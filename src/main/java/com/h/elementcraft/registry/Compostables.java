package com.h.elementcraft.registry;

import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.minecraft.item.Items;

public class Compostables
{
    public static void registerAll()
    {
        //原版
        CompostingChanceRegistry.INSTANCE.add(Items.ROTTEN_FLESH,.3f);
        CompostingChanceRegistry.INSTANCE.add(Items.GOLDEN_APPLE,1f);
        CompostingChanceRegistry.INSTANCE.add(Items.ENCHANTED_GOLDEN_APPLE,1f);
        CompostingChanceRegistry.INSTANCE.add(Items.GOLDEN_CARROT,1f);
        CompostingChanceRegistry.INSTANCE.add(Items.CHORUS_FRUIT,.85f);
        CompostingChanceRegistry.INSTANCE.add(Items.POISONOUS_POTATO,.65f);
        CompostingChanceRegistry.INSTANCE.add(Items.BEEF,.85f);
        CompostingChanceRegistry.INSTANCE.add(Items.COOKED_BEEF,.85f);
        CompostingChanceRegistry.INSTANCE.add(Items.PORKCHOP,.85f);
        CompostingChanceRegistry.INSTANCE.add(Items.COOKED_PORKCHOP,.85f);
        CompostingChanceRegistry.INSTANCE.add(Items.MUTTON,.85f);
        CompostingChanceRegistry.INSTANCE.add(Items.COOKED_MUTTON,.85f);
        CompostingChanceRegistry.INSTANCE.add(Items.RABBIT,.85f);
        CompostingChanceRegistry.INSTANCE.add(Items.COOKED_RABBIT,.85f);
        CompostingChanceRegistry.INSTANCE.add(Items.CHICKEN,.85f);
        CompostingChanceRegistry.INSTANCE.add(Items.COOKED_CHICKEN,.85f);
        CompostingChanceRegistry.INSTANCE.add(Items.SALMON,.85f);
        CompostingChanceRegistry.INSTANCE.add(Items.COOKED_SALMON,.85f);
        CompostingChanceRegistry.INSTANCE.add(Items.COD,.85f);
        CompostingChanceRegistry.INSTANCE.add(Items.COOKED_COD,.85f);
        CompostingChanceRegistry.INSTANCE.add(Items.TROPICAL_FISH,.85f);
        CompostingChanceRegistry.INSTANCE.add(Items.SPIDER_EYE,.65f);
        CompostingChanceRegistry.INSTANCE.add(Items.FERMENTED_SPIDER_EYE,.85f);
        CompostingChanceRegistry.INSTANCE.add(Items.PUFFERFISH,.85f);
        CompostingChanceRegistry.INSTANCE.add(Items.BEETROOT_SOUP,.3f);
        CompostingChanceRegistry.INSTANCE.add(Items.RABBIT_STEW,.3f);
        CompostingChanceRegistry.INSTANCE.add(Items.SUSPICIOUS_STEW,.5f);
        CompostingChanceRegistry.INSTANCE.add(Items.MUSHROOM_STEW,.3f);
        CompostingChanceRegistry.INSTANCE.add(Items.HONEYCOMB,.3f);
        CompostingChanceRegistry.INSTANCE.add(Items.INK_SAC,.3f);
        CompostingChanceRegistry.INSTANCE.add(Items.GLOW_INK_SAC,.3f);
        CompostingChanceRegistry.INSTANCE.add(Items.SLIME_BALL,.5f);
        CompostingChanceRegistry.INSTANCE.add(Items.POPPED_CHORUS_FRUIT,.65f);
        CompostingChanceRegistry.INSTANCE.add(Items.EGG,.3f);
        CompostingChanceRegistry.INSTANCE.add(Items.SUGAR,.3f);
        CompostingChanceRegistry.INSTANCE.add(Items.RABBIT_FOOT,.85f);
        CompostingChanceRegistry.INSTANCE.add(Items.GLISTERING_MELON_SLICE,85f);
        CompostingChanceRegistry.INSTANCE.add(Items.PHANTOM_MEMBRANE,.5f);
        CompostingChanceRegistry.INSTANCE.add(Items.MUDDY_MANGROVE_ROOTS,.5f);
        CompostingChanceRegistry.INSTANCE.add(Items.BAMBOO,.5f);
        CompostingChanceRegistry.INSTANCE.add(Items.CHORUS_PLANT,.85f);
        CompostingChanceRegistry.INSTANCE.add(Items.CHORUS_FLOWER,.85f);
        CompostingChanceRegistry.INSTANCE.add(Items.FROGSPAWN,.3f);
        CompostingChanceRegistry.INSTANCE.add(Items.TURTLE_EGG,.5f);
        CompostingChanceRegistry.INSTANCE.add(Items.BEE_NEST,1f);
        CompostingChanceRegistry.INSTANCE.add(Items.SLIME_BLOCK,1f);
        CompostingChanceRegistry.INSTANCE.add(Items.HONEY_BLOCK,1f);
        CompostingChanceRegistry.INSTANCE.add(Items.HONEYCOMB_BLOCK,1f);

    }
}
