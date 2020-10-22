package com.gboihere.overworldoverhaul.registry;

import com.gboihere.overworldoverhaul.OverworldOverhaul;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {
    //Materials
    public static final Item Ruby = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
    public static final Item Sapphire = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
    public static final Item Silver_Ingot = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
    public static final Item Steel_Ingot = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
    //Blocks
    public static final Block Ruby_Ore = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).breakByTool(FabricToolTags.PICKAXES,2).requiresTool().breakByHand(false));
    public static final Block Block_of_Ruby = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0f,6.0f).breakByTool(FabricToolTags.PICKAXES,2).requiresTool().breakByHand(false).sounds(BlockSoundGroup.METAL));
    public static final Block Sapphire_Ore = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).breakByTool(FabricToolTags.PICKAXES,2).requiresTool().breakByHand(false));
    public static final Block Block_of_Sapphire = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0f,6.0f).breakByTool(FabricToolTags.PICKAXES,2).requiresTool().breakByHand(false).sounds(BlockSoundGroup.METAL));
    //Tools

    public static void registerItems() {
        //Materials
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "ruby"), Ruby);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "sapphire"), Sapphire);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "silver_ingot"), Silver_Ingot);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, "steel_ingot"), Steel_Ingot);
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

    }
}
