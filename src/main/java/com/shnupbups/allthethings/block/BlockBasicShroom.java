package com.shnupbups.allthethings.block;

import com.shnupbups.allthethings.init.ModBlocks;
import com.shnupbups.allthethings.lib.Reference;
import com.shnupbups.allthethings.utility.UtilityCheck;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockMushroom;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class BlockBasicShroom extends BlockBasic {

	public BlockBasicShroom(String name, Material material, CreativeTabs tab, int harvest, int hard) {
		super(name, material, tab, harvest, hard);
		float f = 0.2F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
	}
	
	public boolean canPlaceBlockAt(World world, int x, int y, int z)
    {
        return (world.getBlock(x, y-1, z) == ModBlocks.ustherite);
    }
	
	public boolean canBlockStay(World world, int x, int y, int z)
    {
        return (world.getBlock(x, y-1, z) == ModBlocks.ustherite);
    }
	
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_)
    {
        return null;
    }
	
	public boolean isOpaqueCube()
    {
        return false;
    }

    public boolean renderAsNormalBlock()
    {
        return false;
    }

    public int getRenderType()
    {
        return 1;
    }
	
}
