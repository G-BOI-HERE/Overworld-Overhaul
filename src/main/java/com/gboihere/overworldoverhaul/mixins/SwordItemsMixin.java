package com.gboihere.overworldoverhaul.mixins;


import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static net.minecraft.item.ToolMaterials.WOOD;


@Mixin(SwordItem.class)

public class SwordItemsMixin {

    @Mutable
    @Final
    @Shadow
    private float attackDamage;

    public SwordItemsMixin(float attackDamage) {
        this.attackDamage = attackDamage;
    }

    @ModifyVariable(method = "<init>", at = @At(value = "HEAD"), ordinal = 3)
    private static int ItemsMixin(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Item.Settings settings) {
        System.out.println(toolMaterial);
        return attackDamage;
    }
}



