package net.peach.cas.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {
    public static final CreativeModeTab TAB = new CreativeModeTab("claws_and_shells_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RAW_CRAB_LEG.get());
        }
    };
}
