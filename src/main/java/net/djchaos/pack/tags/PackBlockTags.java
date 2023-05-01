package net.djchaos.pack.tags;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import static net.djchaos.pack.PackInfo.PACK_ID;

public class PackBlockTags {
    public static final TagKey<Block> GLASS = packBlockTag("glass");
    public static final TagKey<Block> GLASS_BLOCKS = packBlockTag("glass_blocks");
    public static final TagKey<Block> GLASS_PANES = packBlockTag("glass_panes");

    //REGISTRY
    private static TagKey<Block> packBlockTag(String name) {
        return TagKey.of(RegistryKeys.BLOCK, new Identifier(PACK_ID, name));
    }
}
