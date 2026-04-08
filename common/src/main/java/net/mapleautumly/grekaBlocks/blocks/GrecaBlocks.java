package net.mapleautumly.grekaBlocks.blocks;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.mapleautumly.grekaBlocks.GrekaBlocksCommon;
import net.mapleautumly.grekaBlocks.tab.GrecaTabs;
import net.minecraft.core.registries.Registries;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

import static net.minecraft.world.item.Items.registerBlock;

public class GrecaBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(GrekaBlocksCommon.MOD_ID, Registries.BLOCK);

    public static final DeferredRegister<Item> BLOCK_ITEMS =
            DeferredRegister.create(GrekaBlocksCommon.MOD_ID, Registries.ITEM);

    // Crafting blocks
    public static final RegistrySupplier<Block> ENGRAVING_STATION = BLOCKS.register("engraving_station", () -> new Block(
            BlockBehaviour.Properties.of().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.CHIME)
                    .requiresCorrectToolForDrops().strength(2.0f).sound(SoundType.ANVIL)));
    public static final RegistrySupplier<Item> ENGRAVING_STATION_ITEM = BLOCK_ITEMS.register(ENGRAVING_STATION.getId(), () -> new BlockItem(
            ENGRAVING_STATION.get(), new Item.Properties().arch$tab(GrecaTabs.GRECA_UTIL_TAB)));
    public static final RegistrySupplier<Block> PALETTE_WHEEL = BLOCKS.register("palette_wheel", () -> new Block(
            BlockBehaviour.Properties.of().mapColor(MapColor.WOOL).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().strength(0.8f).sound(SoundType.WOOD)));
    public static final RegistrySupplier<Item> PALETTE_WHEEL_ITEM = BLOCK_ITEMS.register(PALETTE_WHEEL.getId(), () -> new BlockItem(
            PALETTE_WHEEL.get(), new Item.Properties().arch$tab(GrecaTabs.GRECA_UTIL_TAB)));


    // Mineral Section

    public static final RegistrySupplier<Block> TIGER_EYE_BLOCK = BLOCKS.register("tiger_eye_block", () -> new Block(
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().strength(3.0f, 3.0f).sound(SoundType.CALCITE)));
    private static final RegistrySupplier<Item> TIGER_EYE_BLOCK_ITEM = BLOCK_ITEMS.register(TIGER_EYE_BLOCK.getId(), () -> new BlockItem(
            TIGER_EYE_BLOCK.get(), new Item.Properties()));

    public static final RegistrySupplier<Block> BLOCK_OF_JET = BLOCKS.register("jet_block", () -> new Block(
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().strength(3.5f, 6.5f).sound(SoundType.METAL)));
    private static final RegistrySupplier<Item> BLOCK_OF_JET_ITEM = BLOCK_ITEMS.register(BLOCK_OF_JET.getId(), () -> new BlockItem(
            BLOCK_OF_JET.get(), new Item.Properties()));

    public static final RegistrySupplier<Block> JET_ORE = BLOCKS.register("jet_ore", () -> new DropExperienceBlock(
            BlockBehaviour.Properties.of().requiresCorrectToolForDrops().mapColor(MapColor.STONE).strength(3f,6.5f).sound(SoundType.STONE), UniformInt.of(2,5)));
    private static final RegistrySupplier<Item> JET_ORE_ITEM = BLOCK_ITEMS.register(JET_ORE.getId(), () -> new BlockItem(
            JET_ORE.get(), new Item.Properties()));


    public static void register() {}

    static {

        StoneBricks.init();

        BLOCKS.register(); BLOCK_ITEMS.register();
    }
}
