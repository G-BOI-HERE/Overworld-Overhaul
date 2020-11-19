package com.gboihere.overworldoverhaul.mixins;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Inject;

@Mixin(LeavesBlock.class)
public class LeafBlockMixin extends Block {
    public LeafBlockMixin(Settings settings) {
        super(settings);
    }

    @Inject(method="onEntityCollision")
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        entity.slowMovement(state, new Vec3d(0.25D, 0.05000000074505806D, 0.25D));
    }
}
