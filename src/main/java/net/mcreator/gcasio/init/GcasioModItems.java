
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gcasio.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.gcasio.item.LingotdeCasioItem;
import net.mcreator.gcasio.item.HammerenCasioItem;
import net.mcreator.gcasio.item.EpeeCasioItem;
import net.mcreator.gcasio.item.ArmureencasioItem;
import net.mcreator.gcasio.GcasioMod;

public class GcasioModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, GcasioMod.MODID);
	public static final RegistryObject<Item> MINERAISDE_CASIO = block(GcasioModBlocks.MINERAISDE_CASIO, GcasioModTabs.TAB_G_CASIO);
	public static final RegistryObject<Item> LINGOTDE_CASIO = REGISTRY.register("lingotde_casio", () -> new LingotdeCasioItem());
	public static final RegistryObject<Item> EPEE_CASIO = REGISTRY.register("epee_casio", () -> new EpeeCasioItem());
	public static final RegistryObject<Item> HAMMEREN_CASIO = REGISTRY.register("hammeren_casio", () -> new HammerenCasioItem());
	public static final RegistryObject<Item> ARMUREENCASIO_HELMET = REGISTRY.register("armureencasio_helmet", () -> new ArmureencasioItem.Helmet());
	public static final RegistryObject<Item> ARMUREENCASIO_CHESTPLATE = REGISTRY.register("armureencasio_chestplate",
			() -> new ArmureencasioItem.Chestplate());
	public static final RegistryObject<Item> ARMUREENCASIO_LEGGINGS = REGISTRY.register("armureencasio_leggings",
			() -> new ArmureencasioItem.Leggings());
	public static final RegistryObject<Item> ARMUREENCASIO_BOOTS = REGISTRY.register("armureencasio_boots", () -> new ArmureencasioItem.Boots());
	public static final RegistryObject<Item> CAVE_BLOCK = block(GcasioModBlocks.CAVE_BLOCK, GcasioModTabs.TAB_G_CASIO);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
