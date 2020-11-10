package com.gboihere.overworldoverhaul.mixins;

import net.minecraft.item.ToolMaterials;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.ModifyArgs;


@Mixin(ToolMaterials.class)

public class ToolMaterialsMixin_2 {


    @ModifyArg(method = "ToolMaterials", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ToolMaterials;DIAMOND(IIFFIJ)")){

    }


}
