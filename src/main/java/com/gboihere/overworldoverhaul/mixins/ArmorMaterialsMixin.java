package com.gboihere.overworldoverhaul.mixins;

import net.minecraft.item.ArmorMaterials;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ArmorMaterials.class)

public class ArmorMaterialsMixin {

    private final String name;
    int [] protectionAmounts;
    int durabilityMultiplier;
    int enchantability;
    float toughness;

    public ArmorMaterialsMixin(String name){
        this.name = name;
    }

    @Inject(method = "<init>", at = @At(value = "TAIL"))
    private void ArmorMaterials(CallbackInfo ci){
        if (name.equals("diamond"))
            protectionAmounts = new int[]{2,6,5,2};
            durabilityMultiplier = 20;
            enchantability = 11;
            toughness = 1.0F;
        if (name.equals("gold"))
            protectionAmounts = new int[] {2,6,5,2};
            durabilityMultiplier = 15;
            enchantability = 25;
            toughness = 0.0F;
        if (name.equals("iron"))
            protectionAmounts = new int[] {1,5,4,1};
            durabilityMultiplier = 10;
            enchantability = 9;
            toughness = 0.0F;
    }

}
