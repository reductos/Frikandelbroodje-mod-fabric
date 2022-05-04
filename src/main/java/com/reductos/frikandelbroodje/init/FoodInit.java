package com.reductos.frikandelbroodje.init;

import net.minecraft.item.FoodComponent;

public class FoodInit {
    public static final FoodComponent HORSE_MEAT = new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build();
    public static final FoodComponent FRIKANDEL = new FoodComponent.Builder().hunger(7).saturationModifier(0.7f).build();
    public static final FoodComponent FRIKANDELBROODJE = new FoodComponent.Builder().hunger(10).saturationModifier(1.2f).build();

}
