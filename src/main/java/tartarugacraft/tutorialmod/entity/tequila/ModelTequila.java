package tartarugacraft.tutorialmod.entity.tequila;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.util.math.MathHelper;

public class ModelTequila extends ModelBase {
	private final ModelRenderer leftFrontLeg;
	private final ModelRenderer leftBackleg;
	private final ModelRenderer rightFrontLeg;
	private final ModelRenderer rightBackLeg;
	private final ModelRenderer Tail;
	private final ModelRenderer Tail_r1;
	private final ModelRenderer Body;
	private final ModelRenderer head;
	private final ModelRenderer Neck2_r1;
	private final ModelRenderer Neck1_r1;
	private final ModelRenderer Nose_r1;

	public ModelTequila() {
		textureWidth = 32;
		textureHeight = 32;

		leftFrontLeg = new ModelRenderer(this);
		leftFrontLeg.setRotationPoint(2.0F, 20.5F, -1.5F);
		leftFrontLeg.cubeList.add(new ModelBox(leftFrontLeg, 0, 19, -0.5F, -0.5F, -0.5F, 1, 2, 1, 0.0F, false));
		leftFrontLeg.cubeList.add(new ModelBox(leftFrontLeg, 17, 17, -0.5F, 1.25F, -0.5F, 1, 2, 1, -0.125F, false));

		leftBackleg = new ModelRenderer(this);
		leftBackleg.setRotationPoint(2.0F, 20.5F, 3.5F);
		leftBackleg.cubeList.add(new ModelBox(leftBackleg, 18, 14, -0.5F, -0.5F, -0.5F, 1, 2, 1, 0.0F, false));
		leftBackleg.cubeList.add(new ModelBox(leftBackleg, 0, 15, -0.5F, 1.25F, -0.5F, 1, 2, 1, -0.125F, false));

		rightFrontLeg = new ModelRenderer(this);
		rightFrontLeg.setRotationPoint(-2.0F, 20.5F, -1.5F);
		rightFrontLeg.cubeList.add(new ModelBox(rightFrontLeg, 13, 17, -0.5F, 1.25F, -0.5F, 1, 2, 1, -0.125F, false));
		rightFrontLeg.cubeList.add(new ModelBox(rightFrontLeg, 4, 20, -0.5F, -0.5F, -0.5F, 1, 2, 1, 0.0F, false));

		rightBackLeg = new ModelRenderer(this);
		rightBackLeg.setRotationPoint(-2.0F, 20.5F, 3.5F);
		rightBackLeg.cubeList.add(new ModelBox(rightBackLeg, 10, 20, -0.5F, -0.5F, -0.5F, 1, 2, 1, 0.0F, false));
		rightBackLeg.cubeList.add(new ModelBox(rightBackLeg, 3, 17, -0.5F, 1.25F, -0.5F, 1, 2, 1, -0.125F, false));

		Tail = new ModelRenderer(this);
		Tail.setRotationPoint(0.0625F, 18.0F, 4.5F);
		

		Tail_r1 = new ModelRenderer(this);
		Tail_r1.setRotationPoint(0.0F, 1.5F, 0.5F);
		Tail.addChild(Tail_r1);
		setRotationAngle(Tail_r1, -2.0944F, 0.0F, 0.0F);
		Tail_r1.cubeList.add(new ModelBox(Tail_r1, 14, 14, -0.5F, -2.7652F, -0.5794F, 1, 2, 1, -0.25F, false));
		Tail_r1.cubeList.add(new ModelBox(Tail_r1, 7, 18, -0.5F, -2.0152F, -0.5794F, 1, 2, 1, -0.15F, false));
		Tail_r1.cubeList.add(new ModelBox(Tail_r1, 9, 0, -0.5F, -0.5152F, -0.5794F, 1, 1, 1, -0.25F, false));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 20.0F, 1.0F);
		Body.cubeList.add(new ModelBox(Body, 10, 10, -2.0F, -1.0F, 2.0F, 4, 2, 2, 0.1F, false));
		Body.cubeList.add(new ModelBox(Body, 10, 4, -2.0F, -1.0F, -3.0F, 4, 2, 2, 0.1F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 6, -1.5F, -1.0F, -1.0F, 3, 2, 3, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0625F, 18.875F, -1.8125F);
		head.cubeList.add(new ModelBox(head, 0, 0, -1.5F, -3.0175F, -3.2589F, 3, 3, 3, -0.2F, false));

		Neck2_r1 = new ModelRenderer(this);
		Neck2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(Neck2_r1);
		setRotationAngle(Neck2_r1, 0.7854F, 0.0F, 0.0F);
		Neck2_r1.cubeList.add(new ModelBox(Neck2_r1, 12, 0, -1.0F, -1.312F, -1.2816F, 2, 2, 2, -0.2F, false));

		Neck1_r1 = new ModelRenderer(this);
		Neck1_r1.setRotationPoint(0.0625F, 0.625F, 0.5625F);
		head.addChild(Neck1_r1);
		setRotationAngle(Neck1_r1, 0.7854F, 0.0F, 0.0F);
		Neck1_r1.cubeList.add(new ModelBox(Neck1_r1, 6, 14, -1.0625F, -1.3232F, -1.2374F, 2, 2, 2, 0.0F, false));

		Nose_r1 = new ModelRenderer(this);
		Nose_r1.setRotationPoint(0.0F, -1.08F, -3.0714F);
		head.addChild(Nose_r1);
		setRotationAngle(Nose_r1, 0.1309F, 0.0F, 0.0F);
		Nose_r1.cubeList.add(new ModelBox(Nose_r1, 0, 11, -1.0F, -0.9161F, -1.2362F, 2, 2, 2, -0.25F, false));
		Nose_r1.cubeList.add(new ModelBox(Nose_r1, 6, 11, -0.5F, -1.0411F, -1.4237F, 1, 1, 1, -0.25F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		leftFrontLeg.render(f5);
		leftBackleg.render(f5);
		rightFrontLeg.render(f5);
		rightBackLeg.render(f5);
		Tail.render(f5);
		Body.render(f5);
		head.render(f5);
	}
	
	
	 public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime)
	    {
	        EntityTequila entitytequila = (EntityTequila)entitylivingbaseIn;

            this.Tail.rotateAngleY = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;

	        if (entitytequila.isSitting())
	        {
	            this.Neck1_r1.setRotationPoint(-1.0F, 16.0F, -3.0F);
	            this.Neck1_r1.rotateAngleX = ((float)Math.PI * 2F / 5F);
	            this.Neck1_r1.rotateAngleY = 0.0F;
	            //this.Body.setRotationPoint(0.0F, 18.0F, 0.0F);
	            //this.Body.rotateAngleX = ((float)Math.PI / 4F);
	            //this.Tail.setRotationPoint(-1.0F, 21.0F, 6.0F);
	            //this.leftBackleg.setRotationPoint(-2.5F, 22.0F, 2.0F);
	            //this.leftBackleg.rotateAngleX = ((float)Math.PI * 3F / 2F);
	            //this.rightBackLeg.setRotationPoint(0.5F, 22.0F, 2.0F);
	            //this.rightBackLeg.rotateAngleX = ((float)Math.PI * 3F / 2F);
	            //this.leftFrontLeg.rotateAngleX = 5.811947F;
	            //this.leftFrontLeg.setRotationPoint(-2.49F, 17.0F, -4.0F);
	            //this.rightFrontLeg.rotateAngleX = 5.811947F;
	            //this.rightFrontLeg.setRotationPoint(0.51F, 17.0F, -4.0F);
	        }
	        /*
	        else
	        {
	            this.Body.setRotationPoint(0.0F, 14.0F, 2.0F);
	            this.Body.rotateAngleX = ((float)Math.PI / 2F);
	            this.Neck1_r1.setRotationPoint(-1.0F, 14.0F, -3.0F);
	            this.Neck1_r1.rotateAngleX = this.Body.rotateAngleX;
	            this.Tail.setRotationPoint(-1.0F, 12.0F, 8.0F);
	            this.leftBackleg.setRotationPoint(-2.5F, 16.0F, 7.0F);
	            this.rightBackLeg.setRotationPoint(0.5F, 16.0F, 7.0F);
	            this.leftFrontLeg.setRotationPoint(-2.5F, 16.0F, -4.0F);
	            this.rightFrontLeg.setRotationPoint(0.5F, 16.0F, -4.0F);
	            this.leftBackleg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
	            this.rightBackLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
	            this.leftFrontLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
	            this.rightFrontLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
	        }
	        */

	    }

/*
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
*/
	private void setRotationAngle(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
	
	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch, float scaleFactor, Entity entityIn) {
		this.leftBackleg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.rightBackLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.leftFrontLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.rightFrontLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
	}
}