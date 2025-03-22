package me.raponikt.medinik.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties MEDRIOD_CARROT = new FoodProperties.Builder()
            .nutrition(8)
            .saturationModifier(0.25f)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2400, 1), 1.0f)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 2400, 1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 2400, 1), 1.0F)
            .build();
}
