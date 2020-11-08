package com.gboihere.overworldoverhaul.mixins;

import net.minecraft.item.ArmorMaterials;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(ArmorMaterials.class)

public class ArmorMaterialsMixin {

    @ModifyArg(method = "ArmorMaterials", at = @At(value = "INVOKE", target = "net/minecraft/item/ArmorMaterials")) //No idea how to format this.
    private int uwu(int starting_value) {
    return 
    }

}
