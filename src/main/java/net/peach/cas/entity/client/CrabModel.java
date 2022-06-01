package net.peach.cas.entity.client;

import net.peach.cas.CasMod;
import net.peach.cas.entity.custom.CrabEntity;
import net.minecraft.resources.ResourceLocation;
import net.peach.cas.CasMod;
import net.peach.cas.entity.custom.CrabEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CrabModel extends AnimatedGeoModel<CrabEntity> {
    @Override
    public ResourceLocation getModelLocation(CrabEntity object) {
        return new ResourceLocation(CasMod.MOD_ID, "geo/crab.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(CrabEntity object) {
        return new ResourceLocation(CasMod.MOD_ID, "textures/entity/crab/crab.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(CrabEntity animatable) {
        return new ResourceLocation(CasMod.MOD_ID, "animations/crab.animation.json");
    }
}
