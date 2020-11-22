package com.gboihere.overworldoverhaul.item_materials;

import com.gboihere.overworldoverhaul.OverworldOverhaul;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    LEATHER("leather", 5, new int[]{1, 2, 3, 1}, 3, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(Items.LEATHER);
    }),
    CHAIN("chainmail", 15, new int[]{1, 4, 5, 1}, 12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(Items.IRON_INGOT);
    }),
    IRON("iron", 15, new int[]{1, 4, 5, 1}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(Items.IRON_INGOT);
    }),
    STEEL("steel", 15, new int[]{2, 6, 5, 2}, 11, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F, () ->
            Ingredient.ofItems(OverworldOverhaul.Steel_Ingot)
    ),
    SILVER("silver", 15, new int[]{2, 6, 5, 2}, 18, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F, 0.0F, () ->
        Ingredient.ofItems(OverworldOverhaul.Silver_Ingot)
    ),
    GOLD("gold", 15, new int[]{2, 5, 6, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(Items.GOLD_INGOT);
    }),
    DIAMOND("diamond", 25, new int[]{2, 5, 6, 2}, 11, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F, 0.0F, () -> {
        return Ingredient.ofItems(Items.DIAMOND);
    }),
    DIAMOND_STEEL("diamond_steel", 33, new int[]{3, 8, 6, 3}, 12, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 2.0F, 0.0F, () ->
             Ingredient.ofItems(OverworldOverhaul.Diamond_Steel_Ingot)
    ),
    ADAMANT("adamantine", 37, new int[]{3, 8, 6, 3}, 14, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.0F, 0.0F, () ->
             Ingredient.ofItems(OverworldOverhaul.Diamond_Steel_Ingot)
    ),
    NETHERITE("netherite", 53, new int[]{3, 6, 8, 3}, 16, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> {
        return Ingredient.ofItems(Items.NETHERITE_INGOT);
    });

    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Lazy<Ingredient> repairIngredientSupplier;

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredientSupplier) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredientSupplier = new Lazy<>(repairIngredientSupplier);
    }

    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * this.durabilityMultiplier;
    }

    public int getProtectionAmount(EquipmentSlot slot) {
        return this.protectionAmounts[slot.getEntitySlotId()];
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredientSupplier.get();
    }

    @Environment(EnvType.CLIENT)
    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
