package omgimalexis.allthethings.init;

import omgimalexis.allthethings.utility.LogHelper;
import net.minecraftforge.oredict.OreDictionary;

public class ModOreDictRegister {
	public static void init() {
		OreDictionary.registerOre("gemOnyx", ModItems.gemOnyx);
		OreDictionary.registerOre("oreOnyx", ModBlocks.oreOnyx);
		OreDictionary.registerOre("gemRuby", ModItems.gemRuby);
		OreDictionary.registerOre("oreRuby", ModBlocks.oreRuby);
		OreDictionary.registerOre("gemSapphire", ModItems.gemSapphire);
		OreDictionary.registerOre("oreSapphire", ModBlocks.oreSapphire);
		OreDictionary.registerOre("gemAmber", ModItems.gemAmber);
		OreDictionary.registerOre("gemJade", ModItems.gemJade);
		OreDictionary.registerOre("oreJade", ModBlocks.oreJade);
		OreDictionary.registerOre("gemCitrine", ModItems.gemCitrine);
		OreDictionary.registerOre("oreCitrine", ModBlocks.oreCitrine);
		OreDictionary.registerOre("gemAmethyst", ModItems.gemAmethyst);
		OreDictionary.registerOre("oreAmethyst", ModBlocks.oreAmethyst);
		OreDictionary.registerOre("gemCarnelian", ModItems.gemCarnelian);
		OreDictionary.registerOre("oreCarnelian", ModBlocks.oreCarnelian);
		OreDictionary.registerOre("gemVoidium", ModItems.voidium);
		OreDictionary.registerOre("oreVoidium", ModBlocks.oreVoidium);
		OreDictionary.registerOre("gemFyrestone", ModItems.fyrestone);
		OreDictionary.registerOre("oreFyrestone", ModBlocks.oreFyrestone);
		OreDictionary.registerOre("oreVoidium", ModBlocks.oreVoidiumBedrock);
		OreDictionary.registerOre("gemAmazononite", ModItems.gemAmazonite);
		OreDictionary.registerOre("oreAmazonite", ModBlocks.oreAmazonite);
		OreDictionary.registerOre("gemGarnet", ModItems.gemGarnet);
		OreDictionary.registerOre("oreGarnet", ModBlocks.oreGarnet);
		OreDictionary.registerOre("gemKunzite", ModItems.gemKunzite);
		OreDictionary.registerOre("oreKunzite", ModBlocks.oreKunzite);
		OreDictionary.registerOre("gemAquamarine", ModItems.gemAquamarine);
		OreDictionary.registerOre("oreAquamarine", ModBlocks.oreAquamarine);
		OreDictionary.registerOre("gemDiamond", ModItems.gemDiamond);
		OreDictionary.registerOre("gemQuartz", ModItems.gemNetherQuartz);
		OreDictionary.registerOre("gemTopaz", ModItems.gemTopaz);
		OreDictionary.registerOre("oreTopaz", ModBlocks.oreTopaz);
		OreDictionary.registerOre("ingotTin", ModItems.ingotTin);
		OreDictionary.registerOre("oreTin", ModBlocks.oreTin);
		OreDictionary.registerOre("ingotCopper", ModItems.ingotCopper);
		OreDictionary.registerOre("oreCopper", ModBlocks.oreCopper);
		OreDictionary.registerOre("ingotLead", ModItems.ingotLead);
		OreDictionary.registerOre("oreLead", ModBlocks.oreLead);
		OreDictionary.registerOre("ingotSilver", ModItems.ingotSilver);
		OreDictionary.registerOre("oreSilver", ModBlocks.oreSilver);
		OreDictionary.registerOre("ingotPlatinum", ModItems.ingotPlatinum);
		OreDictionary.registerOre("orePlatinum", ModBlocks.orePlatinum);
		OreDictionary.registerOre("ingotSteel", ModItems.ingotSteel);
		OreDictionary.registerOre("ingotBronze", ModItems.ingotBronze);
		OreDictionary.registerOre("ingotElectrum", ModItems.ingotElectrum);
		OreDictionary.registerOre("ingotMalagnite", ModItems.ingotMalagnite);
		OreDictionary.registerOre("oreMalagnite", ModBlocks.oreMalagnite);
		OreDictionary.registerOre("gemTrytementium", ModItems.trytementium);
		OreDictionary.registerOre("oreTrytementium", ModBlocks.oreTrytementium);
		OreDictionary.registerOre("ingotUranium", ModItems.uranium);
		OreDictionary.registerOre("oreUranium", ModBlocks.oreUranium);
		OreDictionary.registerOre("ingotIridium", ModItems.iridium);
		OreDictionary.registerOre("oreIridium", ModBlocks.oreIridium);
		OreDictionary.registerOre("ingotAluminium", ModItems.ingotAluminium);
		OreDictionary.registerOre("oreAluminium", ModBlocks.oreAluminium);
		OreDictionary.registerOre("ingotAluminum", ModItems.ingotAluminium);
		OreDictionary.registerOre("oreAluminum", ModBlocks.oreAluminium);
		OreDictionary.registerOre("ingotZinc", ModItems.ingotZinc);
		OreDictionary.registerOre("oreZinc", ModBlocks.oreZinc);
		OreDictionary.registerOre("ingotBrass", ModItems.ingotBrass);
		OreDictionary.registerOre("ingotUnobtanium", ModItems.unobtanium);
		OreDictionary.registerOre("ingotTitanium", ModItems.ingotTitanium);
		OreDictionary.registerOre("oreTitanium", ModBlocks.oreTitanium);
		OreDictionary.registerOre("treeWood", ModBlocks.cherryWood);
		OreDictionary.registerOre("treeLeaves", ModBlocks.cherryLeaves);
		OreDictionary.registerOre("plankWood", ModBlocks.cherryPlanks);
		
		LogHelper.info("Ore Dictionary integration initialized successfully!");
	}
}