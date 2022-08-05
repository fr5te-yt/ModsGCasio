
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gcasio.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.gcasio.block.MineraisdeCasioBlock;
import net.mcreator.gcasio.block.CaveBlockBlock;
import net.mcreator.gcasio.GcasioMod;

public class GcasioModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, GcasioMod.MODID);
	public static final RegistryObject<Block> MINERAISDE_CASIO = REGISTRY.register("mineraisde_casio", () -> new MineraisdeCasioBlock());
	public static final RegistryObject<Block> CAVE_BLOCK = REGISTRY.register("cave_block", () -> new CaveBlockBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			CaveBlockBlock.registerRenderLayer();
		}
	}
}
