package tartarugacraft.tutorialmod.util;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import tartarugacraft.tutorialmod.entity.tequila.EntityTequila;
import tartarugacraft.tutorialmod.entity.tequila.ModelTequila;
import tartarugacraft.tutorialmod.entity.tequila.RenderTequila;

public class RenderHandler 
{	
	public static void RegisterEntityRenders() {
		RenderingRegistry.registerEntityRenderingHandler(EntityTequila.class, new IRenderFactory<EntityTequila>(){
			@Override
			public Render<? super EntityTequila> createRenderFor(RenderManager manager){
				return new RenderTequila(manager, new ModelTequila(), 0.2F);
			}
		});
	}
	
	
}
