package net.maple.grecablocks;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.maple.grecablocks.block.ModBlocks;
import net.maple.grecablocks.items.ModItemGroups;
import net.maple.grecablocks.items.ModItems;
import net.minecraft.block.OxidizableBlock;
import net.minecraft.client.particle.GlowParticle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class GrecaBlocks implements ModInitializer {
    public static final String MOD_ID = "grecablocks";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		//oxidizable stone bricks cooper engraved blocks
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.STONE_BRICKS_COPPER_BANDS, ModBlocks.STONE_BRICKS_EXPOSED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.STONE_BRICKS_EXPOSED_COPPER_BANDS, ModBlocks.STONE_BRICKS_WEATHERED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.STONE_BRICKS_WEATHERED_COPPER_BANDS, ModBlocks.STONE_BRICKS_OXIDIZED_COPPER_BANDS);

		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.STONE_BRICKS_COPPER_CHEVRON, ModBlocks.STONE_BRICKS_EXPOSED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.STONE_BRICKS_EXPOSED_COPPER_CHEVRON, ModBlocks.STONE_BRICKS_WEATHERED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.STONE_BRICKS_WEATHERED_COPPER_CHEVRON, ModBlocks.STONE_BRICKS_OXIDIZED_COPPER_CHEVRON);

		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.STONE_BRICKS_COPPER_WAVES, ModBlocks.STONE_BRICKS_EXPOSED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.STONE_BRICKS_EXPOSED_COPPER_WAVES, ModBlocks.STONE_BRICKS_WEATHERED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.STONE_BRICKS_WEATHERED_COPPER_WAVES, ModBlocks.STONE_BRICKS_OXIDIZED_COPPER_WAVES);

		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.STONE_BRICKS_COPPER_BANDS, ModBlocks.STONE_BRICKS_WAXED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.STONE_BRICKS_EXPOSED_COPPER_BANDS, ModBlocks.STONE_BRICKS_WAXED_EXPOSED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.STONE_BRICKS_WEATHERED_COPPER_BANDS, ModBlocks.STONE_BRICKS_WAXED_WEATHERED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.STONE_BRICKS_OXIDIZED_COPPER_BANDS, ModBlocks.STONE_BRICKS_WAXED_OXIDIZED_COPPER_BANDS);

		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.STONE_BRICKS_COPPER_CHEVRON, ModBlocks.STONE_BRICKS_WAXED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.STONE_BRICKS_EXPOSED_COPPER_CHEVRON, ModBlocks.STONE_BRICKS_WAXED_EXPOSED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.STONE_BRICKS_WEATHERED_COPPER_CHEVRON, ModBlocks.STONE_BRICKS_WAXED_WEATHERED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.STONE_BRICKS_OXIDIZED_COPPER_CHEVRON, ModBlocks.STONE_BRICKS_WAXED_OXIDIZED_COPPER_CHEVRON);

		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.STONE_BRICKS_COPPER_WAVES, ModBlocks.STONE_BRICKS_WAXED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.STONE_BRICKS_EXPOSED_COPPER_WAVES, ModBlocks.STONE_BRICKS_WAXED_EXPOSED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.STONE_BRICKS_WEATHERED_COPPER_WAVES, ModBlocks.STONE_BRICKS_WAXED_WEATHERED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.STONE_BRICKS_OXIDIZED_COPPER_WAVES, ModBlocks.STONE_BRICKS_WAXED_OXIDIZED_COPPER_WAVES);

		//oxidizable deepslate bricks cooper engraved blocks
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.DEEPSLATE_BRICKS_COPPER_BANDS, ModBlocks.DEEPSLATE_BRICKS_EXPOSED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.DEEPSLATE_BRICKS_EXPOSED_COPPER_BANDS, ModBlocks.DEEPSLATE_BRICKS_WEATHERED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.DEEPSLATE_BRICKS_WEATHERED_COPPER_BANDS, ModBlocks.DEEPSLATE_BRICKS_OXIDIZED_COPPER_BANDS);

		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.DEEPSLATE_BRICKS_COPPER_CHEVRON, ModBlocks.DEEPSLATE_BRICKS_EXPOSED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.DEEPSLATE_BRICKS_EXPOSED_COPPER_CHEVRON, ModBlocks.DEEPSLATE_BRICKS_WEATHERED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.DEEPSLATE_BRICKS_WEATHERED_COPPER_CHEVRON, ModBlocks.DEEPSLATE_BRICKS_OXIDIZED_COPPER_CHEVRON);

		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.DEEPSLATE_BRICKS_COPPER_WAVES, ModBlocks.DEEPSLATE_BRICKS_EXPOSED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.DEEPSLATE_BRICKS_EXPOSED_COPPER_WAVES, ModBlocks.DEEPSLATE_BRICKS_WEATHERED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.DEEPSLATE_BRICKS_WEATHERED_COPPER_WAVES, ModBlocks.DEEPSLATE_BRICKS_OXIDIZED_COPPER_WAVES);

		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.DEEPSLATE_BRICKS_COPPER_BANDS, ModBlocks.DEEPSLATE_BRICKS_WAXED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.DEEPSLATE_BRICKS_EXPOSED_COPPER_BANDS, ModBlocks.DEEPSLATE_BRICKS_WAXED_EXPOSED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.DEEPSLATE_BRICKS_WEATHERED_COPPER_BANDS, ModBlocks.DEEPSLATE_BRICKS_WAXED_WEATHERED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.DEEPSLATE_BRICKS_OXIDIZED_COPPER_BANDS, ModBlocks.DEEPSLATE_BRICKS_WAXED_OXIDIZED_COPPER_BANDS);

		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.DEEPSLATE_BRICKS_COPPER_CHEVRON, ModBlocks.DEEPSLATE_BRICKS_WAXED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.DEEPSLATE_BRICKS_EXPOSED_COPPER_CHEVRON, ModBlocks.DEEPSLATE_BRICKS_WAXED_EXPOSED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.DEEPSLATE_BRICKS_WEATHERED_COPPER_CHEVRON, ModBlocks.DEEPSLATE_BRICKS_WAXED_WEATHERED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.DEEPSLATE_BRICKS_OXIDIZED_COPPER_CHEVRON, ModBlocks.DEEPSLATE_BRICKS_WAXED_OXIDIZED_COPPER_CHEVRON);

		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.DEEPSLATE_BRICKS_COPPER_WAVES, ModBlocks.DEEPSLATE_BRICKS_WAXED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.DEEPSLATE_BRICKS_EXPOSED_COPPER_WAVES, ModBlocks.DEEPSLATE_BRICKS_WAXED_EXPOSED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.DEEPSLATE_BRICKS_WEATHERED_COPPER_WAVES, ModBlocks.DEEPSLATE_BRICKS_WAXED_WEATHERED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.DEEPSLATE_BRICKS_OXIDIZED_COPPER_WAVES, ModBlocks.DEEPSLATE_BRICKS_WAXED_OXIDIZED_COPPER_WAVES);

		//oxidizable prismarine bricks cooper engraved blocks
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.PRISMARINE_BRICKS_COPPER_BANDS, ModBlocks.PRISMARINE_BRICKS_EXPOSED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.PRISMARINE_BRICKS_EXPOSED_COPPER_BANDS, ModBlocks.PRISMARINE_BRICKS_WEATHERED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.PRISMARINE_BRICKS_WEATHERED_COPPER_BANDS, ModBlocks.PRISMARINE_BRICKS_OXIDIZED_COPPER_BANDS);

		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.PRISMARINE_BRICKS_COPPER_CHEVRON, ModBlocks.PRISMARINE_BRICKS_EXPOSED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.PRISMARINE_BRICKS_EXPOSED_COPPER_CHEVRON, ModBlocks.PRISMARINE_BRICKS_WEATHERED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.PRISMARINE_BRICKS_WEATHERED_COPPER_CHEVRON, ModBlocks.PRISMARINE_BRICKS_OXIDIZED_COPPER_CHEVRON);

		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.PRISMARINE_BRICKS_COPPER_WAVES, ModBlocks.PRISMARINE_BRICKS_EXPOSED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.PRISMARINE_BRICKS_EXPOSED_COPPER_WAVES, ModBlocks.PRISMARINE_BRICKS_WEATHERED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.PRISMARINE_BRICKS_WEATHERED_COPPER_WAVES, ModBlocks.PRISMARINE_BRICKS_OXIDIZED_COPPER_WAVES);

		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.PRISMARINE_BRICKS_COPPER_BANDS, ModBlocks.PRISMARINE_BRICKS_WAXED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.PRISMARINE_BRICKS_EXPOSED_COPPER_BANDS, ModBlocks.PRISMARINE_BRICKS_WAXED_EXPOSED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.PRISMARINE_BRICKS_WEATHERED_COPPER_BANDS, ModBlocks.PRISMARINE_BRICKS_WAXED_WEATHERED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.PRISMARINE_BRICKS_OXIDIZED_COPPER_BANDS, ModBlocks.PRISMARINE_BRICKS_WAXED_OXIDIZED_COPPER_BANDS);

		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.PRISMARINE_BRICKS_COPPER_CHEVRON, ModBlocks.PRISMARINE_BRICKS_WAXED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.PRISMARINE_BRICKS_EXPOSED_COPPER_CHEVRON, ModBlocks.PRISMARINE_BRICKS_WAXED_EXPOSED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.PRISMARINE_BRICKS_WEATHERED_COPPER_CHEVRON, ModBlocks.PRISMARINE_BRICKS_WAXED_WEATHERED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.PRISMARINE_BRICKS_OXIDIZED_COPPER_CHEVRON, ModBlocks.PRISMARINE_BRICKS_WAXED_OXIDIZED_COPPER_CHEVRON);

		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.PRISMARINE_BRICKS_COPPER_WAVES, ModBlocks.PRISMARINE_BRICKS_WAXED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.PRISMARINE_BRICKS_EXPOSED_COPPER_WAVES, ModBlocks.PRISMARINE_BRICKS_WAXED_EXPOSED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.PRISMARINE_BRICKS_WEATHERED_COPPER_WAVES, ModBlocks.PRISMARINE_BRICKS_WAXED_WEATHERED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.PRISMARINE_BRICKS_OXIDIZED_COPPER_WAVES, ModBlocks.PRISMARINE_BRICKS_WAXED_OXIDIZED_COPPER_WAVES);

		//oxidizable mud bricks cooper engraved blocks
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.MUD_BRICKS_COPPER_BANDS, ModBlocks.MUD_BRICKS_EXPOSED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.MUD_BRICKS_EXPOSED_COPPER_BANDS, ModBlocks.MUD_BRICKS_WEATHERED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.MUD_BRICKS_WEATHERED_COPPER_BANDS, ModBlocks.MUD_BRICKS_OXIDIZED_COPPER_BANDS);

		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.MUD_BRICKS_COPPER_CHEVRON, ModBlocks.MUD_BRICKS_EXPOSED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.MUD_BRICKS_EXPOSED_COPPER_CHEVRON, ModBlocks.MUD_BRICKS_WEATHERED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.MUD_BRICKS_WEATHERED_COPPER_CHEVRON, ModBlocks.MUD_BRICKS_OXIDIZED_COPPER_CHEVRON);

		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.MUD_BRICKS_COPPER_WAVES, ModBlocks.MUD_BRICKS_EXPOSED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.MUD_BRICKS_EXPOSED_COPPER_WAVES, ModBlocks.MUD_BRICKS_WEATHERED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.MUD_BRICKS_WEATHERED_COPPER_WAVES, ModBlocks.MUD_BRICKS_OXIDIZED_COPPER_WAVES);

		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.MUD_BRICKS_COPPER_BANDS, ModBlocks.MUD_BRICKS_WAXED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.MUD_BRICKS_EXPOSED_COPPER_BANDS, ModBlocks.MUD_BRICKS_WAXED_EXPOSED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.MUD_BRICKS_WEATHERED_COPPER_BANDS, ModBlocks.MUD_BRICKS_WAXED_WEATHERED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.MUD_BRICKS_OXIDIZED_COPPER_BANDS, ModBlocks.MUD_BRICKS_WAXED_OXIDIZED_COPPER_BANDS);

		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.MUD_BRICKS_COPPER_CHEVRON, ModBlocks.MUD_BRICKS_WAXED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.MUD_BRICKS_EXPOSED_COPPER_CHEVRON, ModBlocks.MUD_BRICKS_WAXED_EXPOSED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.MUD_BRICKS_WEATHERED_COPPER_CHEVRON, ModBlocks.MUD_BRICKS_WAXED_WEATHERED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.MUD_BRICKS_OXIDIZED_COPPER_CHEVRON, ModBlocks.MUD_BRICKS_WAXED_OXIDIZED_COPPER_CHEVRON);

		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.MUD_BRICKS_COPPER_WAVES, ModBlocks.MUD_BRICKS_WAXED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.MUD_BRICKS_EXPOSED_COPPER_WAVES, ModBlocks.MUD_BRICKS_WAXED_EXPOSED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.MUD_BRICKS_WEATHERED_COPPER_WAVES, ModBlocks.MUD_BRICKS_WAXED_WEATHERED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.MUD_BRICKS_OXIDIZED_COPPER_WAVES, ModBlocks.MUD_BRICKS_WAXED_OXIDIZED_COPPER_WAVES);

		//oxidizable sandstone cooper engraved blocks
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.SANDSTONE_COPPER_BANDS, ModBlocks.SANDSTONE_EXPOSED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.SANDSTONE_EXPOSED_COPPER_BANDS, ModBlocks.SANDSTONE_WEATHERED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.SANDSTONE_WEATHERED_COPPER_BANDS, ModBlocks.SANDSTONE_OXIDIZED_COPPER_BANDS);

		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.SANDSTONE_COPPER_CHEVRON, ModBlocks.SANDSTONE_EXPOSED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.SANDSTONE_EXPOSED_COPPER_CHEVRON, ModBlocks.SANDSTONE_WEATHERED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.SANDSTONE_WEATHERED_COPPER_CHEVRON, ModBlocks.SANDSTONE_OXIDIZED_COPPER_CHEVRON);

		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.SANDSTONE_COPPER_WAVES, ModBlocks.SANDSTONE_EXPOSED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.SANDSTONE_EXPOSED_COPPER_WAVES, ModBlocks.SANDSTONE_WEATHERED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.SANDSTONE_WEATHERED_COPPER_WAVES, ModBlocks.SANDSTONE_OXIDIZED_COPPER_WAVES);

		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.SANDSTONE_COPPER_BANDS, ModBlocks.SANDSTONE_WAXED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.SANDSTONE_EXPOSED_COPPER_BANDS, ModBlocks.SANDSTONE_WAXED_EXPOSED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.SANDSTONE_WEATHERED_COPPER_BANDS, ModBlocks.SANDSTONE_WAXED_WEATHERED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.SANDSTONE_OXIDIZED_COPPER_BANDS, ModBlocks.SANDSTONE_WAXED_OXIDIZED_COPPER_BANDS);

		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.SANDSTONE_COPPER_CHEVRON, ModBlocks.SANDSTONE_WAXED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.SANDSTONE_EXPOSED_COPPER_CHEVRON, ModBlocks.SANDSTONE_WAXED_EXPOSED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.SANDSTONE_WEATHERED_COPPER_CHEVRON, ModBlocks.SANDSTONE_WAXED_WEATHERED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.SANDSTONE_OXIDIZED_COPPER_CHEVRON, ModBlocks.SANDSTONE_WAXED_OXIDIZED_COPPER_CHEVRON);

		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.SANDSTONE_COPPER_WAVES, ModBlocks.SANDSTONE_WAXED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.SANDSTONE_EXPOSED_COPPER_WAVES, ModBlocks.SANDSTONE_WAXED_EXPOSED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.SANDSTONE_WEATHERED_COPPER_WAVES, ModBlocks.SANDSTONE_WAXED_WEATHERED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.SANDSTONE_OXIDIZED_COPPER_WAVES, ModBlocks.SANDSTONE_WAXED_OXIDIZED_COPPER_WAVES);

		//oxidizable red sandstone cooper engraved blocks
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.RED_SANDSTONE_COPPER_BANDS, ModBlocks.RED_SANDSTONE_EXPOSED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.RED_SANDSTONE_EXPOSED_COPPER_BANDS, ModBlocks.RED_SANDSTONE_WEATHERED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.RED_SANDSTONE_WEATHERED_COPPER_BANDS, ModBlocks.RED_SANDSTONE_OXIDIZED_COPPER_BANDS);

		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.RED_SANDSTONE_COPPER_CHEVRON, ModBlocks.RED_SANDSTONE_EXPOSED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.RED_SANDSTONE_EXPOSED_COPPER_CHEVRON, ModBlocks.RED_SANDSTONE_WEATHERED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.RED_SANDSTONE_WEATHERED_COPPER_CHEVRON, ModBlocks.RED_SANDSTONE_OXIDIZED_COPPER_CHEVRON);

		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.RED_SANDSTONE_COPPER_WAVES, ModBlocks.RED_SANDSTONE_EXPOSED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.RED_SANDSTONE_EXPOSED_COPPER_WAVES, ModBlocks.RED_SANDSTONE_WEATHERED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.RED_SANDSTONE_WEATHERED_COPPER_WAVES, ModBlocks.RED_SANDSTONE_OXIDIZED_COPPER_WAVES);

		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.RED_SANDSTONE_COPPER_BANDS, ModBlocks.RED_SANDSTONE_WAXED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.RED_SANDSTONE_EXPOSED_COPPER_BANDS, ModBlocks.RED_SANDSTONE_WAXED_EXPOSED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.RED_SANDSTONE_WEATHERED_COPPER_BANDS, ModBlocks.RED_SANDSTONE_WAXED_WEATHERED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.RED_SANDSTONE_OXIDIZED_COPPER_BANDS, ModBlocks.RED_SANDSTONE_WAXED_OXIDIZED_COPPER_BANDS);

		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.RED_SANDSTONE_COPPER_CHEVRON, ModBlocks.RED_SANDSTONE_WAXED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.RED_SANDSTONE_EXPOSED_COPPER_CHEVRON, ModBlocks.RED_SANDSTONE_WAXED_EXPOSED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.RED_SANDSTONE_WEATHERED_COPPER_CHEVRON, ModBlocks.RED_SANDSTONE_WAXED_WEATHERED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.RED_SANDSTONE_OXIDIZED_COPPER_CHEVRON, ModBlocks.RED_SANDSTONE_WAXED_OXIDIZED_COPPER_CHEVRON);

		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.RED_SANDSTONE_COPPER_WAVES, ModBlocks.RED_SANDSTONE_WAXED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.RED_SANDSTONE_EXPOSED_COPPER_WAVES, ModBlocks.RED_SANDSTONE_WAXED_EXPOSED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.RED_SANDSTONE_WEATHERED_COPPER_WAVES, ModBlocks.RED_SANDSTONE_WAXED_WEATHERED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.RED_SANDSTONE_OXIDIZED_COPPER_WAVES, ModBlocks.RED_SANDSTONE_WAXED_OXIDIZED_COPPER_WAVES);

		//oxidizable cut cooper metal engraved blocks bands
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.CUT_COPPER_AMETHYST_BANDS, ModBlocks.EXPOSED_CUT_COPPER_AMETHYST_BANDS);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.EXPOSED_CUT_COPPER_AMETHYST_BANDS, ModBlocks.WEATHERED_CUT_COPPER_AMETHYST_BANDS);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.WEATHERED_CUT_COPPER_AMETHYST_BANDS, ModBlocks.OXIDIZED_CUT_COPPER_AMETHYST_BANDS);

		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.CUT_COPPER_DIAMOND_BANDS, ModBlocks.EXPOSED_CUT_COPPER_DIAMOND_BANDS);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.EXPOSED_CUT_COPPER_DIAMOND_BANDS, ModBlocks.WEATHERED_CUT_COPPER_DIAMOND_BANDS);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.WEATHERED_CUT_COPPER_DIAMOND_BANDS, ModBlocks.OXIDIZED_CUT_COPPER_DIAMOND_BANDS);

		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.CUT_COPPER_EMERALD_BANDS, ModBlocks.EXPOSED_CUT_COPPER_EMERALD_BANDS);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.EXPOSED_CUT_COPPER_EMERALD_BANDS, ModBlocks.WEATHERED_CUT_COPPER_EMERALD_BANDS);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.WEATHERED_CUT_COPPER_EMERALD_BANDS, ModBlocks.OXIDIZED_CUT_COPPER_EMERALD_BANDS);

		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.CUT_COPPER_GOLD_BANDS, ModBlocks.EXPOSED_CUT_COPPER_GOLD_BANDS);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.EXPOSED_CUT_COPPER_GOLD_BANDS, ModBlocks.WEATHERED_CUT_COPPER_GOLD_BANDS);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.WEATHERED_CUT_COPPER_GOLD_BANDS, ModBlocks.OXIDIZED_CUT_COPPER_GOLD_BANDS);

		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.CUT_COPPER_IRON_BANDS, ModBlocks.EXPOSED_CUT_COPPER_IRON_BANDS);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.EXPOSED_CUT_COPPER_IRON_BANDS, ModBlocks.WEATHERED_CUT_COPPER_IRON_BANDS);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.WEATHERED_CUT_COPPER_IRON_BANDS, ModBlocks.OXIDIZED_CUT_COPPER_IRON_BANDS);

        //oxidizable cut cooper metal engraved blocks chevron
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.CUT_COPPER_AMETHYST_CHEVRON, ModBlocks.EXPOSED_CUT_COPPER_AMETHYST_CHEVRON);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.EXPOSED_CUT_COPPER_AMETHYST_CHEVRON, ModBlocks.WEATHERED_CUT_COPPER_AMETHYST_CHEVRON);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.WEATHERED_CUT_COPPER_AMETHYST_CHEVRON, ModBlocks.OXIDIZED_CUT_COPPER_AMETHYST_CHEVRON);

		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.CUT_COPPER_DIAMOND_CHEVRON, ModBlocks.EXPOSED_CUT_COPPER_DIAMOND_CHEVRON);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.EXPOSED_CUT_COPPER_DIAMOND_CHEVRON, ModBlocks.WEATHERED_CUT_COPPER_DIAMOND_CHEVRON);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.WEATHERED_CUT_COPPER_DIAMOND_CHEVRON, ModBlocks.OXIDIZED_CUT_COPPER_DIAMOND_CHEVRON);

		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.CUT_COPPER_EMERALD_CHEVRON, ModBlocks.EXPOSED_CUT_COPPER_EMERALD_CHEVRON);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.EXPOSED_CUT_COPPER_EMERALD_CHEVRON, ModBlocks.WEATHERED_CUT_COPPER_EMERALD_CHEVRON);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.WEATHERED_CUT_COPPER_EMERALD_CHEVRON, ModBlocks.OXIDIZED_CUT_COPPER_EMERALD_CHEVRON);

		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.CUT_COPPER_GOLD_CHEVRON, ModBlocks.EXPOSED_CUT_COPPER_GOLD_CHEVRON);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.EXPOSED_CUT_COPPER_GOLD_CHEVRON, ModBlocks.WEATHERED_CUT_COPPER_GOLD_CHEVRON);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.WEATHERED_CUT_COPPER_GOLD_CHEVRON, ModBlocks.OXIDIZED_CUT_COPPER_GOLD_CHEVRON);

		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.CUT_COPPER_IRON_CHEVRON, ModBlocks.EXPOSED_CUT_COPPER_IRON_CHEVRON);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.EXPOSED_CUT_COPPER_IRON_CHEVRON, ModBlocks.WEATHERED_CUT_COPPER_IRON_CHEVRON);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.WEATHERED_CUT_COPPER_IRON_CHEVRON, ModBlocks.OXIDIZED_CUT_COPPER_IRON_CHEVRON);

		//oxidizable cut cooper metal engraved blocks waves
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.CUT_COPPER_AMETHYST_WAVES, ModBlocks.EXPOSED_CUT_COPPER_AMETHYST_WAVES);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.EXPOSED_CUT_COPPER_AMETHYST_WAVES, ModBlocks.WEATHERED_CUT_COPPER_AMETHYST_WAVES);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.WEATHERED_CUT_COPPER_AMETHYST_WAVES, ModBlocks.OXIDIZED_CUT_COPPER_AMETHYST_WAVES);

		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.CUT_COPPER_DIAMOND_WAVES, ModBlocks.EXPOSED_CUT_COPPER_DIAMOND_WAVES);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.EXPOSED_CUT_COPPER_DIAMOND_WAVES, ModBlocks.WEATHERED_CUT_COPPER_DIAMOND_WAVES);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.WEATHERED_CUT_COPPER_DIAMOND_WAVES, ModBlocks.OXIDIZED_CUT_COPPER_DIAMOND_WAVES);

		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.CUT_COPPER_EMERALD_WAVES, ModBlocks.EXPOSED_CUT_COPPER_EMERALD_WAVES);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.EXPOSED_CUT_COPPER_EMERALD_WAVES, ModBlocks.WEATHERED_CUT_COPPER_EMERALD_WAVES);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.WEATHERED_CUT_COPPER_EMERALD_WAVES, ModBlocks.OXIDIZED_CUT_COPPER_EMERALD_WAVES);

		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.CUT_COPPER_GOLD_WAVES, ModBlocks.EXPOSED_CUT_COPPER_GOLD_WAVES);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.EXPOSED_CUT_COPPER_GOLD_WAVES, ModBlocks.WEATHERED_CUT_COPPER_GOLD_WAVES);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.WEATHERED_CUT_COPPER_GOLD_WAVES, ModBlocks.OXIDIZED_CUT_COPPER_GOLD_WAVES);

		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.CUT_COPPER_IRON_WAVES, ModBlocks.EXPOSED_CUT_COPPER_IRON_WAVES);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.EXPOSED_CUT_COPPER_IRON_WAVES, ModBlocks.WEATHERED_CUT_COPPER_IRON_WAVES);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.WEATHERED_CUT_COPPER_IRON_WAVES, ModBlocks.OXIDIZED_CUT_COPPER_IRON_WAVES);

		//oxidizable cut cooper metal engraved blocks
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.CUT_COPPER_AMETHYST_BANDS, ModBlocks.WAXED_CUT_COPPER_AMETHYST_BANDS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.CUT_COPPER_DIAMOND_BANDS, ModBlocks.WAXED_CUT_COPPER_DIAMOND_BANDS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.CUT_COPPER_EMERALD_BANDS, ModBlocks.WAXED_CUT_COPPER_EMERALD_BANDS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.CUT_COPPER_GOLD_BANDS, ModBlocks.WAXED_CUT_COPPER_GOLD_BANDS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.CUT_COPPER_IRON_BANDS, ModBlocks.WAXED_CUT_COPPER_IRON_BANDS);

		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.CUT_COPPER_AMETHYST_CHEVRON, ModBlocks.WAXED_CUT_COPPER_AMETHYST_CHEVRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.CUT_COPPER_DIAMOND_CHEVRON, ModBlocks.WAXED_CUT_COPPER_DIAMOND_CHEVRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.CUT_COPPER_EMERALD_CHEVRON, ModBlocks.WAXED_CUT_COPPER_EMERALD_CHEVRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.CUT_COPPER_GOLD_CHEVRON, ModBlocks.WAXED_CUT_COPPER_GOLD_CHEVRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.CUT_COPPER_IRON_CHEVRON, ModBlocks.WAXED_CUT_COPPER_IRON_CHEVRON);

		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.CUT_COPPER_AMETHYST_WAVES, ModBlocks.WAXED_CUT_COPPER_AMETHYST_WAVES);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.CUT_COPPER_DIAMOND_WAVES, ModBlocks.WAXED_CUT_COPPER_DIAMOND_WAVES);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.CUT_COPPER_EMERALD_WAVES, ModBlocks.WAXED_CUT_COPPER_EMERALD_WAVES);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.CUT_COPPER_GOLD_WAVES, ModBlocks.WAXED_CUT_COPPER_GOLD_WAVES);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.CUT_COPPER_IRON_WAVES, ModBlocks.WAXED_CUT_COPPER_IRON_WAVES);

		//oxidizable exposed cut cooper metal engraved blocks
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.EXPOSED_CUT_COPPER_AMETHYST_BANDS, ModBlocks.WAXED_EXPOSED_CUT_COPPER_AMETHYST_BANDS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.EXPOSED_CUT_COPPER_DIAMOND_BANDS, ModBlocks.WAXED_EXPOSED_CUT_COPPER_DIAMOND_BANDS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.EXPOSED_CUT_COPPER_EMERALD_BANDS, ModBlocks.WAXED_EXPOSED_CUT_COPPER_EMERALD_BANDS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.EXPOSED_CUT_COPPER_GOLD_BANDS, ModBlocks.WAXED_EXPOSED_CUT_COPPER_GOLD_BANDS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.EXPOSED_CUT_COPPER_IRON_BANDS, ModBlocks.WAXED_EXPOSED_CUT_COPPER_IRON_BANDS);

		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.EXPOSED_CUT_COPPER_AMETHYST_CHEVRON, ModBlocks.WAXED_EXPOSED_CUT_COPPER_AMETHYST_CHEVRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.EXPOSED_CUT_COPPER_DIAMOND_CHEVRON, ModBlocks.WAXED_EXPOSED_CUT_COPPER_DIAMOND_CHEVRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.EXPOSED_CUT_COPPER_EMERALD_CHEVRON, ModBlocks.WAXED_EXPOSED_CUT_COPPER_EMERALD_CHEVRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.EXPOSED_CUT_COPPER_GOLD_CHEVRON, ModBlocks.WAXED_EXPOSED_CUT_COPPER_GOLD_CHEVRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.EXPOSED_CUT_COPPER_IRON_CHEVRON, ModBlocks.WAXED_EXPOSED_CUT_COPPER_IRON_CHEVRON);

		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.EXPOSED_CUT_COPPER_AMETHYST_WAVES, ModBlocks.WAXED_EXPOSED_CUT_COPPER_AMETHYST_WAVES);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.EXPOSED_CUT_COPPER_DIAMOND_WAVES, ModBlocks.WAXED_EXPOSED_CUT_COPPER_DIAMOND_WAVES);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.EXPOSED_CUT_COPPER_EMERALD_WAVES, ModBlocks.WAXED_EXPOSED_CUT_COPPER_EMERALD_WAVES);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.EXPOSED_CUT_COPPER_GOLD_WAVES, ModBlocks.WAXED_EXPOSED_CUT_COPPER_GOLD_WAVES);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.EXPOSED_CUT_COPPER_IRON_WAVES, ModBlocks.WAXED_EXPOSED_CUT_COPPER_IRON_WAVES);

		//oxidizable weathered cut cooper metal engraved blocks
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.WEATHERED_CUT_COPPER_AMETHYST_BANDS, ModBlocks.WAXED_WEATHERED_CUT_COPPER_AMETHYST_BANDS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.WEATHERED_CUT_COPPER_DIAMOND_BANDS, ModBlocks.WAXED_WEATHERED_CUT_COPPER_DIAMOND_BANDS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.WEATHERED_CUT_COPPER_EMERALD_BANDS, ModBlocks.WAXED_WEATHERED_CUT_COPPER_EMERALD_BANDS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.WEATHERED_CUT_COPPER_GOLD_BANDS, ModBlocks.WAXED_WEATHERED_CUT_COPPER_GOLD_BANDS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.WEATHERED_CUT_COPPER_IRON_BANDS, ModBlocks.WAXED_WEATHERED_CUT_COPPER_IRON_BANDS);

		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.WEATHERED_CUT_COPPER_AMETHYST_CHEVRON, ModBlocks.WAXED_WEATHERED_CUT_COPPER_AMETHYST_CHEVRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.WEATHERED_CUT_COPPER_DIAMOND_CHEVRON, ModBlocks.WAXED_WEATHERED_CUT_COPPER_DIAMOND_CHEVRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.WEATHERED_CUT_COPPER_EMERALD_CHEVRON, ModBlocks.WAXED_WEATHERED_CUT_COPPER_EMERALD_CHEVRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.WEATHERED_CUT_COPPER_GOLD_CHEVRON, ModBlocks.WAXED_WEATHERED_CUT_COPPER_GOLD_CHEVRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.WEATHERED_CUT_COPPER_IRON_CHEVRON, ModBlocks.WAXED_WEATHERED_CUT_COPPER_IRON_CHEVRON);

		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.WEATHERED_CUT_COPPER_AMETHYST_WAVES, ModBlocks.WAXED_WEATHERED_CUT_COPPER_AMETHYST_WAVES);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.WEATHERED_CUT_COPPER_DIAMOND_WAVES, ModBlocks.WAXED_WEATHERED_CUT_COPPER_DIAMOND_WAVES);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.WEATHERED_CUT_COPPER_EMERALD_WAVES, ModBlocks.WAXED_WEATHERED_CUT_COPPER_EMERALD_WAVES);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.WEATHERED_CUT_COPPER_GOLD_WAVES, ModBlocks.WAXED_WEATHERED_CUT_COPPER_GOLD_WAVES);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.WEATHERED_CUT_COPPER_IRON_WAVES, ModBlocks.WAXED_WEATHERED_CUT_COPPER_IRON_WAVES);

		//oxidizable oxidized cut cooper metal engraved blocks
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.OXIDIZED_CUT_COPPER_AMETHYST_BANDS, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_AMETHYST_BANDS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.OXIDIZED_CUT_COPPER_DIAMOND_BANDS, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_DIAMOND_BANDS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.OXIDIZED_CUT_COPPER_EMERALD_BANDS, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_EMERALD_BANDS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.OXIDIZED_CUT_COPPER_GOLD_BANDS, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_GOLD_BANDS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.OXIDIZED_CUT_COPPER_IRON_BANDS, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_IRON_BANDS);

		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.OXIDIZED_CUT_COPPER_AMETHYST_CHEVRON, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_AMETHYST_CHEVRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.OXIDIZED_CUT_COPPER_DIAMOND_CHEVRON, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_DIAMOND_CHEVRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.OXIDIZED_CUT_COPPER_EMERALD_CHEVRON, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_EMERALD_CHEVRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.OXIDIZED_CUT_COPPER_GOLD_CHEVRON, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_GOLD_CHEVRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.OXIDIZED_CUT_COPPER_IRON_CHEVRON, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_IRON_CHEVRON);

		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.OXIDIZED_CUT_COPPER_AMETHYST_WAVES, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_AMETHYST_WAVES);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.OXIDIZED_CUT_COPPER_DIAMOND_WAVES, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_DIAMOND_WAVES);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.OXIDIZED_CUT_COPPER_EMERALD_WAVES, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_EMERALD_WAVES);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.OXIDIZED_CUT_COPPER_GOLD_WAVES, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_GOLD_WAVES);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.OXIDIZED_CUT_COPPER_IRON_WAVES, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_IRON_WAVES);

		//oxidizable nether bricks cooper engraved blocks
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.NETHER_BRICKS_COPPER_BANDS, ModBlocks.NETHER_BRICKS_EXPOSED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.NETHER_BRICKS_EXPOSED_COPPER_BANDS, ModBlocks.NETHER_BRICKS_WEATHERED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.NETHER_BRICKS_WEATHERED_COPPER_BANDS, ModBlocks.NETHER_BRICKS_OXIDIZED_COPPER_BANDS);

		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.NETHER_BRICKS_COPPER_CHEVRON, ModBlocks.NETHER_BRICKS_EXPOSED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.NETHER_BRICKS_EXPOSED_COPPER_CHEVRON, ModBlocks.NETHER_BRICKS_WEATHERED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.NETHER_BRICKS_WEATHERED_COPPER_CHEVRON, ModBlocks.NETHER_BRICKS_OXIDIZED_COPPER_CHEVRON);

		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.NETHER_BRICKS_COPPER_WAVES, ModBlocks.NETHER_BRICKS_EXPOSED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.NETHER_BRICKS_EXPOSED_COPPER_WAVES, ModBlocks.NETHER_BRICKS_WEATHERED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.NETHER_BRICKS_WEATHERED_COPPER_WAVES, ModBlocks.NETHER_BRICKS_OXIDIZED_COPPER_WAVES);

		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.NETHER_BRICKS_COPPER_BANDS, ModBlocks.NETHER_BRICKS_WAXED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.NETHER_BRICKS_EXPOSED_COPPER_BANDS, ModBlocks.NETHER_BRICKS_WAXED_EXPOSED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.NETHER_BRICKS_WEATHERED_COPPER_BANDS, ModBlocks.NETHER_BRICKS_WAXED_WEATHERED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.NETHER_BRICKS_OXIDIZED_COPPER_BANDS, ModBlocks.NETHER_BRICKS_WAXED_OXIDIZED_COPPER_BANDS);

		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.NETHER_BRICKS_COPPER_CHEVRON, ModBlocks.NETHER_BRICKS_WAXED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.NETHER_BRICKS_EXPOSED_COPPER_CHEVRON, ModBlocks.NETHER_BRICKS_WAXED_EXPOSED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.NETHER_BRICKS_WEATHERED_COPPER_CHEVRON, ModBlocks.NETHER_BRICKS_WAXED_WEATHERED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.NETHER_BRICKS_OXIDIZED_COPPER_CHEVRON, ModBlocks.NETHER_BRICKS_WAXED_OXIDIZED_COPPER_CHEVRON);

		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.NETHER_BRICKS_COPPER_WAVES, ModBlocks.NETHER_BRICKS_WAXED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.NETHER_BRICKS_EXPOSED_COPPER_WAVES, ModBlocks.NETHER_BRICKS_WAXED_EXPOSED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.NETHER_BRICKS_WEATHERED_COPPER_WAVES, ModBlocks.NETHER_BRICKS_WAXED_WEATHERED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.NETHER_BRICKS_OXIDIZED_COPPER_WAVES, ModBlocks.NETHER_BRICKS_WAXED_OXIDIZED_COPPER_WAVES);

		//oxidizable polished blackstone bricks cooper engraved blocks
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.POLISHED_BLACKSTONE_BRICKS_COPPER_BANDS, ModBlocks.POLISHED_BLACKSTONE_BRICKS_EXPOSED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.POLISHED_BLACKSTONE_BRICKS_EXPOSED_COPPER_BANDS, ModBlocks.POLISHED_BLACKSTONE_BRICKS_WEATHERED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.POLISHED_BLACKSTONE_BRICKS_WEATHERED_COPPER_BANDS, ModBlocks.POLISHED_BLACKSTONE_BRICKS_OXIDIZED_COPPER_BANDS);

		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.POLISHED_BLACKSTONE_BRICKS_COPPER_CHEVRON, ModBlocks.POLISHED_BLACKSTONE_BRICKS_EXPOSED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.POLISHED_BLACKSTONE_BRICKS_EXPOSED_COPPER_CHEVRON, ModBlocks.POLISHED_BLACKSTONE_BRICKS_WEATHERED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.POLISHED_BLACKSTONE_BRICKS_WEATHERED_COPPER_CHEVRON, ModBlocks.POLISHED_BLACKSTONE_BRICKS_OXIDIZED_COPPER_CHEVRON);

		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.POLISHED_BLACKSTONE_BRICKS_COPPER_WAVES, ModBlocks.POLISHED_BLACKSTONE_BRICKS_EXPOSED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.POLISHED_BLACKSTONE_BRICKS_EXPOSED_COPPER_WAVES, ModBlocks.POLISHED_BLACKSTONE_BRICKS_WEATHERED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.POLISHED_BLACKSTONE_BRICKS_WEATHERED_COPPER_WAVES, ModBlocks.POLISHED_BLACKSTONE_BRICKS_OXIDIZED_COPPER_WAVES);

		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.POLISHED_BLACKSTONE_BRICKS_COPPER_BANDS, ModBlocks.POLISHED_BLACKSTONE_BRICKS_WAXED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.POLISHED_BLACKSTONE_BRICKS_EXPOSED_COPPER_BANDS, ModBlocks.POLISHED_BLACKSTONE_BRICKS_WAXED_EXPOSED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.POLISHED_BLACKSTONE_BRICKS_WEATHERED_COPPER_BANDS, ModBlocks.POLISHED_BLACKSTONE_BRICKS_WAXED_WEATHERED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.POLISHED_BLACKSTONE_BRICKS_OXIDIZED_COPPER_BANDS, ModBlocks.POLISHED_BLACKSTONE_BRICKS_WAXED_OXIDIZED_COPPER_BANDS);

		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.POLISHED_BLACKSTONE_BRICKS_COPPER_CHEVRON, ModBlocks.POLISHED_BLACKSTONE_BRICKS_WAXED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.POLISHED_BLACKSTONE_BRICKS_EXPOSED_COPPER_CHEVRON, ModBlocks.POLISHED_BLACKSTONE_BRICKS_WAXED_EXPOSED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.POLISHED_BLACKSTONE_BRICKS_WEATHERED_COPPER_CHEVRON, ModBlocks.POLISHED_BLACKSTONE_BRICKS_WAXED_WEATHERED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.POLISHED_BLACKSTONE_BRICKS_OXIDIZED_COPPER_CHEVRON, ModBlocks.POLISHED_BLACKSTONE_BRICKS_WAXED_OXIDIZED_COPPER_CHEVRON);

		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.POLISHED_BLACKSTONE_BRICKS_COPPER_WAVES, ModBlocks.POLISHED_BLACKSTONE_BRICKS_WAXED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.POLISHED_BLACKSTONE_BRICKS_EXPOSED_COPPER_WAVES, ModBlocks.POLISHED_BLACKSTONE_BRICKS_WAXED_EXPOSED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.POLISHED_BLACKSTONE_BRICKS_WEATHERED_COPPER_WAVES, ModBlocks.POLISHED_BLACKSTONE_BRICKS_WAXED_WEATHERED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.POLISHED_BLACKSTONE_BRICKS_OXIDIZED_COPPER_WAVES, ModBlocks.POLISHED_BLACKSTONE_BRICKS_WAXED_OXIDIZED_COPPER_WAVES);

		//oxidizable quartz bricks cooper engraved blocks
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.QUARTZ_BRICKS_COPPER_BANDS, ModBlocks.QUARTZ_BRICKS_EXPOSED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.QUARTZ_BRICKS_EXPOSED_COPPER_BANDS, ModBlocks.QUARTZ_BRICKS_WEATHERED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.QUARTZ_BRICKS_WEATHERED_COPPER_BANDS, ModBlocks.QUARTZ_BRICKS_OXIDIZED_COPPER_BANDS);

		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.QUARTZ_BRICKS_COPPER_CHEVRON, ModBlocks.QUARTZ_BRICKS_EXPOSED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.QUARTZ_BRICKS_EXPOSED_COPPER_CHEVRON, ModBlocks.QUARTZ_BRICKS_WEATHERED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.QUARTZ_BRICKS_WEATHERED_COPPER_CHEVRON, ModBlocks.QUARTZ_BRICKS_OXIDIZED_COPPER_CHEVRON);

		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.QUARTZ_BRICKS_COPPER_WAVES, ModBlocks.QUARTZ_BRICKS_EXPOSED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.QUARTZ_BRICKS_EXPOSED_COPPER_WAVES, ModBlocks.QUARTZ_BRICKS_WEATHERED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.QUARTZ_BRICKS_WEATHERED_COPPER_WAVES, ModBlocks.QUARTZ_BRICKS_OXIDIZED_COPPER_WAVES);

		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.QUARTZ_BRICKS_COPPER_BANDS, ModBlocks.QUARTZ_BRICKS_WAXED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.QUARTZ_BRICKS_EXPOSED_COPPER_BANDS, ModBlocks.QUARTZ_BRICKS_WAXED_EXPOSED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.QUARTZ_BRICKS_WEATHERED_COPPER_BANDS, ModBlocks.QUARTZ_BRICKS_WAXED_WEATHERED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.QUARTZ_BRICKS_OXIDIZED_COPPER_BANDS, ModBlocks.QUARTZ_BRICKS_WAXED_OXIDIZED_COPPER_BANDS);

		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.QUARTZ_BRICKS_COPPER_CHEVRON, ModBlocks.QUARTZ_BRICKS_WAXED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.QUARTZ_BRICKS_EXPOSED_COPPER_CHEVRON, ModBlocks.QUARTZ_BRICKS_WAXED_EXPOSED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.QUARTZ_BRICKS_WEATHERED_COPPER_CHEVRON, ModBlocks.QUARTZ_BRICKS_WAXED_WEATHERED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.QUARTZ_BRICKS_OXIDIZED_COPPER_CHEVRON, ModBlocks.QUARTZ_BRICKS_WAXED_OXIDIZED_COPPER_CHEVRON);

		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.QUARTZ_BRICKS_COPPER_WAVES, ModBlocks.QUARTZ_BRICKS_WAXED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.QUARTZ_BRICKS_EXPOSED_COPPER_WAVES, ModBlocks.QUARTZ_BRICKS_WAXED_EXPOSED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.QUARTZ_BRICKS_WEATHERED_COPPER_WAVES, ModBlocks.QUARTZ_BRICKS_WAXED_WEATHERED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.QUARTZ_BRICKS_OXIDIZED_COPPER_WAVES, ModBlocks.QUARTZ_BRICKS_WAXED_OXIDIZED_COPPER_WAVES);

		//oxidizable end stone bricks cooper engraved blocks
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.END_STONE_BRICKS_COPPER_BANDS, ModBlocks.END_STONE_BRICKS_EXPOSED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.END_STONE_BRICKS_EXPOSED_COPPER_BANDS, ModBlocks.END_STONE_BRICKS_WEATHERED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.END_STONE_BRICKS_WEATHERED_COPPER_BANDS, ModBlocks.END_STONE_BRICKS_OXIDIZED_COPPER_BANDS);

		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.END_STONE_BRICKS_COPPER_CHEVRON, ModBlocks.END_STONE_BRICKS_EXPOSED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.END_STONE_BRICKS_EXPOSED_COPPER_CHEVRON, ModBlocks.END_STONE_BRICKS_WEATHERED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.END_STONE_BRICKS_WEATHERED_COPPER_CHEVRON, ModBlocks.END_STONE_BRICKS_OXIDIZED_COPPER_CHEVRON);

		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.END_STONE_BRICKS_COPPER_WAVES, ModBlocks.END_STONE_BRICKS_EXPOSED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.END_STONE_BRICKS_EXPOSED_COPPER_WAVES, ModBlocks.END_STONE_BRICKS_WEATHERED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.END_STONE_BRICKS_WEATHERED_COPPER_WAVES, ModBlocks.END_STONE_BRICKS_OXIDIZED_COPPER_WAVES);

		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.END_STONE_BRICKS_COPPER_BANDS, ModBlocks.END_STONE_BRICKS_WAXED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.END_STONE_BRICKS_EXPOSED_COPPER_BANDS, ModBlocks.END_STONE_BRICKS_WAXED_EXPOSED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.END_STONE_BRICKS_WEATHERED_COPPER_BANDS, ModBlocks.END_STONE_BRICKS_WAXED_WEATHERED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.END_STONE_BRICKS_OXIDIZED_COPPER_BANDS, ModBlocks.END_STONE_BRICKS_WAXED_OXIDIZED_COPPER_BANDS);

		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.END_STONE_BRICKS_COPPER_CHEVRON, ModBlocks.END_STONE_BRICKS_WAXED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.END_STONE_BRICKS_EXPOSED_COPPER_CHEVRON, ModBlocks.END_STONE_BRICKS_WAXED_EXPOSED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.END_STONE_BRICKS_WEATHERED_COPPER_CHEVRON, ModBlocks.END_STONE_BRICKS_WAXED_WEATHERED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.END_STONE_BRICKS_OXIDIZED_COPPER_CHEVRON, ModBlocks.END_STONE_BRICKS_WAXED_OXIDIZED_COPPER_CHEVRON);

		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.END_STONE_BRICKS_COPPER_WAVES, ModBlocks.END_STONE_BRICKS_WAXED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.END_STONE_BRICKS_EXPOSED_COPPER_WAVES, ModBlocks.END_STONE_BRICKS_WAXED_EXPOSED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.END_STONE_BRICKS_WEATHERED_COPPER_WAVES, ModBlocks.END_STONE_BRICKS_WAXED_WEATHERED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.END_STONE_BRICKS_OXIDIZED_COPPER_WAVES, ModBlocks.END_STONE_BRICKS_WAXED_OXIDIZED_COPPER_WAVES);

		//oxidizable purpur blocks cooper engraved blocks
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.PURPUR_BLOCK_COPPER_BANDS, ModBlocks.PURPUR_BLOCK_EXPOSED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.PURPUR_BLOCK_EXPOSED_COPPER_BANDS, ModBlocks.PURPUR_BLOCK_WEATHERED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.PURPUR_BLOCK_WEATHERED_COPPER_BANDS, ModBlocks.PURPUR_BLOCK_OXIDIZED_COPPER_BANDS);

		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.PURPUR_BLOCK_COPPER_CHEVRON, ModBlocks.PURPUR_BLOCK_EXPOSED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.PURPUR_BLOCK_EXPOSED_COPPER_CHEVRON, ModBlocks.PURPUR_BLOCK_WEATHERED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.PURPUR_BLOCK_WEATHERED_COPPER_CHEVRON, ModBlocks.PURPUR_BLOCK_OXIDIZED_COPPER_CHEVRON);

		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.PURPUR_BLOCK_COPPER_WAVES, ModBlocks.PURPUR_BLOCK_EXPOSED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.PURPUR_BLOCK_EXPOSED_COPPER_WAVES, ModBlocks.PURPUR_BLOCK_WEATHERED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(
				ModBlocks.PURPUR_BLOCK_WEATHERED_COPPER_WAVES, ModBlocks.PURPUR_BLOCK_OXIDIZED_COPPER_WAVES);

		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.PURPUR_BLOCK_COPPER_BANDS, ModBlocks.PURPUR_BLOCK_WAXED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.PURPUR_BLOCK_EXPOSED_COPPER_BANDS, ModBlocks.PURPUR_BLOCK_WAXED_EXPOSED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.PURPUR_BLOCK_WEATHERED_COPPER_BANDS, ModBlocks.PURPUR_BLOCK_WAXED_WEATHERED_COPPER_BANDS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.PURPUR_BLOCK_OXIDIZED_COPPER_BANDS, ModBlocks.PURPUR_BLOCK_WAXED_OXIDIZED_COPPER_BANDS);

		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.PURPUR_BLOCK_COPPER_CHEVRON, ModBlocks.PURPUR_BLOCK_WAXED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.PURPUR_BLOCK_EXPOSED_COPPER_CHEVRON, ModBlocks.PURPUR_BLOCK_WAXED_EXPOSED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.PURPUR_BLOCK_WEATHERED_COPPER_CHEVRON, ModBlocks.PURPUR_BLOCK_WAXED_WEATHERED_COPPER_CHEVRON);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.PURPUR_BLOCK_OXIDIZED_COPPER_CHEVRON, ModBlocks.PURPUR_BLOCK_WAXED_OXIDIZED_COPPER_CHEVRON);

		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.PURPUR_BLOCK_COPPER_WAVES, ModBlocks.PURPUR_BLOCK_WAXED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.PURPUR_BLOCK_EXPOSED_COPPER_WAVES, ModBlocks.PURPUR_BLOCK_WAXED_EXPOSED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.PURPUR_BLOCK_WEATHERED_COPPER_WAVES, ModBlocks.PURPUR_BLOCK_WAXED_WEATHERED_COPPER_WAVES);
		OxidizableBlocksRegistry.registerWaxableBlockPair(
				ModBlocks.PURPUR_BLOCK_OXIDIZED_COPPER_WAVES, ModBlocks.PURPUR_BLOCK_WAXED_OXIDIZED_COPPER_WAVES);


	}
}