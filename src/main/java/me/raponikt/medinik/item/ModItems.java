package me.raponikt.medinik.item;

import me.raponikt.medinik.Medinik;
import net.minecraft.ChatFormatting;
import net.minecraft.Util;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModItems {

    private static final ResourceLocation EMPTY_SLOT_HOE = ResourceLocation.withDefaultNamespace("item/empty_slot_hoe");
    private static final ResourceLocation EMPTY_SLOT_AXE = ResourceLocation.withDefaultNamespace("item/empty_slot_axe");
    private static final ResourceLocation EMPTY_SLOT_SWORD = ResourceLocation.withDefaultNamespace("item/empty_slot_sword");
    private static final ResourceLocation EMPTY_SLOT_SHOVEL = ResourceLocation.withDefaultNamespace("item/empty_slot_shovel");
    private static final ResourceLocation EMPTY_SLOT_PICKAXE = ResourceLocation.withDefaultNamespace("item/empty_slot_pickaxe");
    private static final ResourceLocation EMPTY_SLOT_INGOT = ResourceLocation.withDefaultNamespace("item/empty_slot_ingot");

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Medinik.MOD_ID);

    // Medinik ITEMS
    public static final RegistryObject<Item> MEDRIOD = ITEMS.register("medriod",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_MEDRIOD = ITEMS.register("raw_medriod",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MEDRIOD_NUGGET = ITEMS.register("medriod_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MEDRIOD_DUST = ITEMS.register("medriod_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MEDRIOD_CLUMP = ITEMS.register("medriod_clump",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MEDRIOD_SHARD = ITEMS.register("medriod_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MEDRIOD_CRYSTAL = ITEMS.register("medriod_crystal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MEDRIOD_CARROT = ITEMS.register("medriod_carrot",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MEDRIOD_CARROT)));

    // Medinik TOOLS
    public static final RegistryObject<Item> MEDRIOD_SWORD = ITEMS.register("medriod_sword",
            () -> new SwordItem(ModToolTiers.MEDRIOD, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.MEDRIOD, 20, -2))));

    public static final RegistryObject<Item> MEDRIOD_PICKAXE = ITEMS.register("medriod_pickaxe",
            () -> new PickaxeItem(ModToolTiers.MEDRIOD, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.MEDRIOD, 15, -2))));

    public static final RegistryObject<Item> MEDRIOD_AXE = ITEMS.register("medriod_axe",
            () -> new AxeItem(ModToolTiers.MEDRIOD, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.MEDRIOD, 22, -3.2F))));

    public static final RegistryObject<Item> MEDRIOD_SHOVEL = ITEMS.register("medriod_shovel",
            () -> new ShovelItem(ModToolTiers.MEDRIOD, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.MEDRIOD, 10, -2))));

    public static final RegistryObject<Item> MEDRIOD_HOE = ITEMS.register("medriod_hoe",
            () -> new HoeItem(ModToolTiers.MEDRIOD, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.MEDRIOD, 5, -2))));

    // Medinik - MEDRIOD ARMORS
    public static final RegistryObject<Item> MEDRIOD_HELMET = ITEMS.register("medriod_helmet",
            () -> new ArmorItem(ModArmorMaterials.MEDRIOD_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(18))));
    public static final RegistryObject<Item> MEDRIOD_CHESTPLATE = ITEMS.register("medriod_chestplate",
            () -> new ArmorItem(ModArmorMaterials.MEDRIOD_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(18))));
    public static final RegistryObject<Item> MEDRIOD_LEGGINGS = ITEMS.register("medriod_leggings",
            () -> new ArmorItem(ModArmorMaterials.MEDRIOD_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(18))));
    public static final RegistryObject<Item> MEDRIOD_BOOTS = ITEMS.register("medriod_boots",
            () -> new ArmorItem(ModArmorMaterials.MEDRIOD_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(18))));

    // Medinik - MEDRIOD SMITHING TEMPLATE
    private static final Component MEDRIOD_UPGRADE_APPLIES_TO = Component.translatable(Util.makeDescriptionId("item",
            ResourceLocation.fromNamespaceAndPath(Medinik.MOD_ID, "medriod_upgrade_applies_to")))
            .withStyle(ChatFormatting.BLUE);
    private static final Component MEDRIOD_UPGRADE_INGREDIENTS = Component.translatable(Util.makeDescriptionId("item",
            ResourceLocation.fromNamespaceAndPath(Medinik.MOD_ID, "medriod_upgrade_ingredients")))
            .withStyle(ChatFormatting.BLUE);
    private static final Component MEDRIOD_UPGRADE = Component.translatable(Util.makeDescriptionId("upgrade",
            ResourceLocation.fromNamespaceAndPath(Medinik.MOD_ID, "medriod_upgrade")))
            .withStyle(ChatFormatting.RED);
    private static final Component MEDRIOD_UPGRADE_BASE_SLOT_DESCRIPTION = Component.translatable(
            Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(Medinik.MOD_ID, "medriod_upgrade_base_slot_description")))
            .withStyle(ChatFormatting.GRAY);
    private static final Component MEDRIOD_UPGRADE_ADDITIONS_SLOT_DESCRIPTION = Component.translatable(
            Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(Medinik.MOD_ID, "medriod_upgrade_additions_slot_description")))
            .withStyle(ChatFormatting.GRAY);

    public static final RegistryObject<Item> MEDRIOD_SMITHING_TEMPLATE = ITEMS.register("medriod_smithing_template",
            () -> new SmithingTemplateItem(
                    MEDRIOD_UPGRADE_APPLIES_TO,
                    MEDRIOD_UPGRADE_INGREDIENTS,
                    MEDRIOD_UPGRADE,
                    MEDRIOD_UPGRADE_BASE_SLOT_DESCRIPTION,
                    MEDRIOD_UPGRADE_ADDITIONS_SLOT_DESCRIPTION,
                    createMedriodUpgradeIconList(),
                    createNetheriteUpgradeMaterialList()
            )
    );

    private static List<ResourceLocation> createMedriodUpgradeIconList() {
        return List.of(EMPTY_SLOT_SWORD, EMPTY_SLOT_PICKAXE, EMPTY_SLOT_AXE, EMPTY_SLOT_HOE, EMPTY_SLOT_SHOVEL);
    }
    private static List<ResourceLocation> createNetheriteUpgradeMaterialList() {
        return List.of(EMPTY_SLOT_INGOT);
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
