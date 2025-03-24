package me.raponikt.medinik.datagem;

import me.raponikt.medinik.Medinik;
import me.raponikt.medinik.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Medinik.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.MEDRIOD_BLOCK);
        blockWithItem(ModBlocks.RAW_MEDRIOD_BLOCK);

        blockWithItem(ModBlocks.MEDRIOD_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_MEDRIOD_ORE);
    }
    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
