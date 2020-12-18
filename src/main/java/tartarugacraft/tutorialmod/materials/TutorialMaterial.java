package tartarugacraft.tutorialmod.materials;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import tartarugacraft.tutorialmod.TutorialMod;

public class TutorialMaterial {

	
	public static final ToolMaterial BLACK_TOOL = EnumHelper.addToolMaterial(TutorialMod.MODID + "." + "black_tool", 3, 1000, 7, 4, 10);
	public static final ArmorMaterial BLACK_ARMOR = EnumHelper.addArmorMaterial(TutorialMod.MODID + "." + "black_armor", TutorialMod.MODID + ":black_armor", 30, new int[] {2,6,4,2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);
}
