package tartarugacraft.tutorialmod.client;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import tartarugacraft.tutorialmod.TutorialMod;
import tartarugacraft.tutorialmod.init.ModBlocks;
import tartarugacraft.tutorialmod.init.ModItems;

@EventBusSubscriber(value = Side.CLIENT, modid = TutorialMod.MODID)
public class ModelRegistrationHandler {

	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		registerModel(ModItems.BLACK_INGOT, 0);
		
		registerModel(ModItems.BLACK_AXE, 0);
		registerModel(ModItems.BLACK_HOE, 0);
		registerModel(ModItems.BLACK_PICKAXE, 0);
		registerModel(ModItems.BLACK_SWORD, 0);
		registerModel(ModItems.BLACK_SHOVEL, 0);
		
		registerModel(ModItems.FIRE_STAFF, 0);
		
		//Armor
		registerModel(ModItems.BLACK_HELMET, 0);
		registerModel(ModItems.BLACK_CHESTPLATE, 0);
		registerModel(ModItems.BLACK_LEGGINGS, 0);
		registerModel(ModItems.BLACK_BOOTS, 0);
		
		
		registerModel(Item.getItemFromBlock(ModBlocks.BLACK_BLOCK),0);
		registerModel(Item.getItemFromBlock(ModBlocks.BLACK_BLOCK_INGOT),0);
		registerModel(Item.getItemFromBlock(ModBlocks.FLOOR_SWORD),0);
	}
	
	public static void registerModel(Item item, int meta) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
