package tartarugacraft.tutorialmod.recipes;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import tartarugacraft.tutorialmod.init.ModBlocks;
import tartarugacraft.tutorialmod.init.ModItems;

public class ModRecipes {
	
	public static void initSmelting() {
		
		GameRegistry.addSmelting(Item.getItemFromBlock(ModBlocks.BLACK_BLOCK_INGOT), new ItemStack(ModItems.BLACK_INGOT), 1.0f);
	}
}
