package io.github.testmod.client.renderer;

import io.github.testmod.TestMod;
import io.github.testmod.client.model.GlobEntityModel;
import io.github.testmod.entity.custom.GlobEntity;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.resources.ResourceLocation;

public class GlobEntityRenderer extends LivingEntityRenderer<GlobEntity, GlobEntityModel<GlobEntity>> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(TestMod.MODID, "textures/entity/glob_entity.png");

    public GlobEntityRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new GlobEntityModel(ctx.bakeLayer(GlobEntityModel.LAYER_LOCATION)), 1.0f);

    }

    @Override
    public ResourceLocation getTextureLocation(GlobEntity entity) {
        return TEXTURE;
    }
}
