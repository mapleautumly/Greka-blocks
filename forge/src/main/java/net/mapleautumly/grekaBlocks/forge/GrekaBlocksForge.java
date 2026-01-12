package net.mapleautumly.grekaBlocks.forge;

import net.mapleautumly.grekaBlocks.GrekaBlocks;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(GrekaBlocks.MOD_ID)
public final class GrekaBlocksForge {
    public GrekaBlocksForge() {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(GrekaBlocks.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        // Run our common setup.
        GrekaBlocks.init();
    }
}
