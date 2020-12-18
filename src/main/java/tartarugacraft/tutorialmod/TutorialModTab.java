package tartarugacraft.tutorialmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import tartarugacraft.tutorialmod.init.ModItems;

public class TutorialModTab extends CreativeTabs{

		public TutorialModTab() {
			super(TutorialMod.MODID);
		}
		
		@SideOnly(Side.CLIENT)
		
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ModItems.BLACK_INGOT);
		}
}
