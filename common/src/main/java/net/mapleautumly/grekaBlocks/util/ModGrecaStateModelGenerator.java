package net.maple.grecablocks.util;

import com.google.gson.JsonElement;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.minecraft.item.Item;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ModGrecaStateModelGenerator extends BlockStateModelGenerator {
    public ModGrecaStateModelGenerator(Consumer<BlockStateSupplier> blockStateCollector, BiConsumer<Identifier, Supplier<JsonElement>> modelCollector, Consumer<Item> simpleItemModelExemptionCollector) {
        super(blockStateCollector, modelCollector, simpleItemModelExemptionCollector);
    }

    public final void registerGrecaOrientable(Block block, Block baseBlock, Block topBlock) {
        TextureMap textureMap = new TextureMap()
                .put(TextureKey.TOP, TextureMap.getId(topBlock))
                .put(TextureKey.SIDE, TextureMap.getId(block))
                .put(TextureKey.BOTTOM, TextureMap.getId(baseBlock));
        TextureMap textureMap2 = new TextureMap()
                .put(TextureKey.SIDE, TextureMap.getId(topBlock))
                .put(TextureKey.FRONT, TextureMap.getId(block))
                .put(TextureKey.BOTTOM, TextureMap.getId(baseBlock));
        Identifier identifier = Models.ORIENTABLE.upload(block, textureMap, this.modelCollector);
        Identifier identifier2 = Models.ORIENTABLE_VERTICAL.upload(block, textureMap2, this.modelCollector);
        this.blockStateCollector
                .accept(
                        VariantsBlockStateSupplier.create(block)
                                .coordinate(
                                        BlockStateVariantMap.create(Properties.FACING)
                                                .register(Direction.DOWN, BlockStateVariant.create().put(VariantSettings.MODEL, identifier2).put(VariantSettings.X, VariantSettings.Rotation.R180))
                                                .register(Direction.UP, BlockStateVariant.create().put(VariantSettings.MODEL, identifier2))
                                                .register(Direction.NORTH, BlockStateVariant.create().put(VariantSettings.MODEL, identifier))
                                                .register(Direction.EAST, BlockStateVariant.create().put(VariantSettings.MODEL, identifier).put(VariantSettings.Y, VariantSettings.Rotation.R90))
                                                .register(Direction.SOUTH, BlockStateVariant.create().put(VariantSettings.MODEL, identifier).put(VariantSettings.Y, VariantSettings.Rotation.R180))
                                                .register(Direction.WEST, BlockStateVariant.create().put(VariantSettings.MODEL, identifier).put(VariantSettings.Y, VariantSettings.Rotation.R270))
                                )
                );
    }
}
