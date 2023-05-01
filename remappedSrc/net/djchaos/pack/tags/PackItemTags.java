package net.djchaos.pack.tags;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import static net.djchaos.pack.PackInfo.PACK_ID;
public class PackItemTags {

    public static final TagKey<Item> SMELTS_TO_IRON = packItemTag("smelts_to_iron_nugget");
    public static final TagKey<Item> SMELTS_TO_GOLD = packItemTag("smelts_to_gold_nugget");
    public static final TagKey<Item> SMELTS_TO_NETHERITE = packItemTag("smelts_to_netherite_scrap");
    public static final TagKey<Item> MUSHROOMS = packItemTag("mushrooms");


    //REGISTRY
    private static TagKey<Item> packItemTag(String name) {
        return TagKey.of(RegistryKeys.ITEM, new Identifier(PACK_ID, name));
    }
}
