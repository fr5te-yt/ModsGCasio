
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gcasio.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class GcasioModTabs {
	public static CreativeModeTab TAB_G_CASIO;

	public static void load() {
		TAB_G_CASIO = new CreativeModeTab("tabg_casio") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.ZOMBIE_HEAD);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
