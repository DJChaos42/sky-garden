package net.djchaos.pack.data.client;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;


import static net.djchaos.pack.PackInfo.PACK_ID;

public class DataModelProvider extends FabricModelProvider {
    public static Identifier UNSTABLE_TNT = new Identifier(PACK_ID, "block/unstable_tnt");
    public DataModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //blockStateModelGenerator.modelCollector.accept(new Identifier("minecraft", "block/tnt"), new SimpleModelSupplier(new Identifier("minecraft", "block/cube_bottom_top")));

        /*blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(Blocks.TNT)
                .coordinate(BlockStateVariantMap.create(Properties.UNSTABLE)
                        .register(false, BlockStateVariant.create().put(
                                VariantSettings.MODEL, TexturedModel.CUBE_BOTTOM_TOP
                                        .upload(Blocks.TNT, blockStateModelGenerator.modelCollector)))
                        .register(true, BlockStateVariant.create().put(
                                VariantSettings.MODEL, TexturedModel.CUBE_BOTTOM_TOP
                                        .upload(Blocks.TNT, "_unstable", blockStateModelGenerator.modelCollector)))
                ));*/

        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(Blocks.TNT)
                .coordinate(BlockStateVariantMap.create(Properties.UNSTABLE)
                        .register(false, BlockStateVariant.create().put(
                                VariantSettings.MODEL, TexturedModel.CUBE_BOTTOM_TOP
                                        .upload(Blocks.TNT, blockStateModelGenerator.modelCollector)))
                        .register(true, BlockStateVariant.create().put(
                                VariantSettings.MODEL, TexturedModel.CUBE_BOTTOM_TOP
                                        .upload(Blocks.TNT, "_unstable", blockStateModelGenerator.modelCollector)))
                ));
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        //itemModelGenerator.register(ModItems.TEST_ITEM, Models.GENERATED);
    }
}
