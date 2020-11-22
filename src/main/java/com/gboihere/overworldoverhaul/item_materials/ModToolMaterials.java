package com.gboihere.overworldoverhaul.item_materials;

import com.gboihere.overworldoverhaul.OverworldOverhaul;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.tag.ItemTags;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    WOOD(0, 64, 2.0F, 0.0F, 1, () -> {
        return Ingredient.fromTag(ItemTags.PLANKS);
    }),
    STONE(1, 124, 4.0F, 1.0F, 3, () -> {
        return Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS);
    }),
    IRON(1, 250, 5.0F, 1.0F, 6, () -> {
        return Ingredient.ofItems(Items.IRON_INGOT);
    }),
    STEEL(2,325,7.0F,2.0F,11, () ->{
     return Ingredient.ofItems(OverworldOverhaul.Steel_Ingot);
    }),
    SILVER(2,325,8.0F,2.0F,18, () ->{
        return Ingredient.ofItems(OverworldOverhaul.Silver_Ingot);
    }),
    GOLD(2, 325, 10.0F, 2.0F, 25, () -> {
        return Ingredient.ofItems(Items.GOLD_INGOT);
    }),
    DIAMOND(2, 575, 8.0F, 2.0F, 11, () -> {
        return Ingredient.ofItems(Items.DIAMOND);
    }),
    DIAMOND_STEEL(3, 1560, 8.0F, 3.0F, 14, () -> {
        return Ingredient.ofItems(OverworldOverhaul.Diamond_Steel_Ingot);
    }),
    ADAMANT(4,2031,9.0F,4.0F,15,() -> {
        return Ingredient.ofItems(OverworldOverhaul.Diamond_Steel_Ingot);
    }),
    NETHERITE(5, 3664, 10.0F, 5.0F, 16, () -> {
        return Ingredient.ofItems(Items.NETHERITE_INGOT);
    });

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy<>(repairIngredient);
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
