
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gcasio.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.gcasio.block.MineraisdeCasioBlock;
import net.mcreator.gcasio.GcasioMod;

public class GcasioModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, GcasioMod.MODID);
	public static final RegistryObject<Block> MINERAISDE_CASIO = REGISTRY.register("mineraisde_casio", () -> new MineraisdeCasioBlock());
}
