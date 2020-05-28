package net.lomeli.mozamping.core;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.config.ModConfig;

public class CommonConfig {
    public static ModConfig serverConfig;

    public CommonConfig(final ForgeConfigSpec.Builder builder) {
        builder.push("common");

        builder.pop();
    }

    public static void bakeConfig(final ModConfig config) {
        serverConfig = config;


    }
}
