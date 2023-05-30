
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lukas.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.lukas.world.features.LukashouseFeature;
import net.mcreator.lukas.LukasMod;

@Mod.EventBusSubscriber
public class LukasModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, LukasMod.MODID);
	public static final RegistryObject<Feature<?>> LUKASHOUSE = REGISTRY.register("lukashouse", LukashouseFeature::feature);
}
