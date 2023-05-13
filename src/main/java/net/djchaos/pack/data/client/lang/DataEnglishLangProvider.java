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
        //ADVANCEMENTS
        translationBuilder.add("advancements.pack.root.title", "Sky Garden");
        translationBuilder.add("advancements.pack.root.description", "A world in the sky");
        translationBuilder.add("advancements.pack.punch_wood.title", "Punch It");
        translationBuilder.add("advancements.pack.punch_wood.description", "Punch a tree and collect its wood");
        translationBuilder.add("advancements.pack.sapling.title", "Renewable");
        translationBuilder.add("advancements.pack.sapling.description", "Obtain a sapling");
        translationBuilder.add("advancements.pack.crafting.title", "Just Like The Other One");
        translationBuilder.add("advancements.pack.crafting.description", "Obtain a Crafting Table");
        translationBuilder.add("advancements.pack.logs.title", "Big Logz Inc.");
        translationBuilder.add("advancements.pack.logs.description", "Obtain 64 of each type of Log");
        translationBuilder.add("advancements.pack.cobblestone.title", "Ex Igneus");
        translationBuilder.add("advancements.pack.cobblestone.description", "Build and use a Cobblestone Generator");
        translationBuilder.add("advancements.pack.kill_zombie.title", "The Corrupted");
        translationBuilder.add("advancements.pack.kill_zombie.description", "Kill a Zombie");
        translationBuilder.add("advancements.pack.kill_drowned.title", "Soggy Saboteur");
        translationBuilder.add("advancements.pack.kill_drowned.description", "Kill a Drowned");
        translationBuilder.add("advancements.pack.copper.title", "Beans");
        translationBuilder.add("advancements.pack.copper.description", "Obtain Raw Copper");
        translationBuilder.add("advancements.pack.brush.title", "A Brush With Fortune");
        translationBuilder.add("advancements.pack.brush.description", "Craft a Brush");
        translationBuilder.add("advancements.pack.brush_sand.title", "Sandy Secrets");
        translationBuilder.add("advancements.pack.brush_sand.description", "Use a Brush on Suspicious Sand");
        translationBuilder.add("advancements.pack.kill_zombie_villager.title", "We Could Have Saved Him!");
        translationBuilder.add("advancements.pack.kill_zombie_villager.description", "Kill a Zombie Villager");
        translationBuilder.add("advancements.pack.iron.title", "A Raw Deal");
        translationBuilder.add("advancements.pack.iron.description", "Obtain Raw Iron");
        translationBuilder.add("advancements.pack.diamonds.title", "Diamonds?!");
        translationBuilder.add("advancements.pack.diamonds.description", "Find a way to obtain Diamonds in the sky");
        translationBuilder.add("advancements.pack.sand_root.title", "Sky Garden - Sand Island");
        translationBuilder.add("advancements.pack.sand_root.description", "Visit the Sand Island");
        translationBuilder.add("advancements.pack.suspicious_sand.title", "An Imposter");
        translationBuilder.add("advancements.pack.suspicious_sand.description", "Obtain Suspicious Sand from a Husk");
        translationBuilder.add("advancements.pack.nether_root.title", "Sky Garden - Nether Island");
        translationBuilder.add("advancements.pack.nether_root.description", "Travel to the Nether");
        translationBuilder.add("advancements.pack.cherry_root.title", "Sky Garden - Cherry Island");
        translationBuilder.add("advancements.pack.cherry_root.description", "Visit the Cherry Island");

        //INFO
        translationBuilder.add("info.pack.expansion", "The World has expanded");
        translationBuilder.add("info.pack.expansion2", "The World has opened up to you");

        //ITEMS
        translationBuilder.add("item.pack.permapick", "Permapick");
        //BLOCKS
        translationBuilder.add("block.pack.suspicious_gravel.trail.common", "Earthy");
        translationBuilder.add("block.pack.suspicious_gravel.trail.rare", "Intriguing");
        translationBuilder.add("block.pack.suspicious_gravel.ocean", "Soggy");
        translationBuilder.add("block.pack.suspicious_sand.well", "Loamy");
        translationBuilder.add("block.pack.suspicious_sand.pyramid", "Regal");
        translationBuilder.add("block.pack.suspicious_sand.ocean", "Damp");

    }
}
