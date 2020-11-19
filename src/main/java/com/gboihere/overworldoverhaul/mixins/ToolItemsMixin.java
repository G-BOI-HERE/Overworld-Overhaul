package com.gboihere.overworldoverhaul.mixins;

import com.gboihere.overworldoverhaul.item_materials.ModToolMaterials;
import com.gboihere.overworldoverhaul.items.tools.CustomSwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;


@Mixin(Items.class)

public class ToolItemsMixin {

    //    private static Item register(String id, Item item) {
//        return register(String.valueOf(new Identifier(id)), item);
//    }
    @Shadow
    private static Item register(String id, Item item) {
        return null;
    }

    /**
     * @author
     */
    @Inject(method = "register(Ljava/lang/String;Lnet/minecraft/item/Item;)Lnet/minecraft/item/Item;",
            at = @At(value="HEAD"), cancellable = true)
    private static void registerMixin(String id, Item item, CallbackInfoReturnable<Item> cir) {
        //Swords
        if (id.equals("wooden_sword")) {
            cir.setReturnValue(
                    register(String.valueOf(new Identifier(id)), new CustomSwordItem(ModToolMaterials.WOOD,
                            10, -0.0F, (new Item.Settings()).group(ItemGroup.COMBAT))));
        }


        //            case "stone_sword":
//                cir.setReturnValue(new CustomSwordItem(ModToolMaterials.GOLD, 0, -2.4F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            case "iron_sword":
//                cir.setReturnValue(new CustomSwordItem(ModToolMaterials.GOLD, 0, -2.4F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            case "golden_sword":
//                cir.setReturnValue(new CustomSwordItem(ModToolMaterials.GOLD, 0, -2.4F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            case "diamond_sword":
//                cir.setReturnValue(new CustomSwordItem(ModToolMaterials.DIAMOND, 0, -2.4F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            case "netherite_sword":
//                cir.setReturnValue(new CustomSwordItem(ModToolMaterials.NETHERITE, 0, -2.4F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            //Axes
//            case "wooden_axe":
//                cir.setReturnValue(new CustomAxeItem(ModToolMaterials.WOOD, 3, -3.2F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            case "stone_axe":
//                cir.setReturnValue(new CustomAxeItem(ModToolMaterials.STONE, 3, -3.2F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            case "iron_axe":
//                cir.setReturnValue(new CustomAxeItem(ModToolMaterials.IRON, 3, -3.2F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            case "golden_axe":
//                cir.setReturnValue(new CustomAxeItem(ModToolMaterials.GOLD, 3, -3.0F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            case "diamond_axe":
//                cir.setReturnValue(new CustomAxeItem(ModToolMaterials.DIAMOND, 3, -3.1F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            case "netherite_axe":
//                cir.setReturnValue(new CustomAxeItem(ModToolMaterials.NETHERITE, 3, -3.0F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            //Pickaxes
//            case "wooden_pickaxe":
//                cir.setReturnValue(new CustomPickaxeItem(ModToolMaterials.WOOD, 3, -2.8F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            case "stone_pickaxe":
//                cir.setReturnValue(new CustomPickaxeItem(ModToolMaterials.STONE, 3, -2.8F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            case "iron_pickaxe":
//                cir.setReturnValue(new CustomPickaxeItem(ModToolMaterials.IRON, 3, -2.8F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            case "golden_pickaxe":
//                cir.setReturnValue(new CustomPickaxeItem(ModToolMaterials.GOLD, 3, -2.8F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            case "diamond_pickaxe":
//                cir.setReturnValue(new CustomPickaxeItem(ModToolMaterials.DIAMOND, 3, -2.8F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            case "netherite_pickaxe":
//                cir.setReturnValue(new CustomPickaxeItem(ModToolMaterials.NETHERITE, 3, -2.8F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            //Shovels
//            case "wooden_shovel":
//                cir.setReturnValue(new CustomShovelItem(ModToolMaterials.WOOD, 3, -3.0F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            case "stone_shovel":
//                cir.setReturnValue(new CustomShovelItem(ModToolMaterials.STONE, 3, -3.0F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            case "iron_shovel":
//                cir.setReturnValue(new CustomShovelItem(ModToolMaterials.IRON, 3, -3.0F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            case "golden_shovel":
//                cir.setReturnValue(new CustomShovelItem(ModToolMaterials.GOLD, 3, -3.0F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            case "diamond_shovel":
//                cir.setReturnValue(new CustomShovelItem(ModToolMaterials.DIAMOND, 3, -3.0F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            case "netherite_shovel":
//                cir.setReturnValue(new CustomShovelItem(ModToolMaterials.NETHERITE, 3, -3.0F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            //Hoes
//            case "wooden_hoe":
//                cir.setReturnValue(new CustomHoeItem(ModToolMaterials.WOOD, 3, -3.0F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            case "stone_hoe":
//                cir.setReturnValue(new CustomHoeItem(ModToolMaterials.STONE, 3, -3.0F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            case "iron_hoe":
//                cir.setReturnValue(new CustomHoeItem(ModToolMaterials.IRON, 3, -3.0F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            case "golden_hoe":
//                cir.setReturnValue(new CustomHoeItem(ModToolMaterials.GOLD, 3, -2.0F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            case "diamond_hoe":
//                cir.setReturnValue(new CustomHoeItem(ModToolMaterials.DIAMOND, 3, -2.0F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            case "netherite_hoe":
//                cir.setReturnValue(new CustomHoeItem(ModToolMaterials.NETHERITE, 3, -0.0F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//        }
//    @Inject(method = "register(Ljava/lang/String;Lnet/minecraft/item/Item;)Lnet/minecraft/item/Item;",at = @At(value = "FIELD"))
//    private static void ItemsMixin(String id, Item item, CallbackInfoReturnable<Item> cir){
//        if (id.equals("wooden_sword")){
//            System.out.println(cir.getReturnValue());
//
//        }
//
//    }


        //Swords
//        switch () {
//            case "wooden_sword":
//                cir.setReturnValue(new CustomSwordItem(ModToolMaterials.GOLD, 0, -2.4F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            case "stone_sword":
//                cir.setReturnValue(new CustomSwordItem(ModToolMaterials.GOLD, 0, -2.4F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            case "iron_sword":
//                cir.setReturnValue(new CustomSwordItem(ModToolMaterials.GOLD, 0, -2.4F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            case "golden_sword":
//                cir.setReturnValue(new CustomSwordItem(ModToolMaterials.GOLD, 0, -2.4F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            case "diamond_sword":
//                cir.setReturnValue(new CustomSwordItem(ModToolMaterials.DIAMOND, 0, -2.4F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            case "netherite_sword":
//                cir.setReturnValue(new CustomSwordItem(ModToolMaterials.NETHERITE, 0, -2.4F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            //Axes
//            case "wooden_axe":
//                cir.setReturnValue(new CustomAxeItem(ModToolMaterials.WOOD, 3, -3.2F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            case "stone_axe":
//                cir.setReturnValue(new CustomAxeItem(ModToolMaterials.STONE, 3, -3.2F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            case "iron_axe":
//                cir.setReturnValue(new CustomAxeItem(ModToolMaterials.IRON, 3, -3.2F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            case "golden_axe":
//                cir.setReturnValue(new CustomAxeItem(ModToolMaterials.GOLD, 3, -3.0F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            case "diamond_axe":
//                cir.setReturnValue(new CustomAxeItem(ModToolMaterials.DIAMOND, 3, -3.1F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            case "netherite_axe":
//                cir.setReturnValue(new CustomAxeItem(ModToolMaterials.NETHERITE, 3, -3.0F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            //Pickaxes
//            case "wooden_pickaxe":
//                cir.setReturnValue(new CustomPickaxeItem(ModToolMaterials.WOOD, 3, -2.8F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            case "stone_pickaxe":
//                cir.setReturnValue(new CustomPickaxeItem(ModToolMaterials.STONE, 3, -2.8F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            case "iron_pickaxe":
//                cir.setReturnValue(new CustomPickaxeItem(ModToolMaterials.IRON, 3, -2.8F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            case "golden_pickaxe":
//                cir.setReturnValue(new CustomPickaxeItem(ModToolMaterials.GOLD, 3, -2.8F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            case "diamond_pickaxe":
//                cir.setReturnValue(new CustomPickaxeItem(ModToolMaterials.DIAMOND, 3, -2.8F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            case "netherite_pickaxe":
//                cir.setReturnValue(new CustomPickaxeItem(ModToolMaterials.NETHERITE, 3, -2.8F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            //Shovels
//            case "wooden_shovel":
//                cir.setReturnValue(new CustomShovelItem(ModToolMaterials.WOOD, 3, -3.0F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            case "stone_shovel":
//                cir.setReturnValue(new CustomShovelItem(ModToolMaterials.STONE, 3, -3.0F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            case "iron_shovel":
//                cir.setReturnValue(new CustomShovelItem(ModToolMaterials.IRON, 3, -3.0F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            case "golden_shovel":
//                cir.setReturnValue(new CustomShovelItem(ModToolMaterials.GOLD, 3, -3.0F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            case "diamond_shovel":
//                cir.setReturnValue(new CustomShovelItem(ModToolMaterials.DIAMOND, 3, -3.0F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            case "netherite_shovel":
//                cir.setReturnValue(new CustomShovelItem(ModToolMaterials.NETHERITE, 3, -3.0F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            //Hoes
//            case "wooden_hoe":
//                cir.setReturnValue(new CustomHoeItem(ModToolMaterials.WOOD, 3, -3.0F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            case "stone_hoe":
//                cir.setReturnValue(new CustomHoeItem(ModToolMaterials.STONE, 3, -3.0F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            case "iron_hoe":
//                cir.setReturnValue(new CustomHoeItem(ModToolMaterials.IRON, 3, -3.0F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            case "golden_hoe":
//                cir.setReturnValue(new CustomHoeItem(ModToolMaterials.GOLD, 3, -2.0F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            case "diamond_hoe":
//                cir.setReturnValue(new CustomHoeItem(ModToolMaterials.DIAMOND, 3, -2.0F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//            case "netherite_hoe":
//                cir.setReturnValue(new CustomHoeItem(ModToolMaterials.NETHERITE, 3, -0.0F, (new Item.Settings()).group(ItemGroup.COMBAT)));
//                break;
//        }
    }
}

