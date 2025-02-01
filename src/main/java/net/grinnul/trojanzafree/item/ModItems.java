package net.grinnul.trojanzafree.item;

import net.grinnul.trojanzafree.TrojanzafreeMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(TrojanzafreeMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        TrojanzafreeMod.LOGGER.info("registering items for " + TrojanzafreeMod.MOD_ID);
    }
}
