package net.maple.grecablocks.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.maple.grecablocks.GrecaBlocks;
import net.maple.grecablocks.block.custom.EngravingStationBlock;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    // Crafting blocks
    public static final Block ENGRAVING_STATION = registerBlock("engraving_station",
            new EngravingStationBlock(FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE)));
    public static final Block CHROMATIC_WHEEL = registerBlock("chromatic_wheel",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE)));


    // Here start the engraved blocks
    // This section is for the Overworld blocks
    // Here start the stone bricks family of the metal and gem engraved blocks

    public static final Block STONE_BRICKS_AMETHYST_BANDS = registerBlock("stone_bricks_amethyst_bands",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block STONE_BRICKS_AMETHYST_CHEVRON = registerBlock("stone_bricks_amethyst_chevron",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block STONE_BRICKS_AMETHYST_WAVES = registerBlock("stone_bricks_amethyst_waves",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block STONE_BRICKS_DIAMOND_BANDS = registerBlock("stone_bricks_diamond_bands",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block STONE_BRICKS_DIAMOND_CHEVRON = registerBlock("stone_bricks_diamond_chevron",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block STONE_BRICKS_DIAMOND_WAVES = registerBlock("stone_bricks_diamond_waves",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block STONE_BRICKS_EMERALD_BANDS = registerBlock("stone_bricks_emerald_bands",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block STONE_BRICKS_EMERALD_CHEVRON = registerBlock("stone_bricks_emerald_chevron",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block STONE_BRICKS_EMERALD_WAVES = registerBlock("stone_bricks_emerald_waves",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block STONE_BRICKS_GOLD_BANDS = registerBlock("stone_bricks_gold_bands",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block STONE_BRICKS_GOLD_CHEVRON = registerBlock("stone_bricks_gold_chevron",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block STONE_BRICKS_GOLD_WAVES = registerBlock("stone_bricks_gold_waves",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block STONE_BRICKS_IRON_BANDS = registerBlock("stone_bricks_iron_bands",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block STONE_BRICKS_IRON_CHEVRON = registerBlock("stone_bricks_iron_chevron",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block STONE_BRICKS_IRON_WAVES = registerBlock("stone_bricks_iron_waves",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));

    public static final Block STONE_BRICKS_COPPER_BANDS = registerBlock("stone_bricks_copper_bands",
            new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block STONE_BRICKS_COPPER_CHEVRON = registerBlock("stone_bricks_copper_chevron",
            new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block STONE_BRICKS_COPPER_WAVES = registerBlock("stone_bricks_copper_waves",
            new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block STONE_BRICKS_EXPOSED_COPPER_BANDS = registerBlock("stone_bricks_exposed_copper_bands",
            new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block STONE_BRICKS_EXPOSED_COPPER_CHEVRON = registerBlock("stone_bricks_exposed_copper_chevron",
            new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block STONE_BRICKS_EXPOSED_COPPER_WAVES = registerBlock("stone_bricks_exposed_copper_waves",
            new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block STONE_BRICKS_WEATHERED_COPPER_BANDS = registerBlock("stone_bricks_weathered_copper_bands",
            new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block STONE_BRICKS_WEATHERED_COPPER_CHEVRON = registerBlock("stone_bricks_weathered_copper_chevron",
            new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block STONE_BRICKS_WEATHERED_COPPER_WAVES = registerBlock("stone_bricks_weathered_copper_waves",
            new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block STONE_BRICKS_OXIDIZED_COPPER_BANDS = registerBlock("stone_bricks_oxidized_copper_bands",
            new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block STONE_BRICKS_OXIDIZED_COPPER_CHEVRON = registerBlock("stone_bricks_oxidized_copper_chevron",
            new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block STONE_BRICKS_OXIDIZED_COPPER_WAVES = registerBlock("stone_bricks_oxidized_copper_waves",
            new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));

    public static final Block STONE_BRICKS_WAXED_COPPER_BANDS = registerBlock("stone_bricks_waxed_copper_bands",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block STONE_BRICKS_WAXED_COPPER_CHEVRON = registerBlock("stone_bricks_waxed_copper_chevron",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block STONE_BRICKS_WAXED_COPPER_WAVES = registerBlock("stone_bricks_waxed_copper_waves",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block STONE_BRICKS_WAXED_EXPOSED_COPPER_BANDS = registerBlock("stone_bricks_waxed_exposed_copper_bands",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block STONE_BRICKS_WAXED_EXPOSED_COPPER_CHEVRON = registerBlock("stone_bricks_waxed_exposed_copper_chevron",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block STONE_BRICKS_WAXED_EXPOSED_COPPER_WAVES = registerBlock("stone_bricks_waxed_exposed_copper_waves",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block STONE_BRICKS_WAXED_WEATHERED_COPPER_BANDS = registerBlock("stone_bricks_waxed_weathered_copper_bands",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block STONE_BRICKS_WAXED_WEATHERED_COPPER_CHEVRON = registerBlock("stone_bricks_waxed_weathered_copper_chevron",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block STONE_BRICKS_WAXED_WEATHERED_COPPER_WAVES = registerBlock("stone_bricks_waxed_weathered_copper_waves",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block STONE_BRICKS_WAXED_OXIDIZED_COPPER_BANDS = registerBlock("stone_bricks_waxed_oxidized_copper_bands",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block STONE_BRICKS_WAXED_OXIDIZED_COPPER_CHEVRON = registerBlock("stone_bricks_waxed_oxidized_copper_chevron",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block STONE_BRICKS_WAXED_OXIDIZED_COPPER_WAVES = registerBlock("stone_bricks_waxed_oxidized_copper_waves",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));

    public static final Block STONE_BRICKS_LAPIS_BANDS = registerBlock("stone_bricks_lapis_bands",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block STONE_BRICKS_LAPIS_CHEVRON = registerBlock("stone_bricks_lapis_chevron",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block STONE_BRICKS_LAPIS_WAVES = registerBlock("stone_bricks_lapis_waves",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block STONE_BRICKS_REDSTONE_BANDS = registerBlock("stone_bricks_redstone_bands",
            new RedstoneOreBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block STONE_BRICKS_REDSTONE_CHEVRON = registerBlock("stone_bricks_redstone_chevron",
            new RedstoneOreBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block STONE_BRICKS_REDSTONE_WAVES = registerBlock("stone_bricks_redstone_waves",
            new RedstoneOreBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block STONE_BRICKS_QUARTZ_BANDS = registerBlock("stone_bricks_quartz_bands",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block STONE_BRICKS_QUARTZ_CHEVRON = registerBlock("stone_bricks_quartz_chevron",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block STONE_BRICKS_QUARTZ_WAVES = registerBlock("stone_bricks_quartz_waves",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));

    // Here start the deepslate bricks family of the metal and gem engraved blocks

    public static final Block DEEPSLATE_BRICKS_AMETHYST_BANDS = registerBlock("deepslate_bricks_amethyst_bands", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_BRICKS_AMETHYST_CHEVRON = registerBlock("deepslate_bricks_amethyst_chevron", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_BRICKS_AMETHYST_WAVES = registerBlock("deepslate_bricks_amethyst_waves", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_BRICKS_DIAMOND_BANDS = registerBlock("deepslate_bricks_diamond_bands", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_BRICKS_DIAMOND_CHEVRON = registerBlock("deepslate_bricks_diamond_chevron", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_BRICKS_DIAMOND_WAVES = registerBlock("deepslate_bricks_diamond_waves", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_BRICKS_EMERALD_BANDS = registerBlock("deepslate_bricks_emerald_bands", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_BRICKS_EMERALD_CHEVRON = registerBlock("deepslate_bricks_emerald_chevron", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_BRICKS_EMERALD_WAVES = registerBlock("deepslate_bricks_emerald_waves", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_BRICKS_GOLD_BANDS = registerBlock("deepslate_bricks_gold_bands", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_BRICKS_GOLD_CHEVRON = registerBlock("deepslate_bricks_gold_chevron", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_BRICKS_GOLD_WAVES = registerBlock("deepslate_bricks_gold_waves", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_BRICKS_IRON_BANDS = registerBlock("deepslate_bricks_iron_bands", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_BRICKS_IRON_CHEVRON = registerBlock("deepslate_bricks_iron_chevron", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_BRICKS_IRON_WAVES = registerBlock("deepslate_bricks_iron_waves", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));

    public static final Block DEEPSLATE_BRICKS_COPPER_BANDS = registerBlock("deepslate_bricks_copper_bands", new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_BRICKS_COPPER_CHEVRON = registerBlock("deepslate_bricks_copper_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_BRICKS_COPPER_WAVES = registerBlock("deepslate_bricks_copper_waves", new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_BRICKS_EXPOSED_COPPER_BANDS = registerBlock("deepslate_bricks_exposed_copper_bands", new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_BRICKS_EXPOSED_COPPER_CHEVRON = registerBlock("deepslate_bricks_exposed_copper_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_BRICKS_EXPOSED_COPPER_WAVES = registerBlock("deepslate_bricks_exposed_copper_waves", new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_BRICKS_WEATHERED_COPPER_BANDS = registerBlock("deepslate_bricks_weathered_copper_bands", new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_BRICKS_WEATHERED_COPPER_CHEVRON = registerBlock("deepslate_bricks_weathered_copper_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_BRICKS_WEATHERED_COPPER_WAVES = registerBlock("deepslate_bricks_weathered_copper_waves", new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_BRICKS_OXIDIZED_COPPER_BANDS = registerBlock("deepslate_bricks_oxidized_copper_bands", new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_BRICKS_OXIDIZED_COPPER_CHEVRON = registerBlock("deepslate_bricks_oxidized_copper_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_BRICKS_OXIDIZED_COPPER_WAVES = registerBlock("deepslate_bricks_oxidized_copper_waves", new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));

    public static final Block DEEPSLATE_BRICKS_WAXED_COPPER_BANDS = registerBlock("deepslate_bricks_waxed_copper_bands", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_BRICKS_WAXED_COPPER_CHEVRON = registerBlock("deepslate_bricks_waxed_copper_chevron", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_BRICKS_WAXED_COPPER_WAVES = registerBlock("deepslate_bricks_waxed_copper_waves", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_BRICKS_WAXED_EXPOSED_COPPER_BANDS = registerBlock("deepslate_bricks_waxed_exposed_copper_bands", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_BRICKS_WAXED_EXPOSED_COPPER_CHEVRON = registerBlock("deepslate_bricks_waxed_exposed_copper_chevron", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_BRICKS_WAXED_EXPOSED_COPPER_WAVES = registerBlock("deepslate_bricks_waxed_exposed_copper_waves", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_BRICKS_WAXED_WEATHERED_COPPER_BANDS = registerBlock("deepslate_bricks_waxed_weathered_copper_bands", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_BRICKS_WAXED_WEATHERED_COPPER_CHEVRON = registerBlock("deepslate_bricks_waxed_weathered_copper_chevron", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_BRICKS_WAXED_WEATHERED_COPPER_WAVES = registerBlock("deepslate_bricks_waxed_weathered_copper_waves", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_BRICKS_WAXED_OXIDIZED_COPPER_BANDS = registerBlock("deepslate_bricks_waxed_oxidized_copper_bands", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_BRICKS_WAXED_OXIDIZED_COPPER_CHEVRON = registerBlock("deepslate_bricks_waxed_oxidized_copper_chevron", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_BRICKS_WAXED_OXIDIZED_COPPER_WAVES = registerBlock("deepslate_bricks_waxed_oxidized_copper_waves", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));

    public static final Block DEEPSLATE_BRICKS_LAPIS_BANDS = registerBlock("deepslate_bricks_lapis_bands", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_BRICKS_LAPIS_CHEVRON = registerBlock("deepslate_bricks_lapis_chevron", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_BRICKS_LAPIS_WAVES = registerBlock("deepslate_bricks_lapis_waves", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_BRICKS_REDSTONE_BANDS = registerBlock("deepslate_bricks_redstone_bands", new RedstoneOreBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_BRICKS_REDSTONE_CHEVRON = registerBlock("deepslate_bricks_redstone_chevron", new RedstoneOreBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_BRICKS_REDSTONE_WAVES = registerBlock("deepslate_bricks_redstone_waves", new RedstoneOreBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_BRICKS_QUARTZ_BANDS = registerBlock("deepslate_bricks_quartz_bands", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_BRICKS_QUARTZ_CHEVRON = registerBlock("deepslate_bricks_quartz_chevron", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_BRICKS_QUARTZ_WAVES = registerBlock("deepslate_bricks_quartz_waves", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)));

    // Here start the mud bricks family of the metal and gem engraved blocks

    public static final Block MUD_BRICKS_GOLD_BANDS = registerBlock("mud_bricks_gold_bands",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block MUD_BRICKS_GOLD_CHEVRON = registerBlock("mud_bricks_gold_chevron",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block MUD_BRICKS_GOLD_WAVES = registerBlock("mud_bricks_gold_waves",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block MUD_BRICKS_IRON_BANDS = registerBlock("mud_bricks_iron_bands",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block MUD_BRICKS_IRON_CHEVRON = registerBlock("mud_bricks_iron_chevron",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block MUD_BRICKS_IRON_WAVES = registerBlock("mud_bricks_iron_waves",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));

    public static final Block MUD_BRICKS_COPPER_BANDS = registerBlock("mud_bricks_copper_bands",
            new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block MUD_BRICKS_COPPER_CHEVRON = registerBlock("mud_bricks_copper_chevron",
            new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block MUD_BRICKS_COPPER_WAVES = registerBlock("mud_bricks_copper_waves",
            new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block MUD_BRICKS_EXPOSED_COPPER_BANDS = registerBlock("mud_bricks_exposed_copper_bands",
            new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block MUD_BRICKS_EXPOSED_COPPER_CHEVRON = registerBlock("mud_bricks_exposed_copper_chevron",
            new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block MUD_BRICKS_EXPOSED_COPPER_WAVES = registerBlock("mud_bricks_exposed_copper_waves",
            new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block MUD_BRICKS_WEATHERED_COPPER_BANDS = registerBlock("mud_bricks_weathered_copper_bands",
            new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block MUD_BRICKS_WEATHERED_COPPER_CHEVRON = registerBlock("mud_bricks_weathered_copper_chevron",
            new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block MUD_BRICKS_WEATHERED_COPPER_WAVES = registerBlock("mud_bricks_weathered_copper_waves",
            new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block MUD_BRICKS_OXIDIZED_COPPER_BANDS = registerBlock("mud_bricks_oxidized_copper_bands",
            new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block MUD_BRICKS_OXIDIZED_COPPER_CHEVRON = registerBlock("mud_bricks_oxidized_copper_chevron",
            new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block MUD_BRICKS_OXIDIZED_COPPER_WAVES = registerBlock("mud_bricks_oxidized_copper_waves",
            new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));

    public static final Block MUD_BRICKS_WAXED_COPPER_BANDS = registerBlock("mud_bricks_waxed_copper_bands",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block MUD_BRICKS_WAXED_COPPER_CHEVRON = registerBlock("mud_bricks_waxed_copper_chevron",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block MUD_BRICKS_WAXED_COPPER_WAVES = registerBlock("mud_bricks_waxed_copper_waves",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block MUD_BRICKS_WAXED_EXPOSED_COPPER_BANDS = registerBlock("mud_bricks_waxed_exposed_copper_bands",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block MUD_BRICKS_WAXED_EXPOSED_COPPER_CHEVRON = registerBlock("mud_bricks_waxed_exposed_copper_chevron",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block MUD_BRICKS_WAXED_EXPOSED_COPPER_WAVES = registerBlock("mud_bricks_waxed_exposed_copper_waves",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block MUD_BRICKS_WAXED_WEATHERED_COPPER_BANDS = registerBlock("mud_bricks_waxed_weathered_copper_bands",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block MUD_BRICKS_WAXED_WEATHERED_COPPER_CHEVRON = registerBlock("mud_bricks_waxed_weathered_copper_chevron",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block MUD_BRICKS_WAXED_WEATHERED_COPPER_WAVES = registerBlock("mud_bricks_waxed_weathered_copper_waves",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block MUD_BRICKS_WAXED_OXIDIZED_COPPER_BANDS = registerBlock("mud_bricks_waxed_oxidized_copper_bands",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block MUD_BRICKS_WAXED_OXIDIZED_COPPER_CHEVRON = registerBlock("mud_bricks_waxed_oxidized_copper_chevron",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block MUD_BRICKS_WAXED_OXIDIZED_COPPER_WAVES = registerBlock("mud_bricks_waxed_oxidized_copper_waves",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));

    public static final Block MUD_BRICKS_LAPIS_BANDS = registerBlock("mud_bricks_lapis_bands",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block MUD_BRICKS_LAPIS_CHEVRON = registerBlock("mud_bricks_lapis_chevron",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block MUD_BRICKS_LAPIS_WAVES = registerBlock("mud_bricks_lapis_waves",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block MUD_BRICKS_REDSTONE_BANDS = registerBlock("mud_bricks_redstone_bands",
            new RedstoneOreBlock(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block MUD_BRICKS_REDSTONE_CHEVRON = registerBlock("mud_bricks_redstone_chevron",
            new RedstoneOreBlock(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block MUD_BRICKS_REDSTONE_WAVES = registerBlock("mud_bricks_redstone_waves",
            new RedstoneOreBlock(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block MUD_BRICKS_QUARTZ_BANDS = registerBlock("mud_bricks_quartz_bands",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block MUD_BRICKS_QUARTZ_CHEVRON = registerBlock("mud_bricks_quartz_chevron",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block MUD_BRICKS_QUARTZ_WAVES = registerBlock("mud_bricks_quartz_waves",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));

    // Here start the prismarine bricks family of the metal and gem engraved blocks

    public static final Block PRISMARINE_BRICKS_AMETHYST_BANDS = registerBlock("prismarine_bricks_amethyst_bands", new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICKS_AMETHYST_CHEVRON = registerBlock("prismarine_bricks_amethyst_chevron", new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICKS_AMETHYST_WAVES = registerBlock("prismarine_bricks_amethyst_waves", new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICKS_DIAMOND_BANDS = registerBlock("prismarine_bricks_diamond_bands", new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICKS_DIAMOND_CHEVRON = registerBlock("prismarine_bricks_diamond_chevron", new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICKS_DIAMOND_WAVES = registerBlock("prismarine_bricks_diamond_waves", new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICKS_EMERALD_BANDS = registerBlock("prismarine_bricks_emerald_bands", new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICKS_EMERALD_CHEVRON = registerBlock("prismarine_bricks_emerald_chevron", new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICKS_EMERALD_WAVES = registerBlock("prismarine_bricks_emerald_waves", new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICKS_GOLD_BANDS = registerBlock("prismarine_bricks_gold_bands", new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICKS_GOLD_CHEVRON = registerBlock("prismarine_bricks_gold_chevron", new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICKS_GOLD_WAVES = registerBlock("prismarine_bricks_gold_waves", new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICKS_IRON_BANDS = registerBlock("prismarine_bricks_iron_bands", new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICKS_IRON_CHEVRON = registerBlock("prismarine_bricks_iron_chevron", new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICKS_IRON_WAVES = registerBlock("prismarine_bricks_iron_waves", new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));

    public static final Block PRISMARINE_BRICKS_COPPER_BANDS = registerBlock("prismarine_bricks_copper_bands", new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICKS_COPPER_CHEVRON = registerBlock("prismarine_bricks_copper_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICKS_COPPER_WAVES = registerBlock("prismarine_bricks_copper_waves", new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICKS_EXPOSED_COPPER_BANDS = registerBlock("prismarine_bricks_exposed_copper_bands", new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICKS_EXPOSED_COPPER_CHEVRON = registerBlock("prismarine_bricks_exposed_copper_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICKS_EXPOSED_COPPER_WAVES = registerBlock("prismarine_bricks_exposed_copper_waves", new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICKS_WEATHERED_COPPER_BANDS = registerBlock("prismarine_bricks_weathered_copper_bands", new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICKS_WEATHERED_COPPER_CHEVRON = registerBlock("prismarine_bricks_weathered_copper_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICKS_WEATHERED_COPPER_WAVES = registerBlock("prismarine_bricks_weathered_copper_waves", new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICKS_OXIDIZED_COPPER_BANDS = registerBlock("prismarine_bricks_oxidized_copper_bands", new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICKS_OXIDIZED_COPPER_CHEVRON = registerBlock("prismarine_bricks_oxidized_copper_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICKS_OXIDIZED_COPPER_WAVES = registerBlock("prismarine_bricks_oxidized_copper_waves", new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));

    public static final Block PRISMARINE_BRICKS_WAXED_COPPER_BANDS = registerBlock("prismarine_bricks_waxed_copper_bands", new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICKS_WAXED_COPPER_CHEVRON = registerBlock("prismarine_bricks_waxed_copper_chevron", new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICKS_WAXED_COPPER_WAVES = registerBlock("prismarine_bricks_waxed_copper_waves", new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICKS_WAXED_EXPOSED_COPPER_BANDS = registerBlock("prismarine_bricks_waxed_exposed_copper_bands", new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICKS_WAXED_EXPOSED_COPPER_CHEVRON = registerBlock("prismarine_bricks_waxed_exposed_copper_chevron", new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICKS_WAXED_EXPOSED_COPPER_WAVES = registerBlock("prismarine_bricks_waxed_exposed_copper_waves", new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICKS_WAXED_WEATHERED_COPPER_BANDS = registerBlock("prismarine_bricks_waxed_weathered_copper_bands", new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICKS_WAXED_WEATHERED_COPPER_CHEVRON = registerBlock("prismarine_bricks_waxed_weathered_copper_chevron", new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICKS_WAXED_WEATHERED_COPPER_WAVES = registerBlock("prismarine_bricks_waxed_weathered_copper_waves", new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICKS_WAXED_OXIDIZED_COPPER_BANDS = registerBlock("prismarine_bricks_waxed_oxidized_copper_bands", new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICKS_WAXED_OXIDIZED_COPPER_CHEVRON = registerBlock("prismarine_bricks_waxed_oxidized_copper_chevron", new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICKS_WAXED_OXIDIZED_COPPER_WAVES = registerBlock("prismarine_bricks_waxed_oxidized_copper_waves", new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));

    public static final Block PRISMARINE_BRICKS_LAPIS_BANDS = registerBlock("prismarine_bricks_lapis_bands", new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICKS_LAPIS_CHEVRON = registerBlock("prismarine_bricks_lapis_chevron", new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICKS_LAPIS_WAVES = registerBlock("prismarine_bricks_lapis_waves", new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICKS_REDSTONE_BANDS = registerBlock("prismarine_bricks_redstone_bands", new RedstoneOreBlock(FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICKS_REDSTONE_CHEVRON = registerBlock("prismarine_bricks_redstone_chevron", new RedstoneOreBlock(FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICKS_REDSTONE_WAVES = registerBlock("prismarine_bricks_redstone_waves", new RedstoneOreBlock(FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICKS_QUARTZ_BANDS = registerBlock("prismarine_bricks_quartz_bands", new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICKS_QUARTZ_CHEVRON = registerBlock("prismarine_bricks_quartz_chevron", new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICKS_QUARTZ_WAVES = registerBlock("prismarine_bricks_quartz_waves", new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE_BRICKS)));

    // Here start the sandstone family of the metal and gem engraved blocks

    public static final Block SANDSTONE_GOLD_BANDS = registerBlock("sandstone_gold_bands", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block SANDSTONE_GOLD_CHEVRON = registerBlock("sandstone_gold_chevron", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block SANDSTONE_GOLD_WAVES = registerBlock("sandstone_gold_waves", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block SANDSTONE_IRON_BANDS = registerBlock("sandstone_iron_bands", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block SANDSTONE_IRON_CHEVRON = registerBlock("sandstone_iron_chevron", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block SANDSTONE_IRON_WAVES = registerBlock("sandstone_iron_waves", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));

    public static final Block SANDSTONE_COPPER_BANDS = registerBlock("sandstone_copper_bands", new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block SANDSTONE_COPPER_CHEVRON = registerBlock("sandstone_copper_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block SANDSTONE_COPPER_WAVES = registerBlock("sandstone_copper_waves", new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block SANDSTONE_EXPOSED_COPPER_BANDS = registerBlock("sandstone_exposed_copper_bands", new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block SANDSTONE_EXPOSED_COPPER_CHEVRON = registerBlock("sandstone_exposed_copper_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block SANDSTONE_EXPOSED_COPPER_WAVES = registerBlock("sandstone_exposed_copper_waves", new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block SANDSTONE_WEATHERED_COPPER_BANDS = registerBlock("sandstone_weathered_copper_bands", new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block SANDSTONE_WEATHERED_COPPER_CHEVRON = registerBlock("sandstone_weathered_copper_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block SANDSTONE_WEATHERED_COPPER_WAVES = registerBlock("sandstone_weathered_copper_waves", new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block SANDSTONE_OXIDIZED_COPPER_BANDS = registerBlock("sandstone_oxidized_copper_bands", new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block SANDSTONE_OXIDIZED_COPPER_CHEVRON = registerBlock("sandstone_oxidized_copper_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block SANDSTONE_OXIDIZED_COPPER_WAVES = registerBlock("sandstone_oxidized_copper_waves", new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.SANDSTONE)));

    public static final Block SANDSTONE_WAXED_COPPER_BANDS = registerBlock("sandstone_waxed_copper_bands", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block SANDSTONE_WAXED_COPPER_CHEVRON = registerBlock("sandstone_waxed_copper_chevron", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block SANDSTONE_WAXED_COPPER_WAVES = registerBlock("sandstone_waxed_copper_waves", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block SANDSTONE_WAXED_EXPOSED_COPPER_BANDS = registerBlock("sandstone_waxed_exposed_copper_bands", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block SANDSTONE_WAXED_EXPOSED_COPPER_CHEVRON = registerBlock("sandstone_waxed_exposed_copper_chevron", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block SANDSTONE_WAXED_EXPOSED_COPPER_WAVES = registerBlock("sandstone_waxed_exposed_copper_waves", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block SANDSTONE_WAXED_WEATHERED_COPPER_BANDS = registerBlock("sandstone_waxed_weathered_copper_bands", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block SANDSTONE_WAXED_WEATHERED_COPPER_CHEVRON = registerBlock("sandstone_waxed_weathered_copper_chevron", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block SANDSTONE_WAXED_WEATHERED_COPPER_WAVES = registerBlock("sandstone_waxed_weathered_copper_waves", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block SANDSTONE_WAXED_OXIDIZED_COPPER_BANDS = registerBlock("sandstone_waxed_oxidized_copper_bands", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block SANDSTONE_WAXED_OXIDIZED_COPPER_CHEVRON = registerBlock("sandstone_waxed_oxidized_copper_chevron", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block SANDSTONE_WAXED_OXIDIZED_COPPER_WAVES = registerBlock("sandstone_waxed_oxidized_copper_waves", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));

    public static final Block SANDSTONE_LAPIS_BANDS = registerBlock("sandstone_lapis_bands", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block SANDSTONE_LAPIS_CHEVRON = registerBlock("sandstone_lapis_chevron", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block SANDSTONE_LAPIS_WAVES = registerBlock("sandstone_lapis_waves", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block SANDSTONE_REDSTONE_BANDS = registerBlock("sandstone_redstone_bands", new RedstoneOreBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block SANDSTONE_REDSTONE_CHEVRON = registerBlock("sandstone_redstone_chevron", new RedstoneOreBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block SANDSTONE_REDSTONE_WAVES = registerBlock("sandstone_redstone_waves", new RedstoneOreBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block SANDSTONE_QUARTZ_BANDS = registerBlock("sandstone_quartz_bands", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block SANDSTONE_QUARTZ_CHEVRON = registerBlock("sandstone_quartz_chevron", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block SANDSTONE_QUARTZ_WAVES = registerBlock("sandstone_quartz_waves", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));

    // Here start the red sandstone family of the metal and gem engraved blocks

    public static final Block RED_SANDSTONE_GOLD_BANDS = registerBlock("red_sandstone_gold_bands", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block RED_SANDSTONE_GOLD_CHEVRON = registerBlock("red_sandstone_gold_chevron", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block RED_SANDSTONE_GOLD_WAVES = registerBlock("red_sandstone_gold_waves", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block RED_SANDSTONE_IRON_BANDS = registerBlock("red_sandstone_iron_bands", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block RED_SANDSTONE_IRON_CHEVRON = registerBlock("red_sandstone_iron_chevron", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block RED_SANDSTONE_IRON_WAVES = registerBlock("red_sandstone_iron_waves", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));

    public static final Block RED_SANDSTONE_COPPER_BANDS = registerBlock("red_sandstone_copper_bands", new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block RED_SANDSTONE_COPPER_CHEVRON = registerBlock("red_sandstone_copper_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block RED_SANDSTONE_COPPER_WAVES = registerBlock("red_sandstone_copper_waves", new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block RED_SANDSTONE_EXPOSED_COPPER_BANDS = registerBlock("red_sandstone_exposed_copper_bands", new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block RED_SANDSTONE_EXPOSED_COPPER_CHEVRON = registerBlock("red_sandstone_exposed_copper_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block RED_SANDSTONE_EXPOSED_COPPER_WAVES = registerBlock("red_sandstone_exposed_copper_waves", new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block RED_SANDSTONE_WEATHERED_COPPER_BANDS = registerBlock("red_sandstone_weathered_copper_bands", new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block RED_SANDSTONE_WEATHERED_COPPER_CHEVRON = registerBlock("red_sandstone_weathered_copper_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block RED_SANDSTONE_WEATHERED_COPPER_WAVES = registerBlock("red_sandstone_weathered_copper_waves", new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block RED_SANDSTONE_OXIDIZED_COPPER_BANDS = registerBlock("red_sandstone_oxidized_copper_bands", new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block RED_SANDSTONE_OXIDIZED_COPPER_CHEVRON = registerBlock("red_sandstone_oxidized_copper_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block RED_SANDSTONE_OXIDIZED_COPPER_WAVES = registerBlock("red_sandstone_oxidized_copper_waves", new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.SANDSTONE)));

    public static final Block RED_SANDSTONE_WAXED_COPPER_BANDS = registerBlock("red_sandstone_waxed_copper_bands", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block RED_SANDSTONE_WAXED_COPPER_CHEVRON = registerBlock("red_sandstone_waxed_copper_chevron", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block RED_SANDSTONE_WAXED_COPPER_WAVES = registerBlock("red_sandstone_waxed_copper_waves", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block RED_SANDSTONE_WAXED_EXPOSED_COPPER_BANDS = registerBlock("red_sandstone_waxed_exposed_copper_bands", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block RED_SANDSTONE_WAXED_EXPOSED_COPPER_CHEVRON = registerBlock("red_sandstone_waxed_exposed_copper_chevron", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block RED_SANDSTONE_WAXED_EXPOSED_COPPER_WAVES = registerBlock("red_sandstone_waxed_exposed_copper_waves", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block RED_SANDSTONE_WAXED_WEATHERED_COPPER_BANDS = registerBlock("red_sandstone_waxed_weathered_copper_bands", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block RED_SANDSTONE_WAXED_WEATHERED_COPPER_CHEVRON = registerBlock("red_sandstone_waxed_weathered_copper_chevron", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block RED_SANDSTONE_WAXED_WEATHERED_COPPER_WAVES = registerBlock("red_sandstone_waxed_weathered_copper_waves", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block RED_SANDSTONE_WAXED_OXIDIZED_COPPER_BANDS = registerBlock("red_sandstone_waxed_oxidized_copper_bands", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block RED_SANDSTONE_WAXED_OXIDIZED_COPPER_CHEVRON = registerBlock("red_sandstone_waxed_oxidized_copper_chevron", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block RED_SANDSTONE_WAXED_OXIDIZED_COPPER_WAVES = registerBlock("red_sandstone_waxed_oxidized_copper_waves", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));

    public static final Block RED_SANDSTONE_LAPIS_BANDS = registerBlock("red_sandstone_lapis_bands", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block RED_SANDSTONE_LAPIS_CHEVRON = registerBlock("red_sandstone_lapis_chevron", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block RED_SANDSTONE_LAPIS_WAVES = registerBlock("red_sandstone_lapis_waves", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block RED_SANDSTONE_REDSTONE_BANDS = registerBlock("red_sandstone_redstone_bands", new RedstoneOreBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block RED_SANDSTONE_REDSTONE_CHEVRON = registerBlock("red_sandstone_redstone_chevron", new RedstoneOreBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block RED_SANDSTONE_REDSTONE_WAVES = registerBlock("red_sandstone_redstone_waves", new RedstoneOreBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block RED_SANDSTONE_QUARTZ_BANDS = registerBlock("red_sandstone_quartz_bands", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block RED_SANDSTONE_QUARTZ_CHEVRON = registerBlock("red_sandstone_quartz_chevron", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block RED_SANDSTONE_QUARTZ_WAVES = registerBlock("red_sandstone_quartz_waves", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));

    // This section is for the Cut Copper blocks (they are a lot on their own)
    // Here start the cut copper family of the metal and gem engraved blocks

    public static final Block CUT_COPPER_AMETHYST_BANDS = registerBlock("cut_copper_amethyst_bands", new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block CUT_COPPER_AMETHYST_CHEVRON = registerBlock("cut_copper_amethyst_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block CUT_COPPER_AMETHYST_WAVES = registerBlock("cut_copper_amethyst_waves", new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block CUT_COPPER_DIAMOND_BANDS = registerBlock("cut_copper_diamond_bands", new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block CUT_COPPER_DIAMOND_CHEVRON = registerBlock("cut_copper_diamond_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block CUT_COPPER_DIAMOND_WAVES = registerBlock("cut_copper_diamond_waves", new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block CUT_COPPER_EMERALD_BANDS = registerBlock("cut_copper_emerald_bands", new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block CUT_COPPER_EMERALD_CHEVRON = registerBlock("cut_copper_emerald_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block CUT_COPPER_EMERALD_WAVES = registerBlock("cut_copper_emerald_waves", new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block CUT_COPPER_GOLD_BANDS = registerBlock("cut_copper_gold_bands", new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block CUT_COPPER_GOLD_CHEVRON = registerBlock("cut_copper_gold_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block CUT_COPPER_GOLD_WAVES = registerBlock("cut_copper_gold_waves", new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block CUT_COPPER_IRON_BANDS = registerBlock("cut_copper_iron_bands", new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block CUT_COPPER_IRON_CHEVRON = registerBlock("cut_copper_iron_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block CUT_COPPER_IRON_WAVES = registerBlock("cut_copper_iron_waves", new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));

    public static final Block WAXED_CUT_COPPER_AMETHYST_BANDS = registerBlock("waxed_cut_copper_amethyst_bands", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_CUT_COPPER_AMETHYST_CHEVRON = registerBlock("waxed_cut_copper_amethyst_chevron", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_CUT_COPPER_AMETHYST_WAVES = registerBlock("waxed_cut_copper_amethyst_waves", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_CUT_COPPER_DIAMOND_BANDS = registerBlock("waxed_cut_copper_diamond_bands", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_CUT_COPPER_DIAMOND_CHEVRON = registerBlock("waxed_cut_copper_diamond_chevron", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_CUT_COPPER_DIAMOND_WAVES = registerBlock("waxed_cut_copper_diamond_waves", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_CUT_COPPER_EMERALD_BANDS = registerBlock("waxed_cut_copper_emerald_bands", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_CUT_COPPER_EMERALD_CHEVRON = registerBlock("waxed_cut_copper_emerald_chevron", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_CUT_COPPER_EMERALD_WAVES = registerBlock("waxed_cut_copper_emerald_waves", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_CUT_COPPER_GOLD_BANDS = registerBlock("waxed_cut_copper_gold_bands", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_CUT_COPPER_GOLD_CHEVRON = registerBlock("waxed_cut_copper_gold_chevron", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_CUT_COPPER_GOLD_WAVES = registerBlock("waxed_cut_copper_gold_waves", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_CUT_COPPER_IRON_BANDS = registerBlock("waxed_cut_copper_iron_bands", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_CUT_COPPER_IRON_CHEVRON = registerBlock("waxed_cut_copper_iron_chevron", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_CUT_COPPER_IRON_WAVES = registerBlock("waxed_cut_copper_iron_waves", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));

    // Here start the exposed cut copper family of the metal and gem engraved blocks

    public static final Block EXPOSED_CUT_COPPER_AMETHYST_BANDS = registerBlock("exposed_cut_copper_amethyst_bands", new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block EXPOSED_CUT_COPPER_AMETHYST_CHEVRON = registerBlock("exposed_cut_copper_amethyst_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block EXPOSED_CUT_COPPER_AMETHYST_WAVES = registerBlock("exposed_cut_copper_amethyst_waves", new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block EXPOSED_CUT_COPPER_DIAMOND_BANDS = registerBlock("exposed_cut_copper_diamond_bands", new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block EXPOSED_CUT_COPPER_DIAMOND_CHEVRON = registerBlock("exposed_cut_copper_diamond_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block EXPOSED_CUT_COPPER_DIAMOND_WAVES = registerBlock("exposed_cut_copper_diamond_waves", new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block EXPOSED_CUT_COPPER_EMERALD_BANDS = registerBlock("exposed_cut_copper_emerald_bands", new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block EXPOSED_CUT_COPPER_EMERALD_CHEVRON = registerBlock("exposed_cut_copper_emerald_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block EXPOSED_CUT_COPPER_EMERALD_WAVES = registerBlock("exposed_cut_copper_emerald_waves", new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block EXPOSED_CUT_COPPER_GOLD_BANDS = registerBlock("exposed_cut_copper_gold_bands", new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block EXPOSED_CUT_COPPER_GOLD_CHEVRON = registerBlock("exposed_cut_copper_gold_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block EXPOSED_CUT_COPPER_GOLD_WAVES = registerBlock("exposed_cut_copper_gold_waves", new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block EXPOSED_CUT_COPPER_IRON_BANDS = registerBlock("exposed_cut_copper_iron_bands", new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block EXPOSED_CUT_COPPER_IRON_CHEVRON = registerBlock("exposed_cut_copper_iron_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block EXPOSED_CUT_COPPER_IRON_WAVES = registerBlock("exposed_cut_copper_iron_waves", new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));

    public static final Block WAXED_EXPOSED_CUT_COPPER_AMETHYST_BANDS = registerBlock("waxed_exposed_cut_copper_amethyst_bands", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_EXPOSED_CUT_COPPER_AMETHYST_CHEVRON = registerBlock("waxed_exposed_cut_copper_amethyst_chevron", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_EXPOSED_CUT_COPPER_AMETHYST_WAVES = registerBlock("waxed_exposed_cut_copper_amethyst_waves", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_EXPOSED_CUT_COPPER_DIAMOND_BANDS = registerBlock("waxed_exposed_cut_copper_diamond_bands", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_EXPOSED_CUT_COPPER_DIAMOND_CHEVRON = registerBlock("waxed_exposed_cut_copper_diamond_chevron", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_EXPOSED_CUT_COPPER_DIAMOND_WAVES = registerBlock("waxed_exposed_cut_copper_diamond_waves", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_EXPOSED_CUT_COPPER_EMERALD_BANDS = registerBlock("waxed_exposed_cut_copper_emerald_bands", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_EXPOSED_CUT_COPPER_EMERALD_CHEVRON = registerBlock("waxed_exposed_cut_copper_emerald_chevron", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_EXPOSED_CUT_COPPER_EMERALD_WAVES = registerBlock("waxed_exposed_cut_copper_emerald_waves", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_EXPOSED_CUT_COPPER_GOLD_BANDS = registerBlock("waxed_exposed_cut_copper_gold_bands", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_EXPOSED_CUT_COPPER_GOLD_CHEVRON = registerBlock("waxed_exposed_cut_copper_gold_chevron", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_EXPOSED_CUT_COPPER_GOLD_WAVES = registerBlock("waxed_exposed_cut_copper_gold_waves", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_EXPOSED_CUT_COPPER_IRON_BANDS = registerBlock("waxed_exposed_cut_copper_iron_bands", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_EXPOSED_CUT_COPPER_IRON_CHEVRON = registerBlock("waxed_exposed_cut_copper_iron_chevron", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_EXPOSED_CUT_COPPER_IRON_WAVES = registerBlock("waxed_exposed_cut_copper_iron_waves", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));

    // Here start the weathered cut copper family of the metal and gem engraved blocks

    public static final Block WEATHERED_CUT_COPPER_AMETHYST_BANDS = registerBlock("weathered_cut_copper_amethyst_bands", new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WEATHERED_CUT_COPPER_AMETHYST_CHEVRON = registerBlock("weathered_cut_copper_amethyst_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WEATHERED_CUT_COPPER_AMETHYST_WAVES = registerBlock("weathered_cut_copper_amethyst_waves", new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WEATHERED_CUT_COPPER_DIAMOND_BANDS = registerBlock("weathered_cut_copper_diamond_bands", new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WEATHERED_CUT_COPPER_DIAMOND_CHEVRON = registerBlock("weathered_cut_copper_diamond_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WEATHERED_CUT_COPPER_DIAMOND_WAVES = registerBlock("weathered_cut_copper_diamond_waves", new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WEATHERED_CUT_COPPER_EMERALD_BANDS = registerBlock("weathered_cut_copper_emerald_bands", new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WEATHERED_CUT_COPPER_EMERALD_CHEVRON = registerBlock("weathered_cut_copper_emerald_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WEATHERED_CUT_COPPER_EMERALD_WAVES = registerBlock("weathered_cut_copper_emerald_waves", new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WEATHERED_CUT_COPPER_GOLD_BANDS = registerBlock("weathered_cut_copper_gold_bands", new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WEATHERED_CUT_COPPER_GOLD_CHEVRON = registerBlock("weathered_cut_copper_gold_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WEATHERED_CUT_COPPER_GOLD_WAVES = registerBlock("weathered_cut_copper_gold_waves", new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WEATHERED_CUT_COPPER_IRON_BANDS = registerBlock("weathered_cut_copper_iron_bands", new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WEATHERED_CUT_COPPER_IRON_CHEVRON = registerBlock("weathered_cut_copper_iron_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WEATHERED_CUT_COPPER_IRON_WAVES = registerBlock("weathered_cut_copper_iron_waves", new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));

    public static final Block WAXED_WEATHERED_CUT_COPPER_AMETHYST_BANDS = registerBlock("waxed_weathered_cut_copper_amethyst_bands", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_WEATHERED_CUT_COPPER_AMETHYST_CHEVRON = registerBlock("waxed_weathered_cut_copper_amethyst_chevron", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_WEATHERED_CUT_COPPER_AMETHYST_WAVES = registerBlock("waxed_weathered_cut_copper_amethyst_waves", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_WEATHERED_CUT_COPPER_DIAMOND_BANDS = registerBlock("waxed_weathered_cut_copper_diamond_bands", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_WEATHERED_CUT_COPPER_DIAMOND_CHEVRON = registerBlock("waxed_weathered_cut_copper_diamond_chevron", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_WEATHERED_CUT_COPPER_DIAMOND_WAVES = registerBlock("waxed_weathered_cut_copper_diamond_waves", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_WEATHERED_CUT_COPPER_EMERALD_BANDS = registerBlock("waxed_weathered_cut_copper_emerald_bands", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_WEATHERED_CUT_COPPER_EMERALD_CHEVRON = registerBlock("waxed_weathered_cut_copper_emerald_chevron", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_WEATHERED_CUT_COPPER_EMERALD_WAVES = registerBlock("waxed_weathered_cut_copper_emerald_waves", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_WEATHERED_CUT_COPPER_GOLD_BANDS = registerBlock("waxed_weathered_cut_copper_gold_bands", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_WEATHERED_CUT_COPPER_GOLD_CHEVRON = registerBlock("waxed_weathered_cut_copper_gold_chevron", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_WEATHERED_CUT_COPPER_GOLD_WAVES = registerBlock("waxed_weathered_cut_copper_gold_waves", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_WEATHERED_CUT_COPPER_IRON_BANDS = registerBlock("waxed_weathered_cut_copper_iron_bands", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_WEATHERED_CUT_COPPER_IRON_CHEVRON = registerBlock("waxed_weathered_cut_copper_iron_chevron", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_WEATHERED_CUT_COPPER_IRON_WAVES = registerBlock("waxed_weathered_cut_copper_iron_waves", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));

    // Here start the oxidized cut copper family of the metal and gem engraved blocks

    public static final Block OXIDIZED_CUT_COPPER_AMETHYST_BANDS = registerBlock("oxidized_cut_copper_amethyst_bands", new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block OXIDIZED_CUT_COPPER_AMETHYST_CHEVRON = registerBlock("oxidized_cut_copper_amethyst_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block OXIDIZED_CUT_COPPER_AMETHYST_WAVES = registerBlock("oxidized_cut_copper_amethyst_waves", new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block OXIDIZED_CUT_COPPER_DIAMOND_BANDS = registerBlock("oxidized_cut_copper_diamond_bands", new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block OXIDIZED_CUT_COPPER_DIAMOND_CHEVRON = registerBlock("oxidized_cut_copper_diamond_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block OXIDIZED_CUT_COPPER_DIAMOND_WAVES = registerBlock("oxidized_cut_copper_diamond_waves", new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block OXIDIZED_CUT_COPPER_EMERALD_BANDS = registerBlock("oxidized_cut_copper_emerald_bands", new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block OXIDIZED_CUT_COPPER_EMERALD_CHEVRON = registerBlock("oxidized_cut_copper_emerald_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block OXIDIZED_CUT_COPPER_EMERALD_WAVES = registerBlock("oxidized_cut_copper_emerald_waves", new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block OXIDIZED_CUT_COPPER_GOLD_BANDS = registerBlock("oxidized_cut_copper_gold_bands", new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block OXIDIZED_CUT_COPPER_GOLD_CHEVRON = registerBlock("oxidized_cut_copper_gold_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block OXIDIZED_CUT_COPPER_GOLD_WAVES = registerBlock("oxidized_cut_copper_gold_waves", new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block OXIDIZED_CUT_COPPER_IRON_BANDS = registerBlock("oxidized_cut_copper_iron_bands", new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block OXIDIZED_CUT_COPPER_IRON_CHEVRON = registerBlock("oxidized_cut_copper_iron_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block OXIDIZED_CUT_COPPER_IRON_WAVES = registerBlock("oxidized_cut_copper_iron_waves", new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));

    public static final Block WAXED_OXIDIZED_CUT_COPPER_AMETHYST_BANDS = registerBlock("waxed_oxidized_cut_copper_amethyst_bands", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_OXIDIZED_CUT_COPPER_AMETHYST_CHEVRON = registerBlock("waxed_oxidized_cut_copper_amethyst_chevron", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_OXIDIZED_CUT_COPPER_AMETHYST_WAVES = registerBlock("waxed_oxidized_cut_copper_amethyst_waves", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_OXIDIZED_CUT_COPPER_DIAMOND_BANDS = registerBlock("waxed_oxidized_cut_copper_diamond_bands", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_OXIDIZED_CUT_COPPER_DIAMOND_CHEVRON = registerBlock("waxed_oxidized_cut_copper_diamond_chevron", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_OXIDIZED_CUT_COPPER_DIAMOND_WAVES = registerBlock("waxed_oxidized_cut_copper_diamond_waves", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_OXIDIZED_CUT_COPPER_EMERALD_BANDS = registerBlock("waxed_oxidized_cut_copper_emerald_bands", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_OXIDIZED_CUT_COPPER_EMERALD_CHEVRON = registerBlock("waxed_oxidized_cut_copper_emerald_chevron", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_OXIDIZED_CUT_COPPER_EMERALD_WAVES = registerBlock("waxed_oxidized_cut_copper_emerald_waves", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_OXIDIZED_CUT_COPPER_GOLD_BANDS = registerBlock("waxed_oxidized_cut_copper_gold_bands", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_OXIDIZED_CUT_COPPER_GOLD_CHEVRON = registerBlock("waxed_oxidized_cut_copper_gold_chevron", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_OXIDIZED_CUT_COPPER_GOLD_WAVES = registerBlock("waxed_oxidized_cut_copper_gold_waves", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_OXIDIZED_CUT_COPPER_IRON_BANDS = registerBlock("waxed_oxidized_cut_copper_iron_bands", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_OXIDIZED_CUT_COPPER_IRON_CHEVRON = registerBlock("waxed_oxidized_cut_copper_iron_chevron", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));
    public static final Block WAXED_OXIDIZED_CUT_COPPER_IRON_WAVES = registerBlock("waxed_oxidized_cut_copper_iron_waves", new Block(FabricBlockSettings.copyOf(Blocks.CUT_COPPER)));

    //this section is for the Nether and End blocks
    // Here start the nether bricks family of the metal and gem engraved blocks

    public static final Block NETHER_BRICKS_GOLD_BANDS = registerBlock("nether_bricks_gold_bands", new Block(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS)));
    public static final Block NETHER_BRICKS_GOLD_CHEVRON = registerBlock("nether_bricks_gold_chevron", new Block(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS)));
    public static final Block NETHER_BRICKS_GOLD_WAVES = registerBlock("nether_bricks_gold_waves", new Block(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS)));
    public static final Block NETHER_BRICKS_IRON_BANDS = registerBlock("nether_bricks_iron_bands", new Block(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS)));
    public static final Block NETHER_BRICKS_IRON_CHEVRON = registerBlock("nether_bricks_iron_chevron", new Block(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS)));
    public static final Block NETHER_BRICKS_IRON_WAVES = registerBlock("nether_bricks_iron_waves", new Block(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS)));

    public static final Block NETHER_BRICKS_COPPER_BANDS = registerBlock("nether_bricks_copper_bands", new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS)));
    public static final Block NETHER_BRICKS_COPPER_CHEVRON = registerBlock("nether_bricks_copper_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS)));
    public static final Block NETHER_BRICKS_COPPER_WAVES = registerBlock("nether_bricks_copper_waves", new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS)));
    public static final Block NETHER_BRICKS_EXPOSED_COPPER_BANDS = registerBlock("nether_bricks_exposed_copper_bands", new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS)));
    public static final Block NETHER_BRICKS_EXPOSED_COPPER_CHEVRON = registerBlock("nether_bricks_exposed_copper_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS)));
    public static final Block NETHER_BRICKS_EXPOSED_COPPER_WAVES = registerBlock("nether_bricks_exposed_copper_waves", new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS)));
    public static final Block NETHER_BRICKS_WEATHERED_COPPER_BANDS = registerBlock("nether_bricks_weathered_copper_bands", new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS)));
    public static final Block NETHER_BRICKS_WEATHERED_COPPER_CHEVRON = registerBlock("nether_bricks_weathered_copper_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS)));
    public static final Block NETHER_BRICKS_WEATHERED_COPPER_WAVES = registerBlock("nether_bricks_weathered_copper_waves", new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS)));
    public static final Block NETHER_BRICKS_OXIDIZED_COPPER_BANDS = registerBlock("nether_bricks_oxidized_copper_bands", new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS)));
    public static final Block NETHER_BRICKS_OXIDIZED_COPPER_CHEVRON = registerBlock("nether_bricks_oxidized_copper_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS)));
    public static final Block NETHER_BRICKS_OXIDIZED_COPPER_WAVES = registerBlock("nether_bricks_oxidized_copper_waves", new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS)));

    public static final Block NETHER_BRICKS_WAXED_COPPER_BANDS = registerBlock("nether_bricks_waxed_copper_bands", new Block(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS)));
    public static final Block NETHER_BRICKS_WAXED_COPPER_CHEVRON = registerBlock("nether_bricks_waxed_copper_chevron", new Block(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS)));
    public static final Block NETHER_BRICKS_WAXED_COPPER_WAVES = registerBlock("nether_bricks_waxed_copper_waves", new Block(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS)));
    public static final Block NETHER_BRICKS_WAXED_EXPOSED_COPPER_BANDS = registerBlock("nether_bricks_waxed_exposed_copper_bands", new Block(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS)));
    public static final Block NETHER_BRICKS_WAXED_EXPOSED_COPPER_CHEVRON = registerBlock("nether_bricks_waxed_exposed_copper_chevron", new Block(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS)));
    public static final Block NETHER_BRICKS_WAXED_EXPOSED_COPPER_WAVES = registerBlock("nether_bricks_waxed_exposed_copper_waves", new Block(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS)));
    public static final Block NETHER_BRICKS_WAXED_WEATHERED_COPPER_BANDS = registerBlock("nether_bricks_waxed_weathered_copper_bands", new Block(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS)));
    public static final Block NETHER_BRICKS_WAXED_WEATHERED_COPPER_CHEVRON = registerBlock("nether_bricks_waxed_weathered_copper_chevron", new Block(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS)));
    public static final Block NETHER_BRICKS_WAXED_WEATHERED_COPPER_WAVES = registerBlock("nether_bricks_waxed_weathered_copper_waves", new Block(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS)));
    public static final Block NETHER_BRICKS_WAXED_OXIDIZED_COPPER_BANDS = registerBlock("nether_bricks_waxed_oxidized_copper_bands", new Block(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS)));
    public static final Block NETHER_BRICKS_WAXED_OXIDIZED_COPPER_CHEVRON = registerBlock("nether_bricks_waxed_oxidized_copper_chevron", new Block(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS)));
    public static final Block NETHER_BRICKS_WAXED_OXIDIZED_COPPER_WAVES = registerBlock("nether_bricks_waxed_oxidized_copper_waves", new Block(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS)));

    public static final Block NETHER_BRICKS_LAPIS_BANDS = registerBlock("nether_bricks_lapis_bands", new Block(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS)));
    public static final Block NETHER_BRICKS_LAPIS_CHEVRON = registerBlock("nether_bricks_lapis_chevron", new Block(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS)));
    public static final Block NETHER_BRICKS_LAPIS_WAVES = registerBlock("nether_bricks_lapis_waves", new Block(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS)));
    public static final Block NETHER_BRICKS_REDSTONE_BANDS = registerBlock("nether_bricks_redstone_bands", new RedstoneOreBlock(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS)));
    public static final Block NETHER_BRICKS_REDSTONE_CHEVRON = registerBlock("nether_bricks_redstone_chevron", new RedstoneOreBlock(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS)));
    public static final Block NETHER_BRICKS_REDSTONE_WAVES = registerBlock("nether_bricks_redstone_waves", new RedstoneOreBlock(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS)));
    public static final Block NETHER_BRICKS_QUARTZ_BANDS = registerBlock("nether_bricks_quartz_bands", new Block(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS)));
    public static final Block NETHER_BRICKS_QUARTZ_CHEVRON = registerBlock("nether_bricks_quartz_chevron", new Block(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS)));
    public static final Block NETHER_BRICKS_QUARTZ_WAVES = registerBlock("nether_bricks_quartz_waves", new Block(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS)));
    public static final Block NETHER_BRICKS_BLAZE_BANDS = registerBlock("nether_bricks_blaze_bands", new Block(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS).luminance(10)));
    public static final Block NETHER_BRICKS_BLAZE_CHEVRON = registerBlock("nether_bricks_blaze_chevron", new Block(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS).luminance(10)));
    public static final Block NETHER_BRICKS_BLAZE_WAVES = registerBlock("nether_bricks_blaze_waves", new Block(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS).luminance(10)));

    // Here start the polished blackstone bricks family of the metal and gem engraved blocks

    public static final Block POLISHED_BLACKSTONE_BRICKS_AMETHYST_BANDS = registerBlock("polished_blackstone_bricks_amethyst_bands", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_BRICKS_AMETHYST_CHEVRON = registerBlock("polished_blackstone_bricks_amethyst_chevron", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_BRICKS_AMETHYST_WAVES = registerBlock("polished_blackstone_bricks_amethyst_waves", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_BRICKS_DIAMOND_BANDS = registerBlock("polished_blackstone_bricks_diamond_bands", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_BRICKS_DIAMOND_CHEVRON = registerBlock("polished_blackstone_bricks_diamond_chevron", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_BRICKS_DIAMOND_WAVES = registerBlock("polished_blackstone_bricks_diamond_waves", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_BRICKS_EMERALD_BANDS = registerBlock("polished_blackstone_bricks_emerald_bands", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_BRICKS_EMERALD_CHEVRON = registerBlock("polished_blackstone_bricks_emerald_chevron", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_BRICKS_EMERALD_WAVES = registerBlock("polished_blackstone_bricks_emerald_waves", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_BRICKS_GOLD_BANDS = registerBlock("polished_blackstone_bricks_gold_bands", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_BRICKS_GOLD_CHEVRON = registerBlock("polished_blackstone_bricks_gold_chevron", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_BRICKS_GOLD_WAVES = registerBlock("polished_blackstone_bricks_gold_waves", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_BRICKS_IRON_BANDS = registerBlock("polished_blackstone_bricks_iron_bands", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_BRICKS_IRON_CHEVRON = registerBlock("polished_blackstone_bricks_iron_chevron", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_BRICKS_IRON_WAVES = registerBlock("polished_blackstone_bricks_iron_waves", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));

    public static final Block POLISHED_BLACKSTONE_BRICKS_COPPER_BANDS = registerBlock("polished_blackstone_bricks_copper_bands", new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_BRICKS_COPPER_CHEVRON = registerBlock("polished_blackstone_bricks_copper_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_BRICKS_COPPER_WAVES = registerBlock("polished_blackstone_bricks_copper_waves", new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_BRICKS_EXPOSED_COPPER_BANDS = registerBlock("polished_blackstone_bricks_exposed_copper_bands", new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_BRICKS_EXPOSED_COPPER_CHEVRON = registerBlock("polished_blackstone_bricks_exposed_copper_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_BRICKS_EXPOSED_COPPER_WAVES = registerBlock("polished_blackstone_bricks_exposed_copper_waves", new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_BRICKS_WEATHERED_COPPER_BANDS = registerBlock("polished_blackstone_bricks_weathered_copper_bands", new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_BRICKS_WEATHERED_COPPER_CHEVRON = registerBlock("polished_blackstone_bricks_weathered_copper_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_BRICKS_WEATHERED_COPPER_WAVES = registerBlock("polished_blackstone_bricks_weathered_copper_waves", new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_BRICKS_OXIDIZED_COPPER_BANDS = registerBlock("polished_blackstone_bricks_oxidized_copper_bands", new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_BRICKS_OXIDIZED_COPPER_CHEVRON = registerBlock("polished_blackstone_bricks_oxidized_copper_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_BRICKS_OXIDIZED_COPPER_WAVES = registerBlock("polished_blackstone_bricks_oxidized_copper_waves", new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));

    public static final Block POLISHED_BLACKSTONE_BRICKS_WAXED_COPPER_BANDS = registerBlock("polished_blackstone_bricks_waxed_copper_bands", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_BRICKS_WAXED_COPPER_CHEVRON = registerBlock("polished_blackstone_bricks_waxed_copper_chevron", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_BRICKS_WAXED_COPPER_WAVES = registerBlock("polished_blackstone_bricks_waxed_copper_waves", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_BRICKS_WAXED_EXPOSED_COPPER_BANDS = registerBlock("polished_blackstone_bricks_waxed_exposed_copper_bands", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_BRICKS_WAXED_EXPOSED_COPPER_CHEVRON = registerBlock("polished_blackstone_bricks_waxed_exposed_copper_chevron", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_BRICKS_WAXED_EXPOSED_COPPER_WAVES = registerBlock("polished_blackstone_bricks_waxed_exposed_copper_waves", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_BRICKS_WAXED_WEATHERED_COPPER_BANDS = registerBlock("polished_blackstone_bricks_waxed_weathered_copper_bands", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_BRICKS_WAXED_WEATHERED_COPPER_CHEVRON = registerBlock("polished_blackstone_bricks_waxed_weathered_copper_chevron", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_BRICKS_WAXED_WEATHERED_COPPER_WAVES = registerBlock("polished_blackstone_bricks_waxed_weathered_copper_waves", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_BRICKS_WAXED_OXIDIZED_COPPER_BANDS = registerBlock("polished_blackstone_bricks_waxed_oxidized_copper_bands", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_BRICKS_WAXED_OXIDIZED_COPPER_CHEVRON = registerBlock("polished_blackstone_bricks_waxed_oxidized_copper_chevron", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_BRICKS_WAXED_OXIDIZED_COPPER_WAVES = registerBlock("polished_blackstone_bricks_waxed_oxidized_copper_waves", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));

    public static final Block POLISHED_BLACKSTONE_BRICKS_LAPIS_BANDS = registerBlock("polished_blackstone_bricks_lapis_bands", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_BRICKS_LAPIS_CHEVRON = registerBlock("polished_blackstone_bricks_lapis_chevron", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_BRICKS_LAPIS_WAVES = registerBlock("polished_blackstone_bricks_lapis_waves", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_BRICKS_REDSTONE_BANDS = registerBlock("polished_blackstone_bricks_redstone_bands", new RedstoneOreBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_BRICKS_REDSTONE_CHEVRON = registerBlock("polished_blackstone_bricks_redstone_chevron", new RedstoneOreBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_BRICKS_REDSTONE_WAVES = registerBlock("polished_blackstone_bricks_redstone_waves", new RedstoneOreBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_BRICKS_QUARTZ_BANDS = registerBlock("polished_blackstone_bricks_quartz_bands", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_BRICKS_QUARTZ_CHEVRON = registerBlock("polished_blackstone_bricks_quartz_chevron", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_BRICKS_QUARTZ_WAVES = registerBlock("polished_blackstone_bricks_quartz_waves", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_BRICKS_BLAZE_BANDS = registerBlock("polished_blackstone_bricks_blaze_bands", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS).luminance(10)));
    public static final Block POLISHED_BLACKSTONE_BRICKS_BLAZE_CHEVRON = registerBlock("polished_blackstone_bricks_blaze_chevron", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS).luminance(10)));
    public static final Block POLISHED_BLACKSTONE_BRICKS_BLAZE_WAVES = registerBlock("polished_blackstone_bricks_blaze_waves", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS).luminance(10)));

    // Here start the quartz bricks family of the metal and gem engraved blocks

    public static final Block QUARTZ_BRICKS_AMETHYST_BANDS = registerBlock("quartz_bricks_amethyst_bands", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICKS_AMETHYST_CHEVRON = registerBlock("quartz_bricks_amethyst_chevron", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICKS_AMETHYST_WAVES = registerBlock("quartz_bricks_amethyst_waves", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICKS_DIAMOND_BANDS = registerBlock("quartz_bricks_diamond_bands", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICKS_DIAMOND_CHEVRON = registerBlock("quartz_bricks_diamond_chevron", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICKS_DIAMOND_WAVES = registerBlock("quartz_bricks_diamond_waves", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICKS_EMERALD_BANDS = registerBlock("quartz_bricks_emerald_bands", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICKS_EMERALD_CHEVRON = registerBlock("quartz_bricks_emerald_chevron", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICKS_EMERALD_WAVES = registerBlock("quartz_bricks_emerald_waves", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICKS_GOLD_BANDS = registerBlock("quartz_bricks_gold_bands", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICKS_GOLD_CHEVRON = registerBlock("quartz_bricks_gold_chevron", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICKS_GOLD_WAVES = registerBlock("quartz_bricks_gold_waves", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICKS_IRON_BANDS = registerBlock("quartz_bricks_iron_bands", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICKS_IRON_CHEVRON = registerBlock("quartz_bricks_iron_chevron", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICKS_IRON_WAVES = registerBlock("quartz_bricks_iron_waves", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));

    public static final Block QUARTZ_BRICKS_COPPER_BANDS = registerBlock("quartz_bricks_copper_bands", new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICKS_COPPER_CHEVRON = registerBlock("quartz_bricks_copper_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICKS_COPPER_WAVES = registerBlock("quartz_bricks_copper_waves", new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICKS_EXPOSED_COPPER_BANDS = registerBlock("quartz_bricks_exposed_copper_bands", new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICKS_EXPOSED_COPPER_CHEVRON = registerBlock("quartz_bricks_exposed_copper_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICKS_EXPOSED_COPPER_WAVES = registerBlock("quartz_bricks_exposed_copper_waves", new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICKS_WEATHERED_COPPER_BANDS = registerBlock("quartz_bricks_weathered_copper_bands", new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICKS_WEATHERED_COPPER_CHEVRON = registerBlock("quartz_bricks_weathered_copper_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICKS_WEATHERED_COPPER_WAVES = registerBlock("quartz_bricks_weathered_copper_waves", new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICKS_OXIDIZED_COPPER_BANDS = registerBlock("quartz_bricks_oxidized_copper_bands", new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICKS_OXIDIZED_COPPER_CHEVRON = registerBlock("quartz_bricks_oxidized_copper_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICKS_OXIDIZED_COPPER_WAVES = registerBlock("quartz_bricks_oxidized_copper_waves", new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));

    public static final Block QUARTZ_BRICKS_WAXED_COPPER_BANDS = registerBlock("quartz_bricks_waxed_copper_bands", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICKS_WAXED_COPPER_CHEVRON = registerBlock("quartz_bricks_waxed_copper_chevron", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICKS_WAXED_COPPER_WAVES = registerBlock("quartz_bricks_waxed_copper_waves", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICKS_WAXED_EXPOSED_COPPER_BANDS = registerBlock("quartz_bricks_waxed_exposed_copper_bands", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICKS_WAXED_EXPOSED_COPPER_CHEVRON = registerBlock("quartz_bricks_waxed_exposed_copper_chevron", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICKS_WAXED_EXPOSED_COPPER_WAVES = registerBlock("quartz_bricks_waxed_exposed_copper_waves", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICKS_WAXED_WEATHERED_COPPER_BANDS = registerBlock("quartz_bricks_waxed_weathered_copper_bands", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICKS_WAXED_WEATHERED_COPPER_CHEVRON = registerBlock("quartz_bricks_waxed_weathered_copper_chevron", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICKS_WAXED_WEATHERED_COPPER_WAVES = registerBlock("quartz_bricks_waxed_weathered_copper_waves", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICKS_WAXED_OXIDIZED_COPPER_BANDS = registerBlock("quartz_bricks_waxed_oxidized_copper_bands", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICKS_WAXED_OXIDIZED_COPPER_CHEVRON = registerBlock("quartz_bricks_waxed_oxidized_copper_chevron", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICKS_WAXED_OXIDIZED_COPPER_WAVES = registerBlock("quartz_bricks_waxed_oxidized_copper_waves", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));

    public static final Block QUARTZ_BRICKS_LAPIS_BANDS = registerBlock("quartz_bricks_lapis_bands", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICKS_LAPIS_CHEVRON = registerBlock("quartz_bricks_lapis_chevron", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICKS_LAPIS_WAVES = registerBlock("quartz_bricks_lapis_waves", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICKS_REDSTONE_BANDS = registerBlock("quartz_bricks_redstone_bands", new RedstoneOreBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICKS_REDSTONE_CHEVRON = registerBlock("quartz_bricks_redstone_chevron", new RedstoneOreBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICKS_REDSTONE_WAVES = registerBlock("quartz_bricks_redstone_waves", new RedstoneOreBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICKS_BLAZE_BANDS = registerBlock("quartz_bricks_blaze_bands", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS).luminance(10)));
    public static final Block QUARTZ_BRICKS_BLAZE_CHEVRON = registerBlock("quartz_bricks_blaze_chevron", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS).luminance(10)));
    public static final Block QUARTZ_BRICKS_BLAZE_WAVES = registerBlock("quartz_bricks_blaze_waves", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS).luminance(10)));

    // Here start the end stone bricks family of the metal and gem engraved blocks

    public static final Block END_STONE_BRICKS_AMETHYST_BANDS = registerBlock("end_stone_bricks_amethyst_bands", new Block(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICKS_AMETHYST_CHEVRON = registerBlock("end_stone_bricks_amethyst_chevron", new Block(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICKS_AMETHYST_WAVES = registerBlock("end_stone_bricks_amethyst_waves", new Block(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICKS_DIAMOND_BANDS = registerBlock("end_stone_bricks_diamond_bands", new Block(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICKS_DIAMOND_CHEVRON = registerBlock("end_stone_bricks_diamond_chevron", new Block(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICKS_DIAMOND_WAVES = registerBlock("end_stone_bricks_diamond_waves", new Block(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICKS_EMERALD_BANDS = registerBlock("end_stone_bricks_emerald_bands", new Block(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICKS_EMERALD_CHEVRON = registerBlock("end_stone_bricks_emerald_chevron", new Block(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICKS_EMERALD_WAVES = registerBlock("end_stone_bricks_emerald_waves", new Block(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICKS_GOLD_BANDS = registerBlock("end_stone_bricks_gold_bands", new Block(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICKS_GOLD_CHEVRON = registerBlock("end_stone_bricks_gold_chevron", new Block(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICKS_GOLD_WAVES = registerBlock("end_stone_bricks_gold_waves", new Block(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICKS_IRON_BANDS = registerBlock("end_stone_bricks_iron_bands", new Block(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICKS_IRON_CHEVRON = registerBlock("end_stone_bricks_iron_chevron", new Block(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICKS_IRON_WAVES = registerBlock("end_stone_bricks_iron_waves", new Block(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));

    public static final Block END_STONE_BRICKS_COPPER_BANDS = registerBlock("end_stone_bricks_copper_bands", new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICKS_COPPER_CHEVRON = registerBlock("end_stone_bricks_copper_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICKS_COPPER_WAVES = registerBlock("end_stone_bricks_copper_waves", new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICKS_EXPOSED_COPPER_BANDS = registerBlock("end_stone_bricks_exposed_copper_bands", new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICKS_EXPOSED_COPPER_CHEVRON = registerBlock("end_stone_bricks_exposed_copper_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICKS_EXPOSED_COPPER_WAVES = registerBlock("end_stone_bricks_exposed_copper_waves", new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICKS_WEATHERED_COPPER_BANDS = registerBlock("end_stone_bricks_weathered_copper_bands", new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICKS_WEATHERED_COPPER_CHEVRON = registerBlock("end_stone_bricks_weathered_copper_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICKS_WEATHERED_COPPER_WAVES = registerBlock("end_stone_bricks_weathered_copper_waves", new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICKS_OXIDIZED_COPPER_BANDS = registerBlock("end_stone_bricks_oxidized_copper_bands", new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICKS_OXIDIZED_COPPER_CHEVRON = registerBlock("end_stone_bricks_oxidized_copper_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICKS_OXIDIZED_COPPER_WAVES = registerBlock("end_stone_bricks_oxidized_copper_waves", new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));

    public static final Block END_STONE_BRICKS_WAXED_COPPER_BANDS = registerBlock("end_stone_bricks_waxed_copper_bands", new Block(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICKS_WAXED_COPPER_CHEVRON = registerBlock("end_stone_bricks_waxed_copper_chevron", new Block(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICKS_WAXED_COPPER_WAVES = registerBlock("end_stone_bricks_waxed_copper_waves", new Block(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICKS_WAXED_EXPOSED_COPPER_BANDS = registerBlock("end_stone_bricks_waxed_exposed_copper_bands", new Block(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICKS_WAXED_EXPOSED_COPPER_CHEVRON = registerBlock("end_stone_bricks_waxed_exposed_copper_chevron", new Block(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICKS_WAXED_EXPOSED_COPPER_WAVES = registerBlock("end_stone_bricks_waxed_exposed_copper_waves", new Block(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICKS_WAXED_WEATHERED_COPPER_BANDS = registerBlock("end_stone_bricks_waxed_weathered_copper_bands", new Block(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICKS_WAXED_WEATHERED_COPPER_CHEVRON = registerBlock("end_stone_bricks_waxed_weathered_copper_chevron", new Block(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICKS_WAXED_WEATHERED_COPPER_WAVES = registerBlock("end_stone_bricks_waxed_weathered_copper_waves", new Block(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICKS_WAXED_OXIDIZED_COPPER_BANDS = registerBlock("end_stone_bricks_waxed_oxidized_copper_bands", new Block(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICKS_WAXED_OXIDIZED_COPPER_CHEVRON = registerBlock("end_stone_bricks_waxed_oxidized_copper_chevron", new Block(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICKS_WAXED_OXIDIZED_COPPER_WAVES = registerBlock("end_stone_bricks_waxed_oxidized_copper_waves", new Block(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));

    public static final Block END_STONE_BRICKS_LAPIS_BANDS = registerBlock("end_stone_bricks_lapis_bands", new Block(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICKS_LAPIS_CHEVRON = registerBlock("end_stone_bricks_lapis_chevron", new Block(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICKS_LAPIS_WAVES = registerBlock("end_stone_bricks_lapis_waves", new Block(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICKS_REDSTONE_BANDS = registerBlock("end_stone_bricks_redstone_bands", new RedstoneOreBlock(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICKS_REDSTONE_CHEVRON = registerBlock("end_stone_bricks_redstone_chevron", new RedstoneOreBlock(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICKS_REDSTONE_WAVES = registerBlock("end_stone_bricks_redstone_waves", new RedstoneOreBlock(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICKS_QUARTZ_BANDS = registerBlock("end_stone_bricks_quartz_bands", new Block(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICKS_QUARTZ_CHEVRON = registerBlock("end_stone_bricks_quartz_chevron", new Block(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICKS_QUARTZ_WAVES = registerBlock("end_stone_bricks_quartz_waves", new Block(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICKS_ENDER_BANDS = registerBlock("end_stone_bricks_ender_pearl_bands", new Block(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICKS_ENDER_CHEVRON = registerBlock("end_stone_bricks_ender_pearl_chevron", new Block(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_BRICKS_ENDER_WAVES = registerBlock("end_stone_bricks_ender_pearl_waves", new Block(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));

    // Here start the purpur block family of the metal and gem engraved blocks

    public static final Block PURPUR_BLOCK_AMETHYST_BANDS = registerBlock("purpur_block_amethyst_bands", new Block(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BLOCK_AMETHYST_CHEVRON = registerBlock("purpur_block_amethyst_chevron", new Block(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BLOCK_AMETHYST_WAVES = registerBlock("purpur_block_amethyst_waves", new Block(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BLOCK_DIAMOND_BANDS = registerBlock("purpur_block_diamond_bands", new Block(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BLOCK_DIAMOND_CHEVRON = registerBlock("purpur_block_diamond_chevron", new Block(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BLOCK_DIAMOND_WAVES = registerBlock("purpur_block_diamond_waves", new Block(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BLOCK_EMERALD_BANDS = registerBlock("purpur_block_emerald_bands", new Block(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BLOCK_EMERALD_CHEVRON = registerBlock("purpur_block_emerald_chevron", new Block(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BLOCK_EMERALD_WAVES = registerBlock("purpur_block_emerald_waves", new Block(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BLOCK_GOLD_BANDS = registerBlock("purpur_block_gold_bands", new Block(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BLOCK_GOLD_CHEVRON = registerBlock("purpur_block_gold_chevron", new Block(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BLOCK_GOLD_WAVES = registerBlock("purpur_block_gold_waves", new Block(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BLOCK_IRON_BANDS = registerBlock("purpur_block_iron_bands", new Block(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BLOCK_IRON_CHEVRON = registerBlock("purpur_block_iron_chevron", new Block(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BLOCK_IRON_WAVES = registerBlock("purpur_block_iron_waves", new Block(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));

    public static final Block PURPUR_BLOCK_COPPER_BANDS = registerBlock("purpur_block_copper_bands", new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BLOCK_COPPER_CHEVRON = registerBlock("purpur_block_copper_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BLOCK_COPPER_WAVES = registerBlock("purpur_block_copper_waves", new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BLOCK_EXPOSED_COPPER_BANDS = registerBlock("purpur_block_exposed_copper_bands", new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BLOCK_EXPOSED_COPPER_CHEVRON = registerBlock("purpur_block_exposed_copper_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BLOCK_EXPOSED_COPPER_WAVES = registerBlock("purpur_block_exposed_copper_waves", new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BLOCK_WEATHERED_COPPER_BANDS = registerBlock("purpur_block_weathered_copper_bands", new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BLOCK_WEATHERED_COPPER_CHEVRON = registerBlock("purpur_block_weathered_copper_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BLOCK_WEATHERED_COPPER_WAVES = registerBlock("purpur_block_weathered_copper_waves", new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BLOCK_OXIDIZED_COPPER_BANDS = registerBlock("purpur_block_oxidized_copper_bands", new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BLOCK_OXIDIZED_COPPER_CHEVRON = registerBlock("purpur_block_oxidized_copper_chevron", new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BLOCK_OXIDIZED_COPPER_WAVES = registerBlock("purpur_block_oxidized_copper_waves", new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));

    public static final Block PURPUR_BLOCK_WAXED_COPPER_BANDS = registerBlock("purpur_block_waxed_copper_bands", new Block(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BLOCK_WAXED_COPPER_CHEVRON = registerBlock("purpur_block_waxed_copper_chevron", new Block(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BLOCK_WAXED_COPPER_WAVES = registerBlock("purpur_block_waxed_copper_waves", new Block(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BLOCK_WAXED_EXPOSED_COPPER_BANDS = registerBlock("purpur_block_waxed_exposed_copper_bands", new Block(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BLOCK_WAXED_EXPOSED_COPPER_CHEVRON = registerBlock("purpur_block_waxed_exposed_copper_chevron", new Block(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BLOCK_WAXED_EXPOSED_COPPER_WAVES = registerBlock("purpur_block_waxed_exposed_copper_waves", new Block(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BLOCK_WAXED_WEATHERED_COPPER_BANDS = registerBlock("purpur_block_waxed_weathered_copper_bands", new Block(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BLOCK_WAXED_WEATHERED_COPPER_CHEVRON = registerBlock("purpur_block_waxed_weathered_copper_chevron", new Block(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BLOCK_WAXED_WEATHERED_COPPER_WAVES = registerBlock("purpur_block_waxed_weathered_copper_waves", new Block(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BLOCK_WAXED_OXIDIZED_COPPER_BANDS = registerBlock("purpur_block_waxed_oxidized_copper_bands", new Block(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BLOCK_WAXED_OXIDIZED_COPPER_CHEVRON = registerBlock("purpur_block_waxed_oxidized_copper_chevron", new Block(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BLOCK_WAXED_OXIDIZED_COPPER_WAVES = registerBlock("purpur_block_waxed_oxidized_copper_waves", new Block(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));

    public static final Block PURPUR_BLOCK_LAPIS_BANDS = registerBlock("purpur_block_lapis_bands", new Block(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BLOCK_LAPIS_CHEVRON = registerBlock("purpur_block_lapis_chevron", new Block(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BLOCK_LAPIS_WAVES = registerBlock("purpur_block_lapis_waves", new Block(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BLOCK_REDSTONE_BANDS = registerBlock("purpur_block_redstone_bands", new RedstoneOreBlock(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BLOCK_REDSTONE_CHEVRON = registerBlock("purpur_block_redstone_chevron", new RedstoneOreBlock(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BLOCK_REDSTONE_WAVES = registerBlock("purpur_block_redstone_waves", new RedstoneOreBlock(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BLOCK_QUARTZ_BANDS = registerBlock("purpur_block_quartz_bands", new Block(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BLOCK_QUARTZ_CHEVRON = registerBlock("purpur_block_quartz_chevron", new Block(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BLOCK_QUARTZ_WAVES = registerBlock("purpur_block_quartz_waves", new Block(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BLOCK_ENDER_BANDS = registerBlock("purpur_block_ender_pearl_bands", new Block(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BLOCK_ENDER_CHEVRON = registerBlock("purpur_block_ender_pearl_chevron", new Block(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_BLOCK_ENDER_WAVES = registerBlock("purpur_block_ender_pearl_waves", new Block(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));


    // Here start the Concrete Basic Shapes Blocks
    // Here start the diamond concrete blocks
    public static final Block BLACK_CONCRETE_BLUE_DIAMOND = registerBlock("black_concrete_blue_diamond", new Block(FabricBlockSettings.copyOf(Blocks.BLACK_CONCRETE)));
    public static final Block BLACK_CONCRETE_GREEN_DIAMOND = registerBlock("black_concrete_green_diamond", new Block(FabricBlockSettings.copyOf(Blocks.BLACK_CONCRETE)));
    public static final Block BLACK_CONCRETE_ORANGE_DIAMOND = registerBlock("black_concrete_orange_diamond", new Block(FabricBlockSettings.copyOf(Blocks.BLACK_CONCRETE)));
    public static final Block BLACK_CONCRETE_PURPLE_DIAMOND = registerBlock("black_concrete_purple_diamond", new Block(FabricBlockSettings.copyOf(Blocks.BLACK_CONCRETE)));
    public static final Block BLACK_CONCRETE_RED_DIAMOND = registerBlock("black_concrete_red_diamond", new Block(FabricBlockSettings.copyOf(Blocks.BLACK_CONCRETE)));
    public static final Block BLACK_CONCRETE_WHITE_DIAMOND = registerBlock("black_concrete_white_diamond", new Block(FabricBlockSettings.copyOf(Blocks.BLACK_CONCRETE)));
    public static final Block BLACK_CONCRETE_YELLOW_DIAMOND = registerBlock("black_concrete_yellow_diamond", new Block(FabricBlockSettings.copyOf(Blocks.BLACK_CONCRETE)));

    public static final Block BLUE_CONCRETE_BLACK_DIAMOND = registerBlock("blue_concrete_black_diamond", new Block(FabricBlockSettings.copyOf(Blocks.BLUE_CONCRETE)));
    public static final Block BLUE_CONCRETE_GREEN_DIAMOND = registerBlock("blue_concrete_green_diamond", new Block(FabricBlockSettings.copyOf(Blocks.BLUE_CONCRETE)));
    public static final Block BLUE_CONCRETE_ORANGE_DIAMOND = registerBlock("blue_concrete_orange_diamond", new Block(FabricBlockSettings.copyOf(Blocks.BLUE_CONCRETE)));
    public static final Block BLUE_CONCRETE_PURPLE_DIAMOND = registerBlock("blue_concrete_purple_diamond", new Block(FabricBlockSettings.copyOf(Blocks.BLUE_CONCRETE)));
    public static final Block BLUE_CONCRETE_RED_DIAMOND = registerBlock("blue_concrete_red_diamond", new Block(FabricBlockSettings.copyOf(Blocks.BLUE_CONCRETE)));
    public static final Block BLUE_CONCRETE_WHITE_DIAMOND = registerBlock("blue_concrete_white_diamond", new Block(FabricBlockSettings.copyOf(Blocks.BLUE_CONCRETE)));
    public static final Block BLUE_CONCRETE_YELLOW_DIAMOND = registerBlock("blue_concrete_yellow_diamond", new Block(FabricBlockSettings.copyOf(Blocks.BLUE_CONCRETE)));

    public static final Block GREEN_CONCRETE_BLUE_DIAMOND = registerBlock("green_concrete_blue_diamond", new Block(FabricBlockSettings.copyOf(Blocks.GREEN_CONCRETE)));
    public static final Block GREEN_CONCRETE_BLACK_DIAMOND = registerBlock("green_concrete_black_diamond", new Block(FabricBlockSettings.copyOf(Blocks.GREEN_CONCRETE)));
    public static final Block GREEN_CONCRETE_ORANGE_DIAMOND = registerBlock("green_concrete_orange_diamond", new Block(FabricBlockSettings.copyOf(Blocks.GREEN_CONCRETE)));
    public static final Block GREEN_CONCRETE_PURPLE_DIAMOND = registerBlock("green_concrete_purple_diamond", new Block(FabricBlockSettings.copyOf(Blocks.GREEN_CONCRETE)));
    public static final Block GREEN_CONCRETE_RED_DIAMOND = registerBlock("green_concrete_red_diamond", new Block(FabricBlockSettings.copyOf(Blocks.GREEN_CONCRETE)));
    public static final Block GREEN_CONCRETE_WHITE_DIAMOND = registerBlock("green_concrete_white_diamond", new Block(FabricBlockSettings.copyOf(Blocks.GREEN_CONCRETE)));
    public static final Block GREEN_CONCRETE_YELLOW_DIAMOND = registerBlock("green_concrete_yellow_diamond", new Block(FabricBlockSettings.copyOf(Blocks.GREEN_CONCRETE)));

    public static final Block ORANGE_CONCRETE_BLUE_DIAMOND = registerBlock("orange_concrete_blue_diamond", new Block(FabricBlockSettings.copyOf(Blocks.ORANGE_CONCRETE)));
    public static final Block ORANGE_CONCRETE_GREEN_DIAMOND = registerBlock("orange_concrete_green_diamond", new Block(FabricBlockSettings.copyOf(Blocks.ORANGE_CONCRETE)));
    public static final Block ORANGE_CONCRETE_BLACK_DIAMOND = registerBlock("orange_concrete_black_diamond", new Block(FabricBlockSettings.copyOf(Blocks.ORANGE_CONCRETE)));
    public static final Block ORANGE_CONCRETE_PURPLE_DIAMOND = registerBlock("orange_concrete_purple_diamond", new Block(FabricBlockSettings.copyOf(Blocks.ORANGE_CONCRETE)));
    public static final Block ORANGE_CONCRETE_RED_DIAMOND = registerBlock("orange_concrete_red_diamond", new Block(FabricBlockSettings.copyOf(Blocks.ORANGE_CONCRETE)));
    public static final Block ORANGE_CONCRETE_WHITE_DIAMOND = registerBlock("orange_concrete_white_diamond", new Block(FabricBlockSettings.copyOf(Blocks.ORANGE_CONCRETE)));
    public static final Block ORANGE_CONCRETE_YELLOW_DIAMOND = registerBlock("orange_concrete_yellow_diamond", new Block(FabricBlockSettings.copyOf(Blocks.ORANGE_CONCRETE)));

    public static final Block PURPLE_CONCRETE_BLUE_DIAMOND = registerBlock("purple_concrete_blue_diamond", new Block(FabricBlockSettings.copyOf(Blocks.PURPLE_CONCRETE)));
    public static final Block PURPLE_CONCRETE_GREEN_DIAMOND = registerBlock("purple_concrete_green_diamond", new Block(FabricBlockSettings.copyOf(Blocks.PURPLE_CONCRETE)));
    public static final Block PURPLE_CONCRETE_ORANGE_DIAMOND = registerBlock("purple_concrete_orange_diamond", new Block(FabricBlockSettings.copyOf(Blocks.PURPLE_CONCRETE)));
    public static final Block PURPLE_CONCRETE_BLACK_DIAMOND = registerBlock("purple_concrete_black_diamond", new Block(FabricBlockSettings.copyOf(Blocks.PURPLE_CONCRETE)));
    public static final Block PURPLE_CONCRETE_RED_DIAMOND = registerBlock("purple_concrete_red_diamond", new Block(FabricBlockSettings.copyOf(Blocks.PURPLE_CONCRETE)));
    public static final Block PURPLE_CONCRETE_WHITE_DIAMOND = registerBlock("purple_concrete_white_diamond", new Block(FabricBlockSettings.copyOf(Blocks.PURPLE_CONCRETE)));
    public static final Block PURPLE_CONCRETE_YELLOW_DIAMOND = registerBlock("purple_concrete_yellow_diamond", new Block(FabricBlockSettings.copyOf(Blocks.PURPLE_CONCRETE)));

    public static final Block RED_CONCRETE_BLUE_DIAMOND = registerBlock("red_concrete_blue_diamond", new Block(FabricBlockSettings.copyOf(Blocks.RED_CONCRETE)));
    public static final Block RED_CONCRETE_GREEN_DIAMOND = registerBlock("red_concrete_green_diamond", new Block(FabricBlockSettings.copyOf(Blocks.RED_CONCRETE)));
    public static final Block RED_CONCRETE_ORANGE_DIAMOND = registerBlock("red_concrete_orange_diamond", new Block(FabricBlockSettings.copyOf(Blocks.RED_CONCRETE)));
    public static final Block RED_CONCRETE_PURPLE_DIAMOND = registerBlock("red_concrete_purple_diamond", new Block(FabricBlockSettings.copyOf(Blocks.RED_CONCRETE)));
    public static final Block RED_CONCRETE_BLACK_DIAMOND = registerBlock("red_concrete_black_diamond", new Block(FabricBlockSettings.copyOf(Blocks.RED_CONCRETE)));
    public static final Block RED_CONCRETE_WHITE_DIAMOND = registerBlock("red_concrete_white_diamond", new Block(FabricBlockSettings.copyOf(Blocks.RED_CONCRETE)));
    public static final Block RED_CONCRETE_YELLOW_DIAMOND = registerBlock("red_concrete_yellow_diamond", new Block(FabricBlockSettings.copyOf(Blocks.RED_CONCRETE)));

    public static final Block YELLOW_CONCRETE_BLUE_DIAMOND = registerBlock("yellow_concrete_blue_diamond", new Block(FabricBlockSettings.copyOf(Blocks.YELLOW_CONCRETE)));
    public static final Block YELLOW_CONCRETE_GREEN_DIAMOND = registerBlock("yellow_concrete_green_diamond", new Block(FabricBlockSettings.copyOf(Blocks.YELLOW_CONCRETE)));
    public static final Block YELLOW_CONCRETE_ORANGE_DIAMOND = registerBlock("yellow_concrete_orange_diamond", new Block(FabricBlockSettings.copyOf(Blocks.YELLOW_CONCRETE)));
    public static final Block YELLOW_CONCRETE_PURPLE_DIAMOND = registerBlock("yellow_concrete_purple_diamond", new Block(FabricBlockSettings.copyOf(Blocks.YELLOW_CONCRETE)));
    public static final Block YELLOW_CONCRETE_RED_DIAMOND = registerBlock("yellow_concrete_red_diamond", new Block(FabricBlockSettings.copyOf(Blocks.YELLOW_CONCRETE)));
    public static final Block YELLOW_CONCRETE_WHITE_DIAMOND = registerBlock("yellow_concrete_white_diamond", new Block(FabricBlockSettings.copyOf(Blocks.YELLOW_CONCRETE)));
    public static final Block YELLOW_CONCRETE_BLACK_DIAMOND = registerBlock("yellow_concrete_black_diamond", new Block(FabricBlockSettings.copyOf(Blocks.YELLOW_CONCRETE)));

    public static final Block WHITE_CONCRETE_BLUE_DIAMOND = registerBlock("white_concrete_blue_diamond", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE)));
    public static final Block WHITE_CONCRETE_GREEN_DIAMOND = registerBlock("white_concrete_green_diamond", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE)));
    public static final Block WHITE_CONCRETE_ORANGE_DIAMOND = registerBlock("white_concrete_orange_diamond", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE)));
    public static final Block WHITE_CONCRETE_PURPLE_DIAMOND = registerBlock("white_concrete_purple_diamond", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE)));
    public static final Block WHITE_CONCRETE_RED_DIAMOND = registerBlock("white_concrete_red_diamond", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE)));
    public static final Block WHITE_CONCRETE_BLACK_DIAMOND = registerBlock("white_concrete_black_diamond", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE)));
    public static final Block WHITE_CONCRETE_YELLOW_DIAMOND = registerBlock("white_concrete_yellow_diamond", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE)));
    public static final Block WHITE_CONCRETE_LIGHT_BLUE_DIAMOND = registerBlock("white_concrete_light_blue_diamond", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE)));
    public static final Block WHITE_CONCRETE_LIME_DIAMOND = registerBlock("white_concrete_lime_diamond", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE)));
    public static final Block WHITE_CONCRETE_MAGENTA_DIAMOND = registerBlock("white_concrete_magenta_diamond", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE)));

    public static final Block LIGHT_BLUE_CONCRETE_WHITE_DIAMOND = registerBlock("light_blue_concrete_white_diamond", new Block(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final Block LIGHT_BLUE_CONCRETE_LIME_DIAMOND = registerBlock("light_blue_concrete_lime_diamond", new Block(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final Block LIGHT_BLUE_CONCRETE_MAGENTA_DIAMOND = registerBlock("light_blue_concrete_magenta_diamond", new Block(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_CONCRETE)));

    public static final Block LIME_CONCRETE_LIGHT_BLUE_DIAMOND = registerBlock("lime_concrete_light_blue_diamond", new Block(FabricBlockSettings.copyOf(Blocks.LIME_CONCRETE)));
    public static final Block LIME_CONCRETE_WHITE_DIAMOND = registerBlock("lime_concrete_white_diamond", new Block(FabricBlockSettings.copyOf(Blocks.LIME_CONCRETE)));
    public static final Block LIME_CONCRETE_MAGENTA_DIAMOND = registerBlock("lime_concrete_magenta_diamond", new Block(FabricBlockSettings.copyOf(Blocks.LIME_CONCRETE)));

    public static final Block MAGENTA_CONCRETE_LIGHT_BLUE_DIAMOND = registerBlock("magenta_concrete_light_blue_diamond", new Block(FabricBlockSettings.copyOf(Blocks.MAGENTA_CONCRETE)));
    public static final Block MAGENTA_CONCRETE_LIME_DIAMOND = registerBlock("magenta_concrete_lime_diamond", new Block(FabricBlockSettings.copyOf(Blocks.MAGENTA_CONCRETE)));
    public static final Block MAGENTA_CONCRETE_WHITE_DIAMOND = registerBlock("magenta_concrete_white_diamond", new Block(FabricBlockSettings.copyOf(Blocks.MAGENTA_CONCRETE)));



    //extra blocks
    public static final Block NIGHT_SKY_BLOCK = registerBlock("night_sky_block", new Block(FabricBlockSettings.copyOf(Blocks.BLACK_CONCRETE).luminance(3)));
    public static final Block MOVING_NIGHT_SKY_BLOCK = registerBlock("moving_night_sky_block", new Block(FabricBlockSettings.copyOf(Blocks.BLACK_CONCRETE).luminance(3)));
    public static final Block CINEMATIC_STONE_BRICKS = registerBlock("cinematic_stone_bricks", new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));




    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK,
                new Identifier(GrecaBlocks.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM,
                new Identifier(GrecaBlocks.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        GrecaBlocks.LOGGER.info("Registering ModBlocks for " + GrecaBlocks.MOD_ID);
    }
}
