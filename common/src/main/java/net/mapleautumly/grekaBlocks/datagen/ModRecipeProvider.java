package net.maple.grecablocks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.maple.grecablocks.block.ModBlocks;
import net.maple.grecablocks.items.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.ShapedRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {

    private static final List<ItemConvertible> WOOD_BLOCKS = List.of(Blocks.OAK_PLANKS,
            Blocks.BIRCH_PLANKS,Blocks.ACACIA_PLANKS,Blocks.DARK_OAK_PLANKS,Blocks.CHERRY_PLANKS,
            Blocks.MANGROVE_PLANKS,Blocks.BAMBOO_PLANKS,Blocks.SPRUCE_PLANKS,Blocks.JUNGLE_PLANKS);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
        public void generate(Consumer<RecipeJsonProvider> exporter) {
            ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_BRICKS_WAXED_COPPER_CHEVRON, 1)
                    .input(ModBlocks.STONE_BRICKS_COPPER_CHEVRON)
                    .input(Items.HONEYCOMB)
                    .criterion(hasItem(Items.HONEYCOMB), conditionsFromItem(Items.HONEYCOMB))
                    .criterion(hasItem(ModBlocks.STONE_BRICKS_COPPER_CHEVRON), conditionsFromItem(ModBlocks.STONE_BRICKS_COPPER_CHEVRON))
                    .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STONE_BRICKS_WAXED_COPPER_CHEVRON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ENGRAVING_SHEET_TEMPLATE)
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .input('A', Items.IRON_NUGGET)
                .input('B', Items.IRON_INGOT)
                .criterion(hasItem(Items.IRON_NUGGET), conditionsFromItem(Items.IRON_NUGGET))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ENGRAVING_SHEET_TEMPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COLORING_PATTERN_TEMPLATE)
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .input('A', Items.STRING)
                .input('B', Items.PAPER)
                .criterion(hasItem(Items.STRING), conditionsFromItem(Items.STRING))
                .criterion(hasItem(Items.PAPER), conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COLORING_PATTERN_TEMPLATE)));
    }
}
