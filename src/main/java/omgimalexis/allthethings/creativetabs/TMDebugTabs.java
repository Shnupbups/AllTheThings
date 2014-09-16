package omgimalexis.allthethings.creativetabs;

import omgimalexis.allthethings.init.ModBlocks;
import omgimalexis.allthethings.lib.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TMDebugTabs {
	public static final CreativeTabs debug = new CreativeTabs(Reference.MOD_ID.toLowerCase()+"debug") {
		@Override
		public Item getTabIconItem() {
			return Item.getItemFromBlock(ModBlocks.blockUnobtanium);
		}
	};
}
