package com.gboihere.overworldoverhaul;

import com.gboihere.overworldoverhaul.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class OverworldOverhaul implements ModInitializer {

    public static final String MOD_ID = "overworldoverhaul";
    public static Object Silver_Ingot;

    @Override
    public void onInitialize() {
        ModItems.registerItems();

    }

    public class Silver_Ingot {
    }
}
