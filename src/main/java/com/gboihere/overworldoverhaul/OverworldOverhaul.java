package com.gboihere.overworldoverhaul;

import com.gboihere.overworldoverhaul.items.tools.*;
import com.gboihere.overworldoverhaul.item_materials.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class OverworldOverhaul implements ModInitializer {

    public static final String MOD_ID = "overworldoverhaul";

    //Misc
    public static Item Ruby = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
    public static Item Sapphire = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
    public static Item Silver_Ingot = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
    public static Item Steel_Ingot = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
    public static Item Diamond_Steel_Ingot = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
    public static Item Adamantite_Chunk = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
    public static Item Adamantine_Ingot = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
    //Blocks
    public static Block Ruby_Ore = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().breakByHand(false).sounds(BlockSoundGroup.STONE));
    public static Block Block_of_Ruby = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0F, 6.0F).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().breakByHand(false).sounds(BlockSoundGroup.METAL));
    public static Block Sapphire_Ore = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().breakByHand(false).sounds(BlockSoundGroup.STONE));
    public static Block Block_of_Sapphire = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0F, 6.0F).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().breakByHand(false).sounds(BlockSoundGroup.METAL));
    public static Block Block_of_Diamond_Steel = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0F,6.0F).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().breakByHand(false).sounds(BlockSoundGroup.METAL));
    public static Block Adamantite_Ore = new Block(FabricBlockSettings.of(Material.STONE).strength(12.0F).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().breakByHand(false).sounds(BlockSoundGroup.STONE));
    public static Block Block_of_Adamantine = new Block(FabricBlockSettings.of(Material.METAL).strength(12.0F).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().breakByHand(false).sounds(BlockSoundGroup.METAL));
    //Tools
        //Steel
    public static ToolItem Steel_Shovel = new CustomShovelItem(ModToolMaterials.STEEL, 1.5F, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Steel_Pickaxe = new CustomPickaxeItem(ModToolMaterials.STEEL, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Steel_Axe = new CustomAxeItem(ModToolMaterials.STEEL, 6, -3.1F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Steel_Hoe = new CustomHoeItem(ModToolMaterials.STEEL, -2, -1.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Steel_Sword = new CustomSwordItem(ModToolMaterials.STEEL, 3, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));
        //Silver
    public static ToolItem Silver_Shovel = new CustomShovelItem(ModToolMaterials.SILVER, 1.5F, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Silver_Pickaxe = new CustomPickaxeItem(ModToolMaterials.SILVER, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Silver_Axe = new CustomAxeItem(ModToolMaterials.SILVER, 6, -3.1F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Silver_Hoe = new CustomHoeItem(ModToolMaterials.SILVER, -2, -1.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Silver_Sword = new CustomSwordItem(ModToolMaterials.SILVER, 3, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));
        //Diamond Steel
    public static ToolItem Diamond_Steel_Shovel = new CustomShovelItem(ModToolMaterials.DIAMOND_STEEL, 1.5F, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Diamond_Steel_Shovel_G = new CustomShovelItem(ModToolMaterials.DIAMOND_STEEL, 1.5F, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Diamond_Steel_Shovel_D = new CustomShovelItem(ModToolMaterials.DIAMOND_STEEL, 1.5F, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Diamond_Steel_Pickaxe = new CustomPickaxeItem(ModToolMaterials.DIAMOND_STEEL, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Diamond_Steel_Pickaxe_G = new CustomPickaxeItem(ModToolMaterials.DIAMOND_STEEL, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Diamond_Steel_Pickaxe_D = new CustomPickaxeItem(ModToolMaterials.DIAMOND_STEEL, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Diamond_Steel_Pickaxe_GD = new CustomPickaxeItem(ModToolMaterials.DIAMOND_STEEL, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Diamond_Steel_Axe = new CustomAxeItem(ModToolMaterials.DIAMOND_STEEL, 5, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Diamond_Steel_Axe_G = new CustomAxeItem(ModToolMaterials.DIAMOND_STEEL, 5, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Diamond_Steel_Axe_D = new CustomAxeItem(ModToolMaterials.DIAMOND_STEEL, 5, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Diamond_Steel_Axe_GD = new CustomAxeItem(ModToolMaterials.DIAMOND_STEEL, 5, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Diamond_Steel_Hoe = new CustomHoeItem(ModToolMaterials.DIAMOND_STEEL, -3, 0.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Diamond_Steel_Hoe_G = new CustomHoeItem(ModToolMaterials.DIAMOND_STEEL, -3, 0.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Diamond_Steel_Hoe_D = new CustomHoeItem(ModToolMaterials.DIAMOND_STEEL, -3, 0.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Diamond_Steel_Sword = new CustomSwordItem(ModToolMaterials.DIAMOND_STEEL, 3, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));
    public static ToolItem Diamond_Steel_Sword_G = new CustomSwordItem(ModToolMaterials.DIAMOND_STEEL, 3, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));
    public static ToolItem Diamond_Steel_Sword_D = new CustomSwordItem(ModToolMaterials.DIAMOND_STEEL, 3, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));
    public static ToolItem Diamond_Steel_Sword_GD = new CustomSwordItem(ModToolMaterials.DIAMOND_STEEL, 3, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));
        //Adamantine
    public static ToolItem Adamantine_Shovel = new CustomShovelItem(ModToolMaterials.ADAMANT, 1.5F, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Adamantine_Shovel_G = new CustomShovelItem(ModToolMaterials.ADAMANT, 1.5F, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Adamantine_Shovel_D = new CustomShovelItem(ModToolMaterials.ADAMANT, 1.5F, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Adamantine_Pickaxe = new CustomPickaxeItem(ModToolMaterials.ADAMANT, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Adamantine_Pickaxe_G = new CustomPickaxeItem(ModToolMaterials.ADAMANT, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Adamantine_Pickaxe_D = new CustomPickaxeItem(ModToolMaterials.ADAMANT, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Adamantine_Pickaxe_GD = new CustomPickaxeItem(ModToolMaterials.ADAMANT, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Adamantine_Pickaxe_GE = new CustomPickaxeItem(ModToolMaterials.ADAMANT, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Adamantine_Pickaxe_GR = new CustomPickaxeItem(ModToolMaterials.ADAMANT, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Adamantine_Pickaxe_GS = new CustomPickaxeItem(ModToolMaterials.ADAMANT, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Adamantine_Axe = new CustomAxeItem(ModToolMaterials.ADAMANT, 5, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Adamantine_Axe_G = new CustomAxeItem(ModToolMaterials.ADAMANT, 5, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Adamantine_Axe_D = new CustomAxeItem(ModToolMaterials.ADAMANT, 5, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Adamantine_Axe_GD = new CustomAxeItem(ModToolMaterials.ADAMANT, 5, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Adamantine_Axe_GE = new CustomAxeItem(ModToolMaterials.ADAMANT, 5, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Adamantine_Axe_GR = new CustomAxeItem(ModToolMaterials.ADAMANT, 5, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Adamantine_Axe_GS = new CustomAxeItem(ModToolMaterials.ADAMANT, 5, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Adamantine_Hoe = new CustomHoeItem(ModToolMaterials.ADAMANT, -4, 0.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Adamantine_Hoe_G = new CustomHoeItem(ModToolMaterials.ADAMANT, -4, 0.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Adamantine_Hoe_D = new CustomHoeItem(ModToolMaterials.ADAMANT, -4, 0.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Adamantine_Sword = new CustomSwordItem(ModToolMaterials.ADAMANT, 3, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));
    public static ToolItem Adamantine_Sword_G = new CustomSwordItem(ModToolMaterials.ADAMANT, 3, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));
    public static ToolItem Adamantine_Sword_D = new CustomSwordItem(ModToolMaterials.ADAMANT, 3, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));
    public static ToolItem Adamantine_Sword_GD = new CustomSwordItem(ModToolMaterials.ADAMANT, 3, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));
    public static ToolItem Adamantine_Sword_GE = new CustomSwordItem(ModToolMaterials.ADAMANT, 3, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));
    public static ToolItem Adamantine_Sword_GR = new CustomSwordItem(ModToolMaterials.ADAMANT, 3, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));
    public static ToolItem Adamantine_Sword_GS = new CustomSwordItem(ModToolMaterials.ADAMANT, 3, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));
        //Netherite
    public static ToolItem Netherite_Shovel_G = new CustomShovelItem(ModToolMaterials.NETHERITE, 1.5F, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Netherite_Shovel_D = new CustomShovelItem(ModToolMaterials.NETHERITE, 1.5F, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Netherite_Pickaxe_G = new CustomPickaxeItem(ModToolMaterials.NETHERITE, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Netherite_Pickaxe_D = new CustomPickaxeItem(ModToolMaterials.NETHERITE, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Netherite_Pickaxe_GD = new CustomPickaxeItem(ModToolMaterials.NETHERITE, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Netherite_Pickaxe_GE = new CustomPickaxeItem(ModToolMaterials.NETHERITE, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Netherite_Pickaxe_GR = new CustomPickaxeItem(ModToolMaterials.NETHERITE, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Netherite_Pickaxe_GS = new CustomPickaxeItem(ModToolMaterials.NETHERITE, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Netherite_Axe_G = new CustomAxeItem(ModToolMaterials.NETHERITE, 5, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Netherite_Axe_D = new CustomAxeItem(ModToolMaterials.NETHERITE, 5, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Netherite_Axe_GD = new CustomAxeItem(ModToolMaterials.NETHERITE, 5, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Netherite_Axe_GE = new CustomAxeItem(ModToolMaterials.NETHERITE, 5, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Netherite_Axe_GR = new CustomAxeItem(ModToolMaterials.NETHERITE, 5, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Netherite_Axe_GS = new CustomAxeItem(ModToolMaterials.NETHERITE, 5, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Netherite_Hoe_G = new CustomHoeItem(ModToolMaterials.NETHERITE, -5, 0.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Netherite_Hoe_D = new CustomHoeItem(ModToolMaterials.NETHERITE, -5, 0.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Netherite_Sword_G = new CustomSwordItem(ModToolMaterials.NETHERITE, 3, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));
    public static ToolItem Netherite_Sword_D = new CustomSwordItem(ModToolMaterials.NETHERITE, 3, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));
    public static ToolItem Netherite_Sword_GD = new CustomSwordItem(ModToolMaterials.NETHERITE, 3, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));
    public static ToolItem Netherite_Sword_GE = new CustomSwordItem(ModToolMaterials.NETHERITE, 3, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));
    public static ToolItem Netherite_Sword_GR = new CustomSwordItem(ModToolMaterials.NETHERITE, 3, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));
    public static ToolItem Netherite_Sword_GS = new CustomSwordItem(ModToolMaterials.NETHERITE, 3, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));

    //Armor
        //Steel
    public static Item Steel_Helmet = new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static Item Steel_Chestplate = new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static Item Steel_Leggings = new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static Item Steel_Boots = new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));
        //Silver
    public static Item Silver_Helmet = new ArmorItem(ModArmorMaterials.SILVER, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static Item Silver_Chestplate = new ArmorItem(ModArmorMaterials.SILVER, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static Item Silver_Leggings = new ArmorItem(ModArmorMaterials.SILVER, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static Item Silver_Boots = new ArmorItem(ModArmorMaterials.SILVER, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));
        //Diamond Steel
    public static Item Diamond_Steel_Helmet = new ArmorItem(ModArmorMaterials.DIAMOND_STEEL, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static Item Diamond_Steel_Chestplate = new ArmorItem(ModArmorMaterials.DIAMOND_STEEL, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static Item Diamond_Steel_Leggings = new ArmorItem(ModArmorMaterials.DIAMOND_STEEL, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static Item Diamond_Steel_Boots = new ArmorItem(ModArmorMaterials.DIAMOND_STEEL, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));
        //Adamantine
    public static Item Adamantine_Helmet = new ArmorItem(ModArmorMaterials.ADAMANT, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static Item Adamantine_Chestplate = new ArmorItem(ModArmorMaterials.ADAMANT, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static Item Adamantine_Leggings = new ArmorItem(ModArmorMaterials.ADAMANT, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static Item Adamantine_Boots = new ArmorItem(ModArmorMaterials.ADAMANT, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));
    @Override
    public void onInitialize() {
        //Materials
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "ruby"), Ruby);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "sapphire"), Sapphire);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "silver_ingot"), Silver_Ingot);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "steel_ingot"), Steel_Ingot);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "diamond_steel_ingot"), Diamond_Steel_Ingot);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "adamantite_chunk"), Adamantite_Chunk);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "adamantine_ingot"), Adamantine_Ingot);
        //Blocks
        Registry.register(Registry.BLOCK, new Identifier(OverworldOverhaul.MOD_ID, "ruby_ore"), Ruby_Ore);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "ruby_ore"), new BlockItem(Ruby_Ore, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.BLOCK, new Identifier(OverworldOverhaul.MOD_ID, "sapphire_ore"), Sapphire_Ore);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "sapphire_ore"), new BlockItem(Sapphire_Ore, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.BLOCK, new Identifier(OverworldOverhaul.MOD_ID, "adamantite_ore"), Adamantite_Ore);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "adamantite_ore"), new BlockItem(Adamantite_Ore, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.BLOCK, new Identifier(OverworldOverhaul.MOD_ID, "ruby_block"), Block_of_Ruby);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "ruby_block"), new BlockItem(Block_of_Ruby, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.BLOCK, new Identifier(OverworldOverhaul.MOD_ID, "sapphire_block"), Block_of_Sapphire);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "sapphire_block"), new BlockItem(Block_of_Sapphire, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.BLOCK, new Identifier(OverworldOverhaul.MOD_ID, "diamond_steel_block"), Block_of_Diamond_Steel);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "diamond_steel_block"), new BlockItem(Block_of_Diamond_Steel, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.BLOCK,new Identifier(OverworldOverhaul.MOD_ID,"adamantine_block"), Block_of_Adamantine);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "adamantine_block"), new BlockItem(Block_of_Adamantine, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        //Tools
            //Steel
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "steel_shovel"), Steel_Shovel);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "steel_pickaxe"), Steel_Pickaxe);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "steel_axe"), Steel_Axe);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "steel_hoe"), Steel_Hoe);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "steel_sword"), Steel_Sword);
            //Silver
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "silver_shovel"), Silver_Shovel);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "silver_pickaxe"), Silver_Pickaxe);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "silver_axe"), Silver_Axe);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "silver_hoe"), Silver_Hoe);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "silver_sword"), Silver_Sword);
            //Diamond Steel
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "diamond_steel_shovel"), Diamond_Steel_Shovel);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "diamond_steel_shovel_g"), Diamond_Steel_Shovel_G);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "diamond_steel_shovel_d"), Diamond_Steel_Shovel_D);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "diamond_steel_pickaxe"), Diamond_Steel_Pickaxe);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "diamond_steel_pickaxe_g"), Diamond_Steel_Pickaxe_G);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "diamond_steel_pickaxe_d"), Diamond_Steel_Pickaxe_D);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "diamond_steel_pickaxe_gd"), Diamond_Steel_Pickaxe_GD);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "diamond_steel_axe"), Diamond_Steel_Axe);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "diamond_steel_axe_g"), Diamond_Steel_Axe_G);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "diamond_steel_axe_d"), Diamond_Steel_Axe_D);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "diamond_steel_axe_gd"), Diamond_Steel_Axe_GD);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "diamond_steel_hoe"), Diamond_Steel_Hoe);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "diamond_steel_hoe_g"), Diamond_Steel_Hoe_G);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "diamond_steel_hoe_d"), Diamond_Steel_Hoe_D);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "diamond_steel_sword"), Diamond_Steel_Sword);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "diamond_steel_sword_g"), Diamond_Steel_Sword_G);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "diamond_steel_sword_d"), Diamond_Steel_Sword_D);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "diamond_steel_sword_gd"), Diamond_Steel_Sword_GD);
            //Adamantine
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "adamantine_shovel"), Adamantine_Shovel);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "adamantine_shovel_g"), Adamantine_Shovel_G);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "adamantine_shovel_d"), Adamantine_Shovel_D);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "adamantine_pickaxe"), Adamantine_Pickaxe);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "adamantine_pickaxe_g"), Adamantine_Pickaxe_G);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "adamantine_pickaxe_d"), Adamantine_Pickaxe_D);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "adamantine_pickaxe_gd"), Adamantine_Pickaxe_GD);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "adamantine_pickaxe_ge"), Adamantine_Pickaxe_GE);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "adamantine_pickaxe_gr"), Adamantine_Pickaxe_GR);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "adamantine_pickaxe_gs"), Adamantine_Pickaxe_GS);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "adamantine_axe"), Adamantine_Axe);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "adamantine_axe_g"), Adamantine_Axe_G);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "adamantine_axe_d"), Adamantine_Axe_D);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "adamantine_axe_gd"), Adamantine_Axe_GD);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "adamantine_axe_ge"), Adamantine_Axe_GE);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "adamantine_axe_gr"), Adamantine_Axe_GR);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "adamantine_axe_gs"), Adamantine_Axe_GS);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "adamantine_hoe"), Adamantine_Hoe);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "adamantine_hoe_g"), Adamantine_Hoe_G);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "adamantine_hoe_d"), Adamantine_Hoe_D);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "adamantine_sword"), Adamantine_Sword);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "adamantine_sword_g"), Adamantine_Sword_G);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "adamantine_sword_d"), Adamantine_Sword_D);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "adamantine_sword_gd"), Adamantine_Sword_GD);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "adamantine_sword_ge"), Adamantine_Sword_GE);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "adamantine_sword_gr"), Adamantine_Sword_GR);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "adamantine_sword_gs"), Adamantine_Sword_GS);
            //Netherite
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "netherite_shovel_g"), Netherite_Shovel_G);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "netherite_shovel_d"), Netherite_Shovel_D);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "netherite_pickaxe_g"), Netherite_Pickaxe_G);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "netherite_pickaxe_d"), Netherite_Pickaxe_D);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "netherite_pickaxe_gd"), Netherite_Pickaxe_GD);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "netherite_pickaxe_ge"), Netherite_Pickaxe_GE);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "netherite_pickaxe_gr"), Netherite_Pickaxe_GR);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "netherite_pickaxe_gs"), Netherite_Pickaxe_GS);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "netherite_axe_g"), Netherite_Axe_G);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "netherite_axe_d"), Netherite_Axe_D);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "netherite_axe_gd"), Netherite_Axe_GD);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "netherite_axe_ge"), Netherite_Axe_GE);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "netherite_axe_gr"), Netherite_Axe_GR);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "netherite_axe_gs"), Netherite_Axe_GS);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "netherite_hoe_g"), Netherite_Hoe_G);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "netherite_hoe_d"), Netherite_Hoe_D);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "netherite_sword_g"), Netherite_Sword_G);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "netherite_sword_d"), Netherite_Sword_D);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "netherite_sword_gd"), Netherite_Sword_GD);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "netherite_sword_ge"), Netherite_Sword_GE);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "netherite_sword_gr"), Netherite_Sword_GR);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "netherite_sword_gs"), Netherite_Sword_GS);
        //Armor
            //Steel
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "steel_helmet"), Steel_Helmet);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "steel_chestplate"), Steel_Chestplate);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "steel_leggings"), Steel_Leggings);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "steel_boots"), Steel_Boots);
            //Silver
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "silver_helmet"), Silver_Helmet);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "silver_chestplate"), Silver_Chestplate);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "silver_leggings"), Silver_Leggings);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "silver_boots"), Silver_Boots);
            //Diamond Steel
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "diamond_steel_helmet"), Diamond_Steel_Helmet);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "diamond_steel_chestplate"), Diamond_Steel_Chestplate);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "diamond_steel_leggings"), Diamond_Steel_Leggings);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "diamond_steel_boots"), Diamond_Steel_Boots);
            //Adamantine
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "adamantine_helmet"), Adamantine_Helmet);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "adamantine_chestplate"), Adamantine_Chestplate);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "adamantine_leggings"), Adamantine_Leggings);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "adamantine_boots"), Adamantine_Boots);
    }
}