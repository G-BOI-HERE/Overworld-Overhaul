package com.gboihere.overworldoverhaul.mixins;

import net.minecraft.item.ArmorMaterials;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.function.Supplier;

@Mixin(ArmorMaterials.class)

public class ArmorMaterialsMixin{

    @Final @Shadow private String name;
    @Mutable @Shadow private int [] protectionAmounts;
    @Mutable @Shadow private int durabilityMultiplier;
    @Mutable @Shadow private int enchantability;
    @Mutable @Shadow private float toughness;
    @Mutable @Shadow private float knockbackResistance;

    @Inject(method = "<init>", at = @At(value = "TAIL"))
    private void ArmorMaterials(CallbackInfo ci){
        switch (name) {
            case "leather":
                protectionAmounts = new int[]{1, 2, 3, 1};
                durabilityMultiplier = 5;
                enchantability = 3;
                break;
            case "chainmail":
            case "iron":
                protectionAmounts = new int[]{1, 4, 5, 1};
                durabilityMultiplier = 10;
                enchantability = 6;
                break;
            case "gold":
                protectionAmounts = new int[]{2, 5, 6, 2};
                durabilityMultiplier = 15;
                enchantability = 25;
                break;
            case "diamond":
                protectionAmounts = new int[]{2, 5, 6, 2};
                durabilityMultiplier = 25;
                enchantability = 11;
                toughness = 1.0F;
                break;
            case "netherite":
                protectionAmounts = new int[]{3, 6, 8, 3};
                durabilityMultiplier = 37;
                enchantability = 16;
                toughness = 3.0F;
                knockbackResistance = 0.1F;
                break;
        }


        //switch (name) {
        //    case "diamond":
        //        protectionAmounts = new int[]{2, 6, 5, 2};
        //        durabilityMultiplier = 25;
        //        enchantability = 11;
        //        toughness = 1.0F;
        //        break;
        //    case "gold":
        //        protectionAmounts = new int[]{2, 6, 5, 2};
        //        durabilityMultiplier = 15;
        //        enchantability = 25;
        //        break;
        //    case "iron":
        //        protectionAmounts = new int[]{1, 5, 4, 1};
        //        durabilityMultiplier = 10;
        //        enchantability = 6;
        //        break;
        //    case "chainmail":
        //        protectionAmounts = new int[]{1, 4, 5, 2};
        //        durabilityMultiplier = 10;
        //        enchantability = 6;
        //        break;
        //    case "leather":
        //        protectionAmounts = new int[]{1, 2, 3, 1};
        //        durabilityMultiplier = 5;
        //        enchantability = 3;
        //        break;
        //}
    }

}
