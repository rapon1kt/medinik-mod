package me.raponikt.medinik.datagem;

import me.raponikt.medinik.Medinik;
import me.raponikt.medinik.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Medinik.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.MEDRIOD_BLOCK.get())
                .add(ModBlocks.RAW_MEDRIOD_BLOCK.get())
                .add(ModBlocks.MEDRIOD_ORE.get())
                .add(ModBlocks.DEEPSLATE_MEDRIOD_ORE.get());

        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.MEDRIOD_BLOCK.get())
                .add(ModBlocks.RAW_MEDRIOD_BLOCK.get())
                .add(ModBlocks.MEDRIOD_ORE.get())
                .add(ModBlocks.DEEPSLATE_MEDRIOD_ORE.get());

    }
}
