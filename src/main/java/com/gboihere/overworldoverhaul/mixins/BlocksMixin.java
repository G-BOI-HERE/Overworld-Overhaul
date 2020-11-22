package com.gboihere.overworldoverhaul.mixins;

import com.gboihere.overworldoverhaul.items.blocks.ModLeavesBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Blocks.class)
public class BlocksMixin {
    @Inject(method= "createLeavesBlock()Lnet/minecraft/block/LeavesBlock;", at=@At(value = "HEAD"), cancellable = true)
    private static void createLeavesBlockMixin(CallbackInfoReturnable<LeavesBlock> cir) {
        cir.setReturnValue(
                new ModLeavesBlock(
                AbstractBlock.Settings
                        .of(Material.LEAVES)
                        .strength(0.2F)
                        .ticksRandomly()
                        .sounds(BlockSoundGroup.GRASS)
                        .nonOpaque()
                        .allowsSpawning(ModLeavesBlock::canSpawnOnLeaves)
                        .suffocates(ModLeavesBlock::suffocates)
                        .blockVision(ModLeavesBlock::blocksVision))
        );
    }
}