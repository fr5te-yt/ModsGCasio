
package net.mcreator.gcasio.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.gcasio.procedures.ArmureencasioEvenementDeTickDuCasqueProcedure;
import net.mcreator.gcasio.init.GcasioModTabs;

public abstract class ArmureencasioItem extends ArmorItem {
	public ArmureencasioItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 39;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{3, 7, 8, 4}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}

			@Override
			public String getName() {
				return "armureencasio";
			}

			@Override
			public float getToughness() {
				return 2f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.2f;
			}
		}, slot, properties);
	}

	public static class Helmet extends ArmureencasioItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(GcasioModTabs.TAB_G_CASIO));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "gcasio:textures/models/armor/armureencasio_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			ArmureencasioEvenementDeTickDuCasqueProcedure.execute(entity);
		}
	}

	public static class Chestplate extends ArmureencasioItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(GcasioModTabs.TAB_G_CASIO));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "gcasio:textures/models/armor/armureencasio_layer_1.png";
		}
	}

	public static class Leggings extends ArmureencasioItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(GcasioModTabs.TAB_G_CASIO));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "gcasio:textures/models/armor/armureencasio_layer_2.png";
		}
	}

	public static class Boots extends ArmureencasioItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(GcasioModTabs.TAB_G_CASIO));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "gcasio:textures/models/armor/armureencasio_layer_1.png";
		}
	}
}
