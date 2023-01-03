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
    CABBAGE("cabbage", () -> new Item(food(Foods.CABBAGE)));

    private final String pathName;
    private final Supplier<Item> itemSupplier;
    private Item item;

    Items(String pathName,Supplier<Item> itemSupplier)
    {
        this(pathName,itemSupplier);
    }

    Items(String pathName,Supplier<Item> itemSupplier)
    {
        this.pathName = pathName;
        this.itemSupplier = itemSupplier;
    }

    public static void registerAll()
    {
        for(Items value : values())
        {
            Registry.register(Registries.ITEM,new Identifier(ElementCraft.MOD_ID,value.pathName),value.get());
        }
    }

    public Item get()
    {
        if (item == null)
        {
            item =itemSupplier.get();
        }

        return item;
    }

    public String getId()
    {
        return Registries.ITEM.getId(get()).toString();
    }
}
