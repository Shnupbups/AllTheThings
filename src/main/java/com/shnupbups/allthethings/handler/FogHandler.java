package com.shnupbups.allthethings.handler;

import net.minecraftforge.client.event.EntityViewRenderEvent.FogColors;
import net.minecraftforge.client.event.EntityViewRenderEvent.FogDensity;

import org.lwjgl.opengl.GL11;

import com.shnupbups.allthethings.block.BlockBasicFluid;
import com.shnupbups.allthethings.init.ModPotions;
import com.shnupbups.allthethings.utility.MiscUtility;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import cpw.mods.fml.relauncher.Side;

public class FogHandler {

	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public void onFogCheck(FogColors fogEvent) {
		if(fogEvent.entity.getActivePotionEffect(ModPotions.bleeding) != null) {
			fogEvent.red=9001f;
			fogEvent.blue=0f;
			fogEvent.green=0f;
		} else if(fogEvent.block instanceof BlockBasicFluid) {
			fogEvent.red = (((BlockBasicFluid)fogEvent.block).getFluid().getColor() >> 16) & 0xFF;
            fogEvent.green = (((BlockBasicFluid)fogEvent.block).getFluid().getColor() >> 8) & 0xFF;
            fogEvent.blue = ((BlockBasicFluid)fogEvent.block).getFluid().getColor() & 0xFF;
		}
	}
	
	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public void onFogDensity(FogDensity fogEvent) {
		if(fogEvent.entity.getActivePotionEffect(ModPotions.bleeding) != null) {
			fogEvent.density=(0.05f*(fogEvent.entity.getActivePotionEffect(ModPotions.bleeding).getAmplifier()+1))*MiscUtility.clamp((fogEvent.entity.getActivePotionEffect(ModPotions.bleeding).getDuration()/10),0.2f,15.0f);
			GL11.glFogi(GL11.GL_FOG_MODE, GL11.GL_EXP);
			fogEvent.setCanceled(true);
		}/** else if(fogEvent.block instanceof BlockBasicFluid) {
			fogEvent.density=2f;
			GL11.glFogi(GL11.GL_FOG_MODE, GL11.GL_EXP);
		}**/
	}
}
