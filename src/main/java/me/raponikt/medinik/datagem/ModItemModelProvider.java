package me.raponikt.medinik.datagem;

import me.raponikt.medinik.Medinik;
import me.raponikt.medinik.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Medinik.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.RAW_MEDRIOD.get());
        basicItem(ModItems.MEDRIOD.get());
        basicItem(ModItems.MEDRIOD_CARROT.get());
        basicItem(ModItems.MEDRIOD_NUGGET.get());
    }
}
