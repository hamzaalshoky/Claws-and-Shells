package net.peach.cas.item;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import net.peach.cas.effects.ModEffects;

public class ModFoods {
    public static final FoodProperties RAW_CRAB_LEG = new FoodProperties.Builder().nutrition(2).saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(ModEffects.TETRODOTOXIN.get(), 200), 1f).build();
    public static final FoodProperties RAW_GREEN_CRAB_LEG = new FoodProperties.Builder().nutrition(2).saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(ModEffects.RADIATION.get(), 200), 1f).build();
    public static final FoodProperties RAW_BLUE_CRAB_LEG = new FoodProperties.Builder().nutrition(2).saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(ModEffects.SAXITOXIN.get(), 200), 1f).build();
    public static final FoodProperties RAW_GOLDEN_CRAB_LEG = new FoodProperties.Builder().nutrition(2).saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(ModEffects.BATRACHOTOXIN.get(), 200), 1f).build();

    public static final FoodProperties COOKED_CRAB_LEG = new FoodProperties.Builder().nutrition(8).saturationMod(0.8f)
            .build();
    public static final FoodProperties COOKED_GREEN_CRAB_LEG = new FoodProperties.Builder().nutrition(8).saturationMod(0.8f)
            .build();
    public static final FoodProperties COOKED_BLUE_CRAB_LEG = new FoodProperties.Builder().nutrition(8).saturationMod(0.8f)
            .build();
    public static final FoodProperties COOKED_GOLDEN_CRAB_LEG = new FoodProperties.Builder().nutrition(8).saturationMod(0.8f)
            .build();
}
