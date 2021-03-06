package net.peach.cas.event;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.peach.cas.CasMod;
import net.peach.cas.entity.ModEntityTypes;
import net.peach.cas.item.ModItems;

@Mod.EventBusSubscriber(modid = CasMod.MOD_ID)
public class EntityEvents {

    @SubscribeEvent
    public static void onInteractEntity(PlayerInteractEvent.EntityInteract event) {
        Entity entity = event.getTarget();
        Player player = event.getPlayer();
        ItemStack stack = event.getItemStack();
        if (stack.getItem() == Items.WATER_BUCKET && entity.isAlive()) {
            ItemStack bucket = ItemStack.EMPTY;
            if (entity.getType() == ModEntityTypes.CRAB.get()) {
                bucket = new ItemStack(ModItems.CRAB_BUCKET.get());
            } else {
                return;
            }

            player.swing(event.getHand());
            entity.playSound(SoundEvents.BUCKET_FILL_FISH, 1.0F, 1.0F);
            stack.shrink(1);

            if (entity.hasCustomName()) {
                bucket.setHoverName(entity.getCustomName());
            }

            if (!event.getWorld().isClientSide) {
                CriteriaTriggers.FILLED_BUCKET.trigger((ServerPlayer) player, bucket);
            }

            if (stack.isEmpty()) {
                player.setItemInHand(event.getHand(), bucket);
            } else if (!player.getInventory().add(bucket)) {
                player.drop(bucket, false);
            }

            entity.discard();
        }
    }
}
