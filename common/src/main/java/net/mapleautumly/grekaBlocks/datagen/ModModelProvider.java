package net.maple.grecablocks.datagen;

import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.maple.grecablocks.block.ModBlocks;
import net.maple.grecablocks.items.ModItems;
import net.maple.grecablocks.textures.ModTextureMap;
import net.maple.grecablocks.util.ModGrecaStateModelGenerator;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

import static net.minecraft.data.client.BlockStateModelGenerator.createEastDefaultHorizontalRotationStates;
import static net.minecraft.data.client.BlockStateModelGenerator.createNorthDefaultRotationStates;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    //    blockStateModelGenerator.registerSimpleState(ModBlocks.PRASINE_FRUIT);

        //stone brick engraved
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONE_BRICKS_AMETHYST_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONE_BRICKS_AMETHYST_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONE_BRICKS_AMETHYST_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONE_BRICKS_DIAMOND_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONE_BRICKS_DIAMOND_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONE_BRICKS_DIAMOND_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONE_BRICKS_EMERALD_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONE_BRICKS_EMERALD_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONE_BRICKS_EMERALD_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONE_BRICKS_GOLD_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONE_BRICKS_GOLD_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONE_BRICKS_GOLD_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONE_BRICKS_IRON_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONE_BRICKS_IRON_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONE_BRICKS_IRON_WAVES);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONE_BRICKS_COPPER_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONE_BRICKS_COPPER_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONE_BRICKS_COPPER_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONE_BRICKS_EXPOSED_COPPER_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONE_BRICKS_EXPOSED_COPPER_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONE_BRICKS_EXPOSED_COPPER_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONE_BRICKS_WEATHERED_COPPER_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONE_BRICKS_WEATHERED_COPPER_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONE_BRICKS_WEATHERED_COPPER_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONE_BRICKS_OXIDIZED_COPPER_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONE_BRICKS_OXIDIZED_COPPER_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONE_BRICKS_OXIDIZED_COPPER_WAVES);

        blockStateModelGenerator.registerParented(ModBlocks.STONE_BRICKS_COPPER_BANDS, ModBlocks.STONE_BRICKS_WAXED_COPPER_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.STONE_BRICKS_COPPER_CHEVRON, ModBlocks.STONE_BRICKS_WAXED_COPPER_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.STONE_BRICKS_COPPER_WAVES, ModBlocks.STONE_BRICKS_WAXED_COPPER_WAVES);
        blockStateModelGenerator.registerParented(ModBlocks.STONE_BRICKS_EXPOSED_COPPER_BANDS, ModBlocks.STONE_BRICKS_WAXED_EXPOSED_COPPER_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.STONE_BRICKS_EXPOSED_COPPER_CHEVRON, ModBlocks.STONE_BRICKS_WAXED_EXPOSED_COPPER_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.STONE_BRICKS_EXPOSED_COPPER_WAVES, ModBlocks.STONE_BRICKS_WAXED_EXPOSED_COPPER_WAVES);
        blockStateModelGenerator.registerParented(ModBlocks.STONE_BRICKS_WEATHERED_COPPER_BANDS, ModBlocks.STONE_BRICKS_WAXED_WEATHERED_COPPER_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.STONE_BRICKS_WEATHERED_COPPER_CHEVRON, ModBlocks.STONE_BRICKS_WAXED_WEATHERED_COPPER_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.STONE_BRICKS_WEATHERED_COPPER_WAVES, ModBlocks.STONE_BRICKS_WAXED_WEATHERED_COPPER_WAVES);
        blockStateModelGenerator.registerParented(ModBlocks.STONE_BRICKS_OXIDIZED_COPPER_BANDS, ModBlocks.STONE_BRICKS_WAXED_OXIDIZED_COPPER_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.STONE_BRICKS_OXIDIZED_COPPER_CHEVRON, ModBlocks.STONE_BRICKS_WAXED_OXIDIZED_COPPER_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.STONE_BRICKS_OXIDIZED_COPPER_WAVES, ModBlocks.STONE_BRICKS_WAXED_OXIDIZED_COPPER_WAVES);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONE_BRICKS_LAPIS_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONE_BRICKS_LAPIS_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONE_BRICKS_LAPIS_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONE_BRICKS_REDSTONE_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONE_BRICKS_REDSTONE_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONE_BRICKS_REDSTONE_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONE_BRICKS_QUARTZ_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONE_BRICKS_QUARTZ_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONE_BRICKS_QUARTZ_WAVES);

        //deepslate brick engraved
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_BRICKS_AMETHYST_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_BRICKS_AMETHYST_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_BRICKS_AMETHYST_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_BRICKS_DIAMOND_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_BRICKS_DIAMOND_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_BRICKS_DIAMOND_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_BRICKS_EMERALD_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_BRICKS_EMERALD_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_BRICKS_EMERALD_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_BRICKS_GOLD_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_BRICKS_GOLD_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_BRICKS_GOLD_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_BRICKS_IRON_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_BRICKS_IRON_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_BRICKS_IRON_WAVES);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_BRICKS_COPPER_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_BRICKS_COPPER_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_BRICKS_COPPER_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_BRICKS_EXPOSED_COPPER_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_BRICKS_EXPOSED_COPPER_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_BRICKS_EXPOSED_COPPER_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_BRICKS_WEATHERED_COPPER_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_BRICKS_WEATHERED_COPPER_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_BRICKS_WEATHERED_COPPER_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_BRICKS_OXIDIZED_COPPER_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_BRICKS_OXIDIZED_COPPER_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_BRICKS_OXIDIZED_COPPER_WAVES);

        blockStateModelGenerator.registerParented(ModBlocks.DEEPSLATE_BRICKS_COPPER_BANDS, ModBlocks.DEEPSLATE_BRICKS_WAXED_COPPER_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.DEEPSLATE_BRICKS_COPPER_CHEVRON, ModBlocks.DEEPSLATE_BRICKS_WAXED_COPPER_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.DEEPSLATE_BRICKS_COPPER_WAVES, ModBlocks.DEEPSLATE_BRICKS_WAXED_COPPER_WAVES);
        blockStateModelGenerator.registerParented(ModBlocks.DEEPSLATE_BRICKS_EXPOSED_COPPER_BANDS, ModBlocks.DEEPSLATE_BRICKS_WAXED_EXPOSED_COPPER_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.DEEPSLATE_BRICKS_EXPOSED_COPPER_CHEVRON, ModBlocks.DEEPSLATE_BRICKS_WAXED_EXPOSED_COPPER_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.DEEPSLATE_BRICKS_EXPOSED_COPPER_WAVES, ModBlocks.DEEPSLATE_BRICKS_WAXED_EXPOSED_COPPER_WAVES);
        blockStateModelGenerator.registerParented(ModBlocks.DEEPSLATE_BRICKS_WEATHERED_COPPER_BANDS, ModBlocks.DEEPSLATE_BRICKS_WAXED_WEATHERED_COPPER_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.DEEPSLATE_BRICKS_WEATHERED_COPPER_CHEVRON, ModBlocks.DEEPSLATE_BRICKS_WAXED_WEATHERED_COPPER_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.DEEPSLATE_BRICKS_WEATHERED_COPPER_WAVES, ModBlocks.DEEPSLATE_BRICKS_WAXED_WEATHERED_COPPER_WAVES);
        blockStateModelGenerator.registerParented(ModBlocks.DEEPSLATE_BRICKS_OXIDIZED_COPPER_BANDS, ModBlocks.DEEPSLATE_BRICKS_WAXED_OXIDIZED_COPPER_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.DEEPSLATE_BRICKS_OXIDIZED_COPPER_CHEVRON, ModBlocks.DEEPSLATE_BRICKS_WAXED_OXIDIZED_COPPER_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.DEEPSLATE_BRICKS_OXIDIZED_COPPER_WAVES, ModBlocks.DEEPSLATE_BRICKS_WAXED_OXIDIZED_COPPER_WAVES);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_BRICKS_LAPIS_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_BRICKS_LAPIS_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_BRICKS_LAPIS_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_BRICKS_REDSTONE_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_BRICKS_REDSTONE_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_BRICKS_REDSTONE_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_BRICKS_QUARTZ_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_BRICKS_QUARTZ_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_BRICKS_QUARTZ_WAVES);

        //mud brick engraved
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MUD_BRICKS_GOLD_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MUD_BRICKS_GOLD_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MUD_BRICKS_GOLD_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MUD_BRICKS_IRON_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MUD_BRICKS_IRON_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MUD_BRICKS_IRON_WAVES);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MUD_BRICKS_COPPER_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MUD_BRICKS_COPPER_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MUD_BRICKS_COPPER_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MUD_BRICKS_EXPOSED_COPPER_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MUD_BRICKS_EXPOSED_COPPER_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MUD_BRICKS_EXPOSED_COPPER_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MUD_BRICKS_WEATHERED_COPPER_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MUD_BRICKS_WEATHERED_COPPER_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MUD_BRICKS_WEATHERED_COPPER_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MUD_BRICKS_OXIDIZED_COPPER_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MUD_BRICKS_OXIDIZED_COPPER_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MUD_BRICKS_OXIDIZED_COPPER_WAVES);

        blockStateModelGenerator.registerParented(ModBlocks.MUD_BRICKS_COPPER_BANDS, ModBlocks.MUD_BRICKS_WAXED_COPPER_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.MUD_BRICKS_COPPER_CHEVRON, ModBlocks.MUD_BRICKS_WAXED_COPPER_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.MUD_BRICKS_COPPER_WAVES, ModBlocks.MUD_BRICKS_WAXED_COPPER_WAVES);
        blockStateModelGenerator.registerParented(ModBlocks.MUD_BRICKS_EXPOSED_COPPER_BANDS, ModBlocks.MUD_BRICKS_WAXED_EXPOSED_COPPER_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.MUD_BRICKS_EXPOSED_COPPER_CHEVRON, ModBlocks.MUD_BRICKS_WAXED_EXPOSED_COPPER_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.MUD_BRICKS_EXPOSED_COPPER_WAVES, ModBlocks.MUD_BRICKS_WAXED_EXPOSED_COPPER_WAVES);
        blockStateModelGenerator.registerParented(ModBlocks.MUD_BRICKS_WEATHERED_COPPER_BANDS, ModBlocks.MUD_BRICKS_WAXED_WEATHERED_COPPER_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.MUD_BRICKS_WEATHERED_COPPER_CHEVRON, ModBlocks.MUD_BRICKS_WAXED_WEATHERED_COPPER_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.MUD_BRICKS_WEATHERED_COPPER_WAVES, ModBlocks.MUD_BRICKS_WAXED_WEATHERED_COPPER_WAVES);
        blockStateModelGenerator.registerParented(ModBlocks.MUD_BRICKS_OXIDIZED_COPPER_BANDS, ModBlocks.MUD_BRICKS_WAXED_OXIDIZED_COPPER_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.MUD_BRICKS_OXIDIZED_COPPER_CHEVRON, ModBlocks.MUD_BRICKS_WAXED_OXIDIZED_COPPER_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.MUD_BRICKS_OXIDIZED_COPPER_WAVES, ModBlocks.MUD_BRICKS_WAXED_OXIDIZED_COPPER_WAVES);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MUD_BRICKS_LAPIS_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MUD_BRICKS_LAPIS_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MUD_BRICKS_LAPIS_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MUD_BRICKS_REDSTONE_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MUD_BRICKS_REDSTONE_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MUD_BRICKS_REDSTONE_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MUD_BRICKS_QUARTZ_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MUD_BRICKS_QUARTZ_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MUD_BRICKS_QUARTZ_WAVES);

        //prismarine brick engraved
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRISMARINE_BRICKS_AMETHYST_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRISMARINE_BRICKS_AMETHYST_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRISMARINE_BRICKS_AMETHYST_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRISMARINE_BRICKS_DIAMOND_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRISMARINE_BRICKS_DIAMOND_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRISMARINE_BRICKS_DIAMOND_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRISMARINE_BRICKS_EMERALD_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRISMARINE_BRICKS_EMERALD_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRISMARINE_BRICKS_EMERALD_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRISMARINE_BRICKS_GOLD_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRISMARINE_BRICKS_GOLD_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRISMARINE_BRICKS_GOLD_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRISMARINE_BRICKS_IRON_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRISMARINE_BRICKS_IRON_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRISMARINE_BRICKS_IRON_WAVES);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRISMARINE_BRICKS_COPPER_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRISMARINE_BRICKS_COPPER_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRISMARINE_BRICKS_COPPER_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRISMARINE_BRICKS_EXPOSED_COPPER_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRISMARINE_BRICKS_EXPOSED_COPPER_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRISMARINE_BRICKS_EXPOSED_COPPER_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRISMARINE_BRICKS_WEATHERED_COPPER_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRISMARINE_BRICKS_WEATHERED_COPPER_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRISMARINE_BRICKS_WEATHERED_COPPER_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRISMARINE_BRICKS_OXIDIZED_COPPER_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRISMARINE_BRICKS_OXIDIZED_COPPER_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRISMARINE_BRICKS_OXIDIZED_COPPER_WAVES);

        blockStateModelGenerator.registerParented(ModBlocks.PRISMARINE_BRICKS_COPPER_BANDS, ModBlocks.PRISMARINE_BRICKS_WAXED_COPPER_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.PRISMARINE_BRICKS_COPPER_CHEVRON, ModBlocks.PRISMARINE_BRICKS_WAXED_COPPER_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.PRISMARINE_BRICKS_COPPER_WAVES, ModBlocks.PRISMARINE_BRICKS_WAXED_COPPER_WAVES);
        blockStateModelGenerator.registerParented(ModBlocks.PRISMARINE_BRICKS_EXPOSED_COPPER_BANDS, ModBlocks.PRISMARINE_BRICKS_WAXED_EXPOSED_COPPER_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.PRISMARINE_BRICKS_EXPOSED_COPPER_CHEVRON, ModBlocks.PRISMARINE_BRICKS_WAXED_EXPOSED_COPPER_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.PRISMARINE_BRICKS_EXPOSED_COPPER_WAVES, ModBlocks.PRISMARINE_BRICKS_WAXED_EXPOSED_COPPER_WAVES);
        blockStateModelGenerator.registerParented(ModBlocks.PRISMARINE_BRICKS_WEATHERED_COPPER_BANDS, ModBlocks.PRISMARINE_BRICKS_WAXED_WEATHERED_COPPER_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.PRISMARINE_BRICKS_WEATHERED_COPPER_CHEVRON, ModBlocks.PRISMARINE_BRICKS_WAXED_WEATHERED_COPPER_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.PRISMARINE_BRICKS_WEATHERED_COPPER_WAVES, ModBlocks.PRISMARINE_BRICKS_WAXED_WEATHERED_COPPER_WAVES);
        blockStateModelGenerator.registerParented(ModBlocks.PRISMARINE_BRICKS_OXIDIZED_COPPER_BANDS, ModBlocks.PRISMARINE_BRICKS_WAXED_OXIDIZED_COPPER_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.PRISMARINE_BRICKS_OXIDIZED_COPPER_CHEVRON, ModBlocks.PRISMARINE_BRICKS_WAXED_OXIDIZED_COPPER_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.PRISMARINE_BRICKS_OXIDIZED_COPPER_WAVES, ModBlocks.PRISMARINE_BRICKS_WAXED_OXIDIZED_COPPER_WAVES);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRISMARINE_BRICKS_LAPIS_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRISMARINE_BRICKS_LAPIS_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRISMARINE_BRICKS_LAPIS_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRISMARINE_BRICKS_REDSTONE_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRISMARINE_BRICKS_REDSTONE_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRISMARINE_BRICKS_REDSTONE_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRISMARINE_BRICKS_QUARTZ_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRISMARINE_BRICKS_QUARTZ_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRISMARINE_BRICKS_QUARTZ_WAVES);

        //sandstone brick engraved
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SANDSTONE_GOLD_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SANDSTONE_GOLD_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SANDSTONE_GOLD_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SANDSTONE_IRON_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SANDSTONE_IRON_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SANDSTONE_IRON_WAVES);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SANDSTONE_COPPER_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SANDSTONE_COPPER_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SANDSTONE_COPPER_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SANDSTONE_EXPOSED_COPPER_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SANDSTONE_EXPOSED_COPPER_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SANDSTONE_EXPOSED_COPPER_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SANDSTONE_WEATHERED_COPPER_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SANDSTONE_WEATHERED_COPPER_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SANDSTONE_WEATHERED_COPPER_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SANDSTONE_OXIDIZED_COPPER_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SANDSTONE_OXIDIZED_COPPER_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SANDSTONE_OXIDIZED_COPPER_WAVES);

        blockStateModelGenerator.registerParented(ModBlocks.SANDSTONE_COPPER_BANDS, ModBlocks.SANDSTONE_WAXED_COPPER_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.SANDSTONE_COPPER_CHEVRON, ModBlocks.SANDSTONE_WAXED_COPPER_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.SANDSTONE_COPPER_WAVES, ModBlocks.SANDSTONE_WAXED_COPPER_WAVES);
        blockStateModelGenerator.registerParented(ModBlocks.SANDSTONE_EXPOSED_COPPER_BANDS, ModBlocks.SANDSTONE_WAXED_EXPOSED_COPPER_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.SANDSTONE_EXPOSED_COPPER_CHEVRON, ModBlocks.SANDSTONE_WAXED_EXPOSED_COPPER_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.SANDSTONE_EXPOSED_COPPER_WAVES, ModBlocks.SANDSTONE_WAXED_EXPOSED_COPPER_WAVES);
        blockStateModelGenerator.registerParented(ModBlocks.SANDSTONE_WEATHERED_COPPER_BANDS, ModBlocks.SANDSTONE_WAXED_WEATHERED_COPPER_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.SANDSTONE_WEATHERED_COPPER_CHEVRON, ModBlocks.SANDSTONE_WAXED_WEATHERED_COPPER_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.SANDSTONE_WEATHERED_COPPER_WAVES, ModBlocks.SANDSTONE_WAXED_WEATHERED_COPPER_WAVES);
        blockStateModelGenerator.registerParented(ModBlocks.SANDSTONE_OXIDIZED_COPPER_BANDS, ModBlocks.SANDSTONE_WAXED_OXIDIZED_COPPER_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.SANDSTONE_OXIDIZED_COPPER_CHEVRON, ModBlocks.SANDSTONE_WAXED_OXIDIZED_COPPER_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.SANDSTONE_OXIDIZED_COPPER_WAVES, ModBlocks.SANDSTONE_WAXED_OXIDIZED_COPPER_WAVES);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SANDSTONE_LAPIS_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SANDSTONE_LAPIS_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SANDSTONE_LAPIS_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SANDSTONE_REDSTONE_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SANDSTONE_REDSTONE_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SANDSTONE_REDSTONE_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SANDSTONE_QUARTZ_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SANDSTONE_QUARTZ_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SANDSTONE_QUARTZ_WAVES);

        //red sandstone brick engraved
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_SANDSTONE_GOLD_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_SANDSTONE_GOLD_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_SANDSTONE_GOLD_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_SANDSTONE_IRON_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_SANDSTONE_IRON_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_SANDSTONE_IRON_WAVES);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_SANDSTONE_COPPER_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_SANDSTONE_COPPER_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_SANDSTONE_COPPER_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_SANDSTONE_EXPOSED_COPPER_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_SANDSTONE_EXPOSED_COPPER_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_SANDSTONE_EXPOSED_COPPER_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_SANDSTONE_WEATHERED_COPPER_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_SANDSTONE_WEATHERED_COPPER_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_SANDSTONE_WEATHERED_COPPER_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_SANDSTONE_OXIDIZED_COPPER_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_SANDSTONE_OXIDIZED_COPPER_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_SANDSTONE_OXIDIZED_COPPER_WAVES);

        blockStateModelGenerator.registerParented(ModBlocks.RED_SANDSTONE_COPPER_BANDS, ModBlocks.RED_SANDSTONE_WAXED_COPPER_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.RED_SANDSTONE_COPPER_CHEVRON, ModBlocks.RED_SANDSTONE_WAXED_COPPER_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.RED_SANDSTONE_COPPER_WAVES, ModBlocks.RED_SANDSTONE_WAXED_COPPER_WAVES);
        blockStateModelGenerator.registerParented(ModBlocks.RED_SANDSTONE_EXPOSED_COPPER_BANDS, ModBlocks.RED_SANDSTONE_WAXED_EXPOSED_COPPER_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.RED_SANDSTONE_EXPOSED_COPPER_CHEVRON, ModBlocks.RED_SANDSTONE_WAXED_EXPOSED_COPPER_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.RED_SANDSTONE_EXPOSED_COPPER_WAVES, ModBlocks.RED_SANDSTONE_WAXED_EXPOSED_COPPER_WAVES);
        blockStateModelGenerator.registerParented(ModBlocks.RED_SANDSTONE_WEATHERED_COPPER_BANDS, ModBlocks.RED_SANDSTONE_WAXED_WEATHERED_COPPER_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.RED_SANDSTONE_WEATHERED_COPPER_CHEVRON, ModBlocks.RED_SANDSTONE_WAXED_WEATHERED_COPPER_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.RED_SANDSTONE_WEATHERED_COPPER_WAVES, ModBlocks.RED_SANDSTONE_WAXED_WEATHERED_COPPER_WAVES);
        blockStateModelGenerator.registerParented(ModBlocks.RED_SANDSTONE_OXIDIZED_COPPER_BANDS, ModBlocks.RED_SANDSTONE_WAXED_OXIDIZED_COPPER_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.RED_SANDSTONE_OXIDIZED_COPPER_CHEVRON, ModBlocks.RED_SANDSTONE_WAXED_OXIDIZED_COPPER_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.RED_SANDSTONE_OXIDIZED_COPPER_WAVES, ModBlocks.RED_SANDSTONE_WAXED_OXIDIZED_COPPER_WAVES);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_SANDSTONE_LAPIS_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_SANDSTONE_LAPIS_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_SANDSTONE_LAPIS_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_SANDSTONE_REDSTONE_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_SANDSTONE_REDSTONE_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_SANDSTONE_REDSTONE_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_SANDSTONE_QUARTZ_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_SANDSTONE_QUARTZ_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_SANDSTONE_QUARTZ_WAVES);

        //cut copper engraved
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CUT_COPPER_AMETHYST_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CUT_COPPER_AMETHYST_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CUT_COPPER_AMETHYST_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CUT_COPPER_DIAMOND_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CUT_COPPER_DIAMOND_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CUT_COPPER_DIAMOND_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CUT_COPPER_EMERALD_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CUT_COPPER_EMERALD_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CUT_COPPER_EMERALD_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CUT_COPPER_GOLD_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CUT_COPPER_GOLD_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CUT_COPPER_GOLD_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CUT_COPPER_IRON_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CUT_COPPER_IRON_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CUT_COPPER_IRON_WAVES);

        blockStateModelGenerator.registerParented(ModBlocks.CUT_COPPER_AMETHYST_BANDS, ModBlocks.WAXED_CUT_COPPER_AMETHYST_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.CUT_COPPER_AMETHYST_CHEVRON, ModBlocks.WAXED_CUT_COPPER_AMETHYST_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.CUT_COPPER_AMETHYST_WAVES, ModBlocks.WAXED_CUT_COPPER_AMETHYST_WAVES);
        blockStateModelGenerator.registerParented(ModBlocks.CUT_COPPER_DIAMOND_BANDS, ModBlocks.WAXED_CUT_COPPER_DIAMOND_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.CUT_COPPER_DIAMOND_CHEVRON, ModBlocks.WAXED_CUT_COPPER_DIAMOND_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.CUT_COPPER_DIAMOND_WAVES, ModBlocks.WAXED_CUT_COPPER_DIAMOND_WAVES);
        blockStateModelGenerator.registerParented(ModBlocks.CUT_COPPER_EMERALD_BANDS, ModBlocks.WAXED_CUT_COPPER_EMERALD_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.CUT_COPPER_EMERALD_CHEVRON, ModBlocks.WAXED_CUT_COPPER_EMERALD_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.CUT_COPPER_EMERALD_WAVES, ModBlocks.WAXED_CUT_COPPER_EMERALD_WAVES);
        blockStateModelGenerator.registerParented(ModBlocks.CUT_COPPER_GOLD_BANDS, ModBlocks.WAXED_CUT_COPPER_GOLD_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.CUT_COPPER_GOLD_CHEVRON, ModBlocks.WAXED_CUT_COPPER_GOLD_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.CUT_COPPER_GOLD_WAVES, ModBlocks.WAXED_CUT_COPPER_GOLD_WAVES);
        blockStateModelGenerator.registerParented(ModBlocks.CUT_COPPER_IRON_BANDS, ModBlocks.WAXED_CUT_COPPER_IRON_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.CUT_COPPER_IRON_CHEVRON, ModBlocks.WAXED_CUT_COPPER_IRON_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.CUT_COPPER_IRON_WAVES, ModBlocks.WAXED_CUT_COPPER_IRON_WAVES);

        //exposed cut copper engraved
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.EXPOSED_CUT_COPPER_AMETHYST_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.EXPOSED_CUT_COPPER_AMETHYST_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.EXPOSED_CUT_COPPER_AMETHYST_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.EXPOSED_CUT_COPPER_DIAMOND_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.EXPOSED_CUT_COPPER_DIAMOND_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.EXPOSED_CUT_COPPER_DIAMOND_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.EXPOSED_CUT_COPPER_EMERALD_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.EXPOSED_CUT_COPPER_EMERALD_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.EXPOSED_CUT_COPPER_EMERALD_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.EXPOSED_CUT_COPPER_GOLD_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.EXPOSED_CUT_COPPER_GOLD_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.EXPOSED_CUT_COPPER_GOLD_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.EXPOSED_CUT_COPPER_IRON_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.EXPOSED_CUT_COPPER_IRON_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.EXPOSED_CUT_COPPER_IRON_WAVES);

        blockStateModelGenerator.registerParented(ModBlocks.EXPOSED_CUT_COPPER_AMETHYST_BANDS, ModBlocks.WAXED_EXPOSED_CUT_COPPER_AMETHYST_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.EXPOSED_CUT_COPPER_AMETHYST_CHEVRON, ModBlocks.WAXED_EXPOSED_CUT_COPPER_AMETHYST_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.EXPOSED_CUT_COPPER_AMETHYST_WAVES, ModBlocks.WAXED_EXPOSED_CUT_COPPER_AMETHYST_WAVES);
        blockStateModelGenerator.registerParented(ModBlocks.EXPOSED_CUT_COPPER_DIAMOND_BANDS, ModBlocks.WAXED_EXPOSED_CUT_COPPER_DIAMOND_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.EXPOSED_CUT_COPPER_DIAMOND_CHEVRON, ModBlocks.WAXED_EXPOSED_CUT_COPPER_DIAMOND_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.EXPOSED_CUT_COPPER_DIAMOND_WAVES, ModBlocks.WAXED_EXPOSED_CUT_COPPER_DIAMOND_WAVES);
        blockStateModelGenerator.registerParented(ModBlocks.EXPOSED_CUT_COPPER_EMERALD_BANDS, ModBlocks.WAXED_EXPOSED_CUT_COPPER_EMERALD_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.EXPOSED_CUT_COPPER_EMERALD_CHEVRON, ModBlocks.WAXED_EXPOSED_CUT_COPPER_EMERALD_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.EXPOSED_CUT_COPPER_EMERALD_WAVES, ModBlocks.WAXED_EXPOSED_CUT_COPPER_EMERALD_WAVES);
        blockStateModelGenerator.registerParented(ModBlocks.EXPOSED_CUT_COPPER_GOLD_BANDS, ModBlocks.WAXED_EXPOSED_CUT_COPPER_GOLD_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.EXPOSED_CUT_COPPER_GOLD_CHEVRON, ModBlocks.WAXED_EXPOSED_CUT_COPPER_GOLD_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.EXPOSED_CUT_COPPER_GOLD_WAVES, ModBlocks.WAXED_EXPOSED_CUT_COPPER_GOLD_WAVES);
        blockStateModelGenerator.registerParented(ModBlocks.EXPOSED_CUT_COPPER_IRON_BANDS, ModBlocks.WAXED_EXPOSED_CUT_COPPER_IRON_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.EXPOSED_CUT_COPPER_IRON_CHEVRON, ModBlocks.WAXED_EXPOSED_CUT_COPPER_IRON_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.EXPOSED_CUT_COPPER_IRON_WAVES, ModBlocks.WAXED_EXPOSED_CUT_COPPER_IRON_WAVES);

        //weathered cut copper engraved
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WEATHERED_CUT_COPPER_AMETHYST_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WEATHERED_CUT_COPPER_AMETHYST_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WEATHERED_CUT_COPPER_AMETHYST_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WEATHERED_CUT_COPPER_DIAMOND_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WEATHERED_CUT_COPPER_DIAMOND_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WEATHERED_CUT_COPPER_DIAMOND_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WEATHERED_CUT_COPPER_EMERALD_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WEATHERED_CUT_COPPER_EMERALD_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WEATHERED_CUT_COPPER_EMERALD_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WEATHERED_CUT_COPPER_GOLD_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WEATHERED_CUT_COPPER_GOLD_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WEATHERED_CUT_COPPER_GOLD_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WEATHERED_CUT_COPPER_IRON_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WEATHERED_CUT_COPPER_IRON_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WEATHERED_CUT_COPPER_IRON_WAVES);

        blockStateModelGenerator.registerParented(ModBlocks.WEATHERED_CUT_COPPER_AMETHYST_BANDS, ModBlocks.WAXED_WEATHERED_CUT_COPPER_AMETHYST_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.WEATHERED_CUT_COPPER_AMETHYST_CHEVRON, ModBlocks.WAXED_WEATHERED_CUT_COPPER_AMETHYST_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.WEATHERED_CUT_COPPER_AMETHYST_WAVES, ModBlocks.WAXED_WEATHERED_CUT_COPPER_AMETHYST_WAVES);
        blockStateModelGenerator.registerParented(ModBlocks.WEATHERED_CUT_COPPER_DIAMOND_BANDS, ModBlocks.WAXED_WEATHERED_CUT_COPPER_DIAMOND_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.WEATHERED_CUT_COPPER_DIAMOND_CHEVRON, ModBlocks.WAXED_WEATHERED_CUT_COPPER_DIAMOND_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.WEATHERED_CUT_COPPER_DIAMOND_WAVES, ModBlocks.WAXED_WEATHERED_CUT_COPPER_DIAMOND_WAVES);
        blockStateModelGenerator.registerParented(ModBlocks.WEATHERED_CUT_COPPER_EMERALD_BANDS, ModBlocks.WAXED_WEATHERED_CUT_COPPER_EMERALD_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.WEATHERED_CUT_COPPER_EMERALD_CHEVRON, ModBlocks.WAXED_WEATHERED_CUT_COPPER_EMERALD_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.WEATHERED_CUT_COPPER_EMERALD_WAVES, ModBlocks.WAXED_WEATHERED_CUT_COPPER_EMERALD_WAVES);
        blockStateModelGenerator.registerParented(ModBlocks.WEATHERED_CUT_COPPER_GOLD_BANDS, ModBlocks.WAXED_WEATHERED_CUT_COPPER_GOLD_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.WEATHERED_CUT_COPPER_GOLD_CHEVRON, ModBlocks.WAXED_WEATHERED_CUT_COPPER_GOLD_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.WEATHERED_CUT_COPPER_GOLD_WAVES, ModBlocks.WAXED_WEATHERED_CUT_COPPER_GOLD_WAVES);
        blockStateModelGenerator.registerParented(ModBlocks.WEATHERED_CUT_COPPER_IRON_BANDS, ModBlocks.WAXED_WEATHERED_CUT_COPPER_IRON_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.WEATHERED_CUT_COPPER_IRON_CHEVRON, ModBlocks.WAXED_WEATHERED_CUT_COPPER_IRON_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.WEATHERED_CUT_COPPER_IRON_WAVES, ModBlocks.WAXED_WEATHERED_CUT_COPPER_IRON_WAVES);

        //cut copper engraved
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OXIDIZED_CUT_COPPER_AMETHYST_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OXIDIZED_CUT_COPPER_AMETHYST_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OXIDIZED_CUT_COPPER_AMETHYST_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OXIDIZED_CUT_COPPER_DIAMOND_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OXIDIZED_CUT_COPPER_DIAMOND_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OXIDIZED_CUT_COPPER_DIAMOND_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OXIDIZED_CUT_COPPER_EMERALD_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OXIDIZED_CUT_COPPER_EMERALD_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OXIDIZED_CUT_COPPER_EMERALD_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OXIDIZED_CUT_COPPER_GOLD_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OXIDIZED_CUT_COPPER_GOLD_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OXIDIZED_CUT_COPPER_GOLD_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OXIDIZED_CUT_COPPER_IRON_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OXIDIZED_CUT_COPPER_IRON_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OXIDIZED_CUT_COPPER_IRON_WAVES);

        blockStateModelGenerator.registerParented(ModBlocks.OXIDIZED_CUT_COPPER_AMETHYST_BANDS, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_AMETHYST_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.OXIDIZED_CUT_COPPER_AMETHYST_CHEVRON, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_AMETHYST_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.OXIDIZED_CUT_COPPER_AMETHYST_WAVES, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_AMETHYST_WAVES);
        blockStateModelGenerator.registerParented(ModBlocks.OXIDIZED_CUT_COPPER_DIAMOND_BANDS, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_DIAMOND_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.OXIDIZED_CUT_COPPER_DIAMOND_CHEVRON, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_DIAMOND_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.OXIDIZED_CUT_COPPER_DIAMOND_WAVES, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_DIAMOND_WAVES);
        blockStateModelGenerator.registerParented(ModBlocks.OXIDIZED_CUT_COPPER_EMERALD_BANDS, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_EMERALD_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.OXIDIZED_CUT_COPPER_EMERALD_CHEVRON, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_EMERALD_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.OXIDIZED_CUT_COPPER_EMERALD_WAVES, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_EMERALD_WAVES);
        blockStateModelGenerator.registerParented(ModBlocks.OXIDIZED_CUT_COPPER_GOLD_BANDS, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_GOLD_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.OXIDIZED_CUT_COPPER_GOLD_CHEVRON, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_GOLD_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.OXIDIZED_CUT_COPPER_GOLD_WAVES, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_GOLD_WAVES);
        blockStateModelGenerator.registerParented(ModBlocks.OXIDIZED_CUT_COPPER_IRON_BANDS, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_IRON_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.OXIDIZED_CUT_COPPER_IRON_CHEVRON, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_IRON_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.OXIDIZED_CUT_COPPER_IRON_WAVES, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_IRON_WAVES);

        //nether brick engraved
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_BRICKS_GOLD_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_BRICKS_GOLD_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_BRICKS_GOLD_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_BRICKS_IRON_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_BRICKS_IRON_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_BRICKS_IRON_WAVES);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_BRICKS_COPPER_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_BRICKS_COPPER_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_BRICKS_COPPER_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_BRICKS_EXPOSED_COPPER_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_BRICKS_EXPOSED_COPPER_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_BRICKS_EXPOSED_COPPER_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_BRICKS_WEATHERED_COPPER_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_BRICKS_WEATHERED_COPPER_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_BRICKS_WEATHERED_COPPER_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_BRICKS_OXIDIZED_COPPER_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_BRICKS_OXIDIZED_COPPER_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_BRICKS_OXIDIZED_COPPER_WAVES);

        blockStateModelGenerator.registerParented(ModBlocks.NETHER_BRICKS_COPPER_BANDS, ModBlocks.NETHER_BRICKS_WAXED_COPPER_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.NETHER_BRICKS_COPPER_CHEVRON, ModBlocks.NETHER_BRICKS_WAXED_COPPER_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.NETHER_BRICKS_COPPER_WAVES, ModBlocks.NETHER_BRICKS_WAXED_COPPER_WAVES);
        blockStateModelGenerator.registerParented(ModBlocks.NETHER_BRICKS_EXPOSED_COPPER_BANDS, ModBlocks.NETHER_BRICKS_WAXED_EXPOSED_COPPER_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.NETHER_BRICKS_EXPOSED_COPPER_CHEVRON, ModBlocks.NETHER_BRICKS_WAXED_EXPOSED_COPPER_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.NETHER_BRICKS_EXPOSED_COPPER_WAVES, ModBlocks.NETHER_BRICKS_WAXED_EXPOSED_COPPER_WAVES);
        blockStateModelGenerator.registerParented(ModBlocks.NETHER_BRICKS_WEATHERED_COPPER_BANDS, ModBlocks.NETHER_BRICKS_WAXED_WEATHERED_COPPER_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.NETHER_BRICKS_WEATHERED_COPPER_CHEVRON, ModBlocks.NETHER_BRICKS_WAXED_WEATHERED_COPPER_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.NETHER_BRICKS_WEATHERED_COPPER_WAVES, ModBlocks.NETHER_BRICKS_WAXED_WEATHERED_COPPER_WAVES);
        blockStateModelGenerator.registerParented(ModBlocks.NETHER_BRICKS_OXIDIZED_COPPER_BANDS, ModBlocks.NETHER_BRICKS_WAXED_OXIDIZED_COPPER_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.NETHER_BRICKS_OXIDIZED_COPPER_CHEVRON, ModBlocks.NETHER_BRICKS_WAXED_OXIDIZED_COPPER_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.NETHER_BRICKS_OXIDIZED_COPPER_WAVES, ModBlocks.NETHER_BRICKS_WAXED_OXIDIZED_COPPER_WAVES);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_BRICKS_LAPIS_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_BRICKS_LAPIS_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_BRICKS_LAPIS_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_BRICKS_REDSTONE_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_BRICKS_REDSTONE_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_BRICKS_REDSTONE_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_BRICKS_QUARTZ_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_BRICKS_QUARTZ_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_BRICKS_QUARTZ_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_BRICKS_BLAZE_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_BRICKS_BLAZE_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_BRICKS_BLAZE_WAVES);

        //polished blackstone brick engraved
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_BLACKSTONE_BRICKS_AMETHYST_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_BLACKSTONE_BRICKS_AMETHYST_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_BLACKSTONE_BRICKS_AMETHYST_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_BLACKSTONE_BRICKS_DIAMOND_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_BLACKSTONE_BRICKS_DIAMOND_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_BLACKSTONE_BRICKS_DIAMOND_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_BLACKSTONE_BRICKS_EMERALD_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_BLACKSTONE_BRICKS_EMERALD_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_BLACKSTONE_BRICKS_EMERALD_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_BLACKSTONE_BRICKS_GOLD_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_BLACKSTONE_BRICKS_GOLD_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_BLACKSTONE_BRICKS_GOLD_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_BLACKSTONE_BRICKS_IRON_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_BLACKSTONE_BRICKS_IRON_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_BLACKSTONE_BRICKS_IRON_WAVES);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_BLACKSTONE_BRICKS_COPPER_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_BLACKSTONE_BRICKS_COPPER_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_BLACKSTONE_BRICKS_COPPER_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_BLACKSTONE_BRICKS_EXPOSED_COPPER_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_BLACKSTONE_BRICKS_EXPOSED_COPPER_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_BLACKSTONE_BRICKS_EXPOSED_COPPER_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_BLACKSTONE_BRICKS_WEATHERED_COPPER_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_BLACKSTONE_BRICKS_WEATHERED_COPPER_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_BLACKSTONE_BRICKS_WEATHERED_COPPER_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_BLACKSTONE_BRICKS_OXIDIZED_COPPER_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_BLACKSTONE_BRICKS_OXIDIZED_COPPER_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_BLACKSTONE_BRICKS_OXIDIZED_COPPER_WAVES);

        blockStateModelGenerator.registerParented(ModBlocks.POLISHED_BLACKSTONE_BRICKS_COPPER_BANDS, ModBlocks.POLISHED_BLACKSTONE_BRICKS_WAXED_COPPER_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.POLISHED_BLACKSTONE_BRICKS_COPPER_CHEVRON, ModBlocks.POLISHED_BLACKSTONE_BRICKS_WAXED_COPPER_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.POLISHED_BLACKSTONE_BRICKS_COPPER_WAVES, ModBlocks.POLISHED_BLACKSTONE_BRICKS_WAXED_COPPER_WAVES);
        blockStateModelGenerator.registerParented(ModBlocks.POLISHED_BLACKSTONE_BRICKS_EXPOSED_COPPER_BANDS, ModBlocks.POLISHED_BLACKSTONE_BRICKS_WAXED_EXPOSED_COPPER_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.POLISHED_BLACKSTONE_BRICKS_EXPOSED_COPPER_CHEVRON, ModBlocks.POLISHED_BLACKSTONE_BRICKS_WAXED_EXPOSED_COPPER_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.POLISHED_BLACKSTONE_BRICKS_EXPOSED_COPPER_WAVES, ModBlocks.POLISHED_BLACKSTONE_BRICKS_WAXED_EXPOSED_COPPER_WAVES);
        blockStateModelGenerator.registerParented(ModBlocks.POLISHED_BLACKSTONE_BRICKS_WEATHERED_COPPER_BANDS, ModBlocks.POLISHED_BLACKSTONE_BRICKS_WAXED_WEATHERED_COPPER_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.POLISHED_BLACKSTONE_BRICKS_WEATHERED_COPPER_CHEVRON, ModBlocks.POLISHED_BLACKSTONE_BRICKS_WAXED_WEATHERED_COPPER_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.POLISHED_BLACKSTONE_BRICKS_WEATHERED_COPPER_WAVES, ModBlocks.POLISHED_BLACKSTONE_BRICKS_WAXED_WEATHERED_COPPER_WAVES);
        blockStateModelGenerator.registerParented(ModBlocks.POLISHED_BLACKSTONE_BRICKS_OXIDIZED_COPPER_BANDS, ModBlocks.POLISHED_BLACKSTONE_BRICKS_WAXED_OXIDIZED_COPPER_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.POLISHED_BLACKSTONE_BRICKS_OXIDIZED_COPPER_CHEVRON, ModBlocks.POLISHED_BLACKSTONE_BRICKS_WAXED_OXIDIZED_COPPER_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.POLISHED_BLACKSTONE_BRICKS_OXIDIZED_COPPER_WAVES, ModBlocks.POLISHED_BLACKSTONE_BRICKS_WAXED_OXIDIZED_COPPER_WAVES);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_BLACKSTONE_BRICKS_LAPIS_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_BLACKSTONE_BRICKS_LAPIS_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_BLACKSTONE_BRICKS_LAPIS_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_BLACKSTONE_BRICKS_REDSTONE_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_BLACKSTONE_BRICKS_REDSTONE_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_BLACKSTONE_BRICKS_REDSTONE_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_BLACKSTONE_BRICKS_QUARTZ_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_BLACKSTONE_BRICKS_QUARTZ_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_BLACKSTONE_BRICKS_QUARTZ_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_BLACKSTONE_BRICKS_BLAZE_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_BLACKSTONE_BRICKS_BLAZE_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_BLACKSTONE_BRICKS_BLAZE_WAVES);

        //quartz brick engraved
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.QUARTZ_BRICKS_AMETHYST_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.QUARTZ_BRICKS_AMETHYST_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.QUARTZ_BRICKS_AMETHYST_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.QUARTZ_BRICKS_DIAMOND_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.QUARTZ_BRICKS_DIAMOND_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.QUARTZ_BRICKS_DIAMOND_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.QUARTZ_BRICKS_EMERALD_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.QUARTZ_BRICKS_EMERALD_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.QUARTZ_BRICKS_EMERALD_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.QUARTZ_BRICKS_GOLD_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.QUARTZ_BRICKS_GOLD_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.QUARTZ_BRICKS_GOLD_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.QUARTZ_BRICKS_IRON_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.QUARTZ_BRICKS_IRON_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.QUARTZ_BRICKS_IRON_WAVES);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.QUARTZ_BRICKS_COPPER_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.QUARTZ_BRICKS_COPPER_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.QUARTZ_BRICKS_COPPER_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.QUARTZ_BRICKS_EXPOSED_COPPER_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.QUARTZ_BRICKS_EXPOSED_COPPER_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.QUARTZ_BRICKS_EXPOSED_COPPER_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.QUARTZ_BRICKS_WEATHERED_COPPER_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.QUARTZ_BRICKS_WEATHERED_COPPER_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.QUARTZ_BRICKS_WEATHERED_COPPER_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.QUARTZ_BRICKS_OXIDIZED_COPPER_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.QUARTZ_BRICKS_OXIDIZED_COPPER_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.QUARTZ_BRICKS_OXIDIZED_COPPER_WAVES);

        blockStateModelGenerator.registerParented(ModBlocks.QUARTZ_BRICKS_COPPER_BANDS, ModBlocks.QUARTZ_BRICKS_WAXED_COPPER_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.QUARTZ_BRICKS_COPPER_CHEVRON, ModBlocks.QUARTZ_BRICKS_WAXED_COPPER_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.QUARTZ_BRICKS_COPPER_WAVES, ModBlocks.QUARTZ_BRICKS_WAXED_COPPER_WAVES);
        blockStateModelGenerator.registerParented(ModBlocks.QUARTZ_BRICKS_EXPOSED_COPPER_BANDS, ModBlocks.QUARTZ_BRICKS_WAXED_EXPOSED_COPPER_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.QUARTZ_BRICKS_EXPOSED_COPPER_CHEVRON, ModBlocks.QUARTZ_BRICKS_WAXED_EXPOSED_COPPER_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.QUARTZ_BRICKS_EXPOSED_COPPER_WAVES, ModBlocks.QUARTZ_BRICKS_WAXED_EXPOSED_COPPER_WAVES);
        blockStateModelGenerator.registerParented(ModBlocks.QUARTZ_BRICKS_WEATHERED_COPPER_BANDS, ModBlocks.QUARTZ_BRICKS_WAXED_WEATHERED_COPPER_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.QUARTZ_BRICKS_WEATHERED_COPPER_CHEVRON, ModBlocks.QUARTZ_BRICKS_WAXED_WEATHERED_COPPER_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.QUARTZ_BRICKS_WEATHERED_COPPER_WAVES, ModBlocks.QUARTZ_BRICKS_WAXED_WEATHERED_COPPER_WAVES);
        blockStateModelGenerator.registerParented(ModBlocks.QUARTZ_BRICKS_OXIDIZED_COPPER_BANDS, ModBlocks.QUARTZ_BRICKS_WAXED_OXIDIZED_COPPER_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.QUARTZ_BRICKS_OXIDIZED_COPPER_CHEVRON, ModBlocks.QUARTZ_BRICKS_WAXED_OXIDIZED_COPPER_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.QUARTZ_BRICKS_OXIDIZED_COPPER_WAVES, ModBlocks.QUARTZ_BRICKS_WAXED_OXIDIZED_COPPER_WAVES);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.QUARTZ_BRICKS_LAPIS_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.QUARTZ_BRICKS_LAPIS_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.QUARTZ_BRICKS_LAPIS_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.QUARTZ_BRICKS_REDSTONE_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.QUARTZ_BRICKS_REDSTONE_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.QUARTZ_BRICKS_REDSTONE_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.QUARTZ_BRICKS_BLAZE_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.QUARTZ_BRICKS_BLAZE_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.QUARTZ_BRICKS_BLAZE_WAVES);

        //end stone brick engraved
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_BRICKS_AMETHYST_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_BRICKS_AMETHYST_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_BRICKS_AMETHYST_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_BRICKS_DIAMOND_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_BRICKS_DIAMOND_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_BRICKS_DIAMOND_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_BRICKS_EMERALD_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_BRICKS_EMERALD_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_BRICKS_EMERALD_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_BRICKS_GOLD_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_BRICKS_GOLD_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_BRICKS_GOLD_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_BRICKS_IRON_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_BRICKS_IRON_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_BRICKS_IRON_WAVES);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_BRICKS_COPPER_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_BRICKS_COPPER_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_BRICKS_COPPER_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_BRICKS_EXPOSED_COPPER_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_BRICKS_EXPOSED_COPPER_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_BRICKS_EXPOSED_COPPER_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_BRICKS_WEATHERED_COPPER_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_BRICKS_WEATHERED_COPPER_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_BRICKS_WEATHERED_COPPER_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_BRICKS_OXIDIZED_COPPER_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_BRICKS_OXIDIZED_COPPER_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_BRICKS_OXIDIZED_COPPER_WAVES);

        blockStateModelGenerator.registerParented(ModBlocks.END_STONE_BRICKS_COPPER_BANDS, ModBlocks.END_STONE_BRICKS_WAXED_COPPER_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.END_STONE_BRICKS_COPPER_CHEVRON, ModBlocks.END_STONE_BRICKS_WAXED_COPPER_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.END_STONE_BRICKS_COPPER_WAVES, ModBlocks.END_STONE_BRICKS_WAXED_COPPER_WAVES);
        blockStateModelGenerator.registerParented(ModBlocks.END_STONE_BRICKS_EXPOSED_COPPER_BANDS, ModBlocks.END_STONE_BRICKS_WAXED_EXPOSED_COPPER_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.END_STONE_BRICKS_EXPOSED_COPPER_CHEVRON, ModBlocks.END_STONE_BRICKS_WAXED_EXPOSED_COPPER_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.END_STONE_BRICKS_EXPOSED_COPPER_WAVES, ModBlocks.END_STONE_BRICKS_WAXED_EXPOSED_COPPER_WAVES);
        blockStateModelGenerator.registerParented(ModBlocks.END_STONE_BRICKS_WEATHERED_COPPER_BANDS, ModBlocks.END_STONE_BRICKS_WAXED_WEATHERED_COPPER_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.END_STONE_BRICKS_WEATHERED_COPPER_CHEVRON, ModBlocks.END_STONE_BRICKS_WAXED_WEATHERED_COPPER_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.END_STONE_BRICKS_WEATHERED_COPPER_WAVES, ModBlocks.END_STONE_BRICKS_WAXED_WEATHERED_COPPER_WAVES);
        blockStateModelGenerator.registerParented(ModBlocks.END_STONE_BRICKS_OXIDIZED_COPPER_BANDS, ModBlocks.END_STONE_BRICKS_WAXED_OXIDIZED_COPPER_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.END_STONE_BRICKS_OXIDIZED_COPPER_CHEVRON, ModBlocks.END_STONE_BRICKS_WAXED_OXIDIZED_COPPER_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.END_STONE_BRICKS_OXIDIZED_COPPER_WAVES, ModBlocks.END_STONE_BRICKS_WAXED_OXIDIZED_COPPER_WAVES);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_BRICKS_LAPIS_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_BRICKS_LAPIS_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_BRICKS_LAPIS_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_BRICKS_REDSTONE_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_BRICKS_REDSTONE_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_BRICKS_REDSTONE_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_BRICKS_QUARTZ_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_BRICKS_QUARTZ_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_BRICKS_QUARTZ_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_BRICKS_ENDER_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_BRICKS_ENDER_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_BRICKS_ENDER_WAVES);

        //purpur blocks engraved
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPUR_BLOCK_AMETHYST_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPUR_BLOCK_AMETHYST_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPUR_BLOCK_AMETHYST_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPUR_BLOCK_DIAMOND_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPUR_BLOCK_DIAMOND_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPUR_BLOCK_DIAMOND_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPUR_BLOCK_EMERALD_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPUR_BLOCK_EMERALD_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPUR_BLOCK_EMERALD_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPUR_BLOCK_GOLD_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPUR_BLOCK_GOLD_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPUR_BLOCK_GOLD_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPUR_BLOCK_IRON_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPUR_BLOCK_IRON_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPUR_BLOCK_IRON_WAVES);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPUR_BLOCK_COPPER_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPUR_BLOCK_COPPER_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPUR_BLOCK_COPPER_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPUR_BLOCK_EXPOSED_COPPER_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPUR_BLOCK_EXPOSED_COPPER_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPUR_BLOCK_EXPOSED_COPPER_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPUR_BLOCK_WEATHERED_COPPER_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPUR_BLOCK_WEATHERED_COPPER_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPUR_BLOCK_WEATHERED_COPPER_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPUR_BLOCK_OXIDIZED_COPPER_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPUR_BLOCK_OXIDIZED_COPPER_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPUR_BLOCK_OXIDIZED_COPPER_WAVES);

        blockStateModelGenerator.registerParented(ModBlocks.PURPUR_BLOCK_COPPER_BANDS, ModBlocks.PURPUR_BLOCK_WAXED_COPPER_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.PURPUR_BLOCK_COPPER_CHEVRON, ModBlocks.PURPUR_BLOCK_WAXED_COPPER_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.PURPUR_BLOCK_COPPER_WAVES, ModBlocks.PURPUR_BLOCK_WAXED_COPPER_WAVES);
        blockStateModelGenerator.registerParented(ModBlocks.PURPUR_BLOCK_EXPOSED_COPPER_BANDS, ModBlocks.PURPUR_BLOCK_WAXED_EXPOSED_COPPER_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.PURPUR_BLOCK_EXPOSED_COPPER_CHEVRON, ModBlocks.PURPUR_BLOCK_WAXED_EXPOSED_COPPER_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.PURPUR_BLOCK_EXPOSED_COPPER_WAVES, ModBlocks.PURPUR_BLOCK_WAXED_EXPOSED_COPPER_WAVES);
        blockStateModelGenerator.registerParented(ModBlocks.PURPUR_BLOCK_WEATHERED_COPPER_BANDS, ModBlocks.PURPUR_BLOCK_WAXED_WEATHERED_COPPER_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.PURPUR_BLOCK_WEATHERED_COPPER_CHEVRON, ModBlocks.PURPUR_BLOCK_WAXED_WEATHERED_COPPER_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.PURPUR_BLOCK_WEATHERED_COPPER_WAVES, ModBlocks.PURPUR_BLOCK_WAXED_WEATHERED_COPPER_WAVES);
        blockStateModelGenerator.registerParented(ModBlocks.PURPUR_BLOCK_OXIDIZED_COPPER_BANDS, ModBlocks.PURPUR_BLOCK_WAXED_OXIDIZED_COPPER_BANDS);
        blockStateModelGenerator.registerParented(ModBlocks.PURPUR_BLOCK_OXIDIZED_COPPER_CHEVRON, ModBlocks.PURPUR_BLOCK_WAXED_OXIDIZED_COPPER_CHEVRON);
        blockStateModelGenerator.registerParented(ModBlocks.PURPUR_BLOCK_OXIDIZED_COPPER_WAVES, ModBlocks.PURPUR_BLOCK_WAXED_OXIDIZED_COPPER_WAVES);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPUR_BLOCK_LAPIS_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPUR_BLOCK_LAPIS_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPUR_BLOCK_LAPIS_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPUR_BLOCK_REDSTONE_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPUR_BLOCK_REDSTONE_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPUR_BLOCK_REDSTONE_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPUR_BLOCK_QUARTZ_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPUR_BLOCK_QUARTZ_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPUR_BLOCK_QUARTZ_WAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPUR_BLOCK_ENDER_BANDS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPUR_BLOCK_ENDER_CHEVRON);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPUR_BLOCK_ENDER_WAVES);


        // concrete diamond blocks
        // black concrete diamond
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLACK_CONCRETE_BLUE_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLACK_CONCRETE_GREEN_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLACK_CONCRETE_ORANGE_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLACK_CONCRETE_PURPLE_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLACK_CONCRETE_RED_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLACK_CONCRETE_WHITE_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLACK_CONCRETE_YELLOW_DIAMOND);
        // blue concrete diamond
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_CONCRETE_BLACK_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_CONCRETE_GREEN_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_CONCRETE_ORANGE_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_CONCRETE_PURPLE_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_CONCRETE_RED_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_CONCRETE_WHITE_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_CONCRETE_YELLOW_DIAMOND);
        // green concrete diamond
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREEN_CONCRETE_BLUE_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREEN_CONCRETE_BLACK_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREEN_CONCRETE_ORANGE_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREEN_CONCRETE_PURPLE_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREEN_CONCRETE_RED_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREEN_CONCRETE_WHITE_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREEN_CONCRETE_YELLOW_DIAMOND);
        // orange concrete diamond
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORANGE_CONCRETE_BLUE_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORANGE_CONCRETE_GREEN_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORANGE_CONCRETE_BLACK_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORANGE_CONCRETE_PURPLE_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORANGE_CONCRETE_RED_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORANGE_CONCRETE_WHITE_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORANGE_CONCRETE_YELLOW_DIAMOND);
        // purple concrete diamond
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPLE_CONCRETE_BLUE_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPLE_CONCRETE_GREEN_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPLE_CONCRETE_ORANGE_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPLE_CONCRETE_BLACK_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPLE_CONCRETE_RED_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPLE_CONCRETE_WHITE_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPLE_CONCRETE_YELLOW_DIAMOND);
        // red concrete diamond
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_CONCRETE_BLUE_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_CONCRETE_GREEN_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_CONCRETE_ORANGE_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_CONCRETE_PURPLE_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_CONCRETE_BLACK_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_CONCRETE_WHITE_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_CONCRETE_YELLOW_DIAMOND);
        // yellow concrete diamond
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.YELLOW_CONCRETE_BLUE_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.YELLOW_CONCRETE_GREEN_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.YELLOW_CONCRETE_ORANGE_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.YELLOW_CONCRETE_PURPLE_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.YELLOW_CONCRETE_RED_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.YELLOW_CONCRETE_WHITE_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.YELLOW_CONCRETE_BLACK_DIAMOND);
        // white concrete diamond
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_CONCRETE_BLUE_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_CONCRETE_GREEN_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_CONCRETE_ORANGE_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_CONCRETE_PURPLE_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_CONCRETE_RED_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_CONCRETE_BLACK_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_CONCRETE_YELLOW_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_CONCRETE_LIGHT_BLUE_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_CONCRETE_LIME_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_CONCRETE_MAGENTA_DIAMOND);
        // light blue concrete diamond
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_BLUE_CONCRETE_WHITE_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_BLUE_CONCRETE_LIME_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_BLUE_CONCRETE_MAGENTA_DIAMOND);
        // lime concrete diamond
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIME_CONCRETE_LIGHT_BLUE_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIME_CONCRETE_WHITE_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIME_CONCRETE_MAGENTA_DIAMOND);
        // magenta concrete diamond
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAGENTA_CONCRETE_LIGHT_BLUE_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAGENTA_CONCRETE_LIME_DIAMOND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAGENTA_CONCRETE_WHITE_DIAMOND);


        // special
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NIGHT_SKY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOVING_NIGHT_SKY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CINEMATIC_STONE_BRICKS);

        //    BlockStateModelGenerator.BlockTexturePool CCAmWavesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.STONE_BRICKS_AMETHYST_WAVES);


        // createNorthDefaultRotationStates()
    }



    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.ENGRAVING_SHEET_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BANDS_ENGRAVING_SHEET, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHEVRON_ENGRAVING_SHEET, Models.GENERATED);
        itemModelGenerator.register(ModItems.WAVES_ENGRAVING_SHEET, Models.GENERATED);

        itemModelGenerator.register(ModItems.COLORING_PATTERN_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_COLORING_PATTERN, Models.GENERATED);
        itemModelGenerator.register(ModItems.DOT_COLORING_PATTERN, Models.GENERATED);
        itemModelGenerator.register(ModItems.SQUARE_COLORING_PATTERN, Models.GENERATED);

    }
}
