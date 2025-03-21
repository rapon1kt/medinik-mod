package me.raponikt.medinik.item;

import me.raponikt.medinik.Medinik;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Medinik.MOD_ID);

    public static final RegistryObject<Item> MEDRIOD = ITEMS.register("medriod", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_MEDRIOD = ITEMS.register("raw_medriod", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
