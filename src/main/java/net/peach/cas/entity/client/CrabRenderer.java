package net.peach.cas.entity.client;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.peach.cas.CasMod;
import net.peach.cas.entity.custom.CrabEntity;
import net.peach.cas.entity.variant.CrabVariant;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class CrabRenderer extends GeoEntityRenderer<CrabEntity> {
    public static final Map<CrabVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(CrabVariant.class), (p_114874_) -> {
                p_114874_.put(CrabVariant.RED,
                        new ResourceLocation(CasMod.MOD_ID, "textures/entity/crab/crab.png"));
                p_114874_.put(CrabVariant.GREEN,
                        new ResourceLocation(CasMod.MOD_ID, "textures/entity/crab/crab_green.png"));
                p_114874_.put(CrabVariant.PURPLE,
                        new ResourceLocation(CasMod.MOD_ID, "textures/entity/crab/crab_blue.png"));
                p_114874_.put(CrabVariant.GOLDEN,
                        new ResourceLocation(CasMod.MOD_ID, "textures/entity/crab/crab_golden.png"));
            });
    
    
    
    public CrabRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new CrabModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(CrabEntity instance) {
        return LOCATION_BY_VARIANT.get(instance.getVariant());
    }


    @Override
    public RenderType getRenderType(CrabEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.8F, 0.8F, 0.8F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
