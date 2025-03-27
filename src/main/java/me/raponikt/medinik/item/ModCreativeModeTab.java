package me.raponikt.medinik.item;

import me.raponikt.medinik.Medinik;
import me.raponikt.medinik.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTab {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Medinik.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MEDINIK_ITEMS_TAB = CREATIVE_MODE_TABS.register("medinik_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MEDRIOD.get()))
                    .title(Component.translatable("creativetab.medinik.medinik_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        // COMMON ITEMS
                        output.accept(ModItems.MEDRIOD.get());
                        output.accept(ModItems.RAW_MEDRIOD.get());
                        output.accept(ModItems.MEDRIOD_NUGGET.get());
                        output.accept(ModItems.MEDRIOD_DUST.get());
                        output.accept(ModItems.MEDRIOD_CLUMP.get());
                        output.accept(ModItems.MEDRIOD_SHARD.get());
                        output.accept(ModItems.MEDRIOD_CRYSTAL.get());
                        // FOODS & OTHERS
                        output.accept(ModItems.MEDRIOD_CARROT.get());
                        // TOOLS & ARMORS
                        output.accept(ModItems.MEDRIOD_SWORD.get());
                        output.accept(ModItems.MEDRIOD_AXE.get());
                        output.accept(ModItems.MEDRIOD_PICKAXE.get());
                        output.accept(ModItems.MEDRIOD_SHOVEL.get());
                        output.accept(ModItems.MEDRIOD_HOE.get());
                        output.accept(ModItems.MEDRIOD_SMITHING_TEMPLATE.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> MEDINIK_BLOCKS_TAB = CREATIVE_MODE_TABS.register("medinik_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.MEDRIOD_BLOCK.get()))
                    .withTabsBefore(MEDINIK_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.medinik.medinik_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.MEDRIOD_BLOCK.get());
                        output.accept(ModBlocks.RAW_MEDRIOD_BLOCK.get());
                        output.accept(ModBlocks.DEEPSLATE_MEDRIOD_ORE.get());
                        output.accept(ModBlocks.MEDRIOD_ORE.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
