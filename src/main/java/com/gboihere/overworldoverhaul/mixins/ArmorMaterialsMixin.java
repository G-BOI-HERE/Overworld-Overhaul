package com.gboihere.overworldoverhaul.mixins;

import net.minecraft.item.ArmorMaterials;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ArmorMaterials.class)

public class ArmorMaterialsMixin{

    private final String name;
    private int [] protectionAmounts;
    private int durabilityMultiplier;
    private int enchantability;
    private float toughness;

    public ArmorMaterialsMixin(String name){
        this.name = name;
    }

    @Inject(method = "<init>", at = @At(value = "TAIL"))
    private void ArmorMaterials(CallbackInfo ci){
        switch (name) {
            case "diamond":
                protectionAmounts = new int[]{2, 6, 5, 2};
                durabilityMultiplier = 25;
                enchantability = 11;
                toughness = 1.0F;
                break;
            case "gold":
                protectionAmounts = new int[]{2, 6, 5, 2};
                durabilityMultiplier = 15;
                enchantability = 25;
                break;
            case "iron":
                protectionAmounts = new int[]{1, 5, 4, 1};
                durabilityMultiplier = 10;
                enchantability = 6;
                break;
            case "chainmail":
                protectionAmounts = new int[]{1, 4, 5, 2};
                durabilityMultiplier = 10;
                enchantability = 6;
                break;
            case "leather":
                protectionAmounts = new int[]{1, 2, 3, 1};
                durabilityMultiplier = 5;
                enchantability = 3;
                break;
        }
    }

}
