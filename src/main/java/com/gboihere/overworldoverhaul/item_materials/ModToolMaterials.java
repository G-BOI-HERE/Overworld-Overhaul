package com.gboihere.overworldoverhaul.item_materials;

import java.util.function.Supplier;

import com.gboihere.overworldoverhaul.OverworldOverhaul;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

public enum ModToolMaterials implements ToolMaterial {
    STEEL(2,250,6.0F,2.0F,10, () ->{
     return Ingredient.ofItems(OverworldOverhaul.Steel_Ingot);
    }),
    SILVER(2,250,8.0F,2.0F,15, () ->{
        return Ingredient.ofItems(OverworldOverhaul.Silver_Ingot);
    }),
    DIAMOND_STEEL(3, 1561, 8.0F, 3.0F, 10, () -> {
        return Ingredient.ofItems(OverworldOverhaul.Diamond_Steel_Ingot);
    });

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    private ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy(repairIngredient);
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
        return (Ingredient)this.repairIngredient.get();
    }
}
