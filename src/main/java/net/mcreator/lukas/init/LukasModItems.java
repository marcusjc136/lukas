
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lukas.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.lukas.LukasMod;

public class LukasModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, LukasMod.MODID);
	public static final RegistryObject<Item> LUKAS_SPAWN_EGG = REGISTRY.register("lukas_spawn_egg", () -> new ForgeSpawnEggItem(LukasModEntities.LUKAS, -65485, -16777216, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}
