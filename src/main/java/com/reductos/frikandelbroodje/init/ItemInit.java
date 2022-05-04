package com.reductos.frikandelbroodje.init;

import com.reductos.frikandelbroodje.Frikandelbroodje;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemInit {
    public static final Item HORSE_MEAT = register_item("horse_meat", new Item(new FabricItemSettings().group(Frikandelbroodje.Frikandelbroodje_IG).food(FoodInit.HORSE_MEAT)));

    public static final Item FRIKANDEL = register_item("frikandel", new Item(new FabricItemSettings().group(Frikandelbroodje.Frikandelbroodje_IG).food(FoodInit.FRIKANDEL)));

    public static final Item FRIKANDELBROODJE = register_item("frikandelbroodje", new Item(new FabricItemSettings().group(Frikandelbroodje.Frikandelbroodje_IG).food(FoodInit.FRIKANDELBROODJE)));


    private static Item register_item(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Frikandelbroodje.MOD_ID, name), item);
    }

    public static void register_items() {

    }
}
