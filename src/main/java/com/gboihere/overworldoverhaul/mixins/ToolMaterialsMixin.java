package com.gboihere.overworldoverhaul.mixins;

import net.minecraft.item.ToolMaterials;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;



@Mixin(ToolMaterials.class)

public abstract class ToolMaterialsMixin{

    int miningLevel;
    int itemDurability;
    float miningSpeed;
    float attackDamage;
    int enchantability;


    @Inject(method = "<init>", at = @At(value = "TAIL"))
    private void ToolMaterialsMixin(CallbackInfo ci) {

          if () {
            miningLevel = 1;
            itemDurability = 1;
            miningSpeed = 1;
            attackDamage = -3;
            enchantability = 0;
        }
    }
}
