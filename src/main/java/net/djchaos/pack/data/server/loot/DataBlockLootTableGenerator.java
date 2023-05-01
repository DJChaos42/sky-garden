package net.djchaos.pack.data.server.loot;

//import net.djchaos.chaosutils.block.ModBlocks;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class DataBlockLootTableGenerator extends FabricBlockLootTableProvider {
    public DataBlockLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDropWithSilkTouch(Blocks.BUDDING_AMETHYST);
        addDrop(Blocks.POWDER_SNOW, drops(Items.SNOWBALL, UniformLootNumberProvider.create(4, 4)));
        //addDropWithSilkTouch(Blocks.SUSPICIOUS_SAND);
    }
}
