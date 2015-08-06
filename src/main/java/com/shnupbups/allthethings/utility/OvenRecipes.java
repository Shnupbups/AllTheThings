package com.shnupbups.allthethings.utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.shnupbups.allthethings.machine.IMachineRecipe;
import com.shnupbups.allthethings.tileEntity.TileEntityOven;

public class OvenRecipes {

	/** The static instance of this class */
    private static final OvenRecipes instance = new OvenRecipes();
    /** A list of all the recipes added */
    private List recipes = new ArrayList();
	
    /**
     * Returns the static instance of this class
     */
    public static final OvenRecipes getInstance() {
        return instance;
    }

    private OvenRecipes() {
    	
    }
    
    public OvenRecipeShaped addRecipe(ItemStack p_92103_1_, Object ... p_92103_2_)
    {
        String s = "";
        int i = 0;
        int j = 0;
        int k = 0;

        if (p_92103_2_[i] instanceof String[])
        {
            String[] astring = (String[])((String[])p_92103_2_[i++]);

            for (int l = 0; l < astring.length; ++l)
            {
                String s1 = astring[l];
                ++k;
                j = s1.length();
                s = s + s1;
            }
        }
        else
        {
            while (p_92103_2_[i] instanceof String)
            {
                String s2 = (String)p_92103_2_[i++];
                ++k;
                j = s2.length();
                s = s + s2;
            }
        }

        HashMap hashmap;

        for (hashmap = new HashMap(); i < p_92103_2_.length; i += 2)
        {
            Character character = (Character)p_92103_2_[i];
            ItemStack itemstack1 = null;

            if (p_92103_2_[i + 1] instanceof Item)
            {
                itemstack1 = new ItemStack((Item)p_92103_2_[i + 1]);
            }
            else if (p_92103_2_[i + 1] instanceof Block)
            {
                itemstack1 = new ItemStack((Block)p_92103_2_[i + 1], 1, 32767);
            }
            else if (p_92103_2_[i + 1] instanceof ItemStack)
            {
                itemstack1 = (ItemStack)p_92103_2_[i + 1];
            }

            hashmap.put(character, itemstack1);
        }

        ItemStack[] aitemstack = new ItemStack[j * k];

        for (int i1 = 0; i1 < j * k; ++i1)
        {
            char c0 = s.charAt(i1);

            if (hashmap.containsKey(Character.valueOf(c0)))
            {
                aitemstack[i1] = ((ItemStack)hashmap.get(Character.valueOf(c0))).copy();
            }
            else
            {
                aitemstack[i1] = null;
            }
        }

        OvenRecipeShaped OvenRecipeShaped = new OvenRecipeShaped(j, k, aitemstack, p_92103_1_);
        this.recipes.add(OvenRecipeShaped);
        return OvenRecipeShaped;
    }

    public void addShapelessRecipe(ItemStack p_77596_1_, Object ... p_77596_2_)
    {
        ArrayList arraylist = new ArrayList();
        Object[] aobject = p_77596_2_;
        int i = p_77596_2_.length;

        for (int j = 0; j < i; ++j)
        {
            Object object1 = aobject[j];

            if (object1 instanceof ItemStack)
            {
                arraylist.add(((ItemStack)object1).copy());
            }
            else if (object1 instanceof Item)
            {
                arraylist.add(new ItemStack((Item)object1));
            }
            else
            {
                if (!(object1 instanceof Block))
                {
                    throw new RuntimeException("Invalid shapeless recipy!");
                }

                arraylist.add(new ItemStack((Block)object1));
            }
        }

        this.recipes.add(new OvenRecipeShapeless(p_77596_1_, arraylist));
    }

    public IMachineRecipe findMatchingRecipe(TileEntityOven p_82787_1_, World p_82787_2_)
    {
    	int j;
        for (j = 0; j < this.recipes.size(); ++j) {
            IMachineRecipe IMachineRecipe = (IMachineRecipe)this.recipes.get(j);

            if (IMachineRecipe.matches(p_82787_1_, p_82787_2_)) {
                return IMachineRecipe;
            }
        }

        return null;
    }
    
    public ItemStack findMatchingOutput(TileEntityOven p_82787_1_, World p_82787_2_)
    {
    	int j;
        for (j = 0; j < this.recipes.size(); ++j) {
            IMachineRecipe IMachineRecipe = (IMachineRecipe)this.recipes.get(j);

            if (IMachineRecipe.matches(p_82787_1_, p_82787_2_)) {
                return IMachineRecipe.getRecipeOutput();
            }
        }

        return null;
    }
    
    public ItemStack findMatchingSecondOutput(TileEntityOven p_82787_1_, World p_82787_2_)
    {
    	int j;
        for (j = 0; j < this.recipes.size(); ++j) {
            IMachineRecipe IMachineRecipe = (IMachineRecipe)this.recipes.get(j);

            if (IMachineRecipe.matches(p_82787_1_, p_82787_2_)) {
                return IMachineRecipe.getSecondOutput();
            }
        }

        return null;
    }

    /**
     * returns the List<> of all recipes
     */
    public List getRecipeList()
    {
        return this.recipes;
    }
}
