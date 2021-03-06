package com.shnupbups.allthethings.item.render;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import com.shnupbups.allthethings.tileEntity.render.TileEntityRenderShell;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class CustomItemRenderer implements IItemRenderer {

	TileEntityRenderShell render;
	private TileEntity tileentity;

	public CustomItemRenderer(TileEntitySpecialRenderer render, TileEntity tileentity) {
	    this.render = (TileEntityRenderShell) render;
	    this.tileentity = tileentity;
	}
	
	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		return true;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		if (type == IItemRenderer.ItemRenderType.ENTITY)
			GL11.glTranslatef(-0.5F, 0.0F, -0.5F);
			this.render.render(tileentity, 0.0D, 0.0D, 0.0D, 0.0F);
	}

}
