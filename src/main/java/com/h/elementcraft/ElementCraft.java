package com.h.elementcraft;

import com.h.elementcraft.registry.Compostables;
import com.h.elementcraft.registry.Items;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ElementCraft implements ModInitializer
{
	public static final String MOD_ID = "elementcraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final ItemGroup MINER_GROUP = FabricItemGroup.builder(new Identifier(ElementCraft.MOD_ID,"miner_group"))
			.icon(() -> new ItemStack(net.minecraft.item.Items.DIAMOND_BLOCK))
			.build();

	@Override
	public void onInitialize()
	{

		Compostables.registerAll();
		Items.registerAll();



		LOGGER.info("Hello Fabric World!");
	}
}
