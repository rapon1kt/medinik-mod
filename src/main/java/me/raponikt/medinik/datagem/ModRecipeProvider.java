package me.raponikt.medinik.datagem;

import me.raponikt.medinik.Medinik;
import me.raponikt.medinik.block.ModBlocks;
import me.raponikt.medinik.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {

        List<ItemLike> MEDRIOD_SMELTABLES = List.of(ModItems.RAW_MEDRIOD.get(),
                ModBlocks.MEDRIOD_ORE.get(),
                ModBlocks.DEEPSLATE_MEDRIOD_ORE.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MEDRIOD_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.MEDRIOD.get())
                .unlockedBy(getHasName(ModItems.MEDRIOD.get()), has(ModItems.MEDRIOD.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MEDRIOD.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.MEDRIOD_NUGGET.get())
                .unlockedBy(getHasName(ModItems.MEDRIOD_NUGGET.get()), has(ModItems.MEDRIOD_NUGGET.get())).save(pRecipeOutput, "888429");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MEDRIOD_CARROT.get())
                .pattern("AAA")
                .pattern("AXA")
                .pattern("AAA")
                .define('A', ModItems.MEDRIOD_NUGGET.get())
                .define('X', Items.CARROT)
                .unlockedBy(getHasName(ModItems.MEDRIOD_NUGGET.get()), has(ModItems.MEDRIOD_NUGGET.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_MEDRIOD_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.RAW_MEDRIOD.get())
                .unlockedBy(getHasName(ModItems.RAW_MEDRIOD.get()), has(ModItems.RAW_MEDRIOD.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MEDRIOD.get(), 9)
                .requires(ModBlocks.MEDRIOD_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.MEDRIOD_BLOCK.get()), has(ModBlocks.MEDRIOD_BLOCK.get())).save(pRecipeOutput, "888428");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MEDRIOD_NUGGET.get(), 9)
                .requires(ModItems.MEDRIOD.get())
                .unlockedBy(getHasName(ModItems.MEDRIOD.get()), has(ModItems.MEDRIOD.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_MEDRIOD.get(), 9)
                .requires(ModBlocks.RAW_MEDRIOD_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_MEDRIOD_BLOCK.get()), has(ModBlocks.RAW_MEDRIOD_BLOCK.get())).save(pRecipeOutput);

        oreSmelting(pRecipeOutput, MEDRIOD_SMELTABLES, RecipeCategory.MISC, ModItems.MEDRIOD.get(), 0.25f, 300, "medriod");
        oreBlasting(pRecipeOutput, MEDRIOD_SMELTABLES, RecipeCategory.MISC, ModItems.MEDRIOD.get(), 0.25f, 200, "medriod");

        SmithingTransformRecipeBuilder.smithing(
                Ingredient.of(ModItems.MEDRIOD_SMITHING_TEMPLATE.get()),
                Ingredient.of(Items.NETHERITE_SWORD),
                Ingredient.of(ModItems.MEDRIOD.get()),
                RecipeCategory.MISC,
                ModItems.MEDRIOD_SWORD.get()
        ).unlocks("has_netherite_sword", has(Items.NETHERITE_SWORD)).save(pRecipeOutput, "888430");

        SmithingTransformRecipeBuilder.smithing(
                Ingredient.of(ModItems.MEDRIOD_SMITHING_TEMPLATE.get()),
                Ingredient.of(Items.NETHERITE_PICKAXE),
                Ingredient.of(ModItems.MEDRIOD.get()),
                RecipeCategory.MISC,
                ModItems.MEDRIOD_PICKAXE.get()
        ).unlocks("has_netherite_pickaxe", has(Items.NETHERITE_PICKAXE)).save(pRecipeOutput, "888431");

        SmithingTransformRecipeBuilder.smithing(
                Ingredient.of(ModItems.MEDRIOD_SMITHING_TEMPLATE.get()),
                Ingredient.of(Items.NETHERITE_AXE),
                Ingredient.of(ModItems.MEDRIOD.get()),
                RecipeCategory.MISC,
                ModItems.MEDRIOD_AXE.get()
        ).unlocks("has_netherite_axe", has(Items.NETHERITE_AXE)).save(pRecipeOutput, "888432");

        SmithingTransformRecipeBuilder.smithing(
                Ingredient.of(ModItems.MEDRIOD_SMITHING_TEMPLATE.get()),
                Ingredient.of(Items.NETHERITE_SHOVEL),
                Ingredient.of(ModItems.MEDRIOD.get()),
                RecipeCategory.MISC,
                ModItems.MEDRIOD_SHOVEL.get()
        ).unlocks("has_netherite_shovel", has(Items.NETHERITE_SHOVEL)).save(pRecipeOutput, "888433");

        SmithingTransformRecipeBuilder.smithing(
                Ingredient.of(ModItems.MEDRIOD_SMITHING_TEMPLATE.get()),
                Ingredient.of(Items.NETHERITE_HOE),
                Ingredient.of(ModItems.MEDRIOD.get()),
                RecipeCategory.MISC,
                ModItems.MEDRIOD_HOE.get()
        ).unlocks("has_netherite_hoe", has(Items.NETHERITE_HOE)).save(pRecipeOutput, "888434");
    }

    protected static void oreSmelting(
            RecipeOutput pRecipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
            float pExperience, int pCookingTime, String pGroup
    ) {
        oreCooking(pRecipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(
            RecipeOutput pRecipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
            float pExperience, int pCookingTime, String pGroup
    ) {
        oreCooking(pRecipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    private static <T extends AbstractCookingRecipe> void oreCooking(
            RecipeOutput pRecipeOutput,
            RecipeSerializer<T> pSerializer,
            AbstractCookingRecipe.Factory<T> pRecipeFactory,
            List<ItemLike> pIngredients,
            RecipeCategory pCategory,
            ItemLike pResult,
            float pExperience,
            int pCookingTime,
            String pGroup,
            String pSuffix
    ) {
        for (ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pSerializer, pRecipeFactory)
                    .group(pGroup)
                    .unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pRecipeOutput, Medinik.MOD_ID + ":" + getItemName(pResult) + pSuffix + "_" + getItemName(itemlike));
        }
    }
}
