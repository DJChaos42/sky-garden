package net.djchaos.pack.data.server.recipes;

//import net.djchaos.chaosutils.item.ModItems;
import net.djchaos.pack.tags.PackItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.*;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

import static net.djchaos.pack.PackInfo.PACK_ID;

public class DataModRecipeGenerator extends FabricRecipeProvider {

    public static final String VANILLA = "vanilla";
    public DataModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        //SHAPELESS RECIPES
        // PIGLIN BANNER
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.PIGLIN_BANNER_PATTERN)
                .group("piglin_banner_pattern")
                .input(Items.PAPER)
                .input(Items.PIGLIN_HEAD)
                .criterion(FabricRecipeProvider.hasItem(Items.PIGLIN_HEAD),
                        FabricRecipeProvider.conditionsFromItem(Items.PIGLIN_HEAD))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Items.PIGLIN_BANNER_PATTERN)));
        // FLINT FROM GRAVEL
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.FLINT)
                .group("flint")
                .input(Items.GRAVEL)
                .input(Items.GRAVEL)
                .input(Items.GRAVEL)
                .criterion(FabricRecipeProvider.hasItem(Items.GRAVEL),
                        FabricRecipeProvider.conditionsFromItem(Items.GRAVEL))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Items.FLINT)));

        // SHAPED RECIPES
        // TUFF FROM BLACKSTONE
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.TUFF, 2)
                .group("tuff")
                .pattern("BQ")
                .pattern("QB")
                .input('B', Items.BLACKSTONE)
                .input('Q', Items.QUARTZ)
                .criterion(FabricRecipeProvider.hasItem(Items.BLACKSTONE),
                        FabricRecipeProvider.conditionsFromItem(Items.BLACKSTONE))
                .criterion(FabricRecipeProvider.hasItem(Items.QUARTZ),
                        FabricRecipeProvider.conditionsFromItem(Items.QUARTZ))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Items.TUFF) + "_from_blackstone"));
        // BELL
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.BELL)
                .group("bell")
                .pattern("LLL")
                .pattern("SGS")
                .pattern("S S")
                .input('L', ItemTags.LOGS)
                .input('G', Items.GOLD_BLOCK)
                .input('S', Items.STONE)
                .criterion(FabricRecipeProvider.hasItem(Items.STONE),
                        FabricRecipeProvider.conditionsFromItem(Items.STONE))
                .criterion(FabricRecipeProvider.hasItem(Items.GOLD_BLOCK),
                        FabricRecipeProvider.conditionsFromItem(Items.GOLD_BLOCK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Items.BELL)));

        // COBWEB FROM STRING
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Items.COBWEB)
                .group("cobweb")
                .pattern("X X")
                .pattern(" X ")
                .pattern("X X")
                .input('X', Items.STRING)
                .criterion(FabricRecipeProvider.hasItem(Items.STRING),
                        FabricRecipeProvider.conditionsFromItem(Items.STRING))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Items.COBWEB)));

        // NAME TAG
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Items.NAME_TAG, 2)
                .group("name_tag")
                .pattern("  I")
                .pattern(" P ")
                .pattern("P  ")
                .input('I', Items.IRON_INGOT)
                .input('P', Items.PAPER)
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .criterion(FabricRecipeProvider.hasItem(Items.PAPER),
                        FabricRecipeProvider.conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Items.NAME_TAG)));

        // SOUL SOIL
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.SOUL_SOIL, 4)
                .group("soul_soil")
                .pattern("DS")
                .pattern("SD")
                .input('D', Items.DIRT)
                .input('S', Items.SOUL_SAND)
                .criterion(FabricRecipeProvider.hasItem(Items.SOUL_SAND),
                        FabricRecipeProvider.conditionsFromItem(Items.SOUL_SAND))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Items.SOUL_SOIL)));

        // SCULK
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.SCULK_CATALYST)
                .group("sculk_catalyst")
                .pattern("VSV")
                .pattern("XBX")
                .pattern("XXX")
                .input('V', Items.SCULK_VEIN)
                .input('S', Items.SOUL_LANTERN)
                .input('X', Items.SCULK)
                .input('B', Items.BONE_BLOCK)
                .criterion(FabricRecipeProvider.hasItem(Items.SCULK),
                        FabricRecipeProvider.conditionsFromItem(Items.SCULK))
                .criterion(FabricRecipeProvider.hasItem(Items.BONE_BLOCK),
                        FabricRecipeProvider.conditionsFromItem(Items.BONE_BLOCK))
                .criterion(FabricRecipeProvider.hasItem(Items.SOUL_LANTERN),
                        FabricRecipeProvider.conditionsFromItem(Items.SOUL_LANTERN))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Items.SCULK_CATALYST)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.SCULK_SENSOR)
                .group("sculk_sensor")
                .pattern("VVV")
                .pattern("XRX")
                .pattern("XXX")
                .input('V', Items.SCULK_VEIN)
                .input('X', Items.SCULK)
                .input('R', Items.REDSTONE)
                .criterion(FabricRecipeProvider.hasItem(Items.SCULK),
                        FabricRecipeProvider.conditionsFromItem(Items.SCULK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Items.SCULK_SENSOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.SCULK_SHRIEKER)
                .group("sculk_shrieker")
                .pattern("VSV")
                .pattern("XNX")
                .pattern("XXX")
                .input('V', Items.SCULK_VEIN)
                .input('S', Items.SCULK_SENSOR)
                .input('X', Items.SCULK)
                .input('N', Items.NOTE_BLOCK)
                .criterion(FabricRecipeProvider.hasItem(Items.SCULK),
                        FabricRecipeProvider.conditionsFromItem(Items.SCULK))
                .criterion(FabricRecipeProvider.hasItem(Items.BONE_BLOCK),
                        FabricRecipeProvider.conditionsFromItem(Items.BONE_BLOCK))
                .criterion(FabricRecipeProvider.hasItem(Items.SOUL_LANTERN),
                        FabricRecipeProvider.conditionsFromItem(Items.SOUL_LANTERN))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Items.SCULK_SHRIEKER)));
        
        // END STONE
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.END_STONE, 8)
                .group("end_stone")
                .pattern("CCC")
                .pattern("CFC")
                .pattern("CCC")
                .input('C', Items.COBBLESTONE)
                .input('F', Items.DRAGON_BREATH)
                .criterion(FabricRecipeProvider.hasItem(Items.DRAGON_BREATH),
                        FabricRecipeProvider.conditionsFromItem(Items.DRAGON_BREATH))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Items.END_STONE)));
        
        // SHULKER SHELL
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.SHULKER_SHELL, 2)
                .group("end_stone")
                .pattern("PPP")
                .pattern("PEP")
                .pattern("PPP")
                .input('P', Items.PURPUR_BLOCK)
                .input('E', Items.ENDER_EYE)
                .criterion(FabricRecipeProvider.hasItem(Items.PURPUR_BLOCK),
                        FabricRecipeProvider.conditionsFromItem(Items.PURPUR_BLOCK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Items.SHULKER_SHELL)));
        // ECHO SHARD
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.ECHO_SHARD)
                .group("echo_shard")
                .pattern(" S ")
                .pattern("SAS")
                .pattern(" S ")
                .input('S', Items.SCULK)
                .input('A', Items.AMETHYST_SHARD)
                .criterion(FabricRecipeProvider.hasItem(Items.SCULK),
                        FabricRecipeProvider.conditionsFromItem(Items.SCULK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Items.ECHO_SHARD)));

        // BUDDING AMETHYST
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Items.BUDDING_AMETHYST)
                .group("budding_amethyst")
                .pattern("EAE")
                .pattern("AEA")
                .pattern("EAE")
                .input('E', Items.ECHO_SHARD)
                .input('A', Items.AMETHYST_BLOCK)
                .criterion(FabricRecipeProvider.hasItem(Items.ECHO_SHARD),
                        FabricRecipeProvider.conditionsFromItem(Items.ECHO_SHARD))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Items.BUDDING_AMETHYST)));
        // NETHERITE_TEMPLATE_CREATION
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE)
                .group("netherite_smithing_template")
                .pattern("BDB")
                .pattern("DND")
                .pattern("BDB")
                .input('N', Items.NETHERITE_BLOCK)
                .input('B', Items.BLAZE_POWDER)
                .input('D', Items.DIAMOND)
                .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_SCRAP),
                        FabricRecipeProvider.conditionsFromItem(Items.NETHERITE_SCRAP))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE) + "_creation"));
        // PINK PETALS
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Items.PINK_PETALS, 3)
                .group("pink_petals")
                .pattern("LL ")
                .input('L', Items.CHERRY_LEAVES)
                .criterion(FabricRecipeProvider.hasItem(Items.CHERRY_LEAVES),
                        FabricRecipeProvider.conditionsFromItem(Items.CHERRY_LEAVES))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Items.PINK_PETALS)));
        // PODZOL
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Items.PODZOL, 2)
                .group("podzol")
                .pattern("LL")
                .pattern("DD")
                .input('L', ItemTags.LEAVES)
                .input('D', Items.DIRT)
                .criterion(FabricRecipeProvider.hasItem(Items.OAK_LEAVES),
                        FabricRecipeProvider.conditionsFromTag(ItemTags.LEAVES))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Items.PODZOL)));
        // GRASS BLOCK
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Items.GRASS_BLOCK, 2)
                .group("grass_block")
                .pattern("GG")
                .pattern("DD")
                .input('G', Items.GRASS)
                .input('D', Items.DIRT)
                .criterion(FabricRecipeProvider.hasItem(Items.GRASS),
                        FabricRecipeProvider.conditionsFromItem(Items.GRASS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Items.GRASS_BLOCK)));
        // MYCELIUM
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Items.MYCELIUM, 2)
                .group("mycelium")
                .pattern("MM")
                .pattern("DD")
                .input('M', PackItemTags.MUSHROOMS)
                .input('D', Items.DIRT)
                .criterion(FabricRecipeProvider.hasItem(Items.BROWN_MUSHROOM),
                        FabricRecipeProvider.conditionsFromTag(PackItemTags.MUSHROOMS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Items.MYCELIUM)));

        //SMELTING
        //CALCITE
        CookingRecipeJsonBuilder.createSmelting(
                Ingredient.ofItems(Items.DRIPSTONE_BLOCK), RecipeCategory.BUILDING_BLOCKS, Items.CALCITE, 0.1f, 200)
                .group("calcite")
                .criterion(FabricRecipeProvider.hasItem(Items.DRIPSTONE_BLOCK),
                        FabricRecipeProvider.conditionsFromItem(Items.DRIPSTONE_BLOCK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Items.CALCITE) + "_from_dripstone_block_smelting"));
        //BONE MEAL FROM NAUTILUS
        CookingRecipeJsonBuilder.createSmelting(
                Ingredient.ofItems(Items.NAUTILUS_SHELL), RecipeCategory.MISC, Items.BONE_MEAL, 0.1f, 200)
                .group("bone_meal")
                .criterion(FabricRecipeProvider.hasItem(Items.NAUTILUS_SHELL),
                        FabricRecipeProvider.conditionsFromItem(Items.NAUTILUS_SHELL))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Items.BONE_MEAL) + "_from_nautilus_shell_smelting"));

        //Netherite Scrap From Netherite Items
        /*CookingRecipeJsonBuilder.createSmelting(
                        Ingredient.fromTag(TagKey.of(RegistryKeys.ITEM, new Identifier(PACK_ID, "smelts_to_netherite_scrap"))), RecipeCategory.MISC, Items.NETHERITE_SCRAP, 0.1f, 200)
                .group("netherite_scrap")
                .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.NETHERITE_INGOT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Items.NETHERITE_SCRAP) + "_from_smelting"));*/
        CookingRecipeJsonBuilder.createBlasting(
                        Ingredient.fromTag(TagKey.of(RegistryKeys.ITEM, new Identifier(PACK_ID, "smelts_to_netherite_scrap"))), RecipeCategory.MISC, Items.NETHERITE_SCRAP, 0.1f, 100)
                .group("netherite_scrap")
                .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.NETHERITE_INGOT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Items.NETHERITE_SCRAP) + "_from_blasting"));
        
        //VANILLA
        //CRAFTING

        // BEETROOT SOUP
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, Items.BEETROOT_SOUP)
                .group("beetroot_soup")
                .input(Items.BOWL)
                .input(Items.BEETROOT)
                .input(Items.BEETROOT)
                .criterion(FabricRecipeProvider.hasItem(Items.BEETROOT),
                        FabricRecipeProvider.conditionsFromItem(Items.BEETROOT))
                .offerTo(exporter, new Identifier(VANILLA + FabricRecipeProvider.getRecipeName(Items.BEETROOT_SOUP)));

        // SMELTING
        //Mud Bricks
        CookingRecipeJsonBuilder.createSmelting(
                        Ingredient.ofItems(Items.PACKED_MUD), RecipeCategory.BUILDING_BLOCKS, Items.MUD_BRICKS, 0.1f, 200)
                .group("packed_mud")
                .criterion(FabricRecipeProvider.hasItem(Items.PACKED_MUD),
                        FabricRecipeProvider.conditionsFromItem(Items.PACKED_MUD))
                .offerTo(exporter, new Identifier(VANILLA + FabricRecipeProvider.getRecipeName(Items.MUD_BRICKS)));
        // GROUP FOR NETHERITE SCRAP
        CookingRecipeJsonBuilder.createSmelting(
                        Ingredient.ofItems(Items.ANCIENT_DEBRIS), RecipeCategory.MISC, Items.NETHERITE_SCRAP, 0.1f, 200)
                .group("netherite_scrap")
                .criterion(FabricRecipeProvider.hasItem(Items.ANCIENT_DEBRIS),
                        FabricRecipeProvider.conditionsFromItem(Items.ANCIENT_DEBRIS))
                .offerTo(exporter, new Identifier(VANILLA + FabricRecipeProvider.getRecipeName(Items.NETHERITE_SCRAP)));
        CookingRecipeJsonBuilder.createBlasting(
                        Ingredient.ofItems(Items.ANCIENT_DEBRIS), RecipeCategory.MISC, Items.NETHERITE_SCRAP, 0.1f, 100)
                .group("netherite_scrap")
                .criterion(FabricRecipeProvider.hasItem(Items.ANCIENT_DEBRIS),
                        FabricRecipeProvider.conditionsFromItem(Items.ANCIENT_DEBRIS))
                .offerTo(exporter, new Identifier(VANILLA + FabricRecipeProvider.getRecipeName(Items.NETHERITE_SCRAP) + "_from_blasting"));
        // EXPENSIVE INGOTS
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.NETHERITE_INGOT)
                .group("netherite_ingot")
                .pattern("SGS")
                .pattern("GSG")
                .pattern("SGS")
                .input('S', Items.NETHERITE_SCRAP)
                .input('G', Items.GOLD_INGOT)
                .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_SCRAP),
                        FabricRecipeProvider.conditionsFromItem(Items.NETHERITE_SCRAP))
                .offerTo(exporter, new Identifier(VANILLA + FabricRecipeProvider.getRecipeName(Items.NETHERITE_INGOT)));
        // NETHERITE_TEMPLATE_GROUP
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, 2)
                .group("netherite_smithing_template")
                .pattern("DTD")
                .pattern("DND")
                .pattern("DDD")
                .input('N', Items.NETHERRACK)
                .input('T', Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE)
                .input('D', Items.DIAMOND)
                .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_SCRAP),
                        FabricRecipeProvider.conditionsFromItem(Items.NETHERITE_SCRAP))
                .offerTo(exporter, new Identifier(VANILLA + FabricRecipeProvider.getRecipeName(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE)));
        
    }

    @Override
    protected Identifier getRecipeIdentifier(Identifier identifier) {
        if (super.getRecipeIdentifier(identifier).toString().contains("vanilla")) {
            return new Identifier(identifier.toString().replace("vanilla", ""));
        } else {
            return super.getRecipeIdentifier(identifier);
        }
    }
}
