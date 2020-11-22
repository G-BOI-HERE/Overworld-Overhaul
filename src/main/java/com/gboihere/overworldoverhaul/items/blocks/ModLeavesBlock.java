package com.gboihere.overworldoverhaul.items.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.Waterloggable;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ModLeavesBlock extends LeavesBlock implements Waterloggable {

//    private static final VoxelShape NORMAL_OUTLINE_SHAPE;
//    private static final VoxelShape COLLISION_SHAPE = Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D);
//    private static final VoxelShape OUTLINE_SHAPE = VoxelShapes.fullCube().offset(0.0D, -1.0D, 0.0D);
//    public static BooleanProperty BOTTOM;

    public ModLeavesBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        // TODO: decide new Box size
        entity.slowMovement(state, new Vec3d(0.999D, 1.999999999D, 0.999D));
    }



    public static Boolean canSpawnOnLeaves(EntityType<?> type) {
        return type == EntityType.OCELOT || type == EntityType.PARROT;
    }

    //Tried making leaves work similiar to scaffolding.
//    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
//        if (context.isAbove(VoxelShapes.fullCube(), pos, true) && !context.isDescending()) {
//            return NORMAL_OUTLINE_SHAPE;
//        } else {
//            return (Integer)state.get(DISTANCE) != 0 && (Boolean)state.get(BOTTOM) && context.isAbove(OUTLINE_SHAPE, pos, true) ? COLLISION_SHAPE : VoxelShapes.empty();
//        }
//    }
//
//    static {
//        VoxelShape voxelShape = Block.createCuboidShape(0.0D, 14.0D, 0.0D, 16.0D, 16.0D, 16.0D);
//        VoxelShape voxelShape2 = Block.createCuboidShape(0.0D, 0.0D, 0.0D, 2.0D, 16.0D, 2.0D);
//        VoxelShape voxelShape3 = Block.createCuboidShape(14.0D, 0.0D, 0.0D, 16.0D, 16.0D, 2.0D);
//        VoxelShape voxelShape4 = Block.createCuboidShape(0.0D, 0.0D, 14.0D, 2.0D, 16.0D, 16.0D);
//        VoxelShape voxelShape5 = Block.createCuboidShape(14.0D, 0.0D, 14.0D, 16.0D, 16.0D, 16.0D);
//        NORMAL_OUTLINE_SHAPE = VoxelShapes.union(voxelShape, voxelShape2, voxelShape3, voxelShape4, voxelShape5);
//    }

    public static boolean blocksVision() {
        return false;
    }

    public static boolean suffocates() {
        return false;
    }

}
