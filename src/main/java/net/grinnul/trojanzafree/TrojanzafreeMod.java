package net.grinnul.trojanzafree;

import net.fabricmc.api.ModInitializer;

import net.grinnul.trojanzafree.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TrojanzafreeMod implements ModInitializer {
	public static final String MOD_ID = "trojanzafree";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}