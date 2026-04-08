package net.mapleautumly.grekaBlocks.fabric.datagen;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.mapleautumly.grekaBlocks.blocks.GrecaBlocks;
import net.mapleautumly.grekaBlocks.blocks.StoneBricks;
import net.mapleautumly.grekaBlocks.items.GrecaItems;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.ModelLocationUtils;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.data.models.model.TextureSlot;
import net.minecraft.resources.ResourceLocation;

import static net.minecraft.data.models.BlockModelGenerators.createSimpleBlock;

public class ModelGenerator extends FabricModelProvider {
    public ModelGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators gen) {
        GrecaBlocks.register();
        StoneBricks.forEach(pair -> {
            var block = pair.block().get();
                    TextureMapping textureMapping = (new TextureMapping())
                            .put(TextureSlot.PARTICLE, TextureMapping.getBlockTexture(block, ""))
                            .put(TextureSlot.DOWN, TextureMapping.getBlockTexture(block, ""))
                            .put(TextureSlot.UP, TextureMapping.getBlockTexture(block, ""))
                            .put(TextureSlot.NORTH, TextureMapping.getBlockTexture(block, ""))
                            .put(TextureSlot.SOUTH, TextureMapping.getBlockTexture(block, "")
                            ).put(TextureSlot.EAST, TextureMapping.getBlockTexture(block, ""))
                            .put(TextureSlot.WEST, TextureMapping.getBlockTexture(block, ""));
                    gen.blockStateOutput.accept(createSimpleBlock(block, ModelTemplates.CUBE.create(block, textureMapping, gen.modelOutput)));
                }
        );
        gen.createGenericCube(GrecaBlocks.TIGER_EYE_BLOCK.get());
    }

    @Override
    public void generateItemModels(ItemModelGenerators gen) {
        GrecaBlocks.register();
        GrecaItems.register();


        StoneBricks.forEach(pair -> {
            var item = pair.item().get();
            String parentResource = ModelLocationUtils.getModelLocation(pair.block().get()).toString();
            ResourceLocation rl = ModelLocationUtils.getModelLocation(item);

            gen.output.accept(rl,
                    () -> {
                var j = new JsonObject();
                j.addProperty("parent", parentResource);
                return j;
            });
                }
        );

        gen.generateFlatItem(GrecaItems.TIGER_EYE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
    }
}
