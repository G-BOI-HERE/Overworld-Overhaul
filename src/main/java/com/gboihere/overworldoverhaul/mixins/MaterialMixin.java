package com.gboihere.overworldoverhaul.mixins;

import net.minecraft.block.Material;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Material.class)

public final class MaterialMixin{

    @Mutable
    @Shadow @Final public static Material LEAVES;

// Im so lost
    @Inject(method = "<init>", at = @At(value = "TAIL"))
    private void materialMixin(CallbackInfo ci) {
        System.out.println(Material.LEAVES);
        {

        }
    }
}
