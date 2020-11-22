package com.gboihere.overworldoverhaul.mixins;

import com.gboihere.overworldoverhaul.item_materials.ModArmorMaterials;
import com.gboihere.overworldoverhaul.item_materials.ModToolMaterials;
import com.gboihere.overworldoverhaul.items.tools.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;


@Mixin(Items.class)
public class ItemsMixin {

    @Shadow
    private static Item register(String id, Item item) {
        return null;
    }

    @Inject(method = "register(Ljava/lang/String;Lnet/minecraft/item/Item;)Lnet/minecraft/item/Item;",
            at = @At(value="HEAD"), cancellable = true)
    private static void registerMixin1(String id, Item item, CallbackInfoReturnable<Item> cir) {
        //Swords
        switch (id) {
            case "wooden_sword":
                cir.setReturnValue(register(String.valueOf(
                    new Identifier(id)), new CustomSwordItem(ModToolMaterials.WOOD, 3, -2.4F, (new Item.Settings()).group(ItemGroup.COMBAT))));
                break;
            case "stone_sword":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new CustomSwordItem(ModToolMaterials.STONE, 3, -2.4F, (new Item.Settings()).group(ItemGroup.COMBAT))));
                break;
            case "iron_sword":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new CustomSwordItem(ModToolMaterials.IRON, 3, -2.4F, (new Item.Settings()).group(ItemGroup.COMBAT))));
                break;
            case "golden_sword":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new CustomSwordItem(ModToolMaterials.GOLD, 3, -2.4F, (new Item.Settings()).group(ItemGroup.COMBAT))));
                break;
            case "diamond_sword":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new CustomSwordItem(ModToolMaterials.DIAMOND, 3, -2.4F, (new Item.Settings()).group(ItemGroup.COMBAT))));
                break;
            case "netherite_sword":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new CustomSwordItem(ModToolMaterials.NETHERITE, 3, -2.4F, (new Item.Settings()).group(ItemGroup.COMBAT))));
                break;
            //Axes
            case "wooden_axe":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new CustomAxeItem(ModToolMaterials.WOOD, 6, -3.2F, (new Item.Settings()).group(ItemGroup.TOOLS))));
                break;
            case "stone_axe":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new CustomAxeItem(ModToolMaterials.STONE, 7, -3.2F, (new Item.Settings()).group(ItemGroup.TOOLS))));
                break;
            case "iron_axe":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new CustomAxeItem(ModToolMaterials.IRON, 7, -3.2F, (new Item.Settings()).group(ItemGroup.TOOLS))));
                break;
            case "golden_axe":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new CustomAxeItem(ModToolMaterials.GOLD, 6, -3.1F, (new Item.Settings()).group(ItemGroup.TOOLS))));
                break;
            case "diamond_axe":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new CustomAxeItem(ModToolMaterials.DIAMOND, 6, -3.1F, (new Item.Settings()).group(ItemGroup.TOOLS))));
                break;
            case "netherite_axe":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new CustomAxeItem(ModToolMaterials.NETHERITE, 5, -3.0F, (new Item.Settings()).group(ItemGroup.TOOLS))));
                break;
            //Pickaxes
            case "wooden_pickaxe":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new CustomPickaxeItem(ModToolMaterials.WOOD, 1, -2.8F, (new Item.Settings()).group(ItemGroup.TOOLS))));
                break;
            case "stone_pickaxe":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new CustomPickaxeItem(ModToolMaterials.STONE, 1, -2.8F, (new Item.Settings()).group(ItemGroup.TOOLS))));
                break;
            case "iron_pickaxe":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new CustomPickaxeItem(ModToolMaterials.IRON, 1, -2.8F, (new Item.Settings()).group(ItemGroup.TOOLS))));
                break;
            case "golden_pickaxe":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new CustomPickaxeItem(ModToolMaterials.GOLD, 1, -2.8F, (new Item.Settings()).group(ItemGroup.TOOLS))));
                break;
            case "diamond_pickaxe":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new CustomPickaxeItem(ModToolMaterials.DIAMOND, 1, -2.8F, (new Item.Settings()).group(ItemGroup.TOOLS))));
                break;
            case "netherite_pickaxe":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new CustomPickaxeItem(ModToolMaterials.NETHERITE, 1, -2.8F, (new Item.Settings()).group(ItemGroup.TOOLS))));
                break;
            //Shovels
            case "wooden_shovel":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new CustomShovelItem(ModToolMaterials.WOOD, 1.5F, -3.0F, (new Item.Settings()).group(ItemGroup.TOOLS))));
                break;
            case "stone_shovel":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new CustomShovelItem(ModToolMaterials.STONE, 1.5F, -3.0F, (new Item.Settings()).group(ItemGroup.TOOLS))));
                break;
            case "iron_shovel":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new CustomShovelItem(ModToolMaterials.IRON, 1.5F, -3.0F, (new Item.Settings()).group(ItemGroup.TOOLS))));
                break;
            case "golden_shovel":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new CustomShovelItem(ModToolMaterials.GOLD, 1.5F, -3.0F, (new Item.Settings()).group(ItemGroup.TOOLS))));
                break;
            case "diamond_shovel":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new CustomShovelItem(ModToolMaterials.DIAMOND, 1.5F, -3.0F, (new Item.Settings()).group(ItemGroup.TOOLS))));
                break;
            case "netherite_shovel":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new CustomShovelItem(ModToolMaterials.NETHERITE, 1.5F, -3.0F, (new Item.Settings()).group(ItemGroup.TOOLS))));
                break;
            //Hoes
            case "wooden_hoe":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new CustomHoeItem(ModToolMaterials.WOOD, -1, -3.0F, (new Item.Settings()).group(ItemGroup.TOOLS))));
                break;
            case "stone_hoe":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new CustomHoeItem(ModToolMaterials.STONE, -1, -3.0F, (new Item.Settings()).group(ItemGroup.TOOLS))));
                break;
            case "iron_hoe":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new CustomHoeItem(ModToolMaterials.IRON, -1, -2.0F, (new Item.Settings()).group(ItemGroup.TOOLS))));
                break;
            case "golden_hoe":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new CustomHoeItem(ModToolMaterials.GOLD, -2, -2.0F, (new Item.Settings()).group(ItemGroup.TOOLS))));
                break;
            case "diamond_hoe":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new CustomHoeItem(ModToolMaterials.DIAMOND, -2, -2.0F, (new Item.Settings()).group(ItemGroup.TOOLS))));
                break;
            case "netherite_hoe":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new CustomHoeItem(ModToolMaterials.NETHERITE, -5, -0.0F, (new Item.Settings()).group(ItemGroup.TOOLS))));
                break;
            //Helmet
            case "leather_helmet":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new DyeableArmorItem(ModArmorMaterials.LEATHER, EquipmentSlot.HEAD, (new Item.Settings()).group(ItemGroup.COMBAT))));
                break;
            case "chainmail_helmet":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new ArmorItem(ModArmorMaterials.CHAIN, EquipmentSlot.HEAD, (new Item.Settings()).group(ItemGroup.COMBAT))));
                break;
            case "iron_helmet":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new ArmorItem(ModArmorMaterials.IRON, EquipmentSlot.HEAD, (new Item.Settings()).group(ItemGroup.COMBAT))));
                break;
            case "golden_helmet":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new ArmorItem(ModArmorMaterials.GOLD, EquipmentSlot.HEAD, (new Item.Settings()).group(ItemGroup.COMBAT))));
                break;
            case "diamond_helmet":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new ArmorItem(ModArmorMaterials.DIAMOND, EquipmentSlot.HEAD, (new Item.Settings()).group(ItemGroup.COMBAT))));
                break;
            case "netherite_helmet":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new ArmorItem(ModArmorMaterials.NETHERITE, EquipmentSlot.HEAD, (new Item.Settings()).group(ItemGroup.COMBAT))));
                break;
            //Chestplate
            case "leather_chestplate":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new DyeableArmorItem(ModArmorMaterials.LEATHER, EquipmentSlot.CHEST, (new Item.Settings()).group(ItemGroup.COMBAT))));
                break;
            case "chainmail_chestplate":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new ArmorItem(ModArmorMaterials.CHAIN, EquipmentSlot.CHEST, (new Item.Settings()).group(ItemGroup.COMBAT))));
                break;
            case "iron_chestplate":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new ArmorItem(ModArmorMaterials.IRON, EquipmentSlot.CHEST, (new Item.Settings()).group(ItemGroup.COMBAT))));
                break;
            case "golden_chestplate":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new ArmorItem(ModArmorMaterials.GOLD, EquipmentSlot.CHEST, (new Item.Settings()).group(ItemGroup.COMBAT))));
                break;
            case "diamond_chestplate":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new ArmorItem(ModArmorMaterials.DIAMOND, EquipmentSlot.CHEST, (new Item.Settings()).group(ItemGroup.COMBAT))));
                break;
            case "netherite_chestplate":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new ArmorItem(ModArmorMaterials.NETHERITE, EquipmentSlot.CHEST, (new Item.Settings()).group(ItemGroup.COMBAT))));
                break;
            //Leggings
            case "leather_leggings":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new DyeableArmorItem(ModArmorMaterials.LEATHER, EquipmentSlot.LEGS, (new Item.Settings()).group(ItemGroup.COMBAT))));
                break;
            case "chainmail_leggings":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new ArmorItem(ModArmorMaterials.CHAIN, EquipmentSlot.LEGS, (new Item.Settings()).group(ItemGroup.COMBAT))));
                break;
            case "iron_leggings":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new ArmorItem(ModArmorMaterials.IRON, EquipmentSlot.LEGS, (new Item.Settings()).group(ItemGroup.COMBAT))));
                break;
            case "golden_leggings":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new ArmorItem(ModArmorMaterials.GOLD, EquipmentSlot.LEGS, (new Item.Settings()).group(ItemGroup.COMBAT))));
                break;
            case "diamond_leggings":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new ArmorItem(ModArmorMaterials.DIAMOND, EquipmentSlot.LEGS, (new Item.Settings()).group(ItemGroup.COMBAT))));
                break;
            case "netherite_leggings":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new ArmorItem(ModArmorMaterials.NETHERITE, EquipmentSlot.LEGS, (new Item.Settings()).group(ItemGroup.COMBAT))));
                break;
            //Boots
            case "leather_boots":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new DyeableArmorItem(ModArmorMaterials.LEATHER, EquipmentSlot.FEET, (new Item.Settings()).group(ItemGroup.COMBAT))));
                break;
            case "chainmail_boots":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new ArmorItem(ModArmorMaterials.CHAIN, EquipmentSlot.FEET, (new Item.Settings()).group(ItemGroup.COMBAT))));
                break;
            case "iron_boots":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new ArmorItem(ModArmorMaterials.IRON, EquipmentSlot.FEET, (new Item.Settings()).group(ItemGroup.COMBAT))));
                break;
            case "golden_boots":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new ArmorItem(ModArmorMaterials.GOLD, EquipmentSlot.FEET, (new Item.Settings()).group(ItemGroup.COMBAT))));
                break;
            case "diamond_boots":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new ArmorItem(ModArmorMaterials.DIAMOND, EquipmentSlot.FEET, (new Item.Settings()).group(ItemGroup.COMBAT))));
                break;
            case "netherite_boots":
                cir.setReturnValue(register(String.valueOf(
                        new Identifier(id)), new ArmorItem(ModArmorMaterials.NETHERITE, EquipmentSlot.FEET, (new Item.Settings()).group(ItemGroup.COMBAT))));
                break;
        }
    }
}

