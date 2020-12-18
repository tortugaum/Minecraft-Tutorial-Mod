package tartarugacraft.tutorialmod.util;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import tartarugacraft.tutorialmod.TutorialMod;

public class RegistryUtil {

	public static Item setItemName(final Item item, final String name) {
		item.setRegistryName(TutorialMod.MODID, name).setUnlocalizedName(TutorialMod.MODID + "." + name).setCreativeTab(CreativeTabs.MISC);
		return item;
	}
	
	public static Block setBlockName(final Block block, final String name) {
		block.setRegistryName(TutorialMod.MODID, name).setUnlocalizedName(TutorialMod.MODID + "." + name);
		return block;
	}
}
