
package net.mcreator.gcasio.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;

import net.mcreator.gcasio.init.GcasioModTabs;

public class EpeeCasioItem extends SwordItem {
	public EpeeCasioItem() {
		super(new Tier() {
			public int getUses() {
				return 1100;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 7f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 16;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, -3.3f, new Item.Properties().tab(GcasioModTabs.TAB_G_CASIO));
	}
}
