package net.ayoubmrz.amethystswordmod;

import net.ayoubmrz.amethystswordmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AmethystSwordMod implements ModInitializer {
	public static final String MOD_ID = "amethystswordmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

	}
}