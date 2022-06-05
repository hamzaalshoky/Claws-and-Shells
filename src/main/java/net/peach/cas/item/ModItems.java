package net.peach.cas.item;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.MobBucketItem;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.peach.cas.CasMod;
import net.peach.cas.entity.ModEntityTypes;
import net.peach.cas.sound.ModSounds;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CasMod.MOD_ID);

    public static final RegistryObject<ForgeSpawnEggItem> CRAB_SPAWN_EGG = ITEMS.register("crab_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.CRAB,990010, 981010,
                    new Item.Properties().tab(ModCreativeModeTabs.TAB)));

    public static final RegistryObject<Item> CRAB_RAVE_RECORD = ITEMS.register("crab_rave_music_disc",
            () -> new RecordItem(4, ModSounds.CRAB_RAVE,
                    new Item.Properties().tab(ModCreativeModeTabs.TAB).stacksTo(1)));

    public static final RegistryObject<Item> RAW_CRAB_LEG = ITEMS.register("raw_crab_leg",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.TAB).food(ModFoods.RAW_CRAB_LEG)));
    public static final RegistryObject<Item> RAW_GREEN_CRAB_LEG = ITEMS.register("raw_green_crab_leg",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.TAB).food(ModFoods.RAW_GREEN_CRAB_LEG)));
    public static final RegistryObject<Item> RAW_BLUE_CRAB_LEG = ITEMS.register("raw_blue_crab_leg",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.TAB).food(ModFoods.RAW_BLUE_CRAB_LEG)));
    public static final RegistryObject<Item> RAW_GOLDEN_CRAB_LEG = ITEMS.register("raw_golden_crab_leg",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.TAB).food(ModFoods.RAW_GOLDEN_CRAB_LEG)));

    public static final RegistryObject<Item> COOKED_CRAB_LEG = ITEMS.register("cooked_crab_leg",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.TAB).food(ModFoods.COOKED_CRAB_LEG)));
    public static final RegistryObject<Item> COOKED_GREEN_CRAB_LEG = ITEMS.register("cooked_green_crab_leg",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.TAB).food(ModFoods.COOKED_GREEN_CRAB_LEG)));
    public static final RegistryObject<Item> COOKED_BLUE_CRAB_LEG = ITEMS.register("cooked_blue_crab_leg",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.TAB).food(ModFoods.COOKED_BLUE_CRAB_LEG)));
    public static final RegistryObject<Item> COOKED_GOLDEN_CRAB_LEG = ITEMS.register("cooked_golden_crab_leg",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.TAB).food(ModFoods.COOKED_GOLDEN_CRAB_LEG)));

    public static final RegistryObject<Item> CRAB_BUCKET = ITEMS.register("crab_bucket",
            () -> new MobBucketItem(ModEntityTypes.CRAB, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH,
                    (new Item.Properties()).stacksTo(1).tab(ModCreativeModeTabs.TAB)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
