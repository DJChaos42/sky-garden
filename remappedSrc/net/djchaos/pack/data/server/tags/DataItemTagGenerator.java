package net.djchaos.pack.data.server.tags;

import net.djchaos.pack.tags.PackItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class DataItemTagGenerator extends FabricTagProvider<Item> {

    public DataItemTagGenerator(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(dataOutput, RegistryKeys.ITEM, registriesFuture);

    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(PackItemTags.SMELTS_TO_GOLD)
                .add(Items.GOLDEN_PICKAXE)
                .add(Items.GOLDEN_SHOVEL)
                .add(Items.GOLDEN_AXE)
                .add(Items.GOLDEN_HOE)
                .add(Items.GOLDEN_SWORD)
                .add(Items.GOLDEN_HELMET)
                .add(Items.GOLDEN_CHESTPLATE)
                .add(Items.GOLDEN_LEGGINGS)
                .add(Items.GOLDEN_BOOTS)
                .add(Items.GOLDEN_HORSE_ARMOR);
        getOrCreateTagBuilder(PackItemTags.SMELTS_TO_IRON)
                .add(Items.IRON_PICKAXE)
                .add(Items.IRON_SHOVEL)
                .add(Items.IRON_AXE)
                .add(Items.IRON_HOE)
                .add(Items.IRON_SWORD)
                .add(Items.IRON_HELMET)
                .add(Items.IRON_CHESTPLATE)
                .add(Items.IRON_LEGGINGS)
                .add(Items.IRON_BOOTS)
                .add(Items.IRON_HORSE_ARMOR)
                .add(Items.CHAINMAIL_HELMET)
                .add(Items.CHAINMAIL_CHESTPLATE)
                .add(Items.CHAINMAIL_LEGGINGS)
                .add(Items.CHAINMAIL_BOOTS);
        getOrCreateTagBuilder(PackItemTags.SMELTS_TO_NETHERITE)
                .add(Items.NETHERITE_PICKAXE)
                .add(Items.NETHERITE_SHOVEL)
                .add(Items.NETHERITE_AXE)
                .add(Items.NETHERITE_HOE)
                .add(Items.NETHERITE_SWORD)
                .add(Items.NETHERITE_HELMET)
                .add(Items.NETHERITE_CHESTPLATE)
                .add(Items.NETHERITE_LEGGINGS)
                .add(Items.NETHERITE_BOOTS);
        getOrCreateTagBuilder(PackItemTags.MUSHROOMS)
                .add(Items.BROWN_MUSHROOM)
                .add(Items.CRIMSON_FUNGUS)
                .add(Items.RED_MUSHROOM)
                .add(Items.WARPED_FUNGUS);

        //VANILLA
        getOrCreateTagBuilder(ItemTags.VILLAGER_PLANTABLE_SEEDS)
                .add(Items.PUMPKIN_SEEDS)
                .add(Items.MELON_SEEDS);
    }
}
