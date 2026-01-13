package net.maple.grecablocks.textures;

import net.minecraft.block.Block;
import net.minecraft.data.client.TextureKey;
import net.minecraft.data.client.TextureMap;

public class ModTextureMap extends TextureMap {

    public static TextureMap WithCustomSideTopBottom(Block block, Block top, Block bottom) {
        return new TextureMap()
                .put(TextureKey.PARTICLE, getId(block))
                .put(TextureKey.DOWN, getId(bottom))
                .put(TextureKey.UP, getId(top))
                .put(TextureKey.NORTH, getId(block))
                .put(TextureKey.EAST, getId(block))
                .put(TextureKey.SOUTH, getId(block))
                .put(TextureKey.WEST, getId(block));
    }
}
