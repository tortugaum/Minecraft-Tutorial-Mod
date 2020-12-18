package tartarugacraft.tutorialmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import tartarugacraft.tutorialmod.block.FloorSword;
import tartarugacraft.tutorialmod.entity.tequila.EntityTequila;
import tartarugacraft.tutorialmod.init.ModBlocks;
import tartarugacraft.tutorialmod.item.ItemBlackArmor;
import tartarugacraft.tutorialmod.item.ItemBlackAxe;
import tartarugacraft.tutorialmod.item.ItemBlackHoe;
import tartarugacraft.tutorialmod.item.ItemBlackPickaxe;
import tartarugacraft.tutorialmod.item.ItemBlackShovel;
import tartarugacraft.tutorialmod.item.ItemBlackSword;
import tartarugacraft.tutorialmod.item.ItemFireStaff;
import tartarugacraft.tutorialmod.materials.TutorialMaterial;
import tartarugacraft.tutorialmod.util.RegistryUtil;

@EventBusSubscriber(modid = TutorialMod.MODID)
public class RegistrationHandler {
	
	@SubscribeEvent
	public static void registerItems(Register<Item> event) {
		final Item[] items = {
			RegistryUtil.setItemName(new Item(), "black_ingot").setCreativeTab(TutorialMod.TUTORIAL_TAB),
			RegistryUtil.setItemName(new ItemBlackAxe(TutorialMaterial.BLACK_TOOL, 7.0f, -3.1f), "black_axe").setCreativeTab(TutorialMod.TUTORIAL_TAB),
			RegistryUtil.setItemName(new ItemBlackPickaxe(TutorialMaterial.BLACK_TOOL), "black_pickaxe").setCreativeTab(TutorialMod.TUTORIAL_TAB)	,
			RegistryUtil.setItemName(new ItemBlackShovel(TutorialMaterial.BLACK_TOOL), "black_shovel").setCreativeTab(TutorialMod.TUTORIAL_TAB)	,
			RegistryUtil.setItemName(new ItemBlackHoe(TutorialMaterial.BLACK_TOOL), "black_hoe").setCreativeTab(TutorialMod.TUTORIAL_TAB)	,
			RegistryUtil.setItemName(new ItemBlackSword(TutorialMaterial.BLACK_TOOL), "black_sword").setCreativeTab(TutorialMod.TUTORIAL_TAB),
			RegistryUtil.setItemName(new ItemBlackArmor(TutorialMaterial.BLACK_ARMOR, EntityEquipmentSlot.HEAD), "black_helmet").setCreativeTab(TutorialMod.TUTORIAL_TAB),
			RegistryUtil.setItemName(new ItemBlackArmor(TutorialMaterial.BLACK_ARMOR, EntityEquipmentSlot.CHEST), "black_chestplate").setCreativeTab(TutorialMod.TUTORIAL_TAB),
			RegistryUtil.setItemName(new ItemBlackArmor(TutorialMaterial.BLACK_ARMOR, EntityEquipmentSlot.LEGS), "black_leggings").setCreativeTab(TutorialMod.TUTORIAL_TAB),
			RegistryUtil.setItemName(new ItemBlackArmor(TutorialMaterial.BLACK_ARMOR, EntityEquipmentSlot.FEET), "black_boots").setCreativeTab(TutorialMod.TUTORIAL_TAB),
			RegistryUtil.setItemName(new ItemFireStaff(),"fire_staff").setCreativeTab(TutorialMod.TUTORIAL_TAB)
		};
		
		final Item[] itemBlocks = {
				new ItemBlock(ModBlocks.BLACK_BLOCK).setRegistryName(ModBlocks.BLACK_BLOCK.getRegistryName()),
				new ItemBlock(ModBlocks.BLACK_BLOCK_INGOT).setRegistryName(ModBlocks.BLACK_BLOCK_INGOT.getRegistryName()),
				new ItemBlock(ModBlocks.FLOOR_SWORD).setRegistryName(ModBlocks.FLOOR_SWORD.getRegistryName())
		};
		
		event.getRegistry().registerAll(items);
		event.getRegistry().registerAll(itemBlocks);
	}
	
	@SubscribeEvent
	public static void registerBlocks(Register<Block> event) {
		final Block[] blocks = {
				RegistryUtil.setBlockName(new Block(Material.IRON), "black_block").setCreativeTab(TutorialMod.TUTORIAL_TAB).setHardness(5),
				RegistryUtil.setBlockName(new Block(Material.ROCK), "black_block_ingot").setCreativeTab(TutorialMod.TUTORIAL_TAB).setHardness(3),
				RegistryUtil.setBlockName(new FloorSword(Material.ROCK), "floor_sword").setCreativeTab(TutorialMod.TUTORIAL_TAB).setHardness(6)
		};

		event.getRegistry().registerAll(blocks);
	}
	
	public static void registerEntities() {
		registerEntity("Tequila",EntityTequila.class, TutorialMod.ENTITY_TEQUILA, 20, 15260094, 16777215);		
	}
	
	private static void registerEntity (String name, Class<?extends Entity> entity,  int id, int range, int color1, int color2) {
		EntityRegistry.registerModEntity(new ResourceLocation(TutorialMod.MODID + ":" + name), entity, name, id, TutorialMod.instance, range, 1, true, color1, color2);
	}
	
	
	private static void registerNonMobEntity(){
		
	}
}
