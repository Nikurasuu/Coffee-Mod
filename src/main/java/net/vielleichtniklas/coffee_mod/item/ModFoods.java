package net.vielleichtniklas.coffee_mod.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties COFFEE_BEANS = new FoodProperties.Builder()
        .nutrition(2).saturationMod(0.2f).fast().build();
}
