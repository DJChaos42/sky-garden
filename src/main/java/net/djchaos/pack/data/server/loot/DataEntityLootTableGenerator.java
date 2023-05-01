package net.djchaos.pack.data.server.loot;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableProvider;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;

import java.util.function.BiConsumer;

public class DataEntityLootTableGenerator extends SimpleFabricLootTableProvider {
    public static final Identifier ENDER_DRAGON = new Identifier("minecraft", "entities/ender_dragon");
    public DataEntityLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput, LootContextTypes.ENTITY);
    }

    @Override
    public void accept(BiConsumer<Identifier, LootTable.Builder> biConsumer) {
        biConsumer.accept(ENDER_DRAGON, LootTable.builder()
                .pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))
                        .with(ItemEntry.builder(Items.DRAGON_HEAD)
                                .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0F)))
                        )
                )
                .pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))
                        .with(ItemEntry.builder(Items.ELYTRA)
                                .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0F)))
                        )
                )
        );
    }
}
