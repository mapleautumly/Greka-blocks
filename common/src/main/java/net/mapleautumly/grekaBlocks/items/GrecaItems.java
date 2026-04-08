package net.mapleautumly.grekaBlocks.items;


import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.mapleautumly.grekaBlocks.GrekaBlocksCommon;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;


public class GrecaItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(GrekaBlocksCommon.MOD_ID, Registries.ITEM);



    //ITEMS
    public static final RegistrySupplier<Item> ENGRAVING_SHEET_TEMPLATE = ITEMS.register("engraving_sheet_template", () -> new Item(new Item.Properties()));
    public static final RegistrySupplier<Item> BANDS_ENGRAVING_SHEET = ITEMS.register("bands_engraving_sheet", () -> new Item(new Item.Properties()));
    public static final RegistrySupplier<Item> CHEVRON_ENGRAVING_SHEET = ITEMS.register("chevron_engraving_sheet", () -> new Item(new Item.Properties()));
    public static final RegistrySupplier<Item> WAVES_ENGRAVING_SHEET = ITEMS.register("waves_engraving_sheet", () -> new Item(new Item.Properties()));
    public static final RegistrySupplier<Item> BRICK_ENGRAVING_SHEET = ITEMS.register("brick_engraving_sheet", () -> new Item(new Item.Properties()));
    public static final RegistrySupplier<Item> GEAR_ENGRAVING_SHEET = ITEMS.register("gear_engraving_sheet", () -> new Item(new Item.Properties()));
    public static final RegistrySupplier<Item> MOB_ENGRAVING_SHEET = ITEMS.register("mob_engraving_sheet", () -> new Item(new Item.Properties()));
    public static final RegistrySupplier<Item> GEM_ENGRAVING_SHEET = ITEMS.register("gem_engraving_sheet", () -> new Item(new Item.Properties()));

    public static final RegistrySupplier<Item> COLORING_PATTERN_TEMPLATE = ITEMS.register("coloring_pattern_template", () -> new Item(new Item.Properties()));
    public static final RegistrySupplier<Item> DIAMOND_COLORING_PATTERN = ITEMS.register("diamond_coloring_pattern", () -> new Item(new Item.Properties()));
    public static final RegistrySupplier<Item> DOT_COLORING_PATTERN = ITEMS.register("dot_coloring_pattern", () -> new Item(new Item.Properties()));
    public static final RegistrySupplier<Item> SQUARE_COLORING_PATTERN = ITEMS.register("square_coloring_pattern", () -> new Item(new Item.Properties()));

    public static final RegistrySupplier<Item> TIGER_EYE = ITEMS.register("tiger_eye", () -> new Item(new Item.Properties()));
    public static final RegistrySupplier<Item> POLISHED_TIGER_EYE = ITEMS.register("polished_tiger_eye", () -> new Item(new Item.Properties()));

    public static void register(){}

    static {
        ITEMS.register();
    }
}
