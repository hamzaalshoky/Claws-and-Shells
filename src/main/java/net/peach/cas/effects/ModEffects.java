package net.peach.cas.effects;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.peach.cas.CasMod;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS
            = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, CasMod.MOD_ID);

    public static final RegistryObject<MobEffect> SAXITOXIN = MOB_EFFECTS.register("saxitoxin",
            () -> new SaxitoxinEffect(MobEffectCategory.HARMFUL, 3124687));

    public static final RegistryObject<MobEffect> BATRACHOTOXIN = MOB_EFFECTS.register("batrachotoxin",
            () -> new BatrachotoxinEffect(MobEffectCategory.HARMFUL, 3124687));

    public static final RegistryObject<MobEffect> TETRODOTOXIN = MOB_EFFECTS.register("tetrodotoxin",
            () -> new TetrodotoxinEffect(MobEffectCategory.HARMFUL, 3124687));

    public static final RegistryObject<MobEffect> RADIATION = MOB_EFFECTS.register("radiation",
            () -> new RadiationEffect(MobEffectCategory.HARMFUL, 3124687));

    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}
