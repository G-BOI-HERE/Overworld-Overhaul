package com.gboihere.overworldoverhaul.mixins;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterials;
import net.minecraft.recipe.Ingredient;
import net.minecraft.tag.ItemTags;
import net.minecraft.util.Lazy;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ToolMaterials.class)

public class ToolMaterialsMixin{

    @Shadow @Final public static ToolMaterials WOOD;
    @Shadow @Final public static ToolMaterials STONE;
    @Shadow @Final public static ToolMaterials IRON;
    @Shadow @Final public static ToolMaterials DIAMOND;
    @Shadow @Final public static ToolMaterials GOLD;
    @Shadow @Final public static ToolMaterials NETHERITE;
    private String enumName;
    private int ordinal;
    private int miningLevel;
    private int itemDurability;
    private float miningSpeed;
    private float attackDamage;
    private int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    public ToolMaterialsMixin(Lazy<Ingredient> repairIngredient) {
        this.repairIngredient = repairIngredient;
    }

    @Inject(method = "<init>", at = @At(value = "TAIL"))
    private void ToolMaterialsMixin(CallbackInfo ci){
        if (enumName.equals("WOOD")&&repairIngredient.equals(ItemTags.PLANKS)){
            miningLevel= 0;
            itemDurability= 59;
            miningSpeed= 2.0F;
            attackDamage= 0.0F;
            enchantability= 1;
        }
        else if (enumName.equals("STONE")&&repairIngredient.equals(ItemTags.STONE_TOOL_MATERIALS)){
            miningLevel= 2;
            itemDurability= 550;
            miningSpeed= 8.0F;
            attackDamage= 2.0F;
            enchantability= 11;
        } else if (enumName.equals("IRON")&&repairIngredient.equals(Items.IRON_INGOT)){
            miningLevel= 2;
            itemDurability= 550;
            miningSpeed= 8.0F;
            attackDamage= 2.0F;
            enchantability= 11;
        }
        else if (enumName.equals("DIAMOND")&&repairIngredient.equals(Items.DIAMOND)){
            miningLevel= 2;
            itemDurability= 550;
            miningSpeed= 8.0F;
            attackDamage= 2.0F;
            enchantability= 11;
        } else if (enumName.equals("GOLD")&&repairIngredient.equals(Items.GOLD_INGOT)){
            miningLevel= 2;
            itemDurability= 550;
            miningSpeed= 8.0F;
            attackDamage= 2.0F;
            enchantability= 11;
        } else if (enumName.equals("NETHERITE")&&repairIngredient.equals(Items.NETHERITE_INGOT)){
            miningLevel= 2;
            itemDurability= 550;
            miningSpeed= 8.0F;
            attackDamage= 2.0F;
            enchantability= 11;
        }
        //This doesn't work quite right, all ordinals in main ToolMaterials might return as 0??? ^Thought of using enumName but keeps crashing

       // if (ordinal == 0){//Wood
       //     miningLevel= 0;
       //     itemDurability= 59;
       //     miningSpeed= 2.0F;
       //     attackDamage= 0.0F;
       //     enchantability= 1;
       // }
       // else if (ordinal == 1){//Stone
       //     miningLevel= 1;
       //     itemDurability= 131;
       //     miningSpeed= 4.0F;
       //     attackDamage= 1.0F;
       //     enchantability= 3;
       // } else if (ordinal == 2){//Iron
       //     miningLevel= 2;
       //     itemDurability= 172;
       //     miningSpeed= 5.0F;
       //     attackDamage= 1.0F;
       //     enchantability= 6;
       // }
       // else if (ordinal == 3){//Diamond
       //     miningLevel= 2;
       //     itemDurability= 550;
       //     miningSpeed= 8.0F;
       //     attackDamage= 2.0F;
       //     enchantability= 11;
       // } else if (ordinal == 4){//Gold
       //     miningLevel= 2;
       //     itemDurability= 250;
       //     miningSpeed= 10.0F;
       //     attackDamage= 2.0F;
       //     enchantability= 25;
       // } else if (ordinal == 5){//Netherite
       //     miningLevel= 4;
       //     itemDurability= 2031;
       //     miningSpeed= 9.0F;
       //     attackDamage= 4.0F;
       //     enchantability= 16;
       // }
   }
}

