
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dfhs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.dfhs.item.GgliItem;
import net.mcreator.dfhs.DfhsMod;

public class DfhsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DfhsMod.MODID);
	public static final RegistryObject<Item> GGLI = REGISTRY.register("ggli", () -> new GgliItem());
}
