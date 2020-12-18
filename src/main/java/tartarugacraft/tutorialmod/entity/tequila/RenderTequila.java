package tartarugacraft.tutorialmod.entity.tequila;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import tartarugacraft.tutorialmod.TutorialMod;

public class RenderTequila extends RenderLiving<EntityTequila>{

	public RenderTequila(RenderManager manager, ModelBase modelbaseIn, float shadowsizeIn) {
		super(manager, new ModelTequila(), 0.2f);

	}
	
	public static final ResourceLocation TEXTURE = new ResourceLocation(TutorialMod.MODID + ":textures/entity/tequila/tequila.png");

	@Override
	protected ResourceLocation getEntityTexture(EntityTequila entity) {
		return TEXTURE;
	}
	
	 
	

}
