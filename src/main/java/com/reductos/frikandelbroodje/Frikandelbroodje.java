package com.reductos.frikandelbroodje;

import com.reductos.frikandelbroodje.init.ItemInit;
import com.reductos.frikandelbroodje.init.VillagerInit;
import com.reductos.frikandelbroodje.util.LootTableModifiers;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Frikandelbroodje implements ModInitializer {

    public static final String MOD_ID = "frikandelbroodje";

    public static final ItemGroup Frikandelbroodje_IG = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "frikandelbroodje"),
            () -> new ItemStack(ItemInit.FRIKANDELBROODJE));


    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.
        ItemInit.register_items();
        LootTableModifiers.modifyLootTables();
        VillagerInit.registerCustomTrades();
    }
}
