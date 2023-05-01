package net.djchaos.pack.data.client.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.item.Items;

import java.awt.*;

public class DataEnglishLangProvider extends FabricLanguageProvider {
    public DataEnglishLangProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        //VANILLA
        translationBuilder.add(Blocks.STONECUTTER, "Block Cutter");
        translationBuilder.add("container.stonecutter", "Block Cutter");
        translationBuilder.add("stat.minecraft.interact_with_stonecutter", "Interactions with Block Cutter");
        translationBuilder.add("subtitles.ui.stonecutter.take_result", "Block Cutter used");
        translationBuilder.add("gui.jei.category.stoneCutter", "Block Cutting");
        translationBuilder.add("gui.rei.category.stoneCutter", "Block Cutting");
        translationBuilder.add(Items.ENCHANTED_GOLDEN_APPLE, "Enchanted Apple");
        translationBuilder.add(Items.RABBIT_HIDE, "Small Hide");
        translationBuilder.add(Items.QUARTZ, "Quartz");
        //CUSTOM
        translationBuilder.add("advancements.pack.root.title", "Foo");
        translationBuilder.add("advancements.pack.root.description", "Bar");
        translationBuilder.add("item.pack.permapick", "Permapick");
        translationBuilder.add("block.pack.suspicious_gravel.trail.common", "Earthy");
        translationBuilder.add("block.pack.suspicious_gravel.trail.rare", "Intriguing");
        translationBuilder.add("block.pack.suspicious_gravel.ocean", "Soggy");
        translationBuilder.add("block.pack.suspicious_sand.well", "Loamy");
        translationBuilder.add("block.pack.suspicious_sand.pyramid", "Regal");
        translationBuilder.add("block.pack.suspicious_sand.ocean", "Damp");

    }
}
