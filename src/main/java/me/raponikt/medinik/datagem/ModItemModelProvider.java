package me.raponikt.medinik.datagem;

import me.raponikt.medinik.Medinik;
import me.raponikt.medinik.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Medinik.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // COMMON ITEMS
        basicItem(ModItems.MEDRIOD.get());
        basicItem(ModItems.RAW_MEDRIOD.get());
        basicItem(ModItems.MEDRIOD_CARROT.get());
        basicItem(ModItems.MEDRIOD_NUGGET.get());
        basicItem(ModItems.MEDRIOD_DUST.get());
        basicItem(ModItems.MEDRIOD_SHARD.get());
        basicItem(ModItems.MEDRIOD_CLUMP.get());
        basicItem(ModItems.MEDRIOD_CRYSTAL.get());
        // TOOLS & ARMORS
        handheldItem(ModItems.MEDRIOD_SWORD);
        handheldItem(ModItems.MEDRIOD_AXE);
        handheldItem(ModItems.MEDRIOD_SHOVEL);
        handheldItem(ModItems.MEDRIOD_HOE);
        handheldItem(ModItems.MEDRIOD_PICKAXE);
        // SMITHING TEMPLATES
        basicItem(ModItems.MEDRIOD_SMITHING_TEMPLATE.get());
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(Medinik.MOD_ID, "item/" + item.getId().getPath()));
    }
}
