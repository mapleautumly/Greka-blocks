package net.maple.grecablocks.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.maple.grecablocks.GrecaBlocks;
import net.maple.grecablocks.block.ModBlocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    private static void addItemsToBuildingBlocksItemGroup(FabricItemGroupEntries entries) {

    }
    //engraving sheets
    public static final Item ENGRAVING_SHEET_TEMPLATE = registerItem("engraving_sheet_template",
            new Item(new FabricItemSettings()));
    public static final Item BANDS_ENGRAVING_SHEET = registerItem("bands_engraving_sheet",
            new Item(new FabricItemSettings()));
    public static final Item CHEVRON_ENGRAVING_SHEET = registerItem("chevron_engraving_sheet",
            new Item(new FabricItemSettings()));
    public static final Item WAVES_ENGRAVING_SHEET = registerItem("waves_engraving_sheet",
            new Item(new FabricItemSettings()));

    //coloring patterns
    public static final Item COLORING_PATTERN_TEMPLATE = registerItem("coloring_pattern_template",
            new Item(new FabricItemSettings()));
    public static final Item DIAMOND_COLORING_PATTERN = registerItem("diamond_coloring_pattern",
            new Item(new FabricItemSettings()));
    public static final Item DOT_COLORING_PATTERN = registerItem("dot_coloring_pattern",
            new Item(new FabricItemSettings()));
    public static final Item SQUARE_COLORING_PATTERN = registerItem("square_coloring_pattern",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(GrecaBlocks.MOD_ID, name), item);
    }

    public static void registerModItems() {
        GrecaBlocks.LOGGER.info("Registering Mod Items for " + GrecaBlocks.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModItems::addItemsToBuildingBlocksItemGroup);
    }
}
