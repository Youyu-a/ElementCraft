package com.h.elementcraft.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.FoodComponent;

import java.util.function.Supplier;

public enum Foods
{
    CABBAGE(2,.4f);

    private final Supplier<FoodComponent> food;

    Foods(int hunger,float saturation)
    {
        this(hunger,saturation,null,.0f,false,false,false);
    }

    Foods(int hunger,float saturation,boolean isMeat)
    {
        this(hunger,saturation,null,.0f,isMeat,false,false);
    }

    Foods(int hunger, float saturation, Supplier<StatusEffectInstance> effect,float effectChance)
    {
        this(hunger,saturation,effect,effectChance,false,false,false);
    }

    Foods(int hunger, float saturation, Supplier<StatusEffectInstance> effect,float effectChance,boolean isMeat)
    {
        this(hunger,saturation,effect,effectChance,isMeat,false,false);
    }

    Foods(int hunger, float saturation, Supplier<StatusEffectInstance> effect,float effectChance,boolean isMeat,boolean isFastToEat,boolean alwaysEdible)
    {
        food = () ->
        {
            FoodComponent.Builder builder = new FoodComponent.Builder();
            builder.hunger(hunger).saturationModifier(saturation);
            if(effect != null)
            {
                builder.statusEffect(effect.get(),effectChance);
            }
            if (isMeat)
            {
                builder.meat();
            }
            if (isFastToEat)
            {
                builder.snack();
            }
            if (alwaysEdible)
            {
                builder.alwaysEdible();
            }

            return builder.build();
        };
    }

    public FoodComponent get()
    {
        return food.get();
    }
}
