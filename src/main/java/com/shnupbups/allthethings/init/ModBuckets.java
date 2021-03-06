package com.shnupbups.allthethings.init;

import com.shnupbups.allthethings.handler.BucketHandler;
import com.shnupbups.allthethings.item.ItemBasicBucket;
import com.shnupbups.allthethings.item.ItemMaterial;
import com.shnupbups.allthethings.item.material.MaterialDimension;
import com.shnupbups.allthethings.item.material.MaterialRarity;
import com.shnupbups.allthethings.item.material.MaterialType;
import com.shnupbups.allthethings.utility.Register;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBuckets {
	public static final ItemBasicBucket moltenAdamaniteBucket = new ItemBasicBucket("moltenAdamaniteBucket", ModBlocks.moltenAdamanite, ModCreativeTabs.liquid, 0xAE6082);
	public static final ItemBasicBucket moltenAdamantBucket = new ItemBasicBucket("moltenAdamantBucket", ModBlocks.moltenAdamant, ModCreativeTabs.liquid, 0xFFAE9C);
	public static final ItemBasicBucket moltenAluminiumBucket = new ItemBasicBucket("moltenAluminiumBucket", ModBlocks.moltenAluminium, ModCreativeTabs.liquid, 0xA4A8AB);
	public static final ItemBasicBucket moltenBluriteBucket = new ItemBasicBucket("moltenBluriteBucket", ModBlocks.moltenBlurite, ModCreativeTabs.liquid, 0x64868E);
	public static final ItemBasicBucket moltenBrassBucket = new ItemBasicBucket("moltenBrassBucket", ModBlocks.moltenBrass, ModCreativeTabs.liquid, 0x9A822C);
	public static final ItemBasicBucket moltenBronzeBucket = new ItemBasicBucket("moltenBronzeBucket", ModBlocks.moltenBronze, ModCreativeTabs.liquid, 0xA56600);
	public static final ItemBasicBucket moltenChromiumBucket = new ItemBasicBucket("moltenChromiumBucket", ModBlocks.moltenChromium, ModCreativeTabs.liquid, 0xFCFCFC);
	public static final ItemBasicBucket moltenCobaltBucket = new ItemBasicBucket("moltenCobaltBucket", ModBlocks.moltenCobalt, ModCreativeTabs.liquid, 0x364664);
	public static final ItemBasicBucket moltenCopperBucket = new ItemBasicBucket("moltenCopperBucket", ModBlocks.moltenCopper, ModCreativeTabs.liquid, 0xAA6011);
	public static final ItemBasicBucket moltenDaeyaltBucket = new ItemBasicBucket("moltenDaeyaltBucket", ModBlocks.moltenDaeyalt, ModCreativeTabs.liquid, 0xCDB6CD);
	public static final ItemBasicBucket moltenElectrumBucket = new ItemBasicBucket("moltenElectrumBucket", ModBlocks.moltenElectrum, ModCreativeTabs.liquid, 0xE1D45C);
	public static final ItemBasicBucket moltenGoldBucket = new ItemBasicBucket("moltenGoldBucket", ModBlocks.moltenGold, ModCreativeTabs.liquid, 0xFCEE4B);
	public static final ItemBasicBucket moltenGoloidBucket = new ItemBasicBucket("moltenGoloidBucket", ModBlocks.moltenGoloid, ModCreativeTabs.liquid, 0xF7CF1E);
	public static final ItemBasicBucket moltenInvarBucket = new ItemBasicBucket("moltenInvarBucket", ModBlocks.moltenInvar, ModCreativeTabs.liquid, 0x88877C);
	public static final ItemBasicBucket moltenIronBucket = new ItemBasicBucket("moltenIronBucket", ModBlocks.moltenInvar, ModCreativeTabs.liquid, 0xE2C0AA);
	public static final ItemBasicBucket moltenLeadBucket = new ItemBasicBucket("moltenLeadBucket", ModBlocks.moltenLead, ModCreativeTabs.liquid, 0x353047);
	public static final ItemBasicBucket moltenLunarBucket = new ItemBasicBucket("moltenLunarBucket", ModBlocks.moltenLunar, ModCreativeTabs.liquid, 0xDBEADB);
	public static final ItemBasicBucket moltenMalagniteBucket = new ItemBasicBucket("moltenMalagniteBucket", ModBlocks.moltenMalagnite, ModCreativeTabs.liquid, 0x762DC9);
	public static final ItemBasicBucket moltenManganeseBucket = new ItemBasicBucket("moltenManganeseBucket", ModBlocks.moltenManganese, ModCreativeTabs.liquid, 0xB1A7A9);
	public static final ItemBasicBucket moltenMithrilBucket = new ItemBasicBucket("moltenMithrilBucket", ModBlocks.moltenMithril, ModCreativeTabs.liquid, 0xCAD7D8);
	public static final ItemBasicBucket moltenNickelBucket = new ItemBasicBucket("moltenNickelBucket", ModBlocks.moltenNickel, ModCreativeTabs.liquid, 0x6F7671);
	public static final ItemBasicBucket moltenPlatinumBucket = new ItemBasicBucket("moltenPlatinumBucket", ModBlocks.moltenPlatinum, ModCreativeTabs.liquid, 0xCCCBC0);
	public static final ItemBasicBucket moltenRhodiumBucket = new ItemBasicBucket("moltenRhodiumBucket", ModBlocks.moltenRhodium, ModCreativeTabs.liquid, 0xDFDFDF);
	public static final ItemBasicBucket moltenRubiumBucket = new ItemBasicBucket("moltenRubiumBucket", ModBlocks.moltenRubium, ModCreativeTabs.liquid, 0xCC6363);
	public static final ItemBasicBucket moltenRuniteBucket = new ItemBasicBucket("moltenRuniteBucket", ModBlocks.moltenRunite, ModCreativeTabs.liquid, 0xABBAC3);
	public static final ItemBasicBucket moltenSiliconBucket = new ItemBasicBucket("moltenSiliconBucket", ModBlocks.moltenSilicon, ModCreativeTabs.liquid, 0xC6C6C6);
	public static final ItemBasicBucket moltenSilverBucket = new ItemBasicBucket("moltenSilverBucket", ModBlocks.moltenSilver, ModCreativeTabs.liquid, 0xFFFFFF);
	public static final ItemBasicBucket moltenSolderBucket = new ItemBasicBucket("moltenSolderBucket", ModBlocks.moltenSolder, ModCreativeTabs.liquid, 0xD2CFD6);
	public static final ItemBasicBucket moltenSteelBucket = new ItemBasicBucket("moltenSteelBucket", ModBlocks.moltenSteel, ModCreativeTabs.liquid, 0x8C8C8C);
	public static final ItemBasicBucket moltenTinBucket = new ItemBasicBucket("moltenTinBucket", ModBlocks.moltenTin, ModCreativeTabs.liquid, 0xD3C9CB);
	public static final ItemBasicBucket moltenTitaniumBucket = new ItemBasicBucket("moltenTitaniumBucket", ModBlocks.moltenTitanium, ModCreativeTabs.liquid, 0xA9A9A9);
	public static final ItemBasicBucket moltenTungstenBucket = new ItemBasicBucket("moltenTungstenBucket", ModBlocks.moltenTungsten, ModCreativeTabs.liquid, 0x686C73);
	public static final ItemBasicBucket moltenZincBucket = new ItemBasicBucket("moltenZincBucket", ModBlocks.moltenZinc, ModCreativeTabs.liquid, 0x88887F);
	
	public static final ItemBasicBucket moltenAmazoniteBucket = new ItemBasicBucket("moltenAmazoniteBucket", ModBlocks.moltenAmazonite, ModCreativeTabs.liquid, 0x008F61);
	public static final ItemBasicBucket moltenAmberBucket = new ItemBasicBucket("moltenAmberBucket", ModBlocks.moltenAmber, ModCreativeTabs.liquid, 0xDC8C1F);
	public static final ItemBasicBucket moltenAmethystBucket = new ItemBasicBucket("moltenAmethystBucket", ModBlocks.moltenAmethyst, ModCreativeTabs.liquid, 0xCC17DD);
	public static final ItemBasicBucket moltenAquamarineBucket = new ItemBasicBucket("moltenAquamarineBucket", ModBlocks.moltenAquamarine, ModCreativeTabs.liquid, 0x81E8DC);
	public static final ItemBasicBucket moltenCarnelianBucket = new ItemBasicBucket("moltenCarnelianBucket", ModBlocks.moltenCarnelian, ModCreativeTabs.liquid, 0xE36543);
	public static final ItemBasicBucket moltenCitrineBucket = new ItemBasicBucket("moltenCitrineBucket", ModBlocks.moltenCitrine, ModCreativeTabs.liquid, 0xDDD917);
	public static final ItemBasicBucket moltenDiamondBucket = new ItemBasicBucket("moltenDiamondBucket", ModBlocks.moltenDiamond, ModCreativeTabs.liquid, 0x5DECF5);
	public static final ItemBasicBucket moltenEmeraldBucket = new ItemBasicBucket("moltenEmeraldBucket", ModBlocks.moltenEmerald, ModCreativeTabs.liquid, 0x17DD62);
	public static final ItemBasicBucket moltenGarnetBucket = new ItemBasicBucket("moltenGarnetBucket", ModBlocks.moltenGarnet, ModCreativeTabs.liquid, 0x942400);
	public static final ItemBasicBucket moltenJadeBucket = new ItemBasicBucket("moltenJadeBucket", ModBlocks.moltenJade, ModCreativeTabs.liquid, 0xDD17C0);
	public static final ItemBasicBucket moltenKunziteBucket = new ItemBasicBucket("moltenKunziteBucket", ModBlocks.moltenKunzite, ModCreativeTabs.liquid, 0xEC9FA0);
	public static final ItemBasicBucket moltenNetherQuartzBucket = new ItemBasicBucket("moltenNetherQuartzBucket", ModBlocks.moltenNetherQuartz, ModCreativeTabs.liquid, 0xDDCBBE);
	public static final ItemBasicBucket moltenOnyxBucket = new ItemBasicBucket("moltenOnyxBucket", ModBlocks.moltenOnyx, ModCreativeTabs.liquid, 0x3D3D3D);
	public static final ItemBasicBucket moltenOpalBucket = new ItemBasicBucket("moltenOpalBucket", ModBlocks.moltenOpal, ModCreativeTabs.liquid, 0xBEC4BA);
	public static final ItemBasicBucket moltenQuartzBucket = new ItemBasicBucket("moltenQuartzBucket", ModBlocks.moltenQuartz, ModCreativeTabs.liquid, 0xB7B0AA);
	public static final ItemBasicBucket moltenRubyBucket = new ItemBasicBucket("moltenRubyBucket", ModBlocks.moltenRuby, ModCreativeTabs.liquid, 0xDD2317);
	public static final ItemBasicBucket moltenSapphireBucket = new ItemBasicBucket("moltenSapphireBucket", ModBlocks.moltenSapphire, ModCreativeTabs.liquid, 0x1740DD);
	public static final ItemBasicBucket moltenTopazBucket = new ItemBasicBucket("moltenTopazBucket", ModBlocks.moltenTopaz, ModCreativeTabs.liquid, 0xD97700);
	
	public static final ItemBasicBucket moltenVoidiumBucket = new ItemBasicBucket("moltenVoidiumBucket", ModBlocks.moltenVoidium, ModCreativeTabs.liquid, 0x0F0F0F);
	public static final ItemBasicBucket moltenFyrestoneBucket = new ItemBasicBucket("moltenFyrestoneBucket", ModBlocks.moltenFyrestone, ModCreativeTabs.liquid, 0xCC7A00);
	
	public static final ItemBasicBucket moltenIridiumBucket = new ItemBasicBucket("moltenIridiumBucket", ModBlocks.moltenIridium, ModCreativeTabs.liquid, 0xDDDDDD);
	public static final ItemBasicBucket moltenPlutoniumBucket = new ItemBasicBucket("moltenPlutoniumBucket", ModBlocks.moltenPlutonium, ModCreativeTabs.liquid, 0xB1AA94);
	public static final ItemBasicBucket moltenUraniumBucket = new ItemBasicBucket("moltenUraniumBucket", ModBlocks.moltenUranium, ModCreativeTabs.liquid, 0x18BF12);
	
	public static final ItemBasicBucket moltenCrymeretyeBucket = new ItemBasicBucket("moltenCrymeretyeBucket", ModBlocks.moltenCrymeretye, ModCreativeTabs.liquid, 0xFF81A8);
	public static final ItemBasicBucket moltenGraeconthylyniumBucket = new ItemBasicBucket("moltenGraeconthylyniumBucket", ModBlocks.moltenGraeconthylynium, ModCreativeTabs.liquid, 0x454C7D);
	public static final ItemBasicBucket moltenMuktaphlyteBucket = new ItemBasicBucket("moltenMuktaphlyteBucket", ModBlocks.moltenMuktaphlyte, ModCreativeTabs.liquid, 0x943547);
	public static final ItemBasicBucket moltenJonjronyphyllBucket = new ItemBasicBucket("moltenJonjronyphyllBucket", ModBlocks.moltenJonjronyphyll, ModCreativeTabs.liquid, 0x807409);
	public static final ItemBasicBucket moltenKraktachnarBucket = new ItemBasicBucket("moltenKraktachnarBucket", ModBlocks.moltenKraktachnar, ModCreativeTabs.liquid, 0x005655);
	public static final ItemBasicBucket moltenSchulbradethenairdiviteBucket = new ItemBasicBucket("moltenSchulbradethenairdiviteBucket", ModBlocks.moltenSchulbradethenairdivite, ModCreativeTabs.liquid, 0xC37546);
	public static final ItemBasicBucket moltenXaldriodythidyteBucket = new ItemBasicBucket("moltenXaldriodythidyteBucket", ModBlocks.moltenXaldriodythidyte, ModCreativeTabs.liquid, 0x6F0037);
	
	public static final ItemBasicBucket moltenTrytementiumBucket = new ItemBasicBucket("moltenTrytementiumBucket", ModBlocks.moltenTrytementium, ModCreativeTabs.liquid, 0x67AF00);
	public static final ItemBasicBucket moltenUnobtaniumBucket = new ItemBasicBucket("moltenUnobtaniumBucket", ModBlocks.moltenUnobtanium, ModCreativeTabs.liquid, 0xF17E4A);
	
	public static final ItemBasicBucket moltenCoalBucket = new ItemBasicBucket("moltenCoalBucket", ModBlocks.moltenCoal, ModCreativeTabs.liquid, 0x373737);
	public static final ItemBasicBucket moltenLapisBucket = new ItemBasicBucket("moltenLapisBucket", ModBlocks.moltenLapis, ModCreativeTabs.liquid, 0x183DC0);
	public static final ItemBasicBucket moltenObsidianBucket = new ItemBasicBucket("moltenObsidianBucket", ModBlocks.moltenObsidian, ModCreativeTabs.liquid, 0x2A0651);
	public static final ItemBasicBucket moltenRedstoneBucket = new ItemBasicBucket("moltenRedstoneBucket", ModBlocks.moltenRedstone, ModCreativeTabs.liquid, 0xB80505);
	
	public static void init() {
		Register.registerBucket(moltenIronBucket, moltenIronBucket.getTrueUnlocalizedName(), ModFluids.moltenIronFluid, ModBlocks.moltenIron);
		Register.registerBucket(moltenGoldBucket, moltenGoldBucket.getTrueUnlocalizedName(), ModFluids.moltenGoldFluid, ModBlocks.moltenGold);
		Register.registerBucket(moltenCopperBucket, moltenCopperBucket.getTrueUnlocalizedName(), ModFluids.moltenCopperFluid, ModBlocks.moltenCopper);
		Register.registerBucket(moltenTinBucket, moltenTinBucket.getTrueUnlocalizedName(), ModFluids.moltenTinFluid, ModBlocks.moltenTin);
		Register.registerBucket(moltenLeadBucket, moltenLeadBucket.getTrueUnlocalizedName(), ModFluids.moltenLeadFluid, ModBlocks.moltenLead);
		Register.registerBucket(moltenSilverBucket, moltenSilverBucket.getTrueUnlocalizedName(), ModFluids.moltenSilverFluid, ModBlocks.moltenSilver);
		Register.registerBucket(moltenBronzeBucket, moltenBronzeBucket.getTrueUnlocalizedName(), ModFluids.moltenBronzeFluid, ModBlocks.moltenBronze);
		Register.registerBucket(moltenPlatinumBucket, moltenPlatinumBucket.getTrueUnlocalizedName(), ModFluids.moltenPlatinumFluid, ModBlocks.moltenPlatinum);
		Register.registerBucket(moltenZincBucket, moltenZincBucket.getTrueUnlocalizedName(), ModFluids.moltenZincFluid, ModBlocks.moltenZinc);
		Register.registerBucket(moltenSolderBucket, moltenSolderBucket.getTrueUnlocalizedName(), ModFluids.moltenSolderFluid, ModBlocks.moltenSolder);
		Register.registerBucket(moltenBrassBucket, moltenBrassBucket.getTrueUnlocalizedName(), ModFluids.moltenBrassFluid, ModBlocks.moltenBrass);
		Register.registerBucket(moltenSteelBucket, moltenSteelBucket.getTrueUnlocalizedName(), ModFluids.moltenSteelFluid, ModBlocks.moltenSteel);
		Register.registerBucket(moltenElectrumBucket, moltenElectrumBucket.getTrueUnlocalizedName(), ModFluids.moltenElectrumFluid, ModBlocks.moltenElectrum);
		Register.registerBucket(moltenMalagniteBucket, moltenMalagniteBucket.getTrueUnlocalizedName(), ModFluids.moltenMalagniteFluid, ModBlocks.moltenMalagnite);
		Register.registerBucket(moltenAluminiumBucket, moltenAluminiumBucket.getTrueUnlocalizedName(), ModFluids.moltenAluminiumFluid, ModBlocks.moltenAluminium);
		Register.registerBucket(moltenGoloidBucket, moltenGoloidBucket.getTrueUnlocalizedName(), ModFluids.moltenGoloidFluid, ModBlocks.moltenGoloid);
		Register.registerBucket(moltenSiliconBucket, moltenSiliconBucket.getTrueUnlocalizedName(), ModFluids.moltenSiliconFluid, ModBlocks.moltenSilicon);
		Register.registerBucket(moltenVoidiumBucket, moltenVoidiumBucket.getTrueUnlocalizedName(), ModFluids.moltenVoidiumFluid, ModBlocks.moltenVoidium);
		Register.registerBucket(moltenRhodiumBucket, moltenRhodiumBucket.getTrueUnlocalizedName(), ModFluids.moltenRhodiumFluid, ModBlocks.moltenRhodium);
		Register.registerBucket(moltenTungstenBucket, moltenTungstenBucket.getTrueUnlocalizedName(), ModFluids.moltenTungstenFluid, ModBlocks.moltenTungsten);
		Register.registerBucket(moltenCobaltBucket, moltenCobaltBucket.getTrueUnlocalizedName(), ModFluids.moltenCobaltFluid, ModBlocks.moltenCobalt);
		Register.registerBucket(moltenInvarBucket, moltenInvarBucket.getTrueUnlocalizedName(), ModFluids.moltenInvarFluid, ModBlocks.moltenInvar);
		Register.registerBucket(moltenTrytementiumBucket, moltenTrytementiumBucket.getTrueUnlocalizedName(), ModFluids.moltenTrytementiumFluid, ModBlocks.moltenTrytementium);
		Register.registerBucket(moltenNickelBucket, moltenNickelBucket.getTrueUnlocalizedName(), ModFluids.moltenNickelFluid, ModBlocks.moltenNickel);
		Register.registerBucket(moltenChromiumBucket, moltenChromiumBucket.getTrueUnlocalizedName(), ModFluids.moltenChromiumFluid, ModBlocks.moltenChromium);
		Register.registerBucket(moltenUnobtaniumBucket, moltenUnobtaniumBucket.getTrueUnlocalizedName(), ModFluids.moltenUnobtaniumFluid, ModBlocks.moltenUnobtanium);
		Register.registerBucket(moltenPlutoniumBucket, moltenPlutoniumBucket.getTrueUnlocalizedName(), ModFluids.moltenPlutoniumFluid, ModBlocks.moltenPlutonium);
		Register.registerBucket(moltenUraniumBucket, moltenUraniumBucket.getTrueUnlocalizedName(), ModFluids.moltenUraniumFluid, ModBlocks.moltenUranium);
		Register.registerBucket(moltenIridiumBucket, moltenIridiumBucket.getTrueUnlocalizedName(), ModFluids.moltenIridiumFluid, ModBlocks.moltenIridium);
		Register.registerBucket(moltenBluriteBucket, moltenBluriteBucket.getTrueUnlocalizedName(), ModFluids.moltenBluriteFluid, ModBlocks.moltenBlurite);
		Register.registerBucket(moltenRuniteBucket, moltenRuniteBucket.getTrueUnlocalizedName(), ModFluids.moltenRuniteFluid, ModBlocks.moltenRunite);
		Register.registerBucket(moltenRubiumBucket, moltenRubiumBucket.getTrueUnlocalizedName(), ModFluids.moltenRubiumFluid, ModBlocks.moltenRubium);
		Register.registerBucket(moltenLunarBucket, moltenLunarBucket.getTrueUnlocalizedName(), ModFluids.moltenLunarFluid, ModBlocks.moltenLunar);
		Register.registerBucket(moltenOpalBucket, moltenOpalBucket.getTrueUnlocalizedName(), ModFluids.moltenOpalFluid, ModBlocks.moltenOpal);
		Register.registerBucket(moltenDaeyaltBucket, moltenDaeyaltBucket.getTrueUnlocalizedName(), ModFluids.moltenDaeyaltFluid, ModBlocks.moltenDaeyalt);
		Register.registerBucket(moltenRubyBucket, moltenRubyBucket.getTrueUnlocalizedName(), ModFluids.moltenRubyFluid, ModBlocks.moltenRuby);
		Register.registerBucket(moltenSapphireBucket, moltenSapphireBucket.getTrueUnlocalizedName(), ModFluids.moltenSapphireFluid, ModBlocks.moltenSapphire);
		Register.registerBucket(moltenEmeraldBucket, moltenEmeraldBucket.getTrueUnlocalizedName(), ModFluids.moltenEmeraldFluid, ModBlocks.moltenEmerald);
		Register.registerBucket(moltenDiamondBucket, moltenDiamondBucket.getTrueUnlocalizedName(), ModFluids.moltenDiamondFluid, ModBlocks.moltenDiamond);
		Register.registerBucket(moltenNetherQuartzBucket, moltenNetherQuartzBucket.getTrueUnlocalizedName(), ModFluids.moltenNetherQuartzFluid, ModBlocks.moltenNetherQuartz);
		Register.registerBucket(moltenObsidianBucket, moltenObsidianBucket.getTrueUnlocalizedName(), ModFluids.moltenObsidianFluid, ModBlocks.moltenObsidian);
		Register.registerBucket(moltenOnyxBucket, moltenOnyxBucket.getTrueUnlocalizedName(), ModFluids.moltenOnyxFluid, ModBlocks.moltenOnyx);
		Register.registerBucket(moltenKunziteBucket, moltenKunziteBucket.getTrueUnlocalizedName(), ModFluids.moltenKunziteFluid, ModBlocks.moltenKunzite);
		Register.registerBucket(moltenAmberBucket, moltenAmberBucket.getTrueUnlocalizedName(), ModFluids.moltenAmberFluid, ModBlocks.moltenAmber);
		Register.registerBucket(moltenGarnetBucket, moltenGarnetBucket.getTrueUnlocalizedName(), ModFluids.moltenGarnetFluid, ModBlocks.moltenGarnet);
		Register.registerBucket(moltenAmazoniteBucket, moltenAmazoniteBucket.getTrueUnlocalizedName(), ModFluids.moltenAmazoniteFluid, ModBlocks.moltenAmazonite);
		Register.registerBucket(moltenFyrestoneBucket, moltenFyrestoneBucket.getTrueUnlocalizedName(), ModFluids.moltenFyrestoneFluid, ModBlocks.moltenFyrestone);
		Register.registerBucket(moltenAquamarineBucket, moltenAquamarineBucket.getTrueUnlocalizedName(), ModFluids.moltenAquamarineFluid, ModBlocks.moltenAquamarine);
		Register.registerBucket(moltenTopazBucket, moltenTopazBucket.getTrueUnlocalizedName(), ModFluids.moltenTopazFluid, ModBlocks.moltenTopaz);
		Register.registerBucket(moltenCarnelianBucket, moltenCarnelianBucket.getTrueUnlocalizedName(), ModFluids.moltenCarnelianFluid, ModBlocks.moltenCarnelian);
		Register.registerBucket(moltenJadeBucket, moltenJadeBucket.getTrueUnlocalizedName(), ModFluids.moltenJadeFluid, ModBlocks.moltenJade);
		Register.registerBucket(moltenAmethystBucket, moltenAmethystBucket.getTrueUnlocalizedName(), ModFluids.moltenAmethystFluid, ModBlocks.moltenAmethyst);
		Register.registerBucket(moltenCitrineBucket, moltenCitrineBucket.getTrueUnlocalizedName(), ModFluids.moltenCitrineFluid, ModBlocks.moltenCitrine);
		Register.registerBucket(moltenMithrilBucket, moltenMithrilBucket.getTrueUnlocalizedName(), ModFluids.moltenMithrilFluid, ModBlocks.moltenMithril);
		Register.registerBucket(moltenManganeseBucket, moltenManganeseBucket.getTrueUnlocalizedName(), ModFluids.moltenManganeseFluid, ModBlocks.moltenManganese);
	}
}
