package net.mapleautumly.grekaBlocks;

import net.mapleautumly.grekaBlocks.blocks.GrecaBlocks;
import net.mapleautumly.grekaBlocks.items.GrecaItems;
import net.mapleautumly.grekaBlocks.tab.GrecaTabs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class GrekaBlocksCommon {
    public static final String MOD_ID = "greka_blocks";


    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static void init() {
        // Write common init code here.
        LOGGER.info("Initializing Greca Blocks Mod");
        GrecaItems.register();
        GrecaBlocks.register();
        GrecaTabs.register();

    }

}