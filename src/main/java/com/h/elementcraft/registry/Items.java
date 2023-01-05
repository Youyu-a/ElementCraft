package com.h.elementcraft.registry;


import com.h.elementcraft.ElementCraft;
import com.h.elementcraft.item.Foods;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.function.Supplier;

import static com.h.elementcraft.item.ModItemSettings.*;


public enum Items
{
    //Miner
    SILVER_INGOT("silver_ingot",() -> new Item(miner())),

    //Farmer
    CABBAGE("cabbage", () -> new Item(food(Foods.CABBAGE)))
    ;

    private final String id;
    private final Supplier<Item> itemSupplier;

    private Item item;

    Items(String id, Supplier<Item> itemSupplier) {
        this.id = id;
        this.itemSupplier = itemSupplier;
    }

    public static void registerAll() {
        for (Items value : values()) {
            Registry.register(Registries.ITEM, new Identifier(ElementCraft.MOD_ID, value.id), value.get());

        }
    }

    public Item get() {
        if (item == null) {
            item = itemSupplier.get();
        }
        return item;
    }

}
