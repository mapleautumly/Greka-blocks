package net.maple.grecablocks.blockentities;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.maple.grecablocks.block.ModBlocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntityTypes {
    public static <T extends BlockEntityType<?>> T register(String path, T blockEntityType) {
    return Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of("grecablocks", path), blockEntityType);
    }

    public static final BlockEntityType<EngravingStationBlockEntity> ENGRAVING_STATION_BLOCK = register(
            "engraving_station_block",
            FabricBlockEntityTypeBuilder.create(EngravingStationBlockEntity::new, ModBlocks.ENGRAVING_STATION).build()
    );

    public static void initialize() {
    }
}
