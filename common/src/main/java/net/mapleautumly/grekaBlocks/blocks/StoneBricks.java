package net.mapleautumly.grekaBlocks.blocks;

import dev.architectury.registry.registries.DeferredRegister;
import net.mapleautumly.grekaBlocks.tab.GrecaTabs;
import net.minecraft.core.Holder;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.function.Consumer;

import static net.mapleautumly.grekaBlocks.blocks.GrecaBlocks.BLOCKS;
import static net.mapleautumly.grekaBlocks.blocks.GrecaBlocks.BLOCK_ITEMS;

public class StoneBricks {

    public static EnumMap<Materials, EnumMap<Types, BlockItemPair>> blockItemPairs = new EnumMap<Materials, EnumMap<Types, BlockItemPair>>(Materials.class);




    public static BlockBehaviour.Properties templateBlockBehaviour =
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .requiresCorrectToolForDrops()
                    .strength(3.2F, 6.0F)
                    .sound(SoundType.STONE);

    public static Block getPosterChild() {
        return blockItemPairs.get(Materials.AMETHYST).get(Types.BANDS).block().get();
    }

    public enum Materials{
        AMETHYST("amethyst"),
        DIAMOND("diamond"),
        EMERALD("emerald"),
        JET("jet"),
        GOLD("gold"),
        IRON("iron"),
        COPPER("copper"),
        COPPER_EXPOSED("exposed_copper"),
        COPPER_WEATHER("weathered_copper"),
        COPPER_OXIDIZED("oxidized_copper");

        final String name;
        Materials(String name) {
            this.name = name;
        }
    }

    public enum Types{
        BANDS("bands"),
        CHEVRON("chevron"),
        WAVES("waves"),
        BRICKLINE("brickline");

        final String name;
        Types(String name) {
            this.name = name;
        }
    }

    public static void init() {
    }
    static {
        var itemTemplate = new Item.Properties().arch$tab(GrecaTabs.GEM_AND_METAL_STONE_ENGRAVINGS);

        for (Materials material : Materials.values()) {
            EnumMap<Types, BlockItemPair> subMap = new EnumMap<>(Types.class);
            for (Types type : Types.values()) {

                String id = "stone_bricks_" + material.name + "_" + type.name;

                var block = BLOCKS.register(id, () -> new Block(templateBlockBehaviour));

                var blockItem = BLOCK_ITEMS.register(id, () -> new BlockItem(block.get(), itemTemplate));

                subMap.put(type, new BlockItemPair(block, blockItem));

            }
            blockItemPairs.put(material, subMap);
        }
    }
    public static void forEach(Consumer<BlockItemPair> pairConsumer) {
        blockItemPairs.forEach((x,subMap) -> subMap.forEach((z, pair) ->
                pairConsumer.accept(pair)
        ));
    }


}
