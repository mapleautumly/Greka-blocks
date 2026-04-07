package net.mapleautumly.grekaBlocks.forge;

import dev.architectury.platform.forge.EventBuses;
import net.mapleautumly.grekaBlocks.GrekaBlocksCommon;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(GrekaBlocksCommon.MOD_ID)
public final class GrekaBlocksForge {
    public GrekaBlocksForge() {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(GrekaBlocksCommon.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        // Run our common setup.
        GrekaBlocksCommon.init();
    }
}
