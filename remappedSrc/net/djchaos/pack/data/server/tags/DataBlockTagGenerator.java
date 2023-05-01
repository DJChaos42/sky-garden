package net.djchaos.pack.data.server.tags;

import net.djchaos.pack.tags.PackBlockTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class DataBlockTagGenerator extends FabricTagProvider<Block> {

    public DataBlockTagGenerator(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(dataOutput, RegistryKeys.BLOCK, registriesFuture);

    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(PackBlockTags.GLASS_BLOCKS)
                .add(Blocks.GLASS)
                .add(Blocks.TINTED_GLASS)
                .add(Blocks.WHITE_STAINED_GLASS)
                .add(Blocks.ORANGE_STAINED_GLASS)
                .add(Blocks.MAGENTA_STAINED_GLASS)
                .add(Blocks.LIGHT_BLUE_STAINED_GLASS)
                .add(Blocks.YELLOW_STAINED_GLASS)
                .add(Blocks.LIME_STAINED_GLASS)
                .add(Blocks.PINK_STAINED_GLASS)
                .add(Blocks.GRAY_STAINED_GLASS)
                .add(Blocks.LIGHT_GRAY_STAINED_GLASS)
                .add(Blocks.CYAN_STAINED_GLASS)
                .add(Blocks.PURPLE_STAINED_GLASS)
                .add(Blocks.BLUE_STAINED_GLASS)
                .add(Blocks.BROWN_STAINED_GLASS)
                .add(Blocks.GREEN_STAINED_GLASS)
                .add(Blocks.RED_STAINED_GLASS)
                .add(Blocks.BLACK_STAINED_GLASS);
        getOrCreateTagBuilder(PackBlockTags.GLASS_PANES)
                .add(Blocks.GLASS_PANE)
                .add(Blocks.WHITE_STAINED_GLASS_PANE)
                .add(Blocks.ORANGE_STAINED_GLASS_PANE)
                .add(Blocks.MAGENTA_STAINED_GLASS_PANE)
                .add(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE)
                .add(Blocks.YELLOW_STAINED_GLASS_PANE)
                .add(Blocks.LIME_STAINED_GLASS_PANE)
                .add(Blocks.PINK_STAINED_GLASS_PANE)
                .add(Blocks.GRAY_STAINED_GLASS_PANE)
                .add(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE)
                .add(Blocks.CYAN_STAINED_GLASS_PANE)
                .add(Blocks.PURPLE_STAINED_GLASS_PANE)
                .add(Blocks.BLUE_STAINED_GLASS_PANE)
                .add(Blocks.BROWN_STAINED_GLASS_PANE)
                .add(Blocks.GREEN_STAINED_GLASS_PANE)
                .add(Blocks.RED_STAINED_GLASS_PANE)
                .add(Blocks.BLACK_STAINED_GLASS_PANE);
        getOrCreateTagBuilder(PackBlockTags.GLASS)
                .addTag(PackBlockTags.GLASS_BLOCKS)
                .addTag(PackBlockTags.GLASS_PANES);

        //VANILLA
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .addTag(PackBlockTags.GLASS);
        getOrCreateTagBuilder(BlockTags.DRAGON_IMMUNE)
                .add(Blocks.CHORUS_PLANT)
                .add(Blocks.CHORUS_FLOWER);
        getOrCreateTagBuilder(BlockTags.MAINTAINS_FARMLAND)
                .addTag(PackBlockTags.GLASS);
    }
}
