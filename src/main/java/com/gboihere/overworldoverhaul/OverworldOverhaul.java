package com.gboihere.overworldoverhaul;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class OverworldOverhaul implements ModInitializer {

    public static final String MOD_ID = "overworldoverhaul";
    public static Object Silver_Ingot;

    @Override
    public void onInitialize() {
        createSubstances();

    }

    public void createSubstances() {
        createSubstance("ruby", "", true);
        createSubstance("sapphire", "",true);
        createIngotSubstance("silver", true);
        createIngotSubstance("steel", false);
    }

    void createIngotSubstance(String path, boolean has_ore) { createSubstance(path, "ingot", has_ore); }

    void createSubstance(String path, String item_suffix, boolean has_ore) {
        String item_path = path;
        if (!item_suffix.isEmpty()) item_path += ("_" + item_suffix);
        createBlockAndItem(path + "_block");
        if (has_ore) createBlockAndItem(path + "_ore");
        createBlockAndItem(item_path);
    }

    Block createBlockAndItem(String path) {
        Block block = new Block(FabricBlockSettings.of(Material.STONE)
                .strength(3.0f)
                .breakByTool(FabricToolTags.PICKAXES, 2)
                .requiresTool()
                .breakByHand(false)
        );
        Registry.register(Registry.BLOCK, new Identifier(OverworldOverhaul.MOD_ID, path), block);
        Registry.register(Registry.ITEM, new Identifier(OverworldOverhaul.MOD_ID, path),
                new BlockItem(block, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS))
        );
        return block;
    }
}
