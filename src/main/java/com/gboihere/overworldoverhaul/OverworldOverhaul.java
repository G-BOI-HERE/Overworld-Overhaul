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

    public static final Item Ruby = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
    public static final Item Sapphire = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
    public static final Item Silver_Ingot = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
    public static final Item Steel_Ingot = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
    public static final Item Diamond_Steel_Ingot = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
    //Blocks
    public static final Block Ruby_Ore = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().breakByHand(false));
    public static final Block Block_of_Ruby = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0f, 6.0f).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().breakByHand(false).sounds(BlockSoundGroup.METAL));
    public static final Block Sapphire_Ore = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().breakByHand(false));
    public static final Block Block_of_Sapphire = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0f, 6.0f).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().breakByHand(false).sounds(BlockSoundGroup.METAL));
    //Tools

    public static ToolItem Steel_Pickaxe = new CustomPickaxeItem(ModToolMaterials.STEEL, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Steel_Axe = new CustomAxeItem(ModToolMaterials.STEEL, 5, -3.1F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Steel_Hoe = new CustomHoeItem(ModToolMaterials.STEEL, -2, -1.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Steel_Shovel = new CustomShovelItem(ModToolMaterials.STEEL, 1.5F, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Steel_Sword = new CustomSwordItem(ModToolMaterials.STEEL, 3, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));

    public static ToolItem Silver_Pickaxe = new CustomPickaxeItem(ModToolMaterials.SILVER, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Silver_Axe = new CustomAxeItem(ModToolMaterials.SILVER, 5, -3.1F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Silver_Hoe = new CustomHoeItem(ModToolMaterials.SILVER, -2, -1.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Silver_Shovel = new CustomShovelItem(ModToolMaterials.SILVER, 1.5F, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Silver_Sword = new CustomSwordItem(ModToolMaterials.SILVER, 3, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));

    public static ToolItem Diamond_Steel_Pickaxe = new CustomPickaxeItem(ModToolMaterials.DIAMOND_STEEL, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Diamond_Steel_Axe = new CustomAxeItem(ModToolMaterials.DIAMOND_STEEL, 5, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Diamond_Steel_Hoe = new CustomHoeItem(ModToolMaterials.DIAMOND_STEEL, -3, 0.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Diamond_Steel_Shovel = new CustomShovelItem(ModToolMaterials.DIAMOND_STEEL, 1.5F, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem Diamond_Steel_Sword = new CustomSwordItem(ModToolMaterials.DIAMOND_STEEL, 3, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));
    //Armors
    public static Item Steel_Helmet = new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static Item Steel_Chestplate = new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static Item Steel_Leggings = new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static Item Steel_Boots = new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));

    public static Item Silver_Helmet = new ArmorItem(ModArmorMaterials.SILVER, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static Item Silver_Chestplate = new ArmorItem(ModArmorMaterials.SILVER, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static Item Silver_Leggings = new ArmorItem(ModArmorMaterials.SILVER, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static Item Silver_Boots = new ArmorItem(ModArmorMaterials.SILVER, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));

    public static Item Diamond_Steel_Helmet = new ArmorItem(ModArmorMaterials.DIAMOND_STEEL, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static Item Diamond_Steel_Chestplate = new ArmorItem(ModArmorMaterials.DIAMOND_STEEL, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static Item Diamond_Steel_Leggings = new ArmorItem(ModArmorMaterials.DIAMOND_STEEL, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static Item Diamond_Steel_Boots = new ArmorItem(ModArmorMaterials.DIAMOND_STEEL, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));

    //test




    @Override
    public void onInitialize() {
        //Materials
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "ruby"), Ruby);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "sapphire"), Sapphire);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "silver_ingot"), Silver_Ingot);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "steel_ingot"), Steel_Ingot);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "diamond_steel_ingot"), Diamond_Steel_Ingot);
        //Blocks
        Registry.register(Registry.BLOCK, new Identifier(OverworldOverhaul.MOD_ID, "ruby_ore"), Ruby_Ore);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "ruby_ore"), new BlockItem(Ruby_Ore, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

        Registry.register(Registry.BLOCK, new Identifier(OverworldOverhaul.MOD_ID, "sapphire_ore"), Sapphire_Ore);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "sapphire_ore"), new BlockItem(Sapphire_Ore, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

        Registry.register(Registry.BLOCK, new Identifier(OverworldOverhaul.MOD_ID, "ruby_block"), Block_of_Ruby);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "ruby_block"), new BlockItem(Block_of_Ruby, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

        Registry.register(Registry.BLOCK, new Identifier(OverworldOverhaul.MOD_ID, "sapphire_block"), Block_of_Sapphire);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "sapphire_block"), new BlockItem(Block_of_Sapphire, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        //Tools
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "silver_pickaxe"), Silver_Pickaxe);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "silver_axe"), Silver_Axe);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "silver_hoe"), Silver_Hoe);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "silver_shovel"), Silver_Shovel);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "silver_sword"), Silver_Sword);

        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "steel_pickaxe"), Steel_Pickaxe);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "steel_axe"), Steel_Axe);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "steel_hoe"), Steel_Hoe);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "steel_shovel"), Steel_Shovel);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "steel_sword"), Steel_Sword);

        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "diamond_steel_pickaxe"), Diamond_Steel_Pickaxe);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "diamond_steel_axe"), Diamond_Steel_Axe);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "diamond_steel_hoe"), Diamond_Steel_Hoe);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "diamond_steel_shovel"), Diamond_Steel_Shovel);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "diamond_steel_sword"), Diamond_Steel_Sword);
        //Armor
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "steel_helmet"), Steel_Helmet);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "steel_chestplate"), Steel_Chestplate);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "steel_leggings"), Steel_Leggings);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "steel_boots"), Steel_Boots);

        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "silver_helmet"), Silver_Helmet);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "silver_chestplate"), Silver_Chestplate);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "silver_leggings"), Silver_Leggings);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "silver_boots"), Silver_Boots);

        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "diamond_steel_helmet"), Diamond_Steel_Helmet);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "diamond_steel_chestplate"), Diamond_Steel_Chestplate);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "diamond_steel_leggings"), Diamond_Steel_Leggings);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "diamond_steel_boots"), Diamond_Steel_Boots);
    }
}