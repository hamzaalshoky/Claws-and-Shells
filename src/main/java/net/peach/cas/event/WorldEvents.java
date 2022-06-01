package net.peach.cas.event;

import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.peach.cas.CasMod;
import net.peach.cas.effects.ModEffects;

@Mod.EventBusSubscriber(modid = CasMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class WorldEvents {

    @SubscribeEvent
    public void onHurt(final LivingHurtEvent event){

        if(event.getEntity() instanceof LivingEntity le) {
            if(le.hasEffect(ModEffects.SAXITOXIN.get())) {
                event.setAmount(event.getAmount() * 2);
            }
        }
    }
}

