package net.peach.cas.world;

import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.peach.cas.entity.ModEntityTypes;

public class ModEntityGeneration {
    public static void onEntitySpawn(final BiomeLoadingEvent event) {
        if(doesBiomeMatch(event.getName(), Biomes.BEACH)) {
            event.getSpawns().getSpawner(MobCategory.WATER_CREATURE).add(new MobSpawnSettings.SpawnerData(ModEntityTypes.CRAB.get(), 6, 1, 3));
        }
        if(doesBiomeMatch(event.getName(), Biomes.SNOWY_BEACH)) {
            event.getSpawns().getSpawner(MobCategory.WATER_CREATURE).add(new MobSpawnSettings.SpawnerData(ModEntityTypes.CRAB.get(), 6, 1, 3));
        }
        if(doesBiomeMatch(event.getName(), Biomes.RIVER)) {
            event.getSpawns().getSpawner(MobCategory.WATER_CREATURE).add(new MobSpawnSettings.SpawnerData(ModEntityTypes.CRAB.get(), 6, 1, 3));
        }
    }

    public static boolean doesBiomeMatch(ResourceLocation biomeNameIn, ResourceKey<Biome> biomeIn) {
        return biomeNameIn.getPath().matches(biomeIn.location().getPath());
    }
}
