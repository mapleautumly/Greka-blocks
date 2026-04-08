package net.mapleautumly.grekaBlocks.blocks;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;

public record BlockItemPair(RegistrySupplier<Block> block, RegistrySupplier<BlockItem> item) {}
