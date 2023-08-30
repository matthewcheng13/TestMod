package io.github.testmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties ORANGE = new FoodProperties.Builder().nutrition(4)
            .saturationMod(0.3f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED,
                    200), 0.1f).build();

    public static final FoodProperties CHERRY = new FoodProperties.Builder().nutrition(2)
            .saturationMod(0.4f).build();

    public static final FoodProperties CHOCOLATE_MILK = new FoodProperties.Builder().nutrition(3)
            .saturationMod(0.6f).build();

    public static final FoodProperties FRUIT_PUNCH = new FoodProperties.Builder().nutrition(8)
            .saturationMod(1.0f).build();
}
