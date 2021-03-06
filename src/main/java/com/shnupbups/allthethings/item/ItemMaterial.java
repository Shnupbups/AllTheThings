package com.shnupbups.allthethings.item;

import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import com.shnupbups.allthethings.allthethings;
import com.shnupbups.allthethings.init.ModCreativeTabs;
import com.shnupbups.allthethings.item.material.IMaterial;
import com.shnupbups.allthethings.item.material.MaterialDimension;
import com.shnupbups.allthethings.item.material.MaterialRarity;
import com.shnupbups.allthethings.item.material.MaterialType;
import com.shnupbups.allthethings.lib.Reference;
import com.shnupbups.allthethings.utility.LogHelper;
import com.shnupbups.allthethings.utility.UtilityCheck;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemMaterial extends ItemBasic implements IMaterial{
	public MaterialType type;
	public MaterialRarity rarity;
	public MaterialDimension dimension;
	public int colour = 0xFFFFFF;
	
	public boolean isColourNeeded = true;
	
	private String lore;
	
	public ItemMaterial(String name, CreativeTabs tab, int stackSize, MaterialType type, MaterialRarity rarity, int colour, MaterialDimension dimension) {
		super(name, tab, stackSize);
		this.type = type;
		this.rarity = rarity;
		this.dimension = dimension;
		this.colour = colour;
	}
	
	public ItemMaterial(String name, CreativeTabs tab, MaterialType type, MaterialRarity rarity, int colour, MaterialDimension dimension) {
		this(name, tab, 64, type, rarity, colour, dimension);
	}
	
	public ItemMaterial(String name, int stackSize, MaterialType type, MaterialRarity rarity, int colour, MaterialDimension dimension) {
		this(name, ModCreativeTabs.item, stackSize, type, rarity, colour, dimension);
	}
	
	public ItemMaterial(String name, MaterialType type, MaterialRarity rarity, int colour, MaterialDimension dimension) {
		this(name, ModCreativeTabs.item, type, rarity, colour, dimension);
	}
	
	public ItemMaterial(String name, CreativeTabs tab, String lore, MaterialType type, MaterialRarity rarity, int colour, MaterialDimension dimension) {
		this(name, tab, 64, type, rarity, colour, dimension);
		this.lore = lore;
	}
	
	public ItemMaterial(String name, int stackSize, String lore, MaterialType type, MaterialRarity rarity, int colour, MaterialDimension dimension) {
		this(name, ModCreativeTabs.item, stackSize, type, rarity, colour, dimension);
		this.lore = lore;
	}
	
	public ItemMaterial(String name, String lore, MaterialType type, MaterialRarity rarity, int colour, MaterialDimension dimension) {
		this(name, ModCreativeTabs.item, 64, type, rarity, colour, dimension);
		this.lore = lore;
	}
	
	public ItemMaterial(String name, CreativeTabs tab, int stackSize, String lore, MaterialType type, MaterialRarity rarity, int colour, MaterialDimension dimension) {
		this(name, tab, stackSize, type, rarity, colour, dimension);
		this.lore = lore;
	}
	
	public ItemMaterial(String name, CreativeTabs tab, int stackSize, MaterialType type, MaterialRarity rarity, int colour) {
		super(name, tab, stackSize);
		this.type = type;
		this.rarity = rarity;
		this.colour = colour;
		this.dimension = MaterialDimension.OVERWORLD;
	}
	
	public ItemMaterial(String name, CreativeTabs tab, MaterialType type, MaterialRarity rarity, int colour) {
		this(name, tab, 64, type, rarity, colour);
	}
	
	public ItemMaterial(String name, int stackSize, MaterialType type, MaterialRarity rarity, int colour) {
		this(name, ModCreativeTabs.item, stackSize, type, rarity, colour);
	}
	
	public ItemMaterial(String name, MaterialType type, MaterialRarity rarity, int colour) {
		this(name, ModCreativeTabs.item, type, rarity, colour);
	}
	
	public ItemMaterial(String name, CreativeTabs tab, String lore, MaterialType type, MaterialRarity rarity, int colour) {
		this(name, tab, 64, type, rarity, colour);
		this.lore = lore;
	}
	
	public ItemMaterial(String name, int stackSize, String lore, MaterialType type, MaterialRarity rarity, int colour) {
		this(name, ModCreativeTabs.item, stackSize, type, rarity, colour);
		this.lore = lore;
	}
	
	public ItemMaterial(String name, String lore, MaterialType type, MaterialRarity rarity, int colour) {
		this(name, ModCreativeTabs.item, 64, type, rarity, colour);
		this.lore = lore;
	}
	
	public ItemMaterial(String name, CreativeTabs tab, int stackSize, String lore, MaterialType type, MaterialRarity rarity, int colour) {
		this(name, tab, stackSize, type, rarity, colour);
		this.lore = lore;
	}
	
	public ItemMaterial(String name, CreativeTabs tab, int stackSize, MaterialType type, MaterialRarity rarity, MaterialDimension dimension) {
		super(name, tab, stackSize);
		this.type = type;
		this.rarity = rarity;
		this.dimension = dimension;
		this.isColourNeeded = false;
	}
	
	public ItemMaterial(String name, CreativeTabs tab, MaterialType type, MaterialRarity rarity, MaterialDimension dimension) {
		this(name, tab, 64, type, rarity, dimension);
	}
	
	public ItemMaterial(String name, int stackSize, MaterialType type, MaterialRarity rarity, MaterialDimension dimension) {
		this(name, ModCreativeTabs.item, stackSize, type, rarity, dimension);
	}
	
	public ItemMaterial(String name, MaterialType type, MaterialRarity rarity, MaterialDimension dimension) {
		this(name, ModCreativeTabs.item, type, rarity, dimension);
	}
	
	public ItemMaterial(String name, CreativeTabs tab, String lore, MaterialType type, MaterialRarity rarity, MaterialDimension dimension) {
		this(name, tab, 64, type, rarity, dimension);
		this.lore = lore;
	}
	
	public ItemMaterial(String name, int stackSize, String lore, MaterialType type, MaterialRarity rarity, MaterialDimension dimension) {
		this(name, ModCreativeTabs.item, stackSize, type, rarity, dimension);
		this.lore = lore;
	}
	
	public ItemMaterial(String name, String lore, MaterialType type, MaterialRarity rarity, MaterialDimension dimension) {
		this(name, ModCreativeTabs.item, 64, type, rarity, dimension);
		this.lore = lore;
	}
	
	public ItemMaterial(String name, CreativeTabs tab, int stackSize, String lore, MaterialType type, MaterialRarity rarity, MaterialDimension dimension) {
		this(name, tab, stackSize, type, rarity, dimension);
		this.lore = lore;
	}
	
	public ItemMaterial(String name, CreativeTabs tab, int stackSize, MaterialType type, MaterialRarity rarity) {
		super(name, tab, stackSize);
		this.type = type;
		this.rarity = rarity;
		this.dimension = MaterialDimension.OVERWORLD;
		this.isColourNeeded = false;
	}
	
	public ItemMaterial(String name, CreativeTabs tab, MaterialType type, MaterialRarity rarity) {
		this(name, tab, 64, type, rarity);
	}
	
	public ItemMaterial(String name, int stackSize, MaterialType type, MaterialRarity rarity) {
		this(name, ModCreativeTabs.item, stackSize, type, rarity);
	}
	
	public ItemMaterial(String name, MaterialType type, MaterialRarity rarity) {
		this(name, ModCreativeTabs.item, type, rarity);
	}
	
	public ItemMaterial(String name, CreativeTabs tab, String lore, MaterialType type, MaterialRarity rarity) {
		this(name, tab, 64, type, rarity);
		this.lore = lore;
	}
	
	public ItemMaterial(String name, int stackSize, String lore, MaterialType type, MaterialRarity rarity) {
		this(name, ModCreativeTabs.item, stackSize, type, rarity);
		this.lore = lore;
	}
	
	public ItemMaterial(String name, String lore, MaterialType type, MaterialRarity rarity) {
		this(name, ModCreativeTabs.item, 64, type, rarity);
		this.lore = lore;
	}
	
	public ItemMaterial(String name, CreativeTabs tab, int stackSize, String lore, MaterialType type, MaterialRarity rarity) {
		this(name, tab, stackSize, type, rarity);
		this.lore = lore;
	}
	
	public MaterialType getType(){
		return type;
	}
	
	public MaterialRarity getRarity(){
		return rarity;
	}
	
	public MaterialDimension getDimension(){
		return dimension;
	}
	
	@Override
	public int getColour() {
		return colour;
	}
	
	public static MaterialType getType(ItemMaterial material){
		return material.type;
	}
	
	public static MaterialRarity getRarity(ItemMaterial material){
		return material.rarity;
	}
	
	public static MaterialDimension getDimension(ItemMaterial material){
		return material.dimension;
	}
	
	public static int getColour(ItemMaterial material){
		return material.colour;
	}
	
	@Override
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean bool) {
		if(this.lore != null) {
			list.add(lore);
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public int getColorFromItemStack(ItemStack stack, int pass) {
		if(isColourNeeded) return this.getColour();
		else return super.getColorFromItemStack(stack, pass);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		if(Minecraft.getMinecraft().getTextureMapBlocks().getTextureExtry(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1)) != null) {
			isColourNeeded = false;
			LogHelper.info("TEXTURE EXISTS!");
		}
		
		if(isColourNeeded) itemIcon = iconRegister.registerIcon(Reference.MOD_ID+":"+UtilityCheck.getPrefixFromType(getType()));
		else itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	}
}
