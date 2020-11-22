package com.gboihere.overworldoverhaul.items.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.List;

public class ModLeavesBlock extends LeavesBlock {
    List<Block> leavesBlocks;

    public ModLeavesBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        // TODO: decide new Box size
        entity.slowMovement(state, new Vec3d(0.25D, 0.05000000074505806D, 0.25D));
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return Block.createCuboidShape(0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
    }

    public static Boolean canSpawnOnLeaves(BlockState state, BlockView world, BlockPos pos, EntityType<?> type) {
        return type == EntityType.OCELOT || type == EntityType.PARROT;
    }

    public static boolean blocksVision(BlockState state, BlockView world, BlockPos pos) {
        return false;
    }

    public static boolean suffocates(BlockState state, BlockView world, BlockPos pos) {
        return false;
    }

}
