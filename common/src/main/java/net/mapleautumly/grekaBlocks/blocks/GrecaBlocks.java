package net.mapleautumly.grekaBlocks.blocks;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.mapleautumly.grekaBlocks.GrekaBlocksMod;
import net.mapleautumly.grekaBlocks.tab.GrecaTabs;
import net.minecraft.core.registries.Registries;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

import java.awt.*;

import static net.minecraft.world.item.Items.COPPER_BLOCK;
import static net.minecraft.world.item.Items.registerBlock;

public class GrecaBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(GrekaBlocksMod.MOD_ID, Registries.BLOCK);

    public static final DeferredRegister<Item> BLOCK_ITEMS =
            DeferredRegister.create(GrekaBlocksMod.MOD_ID, Registries.ITEM);

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

    // Here start the engraved blocks
    // This section is for the Overworld blocks
    // Here start the stone family of the metal and gem engraved blocks
    //AMETHYST
    public static final RegistrySupplier<Block> STONE_BRICKS_AMETHYST_BANDS = BLOCKS.register("stone_bricks_amethyst_bands", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.6F, 6.0F).sound(SoundType.STONE).sound(SoundType.AMETHYST)));
    public static final RegistrySupplier<Item> STONE_BRICKS_AMETHYST_BANDS_ITEM = BLOCK_ITEMS.register(STONE_BRICKS_AMETHYST_BANDS.getId(), () -> new BlockItem(STONE_BRICKS_AMETHYST_BANDS.get(), new Item.Properties().arch$tab(GrecaTabs.GEM_AND_METAL_STONE_ENGRAVINGS)));
    public static final RegistrySupplier<Block> STONE_BRICKS_AMETHYST_CHEVRON = BLOCKS.register("stone_bricks_amethyst_chevron", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.6F, 6.0F).sound(SoundType.STONE).sound(SoundType.AMETHYST)));
    public static final RegistrySupplier<Item> STONE_BRICKS_AMETHYST_CHEVRON_ITEM = BLOCK_ITEMS.register(STONE_BRICKS_AMETHYST_CHEVRON.getId(), () -> new BlockItem(STONE_BRICKS_AMETHYST_CHEVRON.get(), new Item.Properties().arch$tab(GrecaTabs.GEM_AND_METAL_STONE_ENGRAVINGS)));
    public static final RegistrySupplier<Block> STONE_BRICKS_AMETHYST_WAVES = BLOCKS.register("stone_bricks_amethyst_waves", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.6F, 6.0F).sound(SoundType.STONE).sound(SoundType.AMETHYST)));
    public static final RegistrySupplier<Item> STONE_BRICKS_AMETHYST_WAVES_ITEM = BLOCK_ITEMS.register(STONE_BRICKS_AMETHYST_WAVES.getId(), () -> new BlockItem(STONE_BRICKS_AMETHYST_WAVES.get(), new Item.Properties().arch$tab(GrecaTabs.GEM_AND_METAL_STONE_ENGRAVINGS)));
    public static final RegistrySupplier<Block> STONE_BRICKS_AMETHYST_BRICKLINE = BLOCKS.register("stone_bricks_amethyst_brickline", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.6F, 6.0F).sound(SoundType.STONE).sound(SoundType.AMETHYST)));
    public static final RegistrySupplier<Item> STONE_BRICKS_AMETHYST_BRICKLINE_ITEM = BLOCK_ITEMS.register(STONE_BRICKS_AMETHYST_BRICKLINE.getId(), () -> new BlockItem(STONE_BRICKS_AMETHYST_BRICKLINE.get(), new Item.Properties().arch$tab(GrecaTabs.GEM_AND_METAL_STONE_ENGRAVINGS)));
    //DIAMOND
    public static final RegistrySupplier<Block> STONE_BRICKS_DIAMOND_BANDS = BLOCKS.register("stone_bricks_diamond_bands", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.2F, 6.0F).sound(SoundType.STONE).sound(SoundType.METAL)));
    public static final RegistrySupplier<Item> STONE_BRICKS_DIAMOND_BANDS_ITEM = BLOCK_ITEMS.register(STONE_BRICKS_DIAMOND_BANDS.getId(), () -> new BlockItem(STONE_BRICKS_DIAMOND_BANDS.get(), new Item.Properties().arch$tab(GrecaTabs.GEM_AND_METAL_STONE_ENGRAVINGS)));
    public static final RegistrySupplier<Block> STONE_BRICKS_DIAMOND_CHEVRON = BLOCKS.register("stone_bricks_diamond_chevron", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.2F, 6.0F).sound(SoundType.STONE).sound(SoundType.METAL)));
    public static final RegistrySupplier<Item> STONE_BRICKS_DIAMOND_CHEVRON_ITEM = BLOCK_ITEMS.register(STONE_BRICKS_DIAMOND_CHEVRON.getId(), () -> new BlockItem(STONE_BRICKS_DIAMOND_CHEVRON.get(), new Item.Properties().arch$tab(GrecaTabs.GEM_AND_METAL_STONE_ENGRAVINGS)));
    public static final RegistrySupplier<Block> STONE_BRICKS_DIAMOND_WAVES = BLOCKS.register("stone_bricks_diamond_waves", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.2F, 6.0F).sound(SoundType.STONE).sound(SoundType.METAL)));
    public static final RegistrySupplier<Item> STONE_BRICKS_DIAMOND_WAVES_ITEM = BLOCK_ITEMS.register(STONE_BRICKS_DIAMOND_WAVES.getId(), () -> new BlockItem(STONE_BRICKS_DIAMOND_WAVES.get(), new Item.Properties().arch$tab(GrecaTabs.GEM_AND_METAL_STONE_ENGRAVINGS)));
    public static final RegistrySupplier<Block> STONE_BRICKS_DIAMOND_BRICKLINE = BLOCKS.register("stone_bricks_diamond_brickline", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.2F, 6.0F).sound(SoundType.STONE).sound(SoundType.METAL)));
    public static final RegistrySupplier<Item> STONE_BRICKS_DIAMOND_BRICKLINE_ITEM = BLOCK_ITEMS.register(STONE_BRICKS_DIAMOND_BRICKLINE.getId(), () -> new BlockItem(STONE_BRICKS_DIAMOND_BRICKLINE.get(), new Item.Properties().arch$tab(GrecaTabs.GEM_AND_METAL_STONE_ENGRAVINGS)));
    //EMERALD
    public static final RegistrySupplier<Block> STONE_BRICKS_EMERALD_BANDS = BLOCKS.register("stone_bricks_emerald_bands", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.2F, 6.0F).sound(SoundType.STONE).sound(SoundType.METAL)));
    public static final RegistrySupplier<Item> STONE_BRICKS_EMERALD_BANDS_ITEM = BLOCK_ITEMS.register(STONE_BRICKS_EMERALD_BANDS.getId(), () -> new BlockItem(STONE_BRICKS_EMERALD_BANDS.get(), new Item.Properties().arch$tab(GrecaTabs.GEM_AND_METAL_STONE_ENGRAVINGS)));
    public static final RegistrySupplier<Block> STONE_BRICKS_EMERALD_CHEVRON = BLOCKS.register("stone_bricks_emerald_chevron", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.2F, 6.0F).sound(SoundType.STONE).sound(SoundType.METAL)));
    public static final RegistrySupplier<Item> STONE_BRICKS_EMERALD_CHEVRON_ITEM = BLOCK_ITEMS.register(STONE_BRICKS_EMERALD_CHEVRON.getId(), () -> new BlockItem(STONE_BRICKS_EMERALD_CHEVRON.get(), new Item.Properties().arch$tab(GrecaTabs.GEM_AND_METAL_STONE_ENGRAVINGS)));
    public static final RegistrySupplier<Block> STONE_BRICKS_EMERALD_WAVES = BLOCKS.register("stone_bricks_emerald_waves", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.2F, 6.0F).sound(SoundType.STONE).sound(SoundType.METAL)));
    public static final RegistrySupplier<Item> STONE_BRICKS_EMERALD_WAVES_ITEM = BLOCK_ITEMS.register(STONE_BRICKS_EMERALD_WAVES.getId(), () -> new BlockItem(STONE_BRICKS_EMERALD_WAVES.get(), new Item.Properties().arch$tab(GrecaTabs.GEM_AND_METAL_STONE_ENGRAVINGS)));
    public static final RegistrySupplier<Block> STONE_BRICKS_EMERALD_BRICKLINE = BLOCKS.register("stone_bricks_emerald_brickline", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.2F, 6.0F).sound(SoundType.STONE).sound(SoundType.METAL)));
    public static final RegistrySupplier<Item> STONE_BRICKS_EMERALD_BRICKLINE_ITEM = BLOCK_ITEMS.register(STONE_BRICKS_EMERALD_BRICKLINE.getId(), () -> new BlockItem(STONE_BRICKS_EMERALD_BRICKLINE.get(), new Item.Properties().arch$tab(GrecaTabs.GEM_AND_METAL_STONE_ENGRAVINGS)));
    //JET
    public static final RegistrySupplier<Block> STONE_BRICKS_JET_BANDS = BLOCKS.register("stone_bricks_jet_bands", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BELL).requiresCorrectToolForDrops().strength(3.5F, 6.0F).sound(SoundType.STONE).sound(SoundType.METAL)));
    public static final RegistrySupplier<Item> STONE_BRICKS_JET_BANDS_ITEM = BLOCK_ITEMS.register(STONE_BRICKS_JET_BANDS.getId(), () -> new BlockItem(STONE_BRICKS_JET_BANDS.get(), new Item.Properties().arch$tab(GrecaTabs.GEM_AND_METAL_STONE_ENGRAVINGS)));
    public static final RegistrySupplier<Block> STONE_BRICKS_JET_CHEVRON = BLOCKS.register("stone_bricks_jet_chevron", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BELL).requiresCorrectToolForDrops().strength(3.5F, 6.0F).sound(SoundType.STONE).sound(SoundType.METAL)));
    public static final RegistrySupplier<Item> STONE_BRICKS_JET_CHEVRON_ITEM = BLOCK_ITEMS.register(STONE_BRICKS_JET_CHEVRON.getId(), () -> new BlockItem(STONE_BRICKS_JET_CHEVRON.get(), new Item.Properties().arch$tab(GrecaTabs.GEM_AND_METAL_STONE_ENGRAVINGS)));
    public static final RegistrySupplier<Block> STONE_BRICKS_JET_WAVES = BLOCKS.register("stone_bricks_jet_waves", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BELL).requiresCorrectToolForDrops().strength(3.5F, 6.0F).sound(SoundType.STONE).sound(SoundType.METAL)));
    public static final RegistrySupplier<Item> STONE_BRICKS_JET_WAVES_ITEM = BLOCK_ITEMS.register(STONE_BRICKS_JET_WAVES.getId(), () -> new BlockItem(STONE_BRICKS_JET_WAVES.get(), new Item.Properties().arch$tab(GrecaTabs.GEM_AND_METAL_STONE_ENGRAVINGS)));
    public static final RegistrySupplier<Block> STONE_BRICKS_JET_BRICKLINE = BLOCKS.register("stone_bricks_jet_brickline", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BELL).requiresCorrectToolForDrops().strength(3.5F, 6.0F).sound(SoundType.STONE).sound(SoundType.METAL)));
    public static final RegistrySupplier<Item> STONE_BRICKS_JET_BRICKLINE_ITEM = BLOCK_ITEMS.register(STONE_BRICKS_JET_BRICKLINE.getId(), () -> new BlockItem(STONE_BRICKS_JET_BRICKLINE.get(), new Item.Properties().arch$tab(GrecaTabs.GEM_AND_METAL_STONE_ENGRAVINGS)));
    //GOLD
    public static final RegistrySupplier<Block> STONE_BRICKS_GOLD_BANDS = BLOCKS.register("stone_bricks_gold_bands", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BELL).requiresCorrectToolForDrops().strength(2.2F, 6.0F).sound(SoundType.STONE).sound(SoundType.METAL)));
    public static final RegistrySupplier<Item> STONE_BRICKS_GOLD_BANDS_ITEM = BLOCK_ITEMS.register(STONE_BRICKS_GOLD_BANDS.getId(), () -> new BlockItem(STONE_BRICKS_GOLD_BANDS.get(), new Item.Properties().arch$tab(GrecaTabs.GEM_AND_METAL_STONE_ENGRAVINGS)));
    public static final RegistrySupplier<Block> STONE_BRICKS_GOLD_CHEVRON = BLOCKS.register("stone_bricks_gold_chevron", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BELL).requiresCorrectToolForDrops().strength(2.2F, 6.0F).sound(SoundType.STONE).sound(SoundType.METAL)));
    public static final RegistrySupplier<Item> STONE_BRICKS_GOLD_CHEVRON_ITEM = BLOCK_ITEMS.register(STONE_BRICKS_GOLD_CHEVRON.getId(), () -> new BlockItem(STONE_BRICKS_GOLD_CHEVRON.get(), new Item.Properties().arch$tab(GrecaTabs.GEM_AND_METAL_STONE_ENGRAVINGS)));
    public static final RegistrySupplier<Block> STONE_BRICKS_GOLD_WAVES = BLOCKS.register("stone_bricks_gold_waves", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BELL).requiresCorrectToolForDrops().strength(2.2F, 6.0F).sound(SoundType.STONE).sound(SoundType.METAL)));
    public static final RegistrySupplier<Item> STONE_BRICKS_GOLD_WAVES_ITEM = BLOCK_ITEMS.register(STONE_BRICKS_GOLD_WAVES.getId(), () -> new BlockItem(STONE_BRICKS_GOLD_WAVES.get(), new Item.Properties().arch$tab(GrecaTabs.GEM_AND_METAL_STONE_ENGRAVINGS)));
    public static final RegistrySupplier<Block> STONE_BRICKS_GOLD_BRICKLINE = BLOCKS.register("stone_bricks_gold_brickline", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BELL).requiresCorrectToolForDrops().strength(2.2F, 6.0F).sound(SoundType.STONE).sound(SoundType.METAL)));
    public static final RegistrySupplier<Item> STONE_BRICKS_GOLD_BRICKLINE_ITEM = BLOCK_ITEMS.register(STONE_BRICKS_GOLD_BRICKLINE.getId(), () -> new BlockItem(STONE_BRICKS_GOLD_BRICKLINE.get(), new Item.Properties().arch$tab(GrecaTabs.GEM_AND_METAL_STONE_ENGRAVINGS)));
    //IRON
    public static final RegistrySupplier<Block> STONE_BRICKS_IRON_BANDS = BLOCKS.register("stone_bricks_iron_bands", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.IRON_XYLOPHONE).requiresCorrectToolForDrops().strength(3.2F, 6.0F).sound(SoundType.STONE).sound(SoundType.METAL)));
    public static final RegistrySupplier<Item> STONE_BRICKS_IRON_BANDS_ITEM = BLOCK_ITEMS.register(STONE_BRICKS_IRON_BANDS.getId(), () -> new BlockItem(STONE_BRICKS_IRON_BANDS.get(), new Item.Properties().arch$tab(GrecaTabs.GEM_AND_METAL_STONE_ENGRAVINGS)));
    public static final RegistrySupplier<Block> STONE_BRICKS_IRON_CHEVRON = BLOCKS.register("stone_bricks_iron_chevron", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.IRON_XYLOPHONE).requiresCorrectToolForDrops().strength(3.2F, 6.0F).sound(SoundType.STONE).sound(SoundType.METAL)));
    public static final RegistrySupplier<Item> STONE_BRICKS_IRON_CHEVRON_ITEM = BLOCK_ITEMS.register(STONE_BRICKS_IRON_CHEVRON.getId(), () -> new BlockItem(STONE_BRICKS_IRON_CHEVRON.get(), new Item.Properties().arch$tab(GrecaTabs.GEM_AND_METAL_STONE_ENGRAVINGS)));
    public static final RegistrySupplier<Block> STONE_BRICKS_IRON_WAVES = BLOCKS.register("stone_bricks_iron_waves", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.IRON_XYLOPHONE).requiresCorrectToolForDrops().strength(3.2F, 6.0F).sound(SoundType.STONE).sound(SoundType.METAL)));
    public static final RegistrySupplier<Item> STONE_BRICKS_IRON_WAVES_ITEM = BLOCK_ITEMS.register(STONE_BRICKS_IRON_WAVES.getId(), () -> new BlockItem(STONE_BRICKS_IRON_WAVES.get(), new Item.Properties().arch$tab(GrecaTabs.GEM_AND_METAL_STONE_ENGRAVINGS)));
    public static final RegistrySupplier<Block> STONE_BRICKS_IRON_BRICKLINE = BLOCKS.register("stone_bricks_iron_brickline", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.IRON_XYLOPHONE).requiresCorrectToolForDrops().strength(3.2F, 6.0F).sound(SoundType.STONE).sound(SoundType.METAL)));
    public static final RegistrySupplier<Item> STONE_BRICKS_IRON_BRICKLINE_ITEM = BLOCK_ITEMS.register(STONE_BRICKS_IRON_BRICKLINE.getId(), () -> new BlockItem(STONE_BRICKS_IRON_BRICKLINE.get(), new Item.Properties().arch$tab(GrecaTabs.GEM_AND_METAL_STONE_ENGRAVINGS)));
    //COPPER
    public static final RegistrySupplier<Block> STONE_BRICKS_COPPER_BANDS = BLOCKS.register("stone_bricks_copper_bands", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(3.2F, 6.0F).sound(SoundType.STONE).sound(SoundType.COPPER)));
    public static final RegistrySupplier<Item> STONE_BRICKS_COPPER_BANDS_ITEM = BLOCK_ITEMS.register(STONE_BRICKS_COPPER_BANDS.getId(), () -> new BlockItem(STONE_BRICKS_COPPER_BANDS.get(), new Item.Properties().arch$tab(GrecaTabs.GEM_AND_METAL_STONE_ENGRAVINGS)));
    public static final RegistrySupplier<Block> STONE_BRICKS_COPPER_CHEVRON = BLOCKS.register("stone_bricks_copper_chevron", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(3.2F, 6.0F).sound(SoundType.STONE).sound(SoundType.COPPER)));
    public static final RegistrySupplier<Item> STONE_BRICKS_COPPER_CHEVRON_ITEM = BLOCK_ITEMS.register(STONE_BRICKS_COPPER_CHEVRON.getId(), () -> new BlockItem(STONE_BRICKS_COPPER_CHEVRON.get(), new Item.Properties().arch$tab(GrecaTabs.GEM_AND_METAL_STONE_ENGRAVINGS)));
    public static final RegistrySupplier<Block> STONE_BRICKS_COPPER_WAVES = BLOCKS.register("stone_bricks_copper_waves", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(3.2F, 6.0F).sound(SoundType.STONE).sound(SoundType.COPPER)));
    public static final RegistrySupplier<Item> STONE_BRICKS_COPPER_WAVES_ITEM = BLOCK_ITEMS.register(STONE_BRICKS_COPPER_WAVES.getId(), () -> new BlockItem(STONE_BRICKS_COPPER_WAVES.get(), new Item.Properties().arch$tab(GrecaTabs.GEM_AND_METAL_STONE_ENGRAVINGS)));
    public static final RegistrySupplier<Block> STONE_BRICKS_COPPER_BRICKLINE = BLOCKS.register("stone_bricks_copper_brickline", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(3.2F, 6.0F).sound(SoundType.STONE).sound(SoundType.COPPER)));
    public static final RegistrySupplier<Item> STONE_BRICKS_COPPER_BRICKLINE_ITEM = BLOCK_ITEMS.register(STONE_BRICKS_COPPER_BRICKLINE.getId(), () -> new BlockItem(STONE_BRICKS_COPPER_BRICKLINE.get(), new Item.Properties().arch$tab(GrecaTabs.GEM_AND_METAL_STONE_ENGRAVINGS)));
    //EXPOSED COPPER
    public static final RegistrySupplier<Block> STONE_BRICKS_EXPOSED_COPPER_BANDS = BLOCKS.register("stone_bricks_exposed_copper_bands", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(3.2F, 6.0F).sound(SoundType.STONE).sound(SoundType.COPPER)));
    public static final RegistrySupplier<Item> STONE_BRICKS_EXPOSED_COPPER_BANDS_ITEM = BLOCK_ITEMS.register(STONE_BRICKS_EXPOSED_COPPER_BANDS.getId(), () -> new BlockItem(STONE_BRICKS_EXPOSED_COPPER_BANDS.get(), new Item.Properties().arch$tab(GrecaTabs.GEM_AND_METAL_STONE_ENGRAVINGS)));
    public static final RegistrySupplier<Block> STONE_BRICKS_EXPOSED_COPPER_CHEVRON = BLOCKS.register("stone_bricks_exposed_copper_chevron", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(3.2F, 6.0F).sound(SoundType.STONE).sound(SoundType.COPPER)));
    public static final RegistrySupplier<Item> STONE_BRICKS_EXPOSED_COPPER_CHEVRON_ITEM = BLOCK_ITEMS.register(STONE_BRICKS_EXPOSED_COPPER_CHEVRON.getId(), () -> new BlockItem(STONE_BRICKS_EXPOSED_COPPER_CHEVRON.get(), new Item.Properties().arch$tab(GrecaTabs.GEM_AND_METAL_STONE_ENGRAVINGS)));
    public static final RegistrySupplier<Block> STONE_BRICKS_EXPOSED_COPPER_WAVES = BLOCKS.register("stone_bricks_exposed_copper_waves", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(3.2F, 6.0F).sound(SoundType.STONE).sound(SoundType.COPPER)));
    public static final RegistrySupplier<Item> STONE_BRICKS_EXPOSED_COPPER_WAVES_ITEM = BLOCK_ITEMS.register(STONE_BRICKS_EXPOSED_COPPER_WAVES.getId(), () -> new BlockItem(STONE_BRICKS_EXPOSED_COPPER_WAVES.get(), new Item.Properties().arch$tab(GrecaTabs.GEM_AND_METAL_STONE_ENGRAVINGS)));
    public static final RegistrySupplier<Block> STONE_BRICKS_EXPOSED_COPPER_BRICKLINE = BLOCKS.register("stone_bricks_exposed_copper_brickline", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(3.2F, 6.0F).sound(SoundType.STONE).sound(SoundType.COPPER)));
    public static final RegistrySupplier<Item> STONE_BRICKS_EXPOSED_COPPER_BRICKLINE_ITEM = BLOCK_ITEMS.register(STONE_BRICKS_EXPOSED_COPPER_BRICKLINE.getId(), () -> new BlockItem(STONE_BRICKS_EXPOSED_COPPER_BRICKLINE.get(), new Item.Properties().arch$tab(GrecaTabs.GEM_AND_METAL_STONE_ENGRAVINGS)));
    //WEATHERED
    public static final RegistrySupplier<Block> STONE_BRICKS_WEATHERED_COPPER_BANDS = BLOCKS.register("stone_bricks_weathered_copper_bands", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(3.2F, 6.0F).sound(SoundType.STONE).sound(SoundType.COPPER)));
    public static final RegistrySupplier<Item> STONE_BRICKS_WEATHERED_COPPER_BANDS_ITEM = BLOCK_ITEMS.register(STONE_BRICKS_WEATHERED_COPPER_BANDS.getId(), () -> new BlockItem(STONE_BRICKS_WEATHERED_COPPER_BANDS.get(), new Item.Properties().arch$tab(GrecaTabs.GEM_AND_METAL_STONE_ENGRAVINGS)));
    public static final RegistrySupplier<Block> STONE_BRICKS_WEATHERED_COPPER_CHEVRON = BLOCKS.register("stone_bricks_weathered_copper_chevron", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(3.2F, 6.0F).sound(SoundType.STONE).sound(SoundType.COPPER)));
    public static final RegistrySupplier<Item> STONE_BRICKS_WEATHERED_COPPER_CHEVRON_ITEM = BLOCK_ITEMS.register(STONE_BRICKS_WEATHERED_COPPER_CHEVRON.getId(), () -> new BlockItem(STONE_BRICKS_WEATHERED_COPPER_CHEVRON.get(), new Item.Properties().arch$tab(GrecaTabs.GEM_AND_METAL_STONE_ENGRAVINGS)));
    public static final RegistrySupplier<Block> STONE_BRICKS_WEATHERED_COPPER_WAVES = BLOCKS.register("stone_bricks_weathered_copper_waves", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(3.2F, 6.0F).sound(SoundType.STONE).sound(SoundType.COPPER)));
    public static final RegistrySupplier<Item> STONE_BRICKS_WEATHERED_COPPER_WAVES_ITEM = BLOCK_ITEMS.register(STONE_BRICKS_WEATHERED_COPPER_WAVES.getId(), () -> new BlockItem(STONE_BRICKS_WEATHERED_COPPER_WAVES.get(), new Item.Properties().arch$tab(GrecaTabs.GEM_AND_METAL_STONE_ENGRAVINGS)));
    public static final RegistrySupplier<Block> STONE_BRICKS_WEATHERED_COPPER_BRICKLINE = BLOCKS.register("stone_bricks_weathered_copper_brickline", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(3.2F, 6.0F).sound(SoundType.STONE).sound(SoundType.COPPER)));
    public static final RegistrySupplier<Item> STONE_BRICKS_WEATHERED_COPPER_BRICKLINE_ITEM = BLOCK_ITEMS.register(STONE_BRICKS_WEATHERED_COPPER_BRICKLINE.getId(), () -> new BlockItem(STONE_BRICKS_WEATHERED_COPPER_BRICKLINE.get(), new Item.Properties().arch$tab(GrecaTabs.GEM_AND_METAL_STONE_ENGRAVINGS)));
    //OXIDIZED
    public static final RegistrySupplier<Block> STONE_BRICKS_OXIDIZED_COPPER_BANDS = BLOCKS.register("stone_bricks_oxidized_copper_bands", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(3.2F, 6.0F).sound(SoundType.STONE).sound(SoundType.COPPER)));
    public static final RegistrySupplier<Item> STONE_BRICKS_OXIDIZED_COPPER_BANDS_ITEM = BLOCK_ITEMS.register(STONE_BRICKS_OXIDIZED_COPPER_BANDS.getId(), () -> new BlockItem(STONE_BRICKS_OXIDIZED_COPPER_BANDS.get(), new Item.Properties().arch$tab(GrecaTabs.GEM_AND_METAL_STONE_ENGRAVINGS)));
    public static final RegistrySupplier<Block> STONE_BRICKS_OXIDIZED_COPPER_CHEVRON = BLOCKS.register("stone_bricks_oxidized_copper_chevron", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(3.2F, 6.0F).sound(SoundType.STONE).sound(SoundType.COPPER)));
    public static final RegistrySupplier<Item> STONE_BRICKS_OXIDIZED_COPPER_CHEVRON_ITEM = BLOCK_ITEMS.register(STONE_BRICKS_OXIDIZED_COPPER_CHEVRON.getId(), () -> new BlockItem(STONE_BRICKS_OXIDIZED_COPPER_CHEVRON.get(), new Item.Properties().arch$tab(GrecaTabs.GEM_AND_METAL_STONE_ENGRAVINGS)));
    public static final RegistrySupplier<Block> STONE_BRICKS_OXIDIZED_COPPER_WAVES = BLOCKS.register("stone_bricks_oxidized_copper_waves", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(3.2F, 6.0F).sound(SoundType.STONE).sound(SoundType.COPPER)));
    public static final RegistrySupplier<Item> STONE_BRICKS_OXIDIZED_COPPER_WAVES_ITEM = BLOCK_ITEMS.register(STONE_BRICKS_OXIDIZED_COPPER_WAVES.getId(), () -> new BlockItem(STONE_BRICKS_OXIDIZED_COPPER_WAVES.get(), new Item.Properties().arch$tab(GrecaTabs.GEM_AND_METAL_STONE_ENGRAVINGS)));
    public static final RegistrySupplier<Block> STONE_BRICKS_OXIDIZED_COPPER_BRICKLINE = BLOCKS.register("stone_bricks_oxidized_copper_brickline", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).requiresCorrectToolForDrops().strength(3.2F, 6.0F).sound(SoundType.STONE).sound(SoundType.COPPER)));
    public static final RegistrySupplier<Item> STONE_BRICKS_OXIDIZED_COPPER_BRICKLINE_ITEM = BLOCK_ITEMS.register(STONE_BRICKS_OXIDIZED_COPPER_BRICKLINE.getId(), () -> new BlockItem(STONE_BRICKS_OXIDIZED_COPPER_BRICKLINE.get(), new Item.Properties().arch$tab(GrecaTabs.GEM_AND_METAL_STONE_ENGRAVINGS)));

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

    public static final RegistrySupplier<Block> CUT_IRON = BLOCKS.register("tiger_eye_block", () -> new Block(
            BlockBehaviour.Properties.of().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                    .requiresCorrectToolForDrops().strength(3.0f, 3.0f).sound(SoundType.METAL)));
    private static final RegistrySupplier<Item> CUT_IRON_ITEM = BLOCK_ITEMS.register(CUT_IRON.getId(), () -> new BlockItem(
            CUT_IRON.get(), new Item.Properties()));
    public static final RegistrySupplier<Block> CUT_IRON_STAIRS = BLOCKS.register("tiger_eye_block", () -> new StairBlock(CUT_IRON.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WAXED_CUT_COPPER_STAIRS).strength(3.0f, 3.0f).sound(SoundType.METAL)));
    private static final RegistrySupplier<Item> CUT_IRON_STAIRS_ITEM = BLOCK_ITEMS.register(CUT_IRON_STAIRS.getId(), () -> new BlockItem(CUT_IRON_STAIRS.get(), new Item.Properties()));
    public static final RegistrySupplier<Block> CUT_IRON_SLAB = BLOCKS.register("tiger_eye_block", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_CUT_COPPER_SLAB).strength(3.0f, 3.0f).sound(SoundType.METAL)));
    private static final RegistrySupplier<Item> CUT_IRON_SLAB_ITEM = BLOCK_ITEMS.register(CUT_IRON_SLAB.getId(), () -> new BlockItem(CUT_IRON_SLAB.get(), new Item.Properties()));

    public static final RegistrySupplier<Block> NIGHT_SKY_BLOCK = BLOCKS.register("tiger_eye_block", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BIT).requiresCorrectToolForDrops().strength(3.0f, 3.0f).sound(SoundType.METAL)));
    private static final RegistrySupplier<Item> NIGHT_SKY_BLOCK_ITEM = BLOCK_ITEMS.register(NIGHT_SKY_BLOCK.getId(), () -> new BlockItem(NIGHT_SKY_BLOCK.get(), new Item.Properties()));
    public static final RegistrySupplier<Block> MOVING_NIGHT_SKY_BLOCK = BLOCKS.register("tiger_eye_block", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BIT).requiresCorrectToolForDrops().strength(3.0f, 3.0f).sound(SoundType.METAL)));
    private static final RegistrySupplier<Item> MOVING_NIGHT_SKY_BLOCK_ITEM = BLOCK_ITEMS.register(MOVING_NIGHT_SKY_BLOCK.getId(), () -> new BlockItem(MOVING_NIGHT_SKY_BLOCK.get(), new Item.Properties()));
    public static final RegistrySupplier<Block> CINEMATIC_STONE_BRICKS = BLOCKS.register("tiger_eye_block", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BIT).requiresCorrectToolForDrops().strength(3.0f, 3.0f).sound(SoundType.METAL)));
    private static final RegistrySupplier<Item> CINEMATIC_STONE_BRICKS_ITEM = BLOCK_ITEMS.register(CINEMATIC_STONE_BRICKS.getId(), () -> new BlockItem(CINEMATIC_STONE_BRICKS.get(), new Item.Properties()));


    public static void register() { BLOCKS.register(); BLOCK_ITEMS.register(); }
}
