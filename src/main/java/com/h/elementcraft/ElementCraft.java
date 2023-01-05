package com.h.elementcraft;

import com.h.elementcraft.registry.Compostables;
import com.h.elementcraft.registry.Items;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.impl.itemgroup.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ElementCraft implements ModInitializer
{
	public static final String MOD_ID = "elementcraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		Compostables.registerAll();
		Items.registerAll();
		LOGGER.info("Hello Fabric World!");
	}
}
