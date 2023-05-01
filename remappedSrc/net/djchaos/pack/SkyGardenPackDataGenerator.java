package net.djchaos.pack;

import net.djchaos.pack.data.client.DataModelProvider;
import net.djchaos.pack.data.client.lang.*;
import net.djchaos.pack.data.server.loot.*;
import net.djchaos.pack.data.server.recipes.DataModRecipeGenerator;
import net.djchaos.pack.data.server.tags.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class SkyGardenPackDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        final FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        //SERVER
        pack.addProvider(DataBlockLootTableGenerator::new);
        pack.addProvider(DataEntityLootTableGenerator::new);
        pack.addProvider(DataBlockTagGenerator::new);
        pack.addProvider(DataItemTagGenerator::new);
        pack.addProvider(DataModRecipeGenerator::new);
        //pack.addProvider(DataModStonecutterRecipeGenerator::new);

        //CLIENT
        pack.addProvider(DataModelProvider::new);
        pack.addProvider(DataEnglishLangProvider::new);
    }
}
