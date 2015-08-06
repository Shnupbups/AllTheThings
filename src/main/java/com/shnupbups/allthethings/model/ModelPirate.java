// Date: 9/01/2015 7:09:47 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.shnupbups.allthethings.model;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelPirate extends ModelBiped
{
  //fields
    ModelRenderer body;
    ModelRenderer leftleg;
    ModelRenderer rightleg;
    ModelRenderer rightleg2;
    ModelRenderer hook1;
    ModelRenderer hook2;
    ModelRenderer hook3;
    public ModelRenderer rightarm;
    ModelRenderer leftarm;
    public ModelRenderer head;
    ModelRenderer nose;
    ModelRenderer beard1;
    ModelRenderer beard2;
    ModelRenderer beard3;
    ModelRenderer hat1;
    ModelRenderer hat2;
    ModelRenderer hat3;
    ModelRenderer hat4;
    ModelRenderer hat5;
    ModelRenderer hat6;
  
  public ModelPirate()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      body = new ModelRenderer(this, 16, 18);
      body.addBox(-4F, 0F, -2F, 8, 12, 4);
      body.setRotationPoint(0F, 0F, 0F);
      body.setTextureSize(64, 64);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      leftleg = new ModelRenderer(this, 0, 30);
      leftleg.addBox(-2F, 0F, -2F, 4, 12, 4);
      leftleg.setRotationPoint(2F, 12F, 0F);
      leftleg.setTextureSize(64, 64);
      leftleg.mirror = true;
      setRotation(leftleg, 0F, 0F, 0F);
      rightleg = new ModelRenderer(this, 0, 18);
      rightleg.addBox(-1F, 0F, 0F, 2, 10, 2);
      rightleg.setRotationPoint(-2F, 12F, -1F);
      rightleg.setTextureSize(64, 64);
      rightleg.mirror = true;
      setRotation(rightleg, 0F, 0F, 0F);
      rightleg2 = new ModelRenderer(this, 0, 46);
      rightleg2.addBox(-3F, 10F, -1F, 4, 2, 4);
      rightleg2.setRotationPoint(-2F, 12F, -1F);
      rightleg2.setTextureSize(64, 64);
      rightleg2.mirror = true;
      setRotation(rightleg2, 0F, 0F, 0F);
      hook1 = new ModelRenderer(this, 8, 18);
      hook1.addBox(2F, 9F, 0F, 1, 3, 1);
      hook1.setRotationPoint(4F, 0F, 0F);
      hook1.setTextureSize(64, 64);
      hook1.mirror = true;
      setRotation(hook1, 0F, 0F, 0F);
      hook2 = new ModelRenderer(this, 8, 25);
      hook2.addBox(1F, 11F, 0F, 1, 1, 1);
      hook2.setRotationPoint(4F, 0F, 0F);
      hook2.setTextureSize(64, 64);
      hook2.mirror = true;
      setRotation(hook2, 0F, 0F, 0F);
      hook3 = new ModelRenderer(this, 8, 22);
      hook3.addBox(1F, 8F, 0F, 1, 2, 1);
      hook3.setRotationPoint(4F, 0F, 0F);
      hook3.setTextureSize(64, 64);
      hook3.mirror = true;
      setRotation(hook3, 0F, 0F, 0F);
      rightarm = new ModelRenderer(this, 40, 18);
      rightarm.addBox(-4F, 0F, -2F, 4, 12, 4);
      rightarm.setRotationPoint(-4F, 0F, 0F);
      rightarm.setTextureSize(64, 64);
      rightarm.mirror = true;
      setRotation(rightarm, 0F, 0F, 0F);
      leftarm = new ModelRenderer(this, 32, 2);
      leftarm.addBox(0F, 0F, -2F, 4, 8, 4);
      leftarm.setRotationPoint(4F, 0F, 0F);
      leftarm.setTextureSize(64, 64);
      leftarm.mirror = true;
      setRotation(leftarm, 0F, 0F, 0F);
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-4F, -10F, -4F, 8, 10, 8);
      head.setRotationPoint(0F, 0F, 0F);
      head.setTextureSize(64, 64);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      nose = new ModelRenderer(this, 24, 0);
      nose.addBox(-1F, -3F, -6F, 2, 4, 2);
      nose.setRotationPoint(0F, 0F, 0F);
      nose.setTextureSize(64, 64);
      nose.mirror = true;
      setRotation(nose, 0F, 0F, 0F);
      beard1 = new ModelRenderer(this, 32, 0);
      beard1.addBox(-3F, 0F, -4F, 6, 1, 1);
      beard1.setRotationPoint(0F, 0F, 0F);
      beard1.setTextureSize(64, 64);
      beard1.mirror = true;
      setRotation(beard1, 0F, 0F, 0F);
      beard2 = new ModelRenderer(this, 32, 0);
      beard2.addBox(-2F, 1F, -4F, 4, 1, 1);
      beard2.setRotationPoint(0F, 0F, 0F);
      beard2.setTextureSize(64, 64);
      beard2.mirror = true;
      setRotation(beard2, 0F, 0F, 0F);
      beard3 = new ModelRenderer(this, 32, 0);
      beard3.addBox(-1F, 2F, -4F, 2, 1, 1);
      beard3.setRotationPoint(0F, 0F, 0F);
      beard3.setTextureSize(64, 64);
      beard3.mirror = true;
      setRotation(beard3, 0F, 0F, 0F);
      hat1 = new ModelRenderer(this, 16, 34);
      hat1.addBox(-6F, -12F, -2F, 12, 2, 4);
      hat1.setRotationPoint(0F, 0F, 0F);
      hat1.setTextureSize(64, 64);
      hat1.mirror = true;
      setRotation(hat1, 0F, 0F, 0F);
      hat2 = new ModelRenderer(this, 0, 52);
      hat2.addBox(-5F, -13F, -1F, 10, 1, 2);
      hat2.setRotationPoint(0F, 0F, 0F);
      hat2.setTextureSize(64, 64);
      hat2.mirror = true;
      setRotation(hat2, 0F, 0F, 0F);
      hat3 = new ModelRenderer(this, 0, 55);
      hat3.addBox(-4F, -14F, -1F, 8, 1, 2);
      hat3.setRotationPoint(0F, 0F, 0F);
      hat3.setTextureSize(64, 64);
      hat3.mirror = true;
      setRotation(hat3, 0F, 0F, 0F);
      hat4 = new ModelRenderer(this, 0, 58);
      hat4.addBox(-3F, -15F, -1F, 6, 1, 2);
      hat4.setRotationPoint(0F, 0F, 0F);
      hat4.setTextureSize(64, 64);
      hat4.mirror = true;
      setRotation(hat4, 0F, 0F, 0F);
      hat5 = new ModelRenderer(this, 0, 61);
      hat5.addBox(-2F, -16F, -1F, 4, 1, 2);
      hat5.setRotationPoint(0F, 0F, 0F);
      hat5.setTextureSize(64, 64);
      hat5.mirror = true;
      setRotation(hat5, 0F, 0F, 0F);
      hat6 = new ModelRenderer(this, 12, 18);
      hat6.addBox(-1F, -17F, -1F, 2, 1, 2);
      hat6.setRotationPoint(0F, 0F, 0F);
      hat6.setTextureSize(64, 64);
      hat6.mirror = true;
      setRotation(hat6, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    body.render(f5);
    leftleg.render(f5);
    rightleg.render(f5);
    rightleg2.render(f5);
    hook1.render(f5);
    hook2.render(f5);
    hook3.render(f5);
    rightarm.render(f5);
    leftarm.render(f5);
    head.render(f5);
    nose.render(f5);
    beard1.render(f5);
    beard2.render(f5);
    beard3.render(f5);
    hat1.render(f5);
    hat2.render(f5);
    hat3.render(f5);
    hat4.render(f5);
    hat5.render(f5);
    hat6.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    float f6 = (180F / (float)Math.PI);
    this.head.rotateAngleX = f4 / (180F / (float)Math.PI);
    this.head.rotateAngleY = f3 / (180F / (float)Math.PI);
    this.hat1.rotateAngleX = f4 / (180F / (float)Math.PI);
    this.hat1.rotateAngleY = f3 / (180F / (float)Math.PI);
    this.hat2.rotateAngleX = f4 / (180F / (float)Math.PI);
    this.hat2.rotateAngleY = f3 / (180F / (float)Math.PI);
    this.hat3.rotateAngleX = f4 / (180F / (float)Math.PI);
    this.hat3.rotateAngleY = f3 / (180F / (float)Math.PI);
    this.hat4.rotateAngleX = f4 / (180F / (float)Math.PI);
    this.hat4.rotateAngleY = f3 / (180F / (float)Math.PI);
    this.hat5.rotateAngleX = f4 / (180F / (float)Math.PI);
    this.hat5.rotateAngleY = f3 / (180F / (float)Math.PI);
    this.hat6.rotateAngleX = f4 / (180F / (float)Math.PI);
    this.hat6.rotateAngleY = f3 / (180F / (float)Math.PI);
    this.nose.rotateAngleX = f4 / (180F / (float)Math.PI);
    this.nose.rotateAngleY = f3 / (180F / (float)Math.PI);
    this.beard1.rotateAngleX = f4 / (180F / (float)Math.PI);
    this.beard1.rotateAngleY = f3 / (180F / (float)Math.PI);
    this.beard2.rotateAngleX = f4 / (180F / (float)Math.PI);
    this.beard2.rotateAngleY = f3 / (180F / (float)Math.PI);
    this.beard3.rotateAngleX = f4 / (180F / (float)Math.PI);
    this.beard3.rotateAngleY = f3 / (180F / (float)Math.PI);
    this.body.rotateAngleX = ((float)Math.PI * 2F);
    this.leftarm.rotateAngleX = ((float)Math.PI * 2F);
    this.hook1.rotateAngleX = ((float)Math.PI * 2F);
    this.hook2.rotateAngleX = ((float)Math.PI * 2F);
    this.hook3.rotateAngleX = ((float)Math.PI * 2F);
    this.rightarm.rotateAngleX = ((float)Math.PI * 2F);
    this.body.rotateAngleX = ((float)Math.PI * 2F);
    this.leftleg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    this.rightleg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    this.rightleg2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
  
    this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
    this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
    this.hook1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
    this.hook2.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
    this.hook3.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
    this.rightarm.rotateAngleZ = 0.0F;
    this.leftarm.rotateAngleZ = 0.0F;
    this.hook1.rotateAngleZ = 0.0F;
    this.hook2.rotateAngleZ = 0.0F;
    this.hook3.rotateAngleZ = 0.0F;

    if (this.isRiding)
    {
        this.rightarm.rotateAngleX += -((float)Math.PI / 5F);
        this.leftarm.rotateAngleX += -((float)Math.PI / 5F);
        this.hook1.rotateAngleX += -((float)Math.PI / 5F);
        this.hook2.rotateAngleX += -((float)Math.PI / 5F);
        this.hook3.rotateAngleX += -((float)Math.PI / 5F);
        this.hook1.rotateAngleX += -((float)Math.PI / 5F);
        this.hook2.rotateAngleX += -((float)Math.PI / 5F);
        this.hook3.rotateAngleX += -((float)Math.PI / 5F);
        this.rightleg.rotateAngleX = -((float)Math.PI * 2F / 5F);
        this.rightleg2.rotateAngleX = -((float)Math.PI * 2F / 5F);
        this.leftleg.rotateAngleX = -((float)Math.PI * 2F / 5F);
        this.rightleg.rotateAngleY = ((float)Math.PI / 10F);
        this.rightleg2.rotateAngleY = ((float)Math.PI / 10F);
        this.leftleg.rotateAngleY = -((float)Math.PI / 10F);
    }

    this.rightarm.rotateAngleY = 0.0F;
    this.leftarm.rotateAngleY = 0.0F;
    this.hook1.rotateAngleY = 0.0F;
    this.hook2.rotateAngleY = 0.0F;
    this.hook3.rotateAngleY = 0.0F;
    float f7;
    float f8;

    if (this.onGround > -9990.0F)
    {
        f7 = this.onGround;
        this.body.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(f7) * (float)Math.PI * 2.0F) * 0.2F;
        this.rightarm.rotateAngleY += this.body.rotateAngleY;
        this.leftarm.rotateAngleY += this.body.rotateAngleY;
        this.leftarm.rotateAngleX += this.body.rotateAngleY;
        this.hook1.rotateAngleY += this.body.rotateAngleY;
        this.hook1.rotateAngleX += this.body.rotateAngleY;
        this.hook2.rotateAngleY += this.body.rotateAngleY;
        this.hook2.rotateAngleX += this.body.rotateAngleY;
        this.hook3.rotateAngleY += this.body.rotateAngleY;
        this.hook3.rotateAngleX += this.body.rotateAngleY;
        f7 = 1.0F - this.onGround;
        f7 *= f7;
        f7 *= f7;
        f7 = 1.0F - f7;
        f8 = MathHelper.sin(f7 * (float)Math.PI);
        float f9 = MathHelper.sin(this.onGround * (float)Math.PI) * -(this.head.rotateAngleX - 0.7F) * 0.75F;
        this.rightarm.rotateAngleX = (float)((double)this.rightarm.rotateAngleX - ((double)f8 * 1.2D + (double)f9));
        this.rightarm.rotateAngleY += this.body.rotateAngleY * 2.0F;
        this.rightarm.rotateAngleZ = MathHelper.sin(this.onGround * (float)Math.PI) * -0.4F;
    }


    this.rightarm.rotateAngleZ += MathHelper.cos(f2 * 0.09F) * 0.05F + 0.05F;
    this.leftarm.rotateAngleZ -= MathHelper.cos(f2 * 0.09F) * 0.05F + 0.05F;
    this.hook1.rotateAngleZ -= MathHelper.cos(f2 * 0.09F) * 0.05F + 0.05F;
    this.hook2.rotateAngleZ -= MathHelper.cos(f2 * 0.09F) * 0.05F + 0.05F;
    this.hook3.rotateAngleZ -= MathHelper.cos(f2 * 0.09F) * 0.05F + 0.05F;
    this.rightarm.rotateAngleX += MathHelper.sin(f2 * 0.067F) * 0.05F;
    this.leftarm.rotateAngleX -= MathHelper.sin(f2 * 0.067F) * 0.05F;
    this.hook1.rotateAngleX -= MathHelper.sin(f2 * 0.067F) * 0.05F;
    this.hook2.rotateAngleX -= MathHelper.sin(f2 * 0.067F) * 0.05F;
    this.hook3.rotateAngleX -= MathHelper.sin(f2 * 0.067F) * 0.05F;

  }

}
