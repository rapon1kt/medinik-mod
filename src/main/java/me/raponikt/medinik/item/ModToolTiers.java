package me.raponikt.medinik.item;

import me.raponikt.medinik.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModToolTiers {
    public static final Tier MEDRIOD = new ForgeTier(4064, 10.0F, 10.0F, 15,
            ModTags.Blocks.NEEDS_MEDRIOD_TOOL, () -> Ingredient.of(ModItems.MEDRIOD.get()),
            ModTags.Blocks.INCORRECT_FOR_MEDRIOD_TOOL);
}
