
package net.mcreator.gcasio.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.gcasio.init.GcasioModTabs;

public class LingotdeCasioItem extends Item {
	public LingotdeCasioItem() {
		super(new Item.Properties().tab(GcasioModTabs.TAB_G_CASIO).stacksTo(64).rarity(Rarity.EPIC));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
