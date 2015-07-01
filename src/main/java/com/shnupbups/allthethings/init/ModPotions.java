package com.shnupbups.allthethings.init;

import com.shnupbups.allthethings.potion.PotionBasic;
import com.shnupbups.allthethings.potion.PotionLessening;
import com.shnupbups.allthethings.utility.ColourHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ModPotions {
	public static Potion bleeding;
	public static Potion leadPoison;
	public static Potion fluxCorruption;
	public static Potion radioactivity;
	public static Potion lessening;
	public static Potion flight;
	public static Potion anchorage;
	
	public static void preInit() {
		Potion[] potionTypes = null;

		for (Field f : Potion.class.getDeclaredFields()) {
			f.setAccessible(true);
			try {
				if (f.getName().equals("potionTypes") || f.getName().equals("field_76425_a")) {
					Field modfield = Field.class.getDeclaredField("modifiers");
					modfield.setAccessible(true);
					modfield.setInt(f, f.getModifiers() & ~Modifier.FINAL);

					potionTypes = (Potion[])f.get(null);
					final Potion[] newPotionTypes = new Potion[256];
					System.arraycopy(potionTypes, 0, newPotionTypes, 0, potionTypes.length);
					f.set(null, newPotionTypes);
				}
			} catch (Exception e) {
				System.err.println("Severe error, please report this to the mod author:");
				System.err.println(e);
			}
		}
	}
	
	public static void init() {
		bleeding = (new PotionBasic(32, false, 0, true, 0xFF0000)).setIconIndex(0,0).setPotionName("potion.bleeding");
		leadPoison = (new PotionBasic(33, false, 0, true, ColourHelper.getAverageColour(new ResourceLocation(ModItems.ingotLead.getIcon(new ItemStack(ModItems.ingotLead), 0).getIconName())))).setIconIndex(1,0).setPotionName("potion.leadPoison");
		fluxCorruption = (new PotionBasic(34, false, 0, true, 0xEE00FF)).setIconIndex(2,0).setPotionName("potion.fluxCorruption");
		radioactivity = (new PotionBasic(35, false, 0, true, 0xAAFFAA)).setIconIndex(3,0).setPotionName("potion.radioactivity");
		lessening = (new PotionLessening(36, false, 0, true, 0xEA12BF)).setIconIndex(4,0).setPotionName("potion.lessening");
		flight = (new PotionBasic(37, false, 0, false, 0xA0FFA5)).setIconIndex(5,0).setPotionName("potion.flight");
		anchorage = (new PotionBasic(38, false, 0, true, 0x9D8CFF)).setIconIndex(6,0).setPotionName("potion.anchorage");
	}

}
