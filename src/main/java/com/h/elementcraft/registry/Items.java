package com.h.elementcraft.registry;

import com.h.elementcraft.ElementCraft;
import com.h.elementcraft.item.Foods;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.function.Supplier;

import static com.h.elementcraft.item.ModItemSettings.food;

public enum Items
{
    CABBAGE("cabbage", new Item(food(Foods.CABBAGE)));

    private final String id;
    private final Item item;

    Items(String id, Supplier<Item> itemSupplier)
    {
        this(id, itemSupplier.get());
    }

    Items(String id, Item item)
    {
        this.id = id;
        this.item = item;
    }

    public static void registerAll()
    {
        for(Items item : values())
        {
            Registry.register(Registries.ITEM, new Identifier(ElementCraft.MOD_ID, item.getId()), item.getItem());
        }
    }

    public Item getItem()
    {
        return this.item;
    }

    public String getId()
    {
        return this.id;
    }
}
