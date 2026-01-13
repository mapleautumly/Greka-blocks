package net.maple.grecablocks.items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.maple.grecablocks.GrecaBlocks;
import net.maple.grecablocks.block.ModBlocks;
import net.maple.grecablocks.textures.ModTextureMap;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup ENGRAVED = Registry.register(Registries.ITEM_GROUP,
            new Identifier(GrecaBlocks.MOD_ID, "engraved_blocks"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.engraved_blocks"))
            .icon(() -> new ItemStack(ModBlocks.STONE_BRICKS_GOLD_WAVES)).entries((displayContext, entries) -> {

                // stone brick metal and gem engravings
                entries.add(new ItemStack(ModBlocks.STONE_BRICKS_AMETHYST_BANDS));
                entries.add(new ItemStack(ModBlocks.STONE_BRICKS_AMETHYST_CHEVRON));
                entries.add(new ItemStack(ModBlocks.STONE_BRICKS_AMETHYST_WAVES));
                entries.add(new ItemStack(ModBlocks.STONE_BRICKS_DIAMOND_BANDS));
                entries.add(new ItemStack(ModBlocks.STONE_BRICKS_DIAMOND_CHEVRON));
                entries.add(new ItemStack(ModBlocks.STONE_BRICKS_DIAMOND_WAVES));
                entries.add(new ItemStack(ModBlocks.STONE_BRICKS_EMERALD_BANDS));
                entries.add(new ItemStack(ModBlocks.STONE_BRICKS_EMERALD_CHEVRON));
                entries.add(new ItemStack(ModBlocks.STONE_BRICKS_EMERALD_WAVES));
                entries.add(new ItemStack(ModBlocks.STONE_BRICKS_GOLD_BANDS));
                entries.add(new ItemStack(ModBlocks.STONE_BRICKS_GOLD_CHEVRON));
                entries.add(new ItemStack(ModBlocks.STONE_BRICKS_GOLD_WAVES));
                entries.add(new ItemStack(ModBlocks.STONE_BRICKS_IRON_BANDS));
                entries.add(new ItemStack(ModBlocks.STONE_BRICKS_IRON_CHEVRON));
                entries.add(new ItemStack(ModBlocks.STONE_BRICKS_IRON_WAVES));

                entries.add(new ItemStack(ModBlocks.STONE_BRICKS_COPPER_BANDS));
                entries.add(new ItemStack(ModBlocks.STONE_BRICKS_COPPER_CHEVRON));
                entries.add(new ItemStack(ModBlocks.STONE_BRICKS_COPPER_WAVES));
                entries.add(new ItemStack(ModBlocks.STONE_BRICKS_EXPOSED_COPPER_BANDS));
                entries.add(new ItemStack(ModBlocks.STONE_BRICKS_EXPOSED_COPPER_CHEVRON));
                entries.add(new ItemStack(ModBlocks.STONE_BRICKS_EXPOSED_COPPER_WAVES));
                entries.add(new ItemStack(ModBlocks.STONE_BRICKS_WEATHERED_COPPER_BANDS));
                entries.add(new ItemStack(ModBlocks.STONE_BRICKS_WEATHERED_COPPER_CHEVRON));
                entries.add(new ItemStack(ModBlocks.STONE_BRICKS_WEATHERED_COPPER_WAVES));
                entries.add(new ItemStack(ModBlocks.STONE_BRICKS_OXIDIZED_COPPER_BANDS));
                entries.add(new ItemStack(ModBlocks.STONE_BRICKS_OXIDIZED_COPPER_CHEVRON));
                entries.add(new ItemStack(ModBlocks.STONE_BRICKS_OXIDIZED_COPPER_WAVES));

                entries.add(new ItemStack(ModBlocks.STONE_BRICKS_WAXED_COPPER_BANDS));
                entries.add(new ItemStack(ModBlocks.STONE_BRICKS_WAXED_COPPER_CHEVRON));
                entries.add(new ItemStack(ModBlocks.STONE_BRICKS_WAXED_COPPER_WAVES));
                entries.add(new ItemStack(ModBlocks.STONE_BRICKS_WAXED_EXPOSED_COPPER_BANDS));
                entries.add(new ItemStack(ModBlocks.STONE_BRICKS_WAXED_EXPOSED_COPPER_CHEVRON));
                entries.add(new ItemStack(ModBlocks.STONE_BRICKS_WAXED_EXPOSED_COPPER_WAVES));
                entries.add(new ItemStack(ModBlocks.STONE_BRICKS_WAXED_WEATHERED_COPPER_BANDS));
                entries.add(new ItemStack(ModBlocks.STONE_BRICKS_WAXED_WEATHERED_COPPER_CHEVRON));
                entries.add(new ItemStack(ModBlocks.STONE_BRICKS_WAXED_WEATHERED_COPPER_WAVES));
                entries.add(new ItemStack(ModBlocks.STONE_BRICKS_WAXED_OXIDIZED_COPPER_BANDS));
                entries.add(new ItemStack(ModBlocks.STONE_BRICKS_WAXED_OXIDIZED_COPPER_CHEVRON));
                entries.add(new ItemStack(ModBlocks.STONE_BRICKS_WAXED_OXIDIZED_COPPER_WAVES));

                entries.add(new ItemStack(ModBlocks.STONE_BRICKS_LAPIS_BANDS));
                entries.add(new ItemStack(ModBlocks.STONE_BRICKS_LAPIS_CHEVRON));
                entries.add(new ItemStack(ModBlocks.STONE_BRICKS_LAPIS_WAVES));
                entries.add(new ItemStack(ModBlocks.STONE_BRICKS_REDSTONE_BANDS));
                entries.add(new ItemStack(ModBlocks.STONE_BRICKS_REDSTONE_CHEVRON));
                entries.add(new ItemStack(ModBlocks.STONE_BRICKS_REDSTONE_WAVES));
                entries.add(new ItemStack(ModBlocks.STONE_BRICKS_QUARTZ_BANDS));
                entries.add(new ItemStack(ModBlocks.STONE_BRICKS_QUARTZ_CHEVRON));
                entries.add(new ItemStack(ModBlocks.STONE_BRICKS_QUARTZ_WAVES));

                        // deepslate brick metal and gem engravings
                        entries.add(new ItemStack(ModBlocks.DEEPSLATE_BRICKS_AMETHYST_BANDS));
                        entries.add(new ItemStack(ModBlocks.DEEPSLATE_BRICKS_AMETHYST_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.DEEPSLATE_BRICKS_AMETHYST_WAVES));
                        entries.add(new ItemStack(ModBlocks.DEEPSLATE_BRICKS_DIAMOND_BANDS));
                        entries.add(new ItemStack(ModBlocks.DEEPSLATE_BRICKS_DIAMOND_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.DEEPSLATE_BRICKS_DIAMOND_WAVES));
                        entries.add(new ItemStack(ModBlocks.DEEPSLATE_BRICKS_EMERALD_BANDS));
                        entries.add(new ItemStack(ModBlocks.DEEPSLATE_BRICKS_EMERALD_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.DEEPSLATE_BRICKS_EMERALD_WAVES));
                        entries.add(new ItemStack(ModBlocks.DEEPSLATE_BRICKS_GOLD_BANDS));
                        entries.add(new ItemStack(ModBlocks.DEEPSLATE_BRICKS_GOLD_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.DEEPSLATE_BRICKS_GOLD_WAVES));
                        entries.add(new ItemStack(ModBlocks.DEEPSLATE_BRICKS_IRON_BANDS));
                        entries.add(new ItemStack(ModBlocks.DEEPSLATE_BRICKS_IRON_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.DEEPSLATE_BRICKS_IRON_WAVES));

                        entries.add(new ItemStack(ModBlocks.DEEPSLATE_BRICKS_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.DEEPSLATE_BRICKS_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.DEEPSLATE_BRICKS_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.DEEPSLATE_BRICKS_EXPOSED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.DEEPSLATE_BRICKS_EXPOSED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.DEEPSLATE_BRICKS_EXPOSED_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.DEEPSLATE_BRICKS_WEATHERED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.DEEPSLATE_BRICKS_WEATHERED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.DEEPSLATE_BRICKS_WEATHERED_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.DEEPSLATE_BRICKS_OXIDIZED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.DEEPSLATE_BRICKS_OXIDIZED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.DEEPSLATE_BRICKS_OXIDIZED_COPPER_WAVES));

                        entries.add(new ItemStack(ModBlocks.DEEPSLATE_BRICKS_WAXED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.DEEPSLATE_BRICKS_WAXED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.DEEPSLATE_BRICKS_WAXED_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.DEEPSLATE_BRICKS_WAXED_EXPOSED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.DEEPSLATE_BRICKS_WAXED_EXPOSED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.DEEPSLATE_BRICKS_WAXED_EXPOSED_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.DEEPSLATE_BRICKS_WAXED_WEATHERED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.DEEPSLATE_BRICKS_WAXED_WEATHERED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.DEEPSLATE_BRICKS_WAXED_WEATHERED_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.DEEPSLATE_BRICKS_WAXED_OXIDIZED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.DEEPSLATE_BRICKS_WAXED_OXIDIZED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.DEEPSLATE_BRICKS_WAXED_OXIDIZED_COPPER_WAVES));

                        entries.add(new ItemStack(ModBlocks.DEEPSLATE_BRICKS_LAPIS_BANDS));
                        entries.add(new ItemStack(ModBlocks.DEEPSLATE_BRICKS_LAPIS_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.DEEPSLATE_BRICKS_LAPIS_WAVES));
                        entries.add(new ItemStack(ModBlocks.DEEPSLATE_BRICKS_REDSTONE_BANDS));
                        entries.add(new ItemStack(ModBlocks.DEEPSLATE_BRICKS_REDSTONE_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.DEEPSLATE_BRICKS_REDSTONE_WAVES));
                        entries.add(new ItemStack(ModBlocks.DEEPSLATE_BRICKS_QUARTZ_BANDS));
                        entries.add(new ItemStack(ModBlocks.DEEPSLATE_BRICKS_QUARTZ_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.DEEPSLATE_BRICKS_QUARTZ_WAVES));

                        // mud brick metal and gem engravings
                        entries.add(new ItemStack(ModBlocks.MUD_BRICKS_GOLD_BANDS));
                        entries.add(new ItemStack(ModBlocks.MUD_BRICKS_GOLD_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.MUD_BRICKS_GOLD_WAVES));
                        entries.add(new ItemStack(ModBlocks.MUD_BRICKS_IRON_BANDS));
                        entries.add(new ItemStack(ModBlocks.MUD_BRICKS_IRON_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.MUD_BRICKS_IRON_WAVES));

                        entries.add(new ItemStack(ModBlocks.MUD_BRICKS_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.MUD_BRICKS_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.MUD_BRICKS_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.MUD_BRICKS_EXPOSED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.MUD_BRICKS_EXPOSED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.MUD_BRICKS_EXPOSED_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.MUD_BRICKS_WEATHERED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.MUD_BRICKS_WEATHERED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.MUD_BRICKS_WEATHERED_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.MUD_BRICKS_OXIDIZED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.MUD_BRICKS_OXIDIZED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.MUD_BRICKS_OXIDIZED_COPPER_WAVES));

                        entries.add(new ItemStack(ModBlocks.MUD_BRICKS_WAXED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.MUD_BRICKS_WAXED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.MUD_BRICKS_WAXED_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.MUD_BRICKS_WAXED_EXPOSED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.MUD_BRICKS_WAXED_EXPOSED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.MUD_BRICKS_WAXED_EXPOSED_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.MUD_BRICKS_WAXED_WEATHERED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.MUD_BRICKS_WAXED_WEATHERED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.MUD_BRICKS_WAXED_WEATHERED_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.MUD_BRICKS_WAXED_OXIDIZED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.MUD_BRICKS_WAXED_OXIDIZED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.MUD_BRICKS_WAXED_OXIDIZED_COPPER_WAVES));

                        entries.add(new ItemStack(ModBlocks.MUD_BRICKS_LAPIS_BANDS));
                        entries.add(new ItemStack(ModBlocks.MUD_BRICKS_LAPIS_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.MUD_BRICKS_LAPIS_WAVES));
                        entries.add(new ItemStack(ModBlocks.MUD_BRICKS_REDSTONE_BANDS));
                        entries.add(new ItemStack(ModBlocks.MUD_BRICKS_REDSTONE_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.MUD_BRICKS_REDSTONE_WAVES));
                        entries.add(new ItemStack(ModBlocks.MUD_BRICKS_QUARTZ_BANDS));
                        entries.add(new ItemStack(ModBlocks.MUD_BRICKS_QUARTZ_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.MUD_BRICKS_QUARTZ_WAVES));

                        // stone brick metal and gem engravings
                        entries.add(new ItemStack(ModBlocks.PRISMARINE_BRICKS_AMETHYST_BANDS));
                        entries.add(new ItemStack(ModBlocks.PRISMARINE_BRICKS_AMETHYST_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.PRISMARINE_BRICKS_AMETHYST_WAVES));
                        entries.add(new ItemStack(ModBlocks.PRISMARINE_BRICKS_DIAMOND_BANDS));
                        entries.add(new ItemStack(ModBlocks.PRISMARINE_BRICKS_DIAMOND_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.PRISMARINE_BRICKS_DIAMOND_WAVES));
                        entries.add(new ItemStack(ModBlocks.PRISMARINE_BRICKS_EMERALD_BANDS));
                        entries.add(new ItemStack(ModBlocks.PRISMARINE_BRICKS_EMERALD_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.PRISMARINE_BRICKS_EMERALD_WAVES));
                        entries.add(new ItemStack(ModBlocks.PRISMARINE_BRICKS_GOLD_BANDS));
                        entries.add(new ItemStack(ModBlocks.PRISMARINE_BRICKS_GOLD_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.PRISMARINE_BRICKS_GOLD_WAVES));
                        entries.add(new ItemStack(ModBlocks.PRISMARINE_BRICKS_IRON_BANDS));
                        entries.add(new ItemStack(ModBlocks.PRISMARINE_BRICKS_IRON_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.PRISMARINE_BRICKS_IRON_WAVES));

                        entries.add(new ItemStack(ModBlocks.PRISMARINE_BRICKS_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.PRISMARINE_BRICKS_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.PRISMARINE_BRICKS_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.PRISMARINE_BRICKS_EXPOSED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.PRISMARINE_BRICKS_EXPOSED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.PRISMARINE_BRICKS_EXPOSED_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.PRISMARINE_BRICKS_WEATHERED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.PRISMARINE_BRICKS_WEATHERED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.PRISMARINE_BRICKS_WEATHERED_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.PRISMARINE_BRICKS_OXIDIZED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.PRISMARINE_BRICKS_OXIDIZED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.PRISMARINE_BRICKS_OXIDIZED_COPPER_WAVES));

                        entries.add(new ItemStack(ModBlocks.PRISMARINE_BRICKS_WAXED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.PRISMARINE_BRICKS_WAXED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.PRISMARINE_BRICKS_WAXED_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.PRISMARINE_BRICKS_WAXED_EXPOSED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.PRISMARINE_BRICKS_WAXED_EXPOSED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.PRISMARINE_BRICKS_WAXED_EXPOSED_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.PRISMARINE_BRICKS_WAXED_WEATHERED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.PRISMARINE_BRICKS_WAXED_WEATHERED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.PRISMARINE_BRICKS_WAXED_WEATHERED_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.PRISMARINE_BRICKS_WAXED_OXIDIZED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.PRISMARINE_BRICKS_WAXED_OXIDIZED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.PRISMARINE_BRICKS_WAXED_OXIDIZED_COPPER_WAVES));

                        entries.add(new ItemStack(ModBlocks.PRISMARINE_BRICKS_LAPIS_BANDS));
                        entries.add(new ItemStack(ModBlocks.PRISMARINE_BRICKS_LAPIS_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.PRISMARINE_BRICKS_LAPIS_WAVES));
                        entries.add(new ItemStack(ModBlocks.PRISMARINE_BRICKS_REDSTONE_BANDS));
                        entries.add(new ItemStack(ModBlocks.PRISMARINE_BRICKS_REDSTONE_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.PRISMARINE_BRICKS_REDSTONE_WAVES));
                        entries.add(new ItemStack(ModBlocks.PRISMARINE_BRICKS_QUARTZ_BANDS));
                        entries.add(new ItemStack(ModBlocks.PRISMARINE_BRICKS_QUARTZ_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.PRISMARINE_BRICKS_QUARTZ_WAVES));

                        // sandstone metal and gem engravings
                        entries.add(new ItemStack(ModBlocks.SANDSTONE_GOLD_BANDS));
                        entries.add(new ItemStack(ModBlocks.SANDSTONE_GOLD_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.SANDSTONE_GOLD_WAVES));
                        entries.add(new ItemStack(ModBlocks.SANDSTONE_IRON_BANDS));
                        entries.add(new ItemStack(ModBlocks.SANDSTONE_IRON_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.SANDSTONE_IRON_WAVES));

                        entries.add(new ItemStack(ModBlocks.SANDSTONE_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.SANDSTONE_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.SANDSTONE_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.SANDSTONE_EXPOSED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.SANDSTONE_EXPOSED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.SANDSTONE_EXPOSED_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.SANDSTONE_WEATHERED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.SANDSTONE_WEATHERED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.SANDSTONE_WEATHERED_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.SANDSTONE_OXIDIZED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.SANDSTONE_OXIDIZED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.SANDSTONE_OXIDIZED_COPPER_WAVES));

                        entries.add(new ItemStack(ModBlocks.SANDSTONE_WAXED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.SANDSTONE_WAXED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.SANDSTONE_WAXED_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.SANDSTONE_WAXED_EXPOSED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.SANDSTONE_WAXED_EXPOSED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.SANDSTONE_WAXED_EXPOSED_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.SANDSTONE_WAXED_WEATHERED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.SANDSTONE_WAXED_WEATHERED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.SANDSTONE_WAXED_WEATHERED_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.SANDSTONE_WAXED_OXIDIZED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.SANDSTONE_WAXED_OXIDIZED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.SANDSTONE_WAXED_OXIDIZED_COPPER_WAVES));

                        entries.add(new ItemStack(ModBlocks.SANDSTONE_LAPIS_BANDS));
                        entries.add(new ItemStack(ModBlocks.SANDSTONE_LAPIS_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.SANDSTONE_LAPIS_WAVES));
                        entries.add(new ItemStack(ModBlocks.SANDSTONE_REDSTONE_BANDS));
                        entries.add(new ItemStack(ModBlocks.SANDSTONE_REDSTONE_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.SANDSTONE_REDSTONE_WAVES));
                        entries.add(new ItemStack(ModBlocks.SANDSTONE_QUARTZ_BANDS));
                        entries.add(new ItemStack(ModBlocks.SANDSTONE_QUARTZ_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.SANDSTONE_QUARTZ_WAVES));

                        // red sandstone metal and gem engravings
                        entries.add(new ItemStack(ModBlocks.RED_SANDSTONE_GOLD_BANDS));
                        entries.add(new ItemStack(ModBlocks.RED_SANDSTONE_GOLD_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.RED_SANDSTONE_GOLD_WAVES));
                        entries.add(new ItemStack(ModBlocks.RED_SANDSTONE_IRON_BANDS));
                        entries.add(new ItemStack(ModBlocks.RED_SANDSTONE_IRON_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.RED_SANDSTONE_IRON_WAVES));

                        entries.add(new ItemStack(ModBlocks.RED_SANDSTONE_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.RED_SANDSTONE_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.RED_SANDSTONE_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.RED_SANDSTONE_EXPOSED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.RED_SANDSTONE_EXPOSED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.RED_SANDSTONE_EXPOSED_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.RED_SANDSTONE_WEATHERED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.RED_SANDSTONE_WEATHERED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.RED_SANDSTONE_WEATHERED_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.RED_SANDSTONE_OXIDIZED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.RED_SANDSTONE_OXIDIZED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.RED_SANDSTONE_OXIDIZED_COPPER_WAVES));

                        entries.add(new ItemStack(ModBlocks.RED_SANDSTONE_WAXED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.RED_SANDSTONE_WAXED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.RED_SANDSTONE_WAXED_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.RED_SANDSTONE_WAXED_EXPOSED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.RED_SANDSTONE_WAXED_EXPOSED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.RED_SANDSTONE_WAXED_EXPOSED_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.RED_SANDSTONE_WAXED_WEATHERED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.RED_SANDSTONE_WAXED_WEATHERED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.RED_SANDSTONE_WAXED_WEATHERED_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.RED_SANDSTONE_WAXED_OXIDIZED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.RED_SANDSTONE_WAXED_OXIDIZED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.RED_SANDSTONE_WAXED_OXIDIZED_COPPER_WAVES));

                        entries.add(new ItemStack(ModBlocks.RED_SANDSTONE_LAPIS_BANDS));
                        entries.add(new ItemStack(ModBlocks.RED_SANDSTONE_LAPIS_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.RED_SANDSTONE_LAPIS_WAVES));
                        entries.add(new ItemStack(ModBlocks.RED_SANDSTONE_REDSTONE_BANDS));
                        entries.add(new ItemStack(ModBlocks.RED_SANDSTONE_REDSTONE_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.RED_SANDSTONE_REDSTONE_WAVES));
                        entries.add(new ItemStack(ModBlocks.RED_SANDSTONE_QUARTZ_BANDS));
                        entries.add(new ItemStack(ModBlocks.RED_SANDSTONE_QUARTZ_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.RED_SANDSTONE_QUARTZ_WAVES));

                            // cut copper metal and gem engravings
                            entries.add(new ItemStack(ModBlocks.CUT_COPPER_AMETHYST_BANDS));
                            entries.add(new ItemStack(ModBlocks.CUT_COPPER_AMETHYST_CHEVRON));
                            entries.add(new ItemStack(ModBlocks.CUT_COPPER_AMETHYST_WAVES));
                            entries.add(new ItemStack(ModBlocks.CUT_COPPER_DIAMOND_BANDS));
                            entries.add(new ItemStack(ModBlocks.CUT_COPPER_DIAMOND_CHEVRON));
                            entries.add(new ItemStack(ModBlocks.CUT_COPPER_DIAMOND_WAVES));
                            entries.add(new ItemStack(ModBlocks.CUT_COPPER_EMERALD_BANDS));
                            entries.add(new ItemStack(ModBlocks.CUT_COPPER_EMERALD_CHEVRON));
                            entries.add(new ItemStack(ModBlocks.CUT_COPPER_EMERALD_WAVES));
                            entries.add(new ItemStack(ModBlocks.CUT_COPPER_GOLD_BANDS));
                            entries.add(new ItemStack(ModBlocks.CUT_COPPER_GOLD_CHEVRON));
                            entries.add(new ItemStack(ModBlocks.CUT_COPPER_GOLD_WAVES));
                            entries.add(new ItemStack(ModBlocks.CUT_COPPER_IRON_BANDS));
                            entries.add(new ItemStack(ModBlocks.CUT_COPPER_IRON_CHEVRON));
                            entries.add(new ItemStack(ModBlocks.CUT_COPPER_IRON_WAVES));

                            entries.add(new ItemStack(ModBlocks.WAXED_CUT_COPPER_AMETHYST_BANDS));
                            entries.add(new ItemStack(ModBlocks.WAXED_CUT_COPPER_AMETHYST_CHEVRON));
                            entries.add(new ItemStack(ModBlocks.WAXED_CUT_COPPER_AMETHYST_WAVES));
                            entries.add(new ItemStack(ModBlocks.WAXED_CUT_COPPER_DIAMOND_BANDS));
                            entries.add(new ItemStack(ModBlocks.WAXED_CUT_COPPER_DIAMOND_CHEVRON));
                            entries.add(new ItemStack(ModBlocks.WAXED_CUT_COPPER_DIAMOND_WAVES));
                            entries.add(new ItemStack(ModBlocks.WAXED_CUT_COPPER_EMERALD_BANDS));
                            entries.add(new ItemStack(ModBlocks.WAXED_CUT_COPPER_EMERALD_CHEVRON));
                            entries.add(new ItemStack(ModBlocks.WAXED_CUT_COPPER_EMERALD_WAVES));
                            entries.add(new ItemStack(ModBlocks.WAXED_CUT_COPPER_GOLD_BANDS));
                            entries.add(new ItemStack(ModBlocks.WAXED_CUT_COPPER_GOLD_CHEVRON));
                            entries.add(new ItemStack(ModBlocks.WAXED_CUT_COPPER_GOLD_WAVES));
                            entries.add(new ItemStack(ModBlocks.WAXED_CUT_COPPER_IRON_BANDS));
                            entries.add(new ItemStack(ModBlocks.WAXED_CUT_COPPER_IRON_CHEVRON));
                            entries.add(new ItemStack(ModBlocks.WAXED_CUT_COPPER_IRON_WAVES));

                            // exposed cut copper metal and gem engravings
                            entries.add(new ItemStack(ModBlocks.EXPOSED_CUT_COPPER_AMETHYST_BANDS));
                            entries.add(new ItemStack(ModBlocks.EXPOSED_CUT_COPPER_AMETHYST_CHEVRON));
                            entries.add(new ItemStack(ModBlocks.EXPOSED_CUT_COPPER_AMETHYST_WAVES));
                            entries.add(new ItemStack(ModBlocks.EXPOSED_CUT_COPPER_DIAMOND_BANDS));
                            entries.add(new ItemStack(ModBlocks.EXPOSED_CUT_COPPER_DIAMOND_CHEVRON));
                            entries.add(new ItemStack(ModBlocks.EXPOSED_CUT_COPPER_DIAMOND_WAVES));
                            entries.add(new ItemStack(ModBlocks.EXPOSED_CUT_COPPER_EMERALD_BANDS));
                            entries.add(new ItemStack(ModBlocks.EXPOSED_CUT_COPPER_EMERALD_CHEVRON));
                            entries.add(new ItemStack(ModBlocks.EXPOSED_CUT_COPPER_EMERALD_WAVES));
                            entries.add(new ItemStack(ModBlocks.EXPOSED_CUT_COPPER_GOLD_BANDS));
                            entries.add(new ItemStack(ModBlocks.EXPOSED_CUT_COPPER_GOLD_CHEVRON));
                            entries.add(new ItemStack(ModBlocks.EXPOSED_CUT_COPPER_GOLD_WAVES));
                            entries.add(new ItemStack(ModBlocks.EXPOSED_CUT_COPPER_IRON_BANDS));
                            entries.add(new ItemStack(ModBlocks.EXPOSED_CUT_COPPER_IRON_CHEVRON));
                            entries.add(new ItemStack(ModBlocks.EXPOSED_CUT_COPPER_IRON_WAVES));

                            entries.add(new ItemStack(ModBlocks.WAXED_EXPOSED_CUT_COPPER_AMETHYST_BANDS));
                            entries.add(new ItemStack(ModBlocks.WAXED_EXPOSED_CUT_COPPER_AMETHYST_CHEVRON));
                            entries.add(new ItemStack(ModBlocks.WAXED_EXPOSED_CUT_COPPER_AMETHYST_WAVES));
                            entries.add(new ItemStack(ModBlocks.WAXED_EXPOSED_CUT_COPPER_DIAMOND_BANDS));
                            entries.add(new ItemStack(ModBlocks.WAXED_EXPOSED_CUT_COPPER_DIAMOND_CHEVRON));
                            entries.add(new ItemStack(ModBlocks.WAXED_EXPOSED_CUT_COPPER_DIAMOND_WAVES));
                            entries.add(new ItemStack(ModBlocks.WAXED_EXPOSED_CUT_COPPER_EMERALD_BANDS));
                            entries.add(new ItemStack(ModBlocks.WAXED_EXPOSED_CUT_COPPER_EMERALD_CHEVRON));
                            entries.add(new ItemStack(ModBlocks.WAXED_EXPOSED_CUT_COPPER_EMERALD_WAVES));
                            entries.add(new ItemStack(ModBlocks.WAXED_EXPOSED_CUT_COPPER_GOLD_BANDS));
                            entries.add(new ItemStack(ModBlocks.WAXED_EXPOSED_CUT_COPPER_GOLD_CHEVRON));
                            entries.add(new ItemStack(ModBlocks.WAXED_EXPOSED_CUT_COPPER_GOLD_WAVES));
                            entries.add(new ItemStack(ModBlocks.WAXED_EXPOSED_CUT_COPPER_IRON_BANDS));
                            entries.add(new ItemStack(ModBlocks.WAXED_EXPOSED_CUT_COPPER_IRON_CHEVRON));
                            entries.add(new ItemStack(ModBlocks.WAXED_EXPOSED_CUT_COPPER_IRON_WAVES));

                            // weathered cut copper metal and gem engravings
                            entries.add(new ItemStack(ModBlocks.WEATHERED_CUT_COPPER_AMETHYST_BANDS));
                            entries.add(new ItemStack(ModBlocks.WEATHERED_CUT_COPPER_AMETHYST_CHEVRON));
                            entries.add(new ItemStack(ModBlocks.WEATHERED_CUT_COPPER_AMETHYST_WAVES));
                            entries.add(new ItemStack(ModBlocks.WEATHERED_CUT_COPPER_DIAMOND_BANDS));
                            entries.add(new ItemStack(ModBlocks.WEATHERED_CUT_COPPER_DIAMOND_CHEVRON));
                            entries.add(new ItemStack(ModBlocks.WEATHERED_CUT_COPPER_DIAMOND_WAVES));
                            entries.add(new ItemStack(ModBlocks.WEATHERED_CUT_COPPER_EMERALD_BANDS));
                            entries.add(new ItemStack(ModBlocks.WEATHERED_CUT_COPPER_EMERALD_CHEVRON));
                            entries.add(new ItemStack(ModBlocks.WEATHERED_CUT_COPPER_EMERALD_WAVES));
                            entries.add(new ItemStack(ModBlocks.WEATHERED_CUT_COPPER_GOLD_BANDS));
                            entries.add(new ItemStack(ModBlocks.WEATHERED_CUT_COPPER_GOLD_CHEVRON));
                            entries.add(new ItemStack(ModBlocks.WEATHERED_CUT_COPPER_GOLD_WAVES));
                            entries.add(new ItemStack(ModBlocks.WEATHERED_CUT_COPPER_IRON_BANDS));
                            entries.add(new ItemStack(ModBlocks.WEATHERED_CUT_COPPER_IRON_CHEVRON));
                            entries.add(new ItemStack(ModBlocks.WEATHERED_CUT_COPPER_IRON_WAVES));

                            entries.add(new ItemStack(ModBlocks.WAXED_WEATHERED_CUT_COPPER_AMETHYST_BANDS));
                            entries.add(new ItemStack(ModBlocks.WAXED_WEATHERED_CUT_COPPER_AMETHYST_CHEVRON));
                            entries.add(new ItemStack(ModBlocks.WAXED_WEATHERED_CUT_COPPER_AMETHYST_WAVES));
                            entries.add(new ItemStack(ModBlocks.WAXED_WEATHERED_CUT_COPPER_DIAMOND_BANDS));
                            entries.add(new ItemStack(ModBlocks.WAXED_WEATHERED_CUT_COPPER_DIAMOND_CHEVRON));
                            entries.add(new ItemStack(ModBlocks.WAXED_WEATHERED_CUT_COPPER_DIAMOND_WAVES));
                            entries.add(new ItemStack(ModBlocks.WAXED_WEATHERED_CUT_COPPER_EMERALD_BANDS));
                            entries.add(new ItemStack(ModBlocks.WAXED_WEATHERED_CUT_COPPER_EMERALD_CHEVRON));
                            entries.add(new ItemStack(ModBlocks.WAXED_WEATHERED_CUT_COPPER_EMERALD_WAVES));
                            entries.add(new ItemStack(ModBlocks.WAXED_WEATHERED_CUT_COPPER_GOLD_BANDS));
                            entries.add(new ItemStack(ModBlocks.WAXED_WEATHERED_CUT_COPPER_GOLD_CHEVRON));
                            entries.add(new ItemStack(ModBlocks.WAXED_WEATHERED_CUT_COPPER_GOLD_WAVES));
                            entries.add(new ItemStack(ModBlocks.WAXED_WEATHERED_CUT_COPPER_IRON_BANDS));
                            entries.add(new ItemStack(ModBlocks.WAXED_WEATHERED_CUT_COPPER_IRON_CHEVRON));
                            entries.add(new ItemStack(ModBlocks.WAXED_WEATHERED_CUT_COPPER_IRON_WAVES));

                            // oxidized cut copper metal and gem engravings
                            entries.add(new ItemStack(ModBlocks.OXIDIZED_CUT_COPPER_AMETHYST_BANDS));
                            entries.add(new ItemStack(ModBlocks.OXIDIZED_CUT_COPPER_AMETHYST_CHEVRON));
                            entries.add(new ItemStack(ModBlocks.OXIDIZED_CUT_COPPER_AMETHYST_WAVES));
                            entries.add(new ItemStack(ModBlocks.OXIDIZED_CUT_COPPER_DIAMOND_BANDS));
                            entries.add(new ItemStack(ModBlocks.OXIDIZED_CUT_COPPER_DIAMOND_CHEVRON));
                            entries.add(new ItemStack(ModBlocks.OXIDIZED_CUT_COPPER_DIAMOND_WAVES));
                            entries.add(new ItemStack(ModBlocks.OXIDIZED_CUT_COPPER_EMERALD_BANDS));
                            entries.add(new ItemStack(ModBlocks.OXIDIZED_CUT_COPPER_EMERALD_CHEVRON));
                            entries.add(new ItemStack(ModBlocks.OXIDIZED_CUT_COPPER_EMERALD_WAVES));
                            entries.add(new ItemStack(ModBlocks.OXIDIZED_CUT_COPPER_GOLD_BANDS));
                            entries.add(new ItemStack(ModBlocks.OXIDIZED_CUT_COPPER_GOLD_CHEVRON));
                            entries.add(new ItemStack(ModBlocks.OXIDIZED_CUT_COPPER_GOLD_WAVES));
                            entries.add(new ItemStack(ModBlocks.OXIDIZED_CUT_COPPER_IRON_BANDS));
                            entries.add(new ItemStack(ModBlocks.OXIDIZED_CUT_COPPER_IRON_CHEVRON));
                            entries.add(new ItemStack(ModBlocks.OXIDIZED_CUT_COPPER_IRON_WAVES));

                            entries.add(new ItemStack(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_AMETHYST_BANDS));
                            entries.add(new ItemStack(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_AMETHYST_CHEVRON));
                            entries.add(new ItemStack(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_AMETHYST_WAVES));
                            entries.add(new ItemStack(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_DIAMOND_BANDS));
                            entries.add(new ItemStack(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_DIAMOND_CHEVRON));
                            entries.add(new ItemStack(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_DIAMOND_WAVES));
                            entries.add(new ItemStack(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_EMERALD_BANDS));
                            entries.add(new ItemStack(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_EMERALD_CHEVRON));
                            entries.add(new ItemStack(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_EMERALD_WAVES));
                            entries.add(new ItemStack(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_GOLD_BANDS));
                            entries.add(new ItemStack(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_GOLD_CHEVRON));
                            entries.add(new ItemStack(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_GOLD_WAVES));
                            entries.add(new ItemStack(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_IRON_BANDS));
                            entries.add(new ItemStack(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_IRON_CHEVRON));
                            entries.add(new ItemStack(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_IRON_WAVES));

                        // nether brick metal and gem engravings
                        entries.add(new ItemStack(ModBlocks.NETHER_BRICKS_GOLD_BANDS));
                        entries.add(new ItemStack(ModBlocks.NETHER_BRICKS_GOLD_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.NETHER_BRICKS_GOLD_WAVES));
                        entries.add(new ItemStack(ModBlocks.NETHER_BRICKS_IRON_BANDS));
                        entries.add(new ItemStack(ModBlocks.NETHER_BRICKS_IRON_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.NETHER_BRICKS_IRON_WAVES));

                        entries.add(new ItemStack(ModBlocks.NETHER_BRICKS_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.NETHER_BRICKS_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.NETHER_BRICKS_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.NETHER_BRICKS_EXPOSED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.NETHER_BRICKS_EXPOSED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.NETHER_BRICKS_EXPOSED_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.NETHER_BRICKS_WEATHERED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.NETHER_BRICKS_WEATHERED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.NETHER_BRICKS_WEATHERED_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.NETHER_BRICKS_OXIDIZED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.NETHER_BRICKS_OXIDIZED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.NETHER_BRICKS_OXIDIZED_COPPER_WAVES));

                        entries.add(new ItemStack(ModBlocks.NETHER_BRICKS_WAXED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.NETHER_BRICKS_WAXED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.NETHER_BRICKS_WAXED_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.NETHER_BRICKS_WAXED_EXPOSED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.NETHER_BRICKS_WAXED_EXPOSED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.NETHER_BRICKS_WAXED_EXPOSED_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.NETHER_BRICKS_WAXED_WEATHERED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.NETHER_BRICKS_WAXED_WEATHERED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.NETHER_BRICKS_WAXED_WEATHERED_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.NETHER_BRICKS_WAXED_OXIDIZED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.NETHER_BRICKS_WAXED_OXIDIZED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.NETHER_BRICKS_WAXED_OXIDIZED_COPPER_WAVES));

                        entries.add(new ItemStack(ModBlocks.NETHER_BRICKS_LAPIS_BANDS));
                        entries.add(new ItemStack(ModBlocks.NETHER_BRICKS_LAPIS_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.NETHER_BRICKS_LAPIS_WAVES));
                        entries.add(new ItemStack(ModBlocks.NETHER_BRICKS_REDSTONE_BANDS));
                        entries.add(new ItemStack(ModBlocks.NETHER_BRICKS_REDSTONE_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.NETHER_BRICKS_REDSTONE_WAVES));
                        entries.add(new ItemStack(ModBlocks.NETHER_BRICKS_QUARTZ_BANDS));
                        entries.add(new ItemStack(ModBlocks.NETHER_BRICKS_QUARTZ_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.NETHER_BRICKS_QUARTZ_WAVES));
                        entries.add(new ItemStack(ModBlocks.NETHER_BRICKS_BLAZE_BANDS));
                        entries.add(new ItemStack(ModBlocks.NETHER_BRICKS_BLAZE_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.NETHER_BRICKS_BLAZE_WAVES));

                        // polished blackstone brick metal and gem engravings
                        entries.add(new ItemStack(ModBlocks.POLISHED_BLACKSTONE_BRICKS_AMETHYST_BANDS));
                        entries.add(new ItemStack(ModBlocks.POLISHED_BLACKSTONE_BRICKS_AMETHYST_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.POLISHED_BLACKSTONE_BRICKS_AMETHYST_WAVES));
                        entries.add(new ItemStack(ModBlocks.POLISHED_BLACKSTONE_BRICKS_DIAMOND_BANDS));
                        entries.add(new ItemStack(ModBlocks.POLISHED_BLACKSTONE_BRICKS_DIAMOND_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.POLISHED_BLACKSTONE_BRICKS_DIAMOND_WAVES));
                        entries.add(new ItemStack(ModBlocks.POLISHED_BLACKSTONE_BRICKS_EMERALD_BANDS));
                        entries.add(new ItemStack(ModBlocks.POLISHED_BLACKSTONE_BRICKS_EMERALD_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.POLISHED_BLACKSTONE_BRICKS_EMERALD_WAVES));
                        entries.add(new ItemStack(ModBlocks.POLISHED_BLACKSTONE_BRICKS_GOLD_BANDS));
                        entries.add(new ItemStack(ModBlocks.POLISHED_BLACKSTONE_BRICKS_GOLD_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.POLISHED_BLACKSTONE_BRICKS_GOLD_WAVES));
                        entries.add(new ItemStack(ModBlocks.POLISHED_BLACKSTONE_BRICKS_IRON_BANDS));
                        entries.add(new ItemStack(ModBlocks.POLISHED_BLACKSTONE_BRICKS_IRON_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.POLISHED_BLACKSTONE_BRICKS_IRON_WAVES));

                        entries.add(new ItemStack(ModBlocks.POLISHED_BLACKSTONE_BRICKS_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.POLISHED_BLACKSTONE_BRICKS_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.POLISHED_BLACKSTONE_BRICKS_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.POLISHED_BLACKSTONE_BRICKS_EXPOSED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.POLISHED_BLACKSTONE_BRICKS_EXPOSED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.POLISHED_BLACKSTONE_BRICKS_EXPOSED_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.POLISHED_BLACKSTONE_BRICKS_WEATHERED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.POLISHED_BLACKSTONE_BRICKS_WEATHERED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.POLISHED_BLACKSTONE_BRICKS_WEATHERED_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.POLISHED_BLACKSTONE_BRICKS_OXIDIZED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.POLISHED_BLACKSTONE_BRICKS_OXIDIZED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.POLISHED_BLACKSTONE_BRICKS_OXIDIZED_COPPER_WAVES));

                        entries.add(new ItemStack(ModBlocks.POLISHED_BLACKSTONE_BRICKS_WAXED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.POLISHED_BLACKSTONE_BRICKS_WAXED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.POLISHED_BLACKSTONE_BRICKS_WAXED_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.POLISHED_BLACKSTONE_BRICKS_WAXED_EXPOSED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.POLISHED_BLACKSTONE_BRICKS_WAXED_EXPOSED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.POLISHED_BLACKSTONE_BRICKS_WAXED_EXPOSED_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.POLISHED_BLACKSTONE_BRICKS_WAXED_WEATHERED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.POLISHED_BLACKSTONE_BRICKS_WAXED_WEATHERED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.POLISHED_BLACKSTONE_BRICKS_WAXED_WEATHERED_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.POLISHED_BLACKSTONE_BRICKS_WAXED_OXIDIZED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.POLISHED_BLACKSTONE_BRICKS_WAXED_OXIDIZED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.POLISHED_BLACKSTONE_BRICKS_WAXED_OXIDIZED_COPPER_WAVES));

                        entries.add(new ItemStack(ModBlocks.POLISHED_BLACKSTONE_BRICKS_LAPIS_BANDS));
                        entries.add(new ItemStack(ModBlocks.POLISHED_BLACKSTONE_BRICKS_LAPIS_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.POLISHED_BLACKSTONE_BRICKS_LAPIS_WAVES));
                        entries.add(new ItemStack(ModBlocks.POLISHED_BLACKSTONE_BRICKS_REDSTONE_BANDS));
                        entries.add(new ItemStack(ModBlocks.POLISHED_BLACKSTONE_BRICKS_REDSTONE_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.POLISHED_BLACKSTONE_BRICKS_REDSTONE_WAVES));
                        entries.add(new ItemStack(ModBlocks.POLISHED_BLACKSTONE_BRICKS_QUARTZ_BANDS));
                        entries.add(new ItemStack(ModBlocks.POLISHED_BLACKSTONE_BRICKS_QUARTZ_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.POLISHED_BLACKSTONE_BRICKS_QUARTZ_WAVES));
                        entries.add(new ItemStack(ModBlocks.POLISHED_BLACKSTONE_BRICKS_BLAZE_BANDS));
                        entries.add(new ItemStack(ModBlocks.POLISHED_BLACKSTONE_BRICKS_BLAZE_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.POLISHED_BLACKSTONE_BRICKS_BLAZE_WAVES));

                        // quartz brick metal and gem engravings
                        entries.add(new ItemStack(ModBlocks.QUARTZ_BRICKS_AMETHYST_BANDS));
                        entries.add(new ItemStack(ModBlocks.QUARTZ_BRICKS_AMETHYST_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.QUARTZ_BRICKS_AMETHYST_WAVES));
                        entries.add(new ItemStack(ModBlocks.QUARTZ_BRICKS_DIAMOND_BANDS));
                        entries.add(new ItemStack(ModBlocks.QUARTZ_BRICKS_DIAMOND_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.QUARTZ_BRICKS_DIAMOND_WAVES));
                        entries.add(new ItemStack(ModBlocks.QUARTZ_BRICKS_EMERALD_BANDS));
                        entries.add(new ItemStack(ModBlocks.QUARTZ_BRICKS_EMERALD_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.QUARTZ_BRICKS_EMERALD_WAVES));
                        entries.add(new ItemStack(ModBlocks.QUARTZ_BRICKS_GOLD_BANDS));
                        entries.add(new ItemStack(ModBlocks.QUARTZ_BRICKS_GOLD_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.QUARTZ_BRICKS_GOLD_WAVES));
                        entries.add(new ItemStack(ModBlocks.QUARTZ_BRICKS_IRON_BANDS));
                        entries.add(new ItemStack(ModBlocks.QUARTZ_BRICKS_IRON_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.QUARTZ_BRICKS_IRON_WAVES));

                        entries.add(new ItemStack(ModBlocks.QUARTZ_BRICKS_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.QUARTZ_BRICKS_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.QUARTZ_BRICKS_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.QUARTZ_BRICKS_EXPOSED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.QUARTZ_BRICKS_EXPOSED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.QUARTZ_BRICKS_EXPOSED_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.QUARTZ_BRICKS_WEATHERED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.QUARTZ_BRICKS_WEATHERED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.QUARTZ_BRICKS_WEATHERED_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.QUARTZ_BRICKS_OXIDIZED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.QUARTZ_BRICKS_OXIDIZED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.QUARTZ_BRICKS_OXIDIZED_COPPER_WAVES));

                        entries.add(new ItemStack(ModBlocks.QUARTZ_BRICKS_WAXED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.QUARTZ_BRICKS_WAXED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.QUARTZ_BRICKS_WAXED_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.QUARTZ_BRICKS_WAXED_EXPOSED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.QUARTZ_BRICKS_WAXED_EXPOSED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.QUARTZ_BRICKS_WAXED_EXPOSED_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.QUARTZ_BRICKS_WAXED_WEATHERED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.QUARTZ_BRICKS_WAXED_WEATHERED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.QUARTZ_BRICKS_WAXED_WEATHERED_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.QUARTZ_BRICKS_WAXED_OXIDIZED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.QUARTZ_BRICKS_WAXED_OXIDIZED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.QUARTZ_BRICKS_WAXED_OXIDIZED_COPPER_WAVES));

                        entries.add(new ItemStack(ModBlocks.QUARTZ_BRICKS_LAPIS_BANDS));
                        entries.add(new ItemStack(ModBlocks.QUARTZ_BRICKS_LAPIS_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.QUARTZ_BRICKS_LAPIS_WAVES));
                        entries.add(new ItemStack(ModBlocks.QUARTZ_BRICKS_REDSTONE_BANDS));
                        entries.add(new ItemStack(ModBlocks.QUARTZ_BRICKS_REDSTONE_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.QUARTZ_BRICKS_REDSTONE_WAVES));
                        entries.add(new ItemStack(ModBlocks.QUARTZ_BRICKS_BLAZE_BANDS));
                        entries.add(new ItemStack(ModBlocks.QUARTZ_BRICKS_BLAZE_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.QUARTZ_BRICKS_BLAZE_WAVES));

                        // end stone brick metal and gem engravings
                        entries.add(new ItemStack(ModBlocks.END_STONE_BRICKS_AMETHYST_BANDS));
                        entries.add(new ItemStack(ModBlocks.END_STONE_BRICKS_AMETHYST_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.END_STONE_BRICKS_AMETHYST_WAVES));
                        entries.add(new ItemStack(ModBlocks.END_STONE_BRICKS_DIAMOND_BANDS));
                        entries.add(new ItemStack(ModBlocks.END_STONE_BRICKS_DIAMOND_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.END_STONE_BRICKS_DIAMOND_WAVES));
                        entries.add(new ItemStack(ModBlocks.END_STONE_BRICKS_EMERALD_BANDS));
                        entries.add(new ItemStack(ModBlocks.END_STONE_BRICKS_EMERALD_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.END_STONE_BRICKS_EMERALD_WAVES));
                        entries.add(new ItemStack(ModBlocks.END_STONE_BRICKS_GOLD_BANDS));
                        entries.add(new ItemStack(ModBlocks.END_STONE_BRICKS_GOLD_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.END_STONE_BRICKS_GOLD_WAVES));
                        entries.add(new ItemStack(ModBlocks.END_STONE_BRICKS_IRON_BANDS));
                        entries.add(new ItemStack(ModBlocks.END_STONE_BRICKS_IRON_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.END_STONE_BRICKS_IRON_WAVES));

                        entries.add(new ItemStack(ModBlocks.END_STONE_BRICKS_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.END_STONE_BRICKS_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.END_STONE_BRICKS_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.END_STONE_BRICKS_EXPOSED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.END_STONE_BRICKS_EXPOSED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.END_STONE_BRICKS_EXPOSED_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.END_STONE_BRICKS_WEATHERED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.END_STONE_BRICKS_WEATHERED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.END_STONE_BRICKS_WEATHERED_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.END_STONE_BRICKS_OXIDIZED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.END_STONE_BRICKS_OXIDIZED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.END_STONE_BRICKS_OXIDIZED_COPPER_WAVES));

                        entries.add(new ItemStack(ModBlocks.END_STONE_BRICKS_WAXED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.END_STONE_BRICKS_WAXED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.END_STONE_BRICKS_WAXED_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.END_STONE_BRICKS_WAXED_EXPOSED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.END_STONE_BRICKS_WAXED_EXPOSED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.END_STONE_BRICKS_WAXED_EXPOSED_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.END_STONE_BRICKS_WAXED_WEATHERED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.END_STONE_BRICKS_WAXED_WEATHERED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.END_STONE_BRICKS_WAXED_WEATHERED_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.END_STONE_BRICKS_WAXED_OXIDIZED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.END_STONE_BRICKS_WAXED_OXIDIZED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.END_STONE_BRICKS_WAXED_OXIDIZED_COPPER_WAVES));

                        entries.add(new ItemStack(ModBlocks.END_STONE_BRICKS_LAPIS_BANDS));
                        entries.add(new ItemStack(ModBlocks.END_STONE_BRICKS_LAPIS_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.END_STONE_BRICKS_LAPIS_WAVES));
                        entries.add(new ItemStack(ModBlocks.END_STONE_BRICKS_REDSTONE_BANDS));
                        entries.add(new ItemStack(ModBlocks.END_STONE_BRICKS_REDSTONE_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.END_STONE_BRICKS_REDSTONE_WAVES));
                        entries.add(new ItemStack(ModBlocks.END_STONE_BRICKS_QUARTZ_BANDS));
                        entries.add(new ItemStack(ModBlocks.END_STONE_BRICKS_QUARTZ_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.END_STONE_BRICKS_QUARTZ_WAVES));
                        entries.add(new ItemStack(ModBlocks.END_STONE_BRICKS_ENDER_BANDS));
                        entries.add(new ItemStack(ModBlocks.END_STONE_BRICKS_ENDER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.END_STONE_BRICKS_ENDER_WAVES));

                        // purpur blocks metal and gem engravings
                        entries.add(new ItemStack(ModBlocks.PURPUR_BLOCK_AMETHYST_BANDS));
                        entries.add(new ItemStack(ModBlocks.PURPUR_BLOCK_AMETHYST_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.PURPUR_BLOCK_AMETHYST_WAVES));
                        entries.add(new ItemStack(ModBlocks.PURPUR_BLOCK_DIAMOND_BANDS));
                        entries.add(new ItemStack(ModBlocks.PURPUR_BLOCK_DIAMOND_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.PURPUR_BLOCK_DIAMOND_WAVES));
                        entries.add(new ItemStack(ModBlocks.PURPUR_BLOCK_EMERALD_BANDS));
                        entries.add(new ItemStack(ModBlocks.PURPUR_BLOCK_EMERALD_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.PURPUR_BLOCK_EMERALD_WAVES));
                        entries.add(new ItemStack(ModBlocks.PURPUR_BLOCK_GOLD_BANDS));
                        entries.add(new ItemStack(ModBlocks.PURPUR_BLOCK_GOLD_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.PURPUR_BLOCK_GOLD_WAVES));
                        entries.add(new ItemStack(ModBlocks.PURPUR_BLOCK_IRON_BANDS));
                        entries.add(new ItemStack(ModBlocks.PURPUR_BLOCK_IRON_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.PURPUR_BLOCK_IRON_WAVES));

                        entries.add(new ItemStack(ModBlocks.PURPUR_BLOCK_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.PURPUR_BLOCK_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.PURPUR_BLOCK_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.PURPUR_BLOCK_EXPOSED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.PURPUR_BLOCK_EXPOSED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.PURPUR_BLOCK_EXPOSED_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.PURPUR_BLOCK_WEATHERED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.PURPUR_BLOCK_WEATHERED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.PURPUR_BLOCK_WEATHERED_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.PURPUR_BLOCK_OXIDIZED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.PURPUR_BLOCK_OXIDIZED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.PURPUR_BLOCK_OXIDIZED_COPPER_WAVES));

                        entries.add(new ItemStack(ModBlocks.PURPUR_BLOCK_WAXED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.PURPUR_BLOCK_WAXED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.PURPUR_BLOCK_WAXED_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.PURPUR_BLOCK_WAXED_EXPOSED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.PURPUR_BLOCK_WAXED_EXPOSED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.PURPUR_BLOCK_WAXED_EXPOSED_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.PURPUR_BLOCK_WAXED_WEATHERED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.PURPUR_BLOCK_WAXED_WEATHERED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.PURPUR_BLOCK_WAXED_WEATHERED_COPPER_WAVES));
                        entries.add(new ItemStack(ModBlocks.PURPUR_BLOCK_WAXED_OXIDIZED_COPPER_BANDS));
                        entries.add(new ItemStack(ModBlocks.PURPUR_BLOCK_WAXED_OXIDIZED_COPPER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.PURPUR_BLOCK_WAXED_OXIDIZED_COPPER_WAVES));

                        entries.add(new ItemStack(ModBlocks.PURPUR_BLOCK_LAPIS_BANDS));
                        entries.add(new ItemStack(ModBlocks.PURPUR_BLOCK_LAPIS_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.PURPUR_BLOCK_LAPIS_WAVES));
                        entries.add(new ItemStack(ModBlocks.PURPUR_BLOCK_REDSTONE_BANDS));
                        entries.add(new ItemStack(ModBlocks.PURPUR_BLOCK_REDSTONE_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.PURPUR_BLOCK_REDSTONE_WAVES));
                        entries.add(new ItemStack(ModBlocks.PURPUR_BLOCK_QUARTZ_BANDS));
                        entries.add(new ItemStack(ModBlocks.PURPUR_BLOCK_QUARTZ_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.PURPUR_BLOCK_QUARTZ_WAVES));
                        entries.add(new ItemStack(ModBlocks.PURPUR_BLOCK_ENDER_BANDS));
                        entries.add(new ItemStack(ModBlocks.PURPUR_BLOCK_ENDER_CHEVRON));
                        entries.add(new ItemStack(ModBlocks.PURPUR_BLOCK_ENDER_WAVES));
            }).build());

    public static final ItemGroup CONCRETE_SHAPES = Registry.register(Registries.ITEM_GROUP,
            new Identifier(GrecaBlocks.MOD_ID, "concrete_shapes_blocks"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.concrete_shapes_blocks"))
                    .icon(() -> new ItemStack(ModBlocks.PURPLE_CONCRETE_RED_DIAMOND)).entries((displayContext, entries) -> {

                        //diamonds
                        //black
                        entries.add(new ItemStack(ModBlocks.BLACK_CONCRETE_RED_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.BLACK_CONCRETE_ORANGE_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.BLACK_CONCRETE_YELLOW_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.BLACK_CONCRETE_GREEN_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.BLACK_CONCRETE_BLUE_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.BLACK_CONCRETE_PURPLE_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.BLACK_CONCRETE_WHITE_DIAMOND));
                        //red
                        entries.add(new ItemStack(ModBlocks.RED_CONCRETE_BLACK_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.RED_CONCRETE_ORANGE_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.RED_CONCRETE_YELLOW_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.RED_CONCRETE_GREEN_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.RED_CONCRETE_BLUE_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.RED_CONCRETE_PURPLE_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.RED_CONCRETE_WHITE_DIAMOND));
                        //orange
                        entries.add(new ItemStack(ModBlocks.ORANGE_CONCRETE_BLACK_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.ORANGE_CONCRETE_RED_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.ORANGE_CONCRETE_YELLOW_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.ORANGE_CONCRETE_GREEN_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.ORANGE_CONCRETE_BLUE_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.ORANGE_CONCRETE_PURPLE_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.ORANGE_CONCRETE_WHITE_DIAMOND));
                        //yellow
                        entries.add(new ItemStack(ModBlocks.YELLOW_CONCRETE_BLACK_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.YELLOW_CONCRETE_RED_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.YELLOW_CONCRETE_ORANGE_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.YELLOW_CONCRETE_GREEN_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.YELLOW_CONCRETE_BLUE_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.YELLOW_CONCRETE_PURPLE_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.YELLOW_CONCRETE_WHITE_DIAMOND));
                        //green
                        entries.add(new ItemStack(ModBlocks.GREEN_CONCRETE_BLACK_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.GREEN_CONCRETE_RED_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.GREEN_CONCRETE_ORANGE_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.GREEN_CONCRETE_YELLOW_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.GREEN_CONCRETE_BLUE_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.GREEN_CONCRETE_PURPLE_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.GREEN_CONCRETE_WHITE_DIAMOND));
                        //blue
                        entries.add(new ItemStack(ModBlocks.BLUE_CONCRETE_BLACK_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.BLUE_CONCRETE_RED_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.BLUE_CONCRETE_ORANGE_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.BLUE_CONCRETE_YELLOW_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.BLUE_CONCRETE_GREEN_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.BLUE_CONCRETE_PURPLE_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.BLUE_CONCRETE_WHITE_DIAMOND));
                        //purple
                        entries.add(new ItemStack(ModBlocks.PURPLE_CONCRETE_BLACK_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.PURPLE_CONCRETE_RED_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.PURPLE_CONCRETE_ORANGE_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.PURPLE_CONCRETE_YELLOW_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.PURPLE_CONCRETE_GREEN_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.PURPLE_CONCRETE_BLUE_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.PURPLE_CONCRETE_WHITE_DIAMOND));
                        //white
                        entries.add(new ItemStack(ModBlocks.WHITE_CONCRETE_BLACK_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.WHITE_CONCRETE_RED_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.WHITE_CONCRETE_ORANGE_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.WHITE_CONCRETE_YELLOW_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.WHITE_CONCRETE_GREEN_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.WHITE_CONCRETE_BLUE_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.WHITE_CONCRETE_PURPLE_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.WHITE_CONCRETE_LIME_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.WHITE_CONCRETE_LIGHT_BLUE_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.WHITE_CONCRETE_MAGENTA_DIAMOND));
                        //lime
                        entries.add(new ItemStack(ModBlocks.LIME_CONCRETE_WHITE_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.LIME_CONCRETE_LIGHT_BLUE_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.LIME_CONCRETE_MAGENTA_DIAMOND));
                        //light blue
                        entries.add(new ItemStack(ModBlocks.LIGHT_BLUE_CONCRETE_WHITE_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.LIGHT_BLUE_CONCRETE_LIME_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.LIGHT_BLUE_CONCRETE_MAGENTA_DIAMOND));
                        //magenta
                        entries.add(new ItemStack(ModBlocks.MAGENTA_CONCRETE_WHITE_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.MAGENTA_CONCRETE_LIME_DIAMOND));
                        entries.add(new ItemStack(ModBlocks.MAGENTA_CONCRETE_LIGHT_BLUE_DIAMOND));

                    }).build());

    public static final ItemGroup BLOCK_DESIGN_TEMPLATES = Registry.register(Registries.ITEM_GROUP,
            new Identifier(GrecaBlocks.MOD_ID, "block_design_templates"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.block_design_templates"))
                    .icon(() -> new ItemStack(ModBlocks.PURPLE_CONCRETE_RED_DIAMOND)).entries((displayContext, entries) -> {
                        entries.add(new ItemStack(ModItems.ENGRAVING_SHEET_TEMPLATE));
                        entries.add(new ItemStack(ModItems.BANDS_ENGRAVING_SHEET));
                        entries.add(new ItemStack(ModItems.CHEVRON_ENGRAVING_SHEET));
                        entries.add(new ItemStack(ModItems.WAVES_ENGRAVING_SHEET));

                        entries.add(new ItemStack(ModItems.COLORING_PATTERN_TEMPLATE));
                        entries.add(new ItemStack(ModItems.DIAMOND_COLORING_PATTERN));
                        entries.add(new ItemStack(ModItems.DOT_COLORING_PATTERN));
                        entries.add(new ItemStack(ModItems.SQUARE_COLORING_PATTERN));
                    }).build());

    public static void registerItemGroups() {
        GrecaBlocks.LOGGER.info("Registering Item Groups for " + GrecaBlocks.MOD_ID);
    }
}
