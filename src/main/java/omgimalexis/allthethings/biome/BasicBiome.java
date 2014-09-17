package omgimalexis.allthethings.biome;

import java.util.Random;

import omgimalexis.allthethings.init.ModBlocks;
import omgimalexis.allthethings.world.WorldGenCherryTree;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BasicBiome extends BiomeGenBase {

	public BasicBiome(int id, String name, int waterColour) {
		super(id);
		this.setBiomeName(name);
		this.waterColorMultiplier = waterColour;
		this.theBiomeDecorator.treesPerChunk = 10;
	}
	
	public int getModdedBiomeGrassColor(int colour) {
		return 0xB0FF6B;
	}
	
	@Override
	public WorldGenAbstractTree func_150567_a(Random par1Random){
		return new WorldGenCherryTree(ModBlocks.cherryWood, ModBlocks.cherryLeaves);
	}
}
