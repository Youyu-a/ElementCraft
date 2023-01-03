package com.h.elementcraft.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

public class ModItemSettings extends FabricItemSettings
{
    public static FabricItemSettings food(Foods food)
    {
        return new ModItemSettings().food(food.get());
    }

    public ModItemSettings()
    {
        super();
    }
}
