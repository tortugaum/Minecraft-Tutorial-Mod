package tartarugacraft.tutorialmod;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import tartarugacraft.tutorialmod.init.ModBlocks;
import tartarugacraft.tutorialmod.recipes.ModRecipes;
import tartarugacraft.tutorialmod.util.RenderHandler;
import tartarugacraft.tutorialmod.world.gen.TutorialWorldGen;

@Mod(modid = TutorialMod.MODID,version = TutorialMod.VERSION, name = TutorialMod.NAME,acceptedMinecraftVersions= TutorialMod.MC_VERSION)
public class TutorialMod {

	public static final String MODID = "tutmod";
	public static final String NAME = "Tutorial Mod";
	public static final String VERSION = "1.0";
	public static final String MC_VERSION = "[1.12.2]";
	
	
	public static final int ENTITY_TEQUILA = 250;
	public static final Logger LOGGER = LogManager.getLogger(TutorialMod.MODID);
	
	public static final CreativeTabs TUTORIAL_TAB = new TutorialModTab();
	
	@Instance
	public static TutorialMod instance;
	
	@EventHandler
	public void PreInit(FMLPreInitializationEvent event) {		
		RegistrationHandler.registerEntities();
		RenderHandler.RegisterEntityRenders();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		System.out.println("Yur gay");
		LOGGER.info(TutorialMod.NAME + " says hi!");
		ModRecipes.initSmelting();
		GameRegistry.registerWorldGenerator(new TutorialWorldGen(), 0);
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent event) {
		ModBlocks.BLACK_BLOCK.setHarvestLevel("pickaxe", 2);
		ModBlocks.BLACK_BLOCK_INGOT.setHarvestLevel("pickaxe", 2);
	}
}
