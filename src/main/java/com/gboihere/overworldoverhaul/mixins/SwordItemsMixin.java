package com.gboihere.overworldoverhaul.mixins;


import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.Vanishable;
import org.spongepowered.asm.mixin.Mixin;


@Mixin(SwordItem.class)

public class SwordItemsMixin extends ToolItem implements Vanishable {
    public SwordItemsMixin(ToolMaterial material, Settings settings) {
        super(material, settings);
    }
//
//    @Mutable
//    @Final
//    @Shadow
//    private float attackDamage;
//    @Mutable
//    @Final
//    @Shadow
//    private Multimap<EntityAttribute, EntityAttributeModifier> attributeModifiers;
//
//    public SwordItemsMixin(ToolMaterial material, Settings settings) {
//        super(material, settings);
//    }
//
//
//    @Inject(method = "<init>", at = @At(value = "FIELD"))
//    private void ItemsMixin(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Item.Settings settings, CallbackInfo ci) {
//        this.attackDamage = (float) attackDamage + toolMaterial.getAttackDamage();
//        ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
//        builder.put(EntityAttributes.GENERIC_ATTACK_DAMAGE, new EntityAttributeModifier(ATTACK_DAMAGE_MODIFIER_ID, "Weapon modifier", (double) this.attackDamage, EntityAttributeModifier.Operation.ADDITION));
//        builder.put(EntityAttributes.GENERIC_ATTACK_SPEED, new EntityAttributeModifier(ATTACK_SPEED_MODIFIER_ID, "Weapon modifier", (double) attackSpeed, EntityAttributeModifier.Operation.ADDITION));
//        this.attributeModifiers = builder.build();
//
//        if (toolMaterial.equals(WOOD)) {
//            this.attackDamage = 10;
//            attackSpeed = 0;
//        }
//    }
//
//    public float getAttackDamage() {
//        return this.attackDamage;
//    }
//
//    public boolean canMine(BlockState state, World world, BlockPos pos, PlayerEntity miner) {
//        return !miner.isCreative();
//    }
//
//    public float getMiningSpeedMultiplier(ItemStack stack, BlockState state) {
//        if (state.isOf(Blocks.COBWEB)) {
//            return 15.0F;
//        } else {
//            Material material = state.getMaterial();
//            return material != Material.PLANT && material != Material.REPLACEABLE_PLANT && material != Material.UNUSED_PLANT && !state.isIn(BlockTags.LEAVES) && material != Material.GOURD ? 1.0F : 1.5F;
//        }
//    }
//
//    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
//        stack.damage(1, (LivingEntity) attacker, (Consumer<LivingEntity>) ((e) -> {
//            e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
//        }));
//        return true;
//    }
//
//    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
//        if (state.getHardness(world, pos) != 0.0F) {
//            stack.damage(2, (LivingEntity) miner, (Consumer<LivingEntity>) ((e) -> {
//                e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
//            }));
//        }
//
//        return true;
//    }
//
//    public boolean isEffectiveOn(BlockState state) {
//        return state.isOf(Blocks.COBWEB);
//    }
//
//    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(EquipmentSlot slot) {
//        return slot == EquipmentSlot.MAINHAND ? this.attributeModifiers : super.getAttributeModifiers(slot);
//    }
}



