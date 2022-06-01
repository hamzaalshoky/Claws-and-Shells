package net.peach.cas.event;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.peach.cas.CasMod;
import net.peach.cas.entity.ModEntityTypes;
import net.peach.cas.entity.custom.CrabEntity;

@Mod.EventBusSubscriber(modid = CasMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.CRAB.get(), CrabEntity.setAttributes());
    }
}
