package me.raponikt.medinik.util;

import me.raponikt.medinik.Medinik;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {

    public static class Blocks {
        private static TagKey<Block> createBlockTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(Medinik.MOD_ID, name));
        }
    }

    public static class Items {

        public static final TagKey<Item> TRANSFORMABLE_ITEMS = createItemTag("transformable_items");

        private static TagKey<Item> createItemTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(Medinik.MOD_ID, name));
        }
    }

}
