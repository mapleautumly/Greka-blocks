package net.mapleautumly.grekaBlocks.tab;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.item.ItemPropertiesRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.mapleautumly.grekaBlocks.GrekaBlocksMod;
import net.mapleautumly.grekaBlocks.blocks.GrecaBlocks;
import net.mapleautumly.grekaBlocks.items.GrecaItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;

public class GrecaTabs {
    public static final DeferredRegister<CreativeModeTab> TAB =
            DeferredRegister.create(GrekaBlocksMod.MOD_ID, Registries.CREATIVE_MODE_TAB);

    public static final RegistrySupplier<CreativeModeTab> GRECA_UTIL_TAB = TAB.register("greca_util_tab", () ->
            CreativeTabRegistry.create(Component.translatable("greca_util_tab"), () -> new ItemStack(GrecaBlocks.PALETTE_WHEEL.get())));
    public static final RegistrySupplier<CreativeModeTab> GEM_AND_METAL_STONE_ENGRAVINGS = TAB.register("gem_metal_stone", () ->
            CreativeTabRegistry.create(Component.translatable("gem_metal_stone"), () -> new ItemStack(GrecaBlocks.STONE_BRICKS_AMETHYST_BANDS.get())));


    public static void register() { TAB.register(); }
}
