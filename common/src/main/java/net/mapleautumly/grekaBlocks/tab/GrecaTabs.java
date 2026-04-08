package net.mapleautumly.grekaBlocks.tab;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.mapleautumly.grekaBlocks.GrekaBlocksCommon;
import net.mapleautumly.grekaBlocks.blocks.GrecaBlocks;
import net.mapleautumly.grekaBlocks.blocks.StoneBricks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class GrecaTabs {
    public static final DeferredRegister<CreativeModeTab> TAB =
            DeferredRegister.create(GrekaBlocksCommon.MOD_ID, Registries.CREATIVE_MODE_TAB);

    public static final RegistrySupplier<CreativeModeTab> GRECA_UTIL_TAB = TAB.register("greca_util_tab", () ->
            CreativeTabRegistry.create(Component.translatable("greca_util_tab"), () -> new ItemStack(GrecaBlocks.PALETTE_WHEEL.get())));
    public static final RegistrySupplier<CreativeModeTab> GEM_AND_METAL_STONE_ENGRAVINGS = TAB.register("gem_metal_stone", () ->
            CreativeTabRegistry.create(Component.translatable("gem_metal_stone"), () -> new ItemStack(StoneBricks.getPosterChild())));


    public static void register() {}

    static { TAB.register(); }
}
