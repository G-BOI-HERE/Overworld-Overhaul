package com.gboihere.overworldoverhaul.item_materials;

import java.util.function.Supplier;

import com.gboihere.overworldoverhaul.OverworldOverhaul;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;

public enum ModArmorMaterials implements ArmorMaterial {
    STEEL("steel", 9, new int[]{2,6,5,2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F, () ->
            Ingredient.ofItems(OverworldOverhaul.Steel_Ingot)),
    SILVER("silver", 9, new int[]{2,6,5,2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F, 0.0F, () ->
            Ingredient.ofItems(OverworldOverhaul.Silver_Ingot)),
    DIAMOND_STEEL("diamond_steel", 33, new int[]{3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 2.0F, 0.0F, () ->
            Ingredient.ofItems(OverworldOverhaul.Diamond_Steel_Ingot));

    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Lazy<Ingredient> repairIngredientSupplier;

    private ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredientSupplier) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredientSupplier = new Lazy(repairIngredientSupplier);
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
        return (Ingredient)this.repairIngredientSupplier.get();
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
