package net.lomeli.mozamping;

import net.lomeli.mozamping.client.ClientProxy;
import net.lomeli.mozamping.core.CommonConfig;
import net.lomeli.mozamping.core.CommonProxy;
import net.lomeli.mozamping.core.IProxy;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Mozamping {
    public static final String MOD_NAME = "Mozamping";
    public static final String MOD_ID = "mozamping";
    public static final Logger LOGGER = LogManager.getLogger(MOD_NAME);
    public static final ForgeConfigSpec COMMON_SPEC;
    public static final CommonConfig COMMON_CONFIG;

    public static IProxy proxy = DistExecutor.runForDist(() -> ClientProxy::new, () -> CommonProxy::new);

    static {
        {
            final Pair<CommonConfig, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(CommonConfig::new);
            COMMON_CONFIG = specPair.getLeft();
            COMMON_SPEC = specPair.getRight();
        }
    }

    public Mozamping() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
    }

    public void commonSetup(final FMLCommonSetupEvent event) {

    }

    public void clientSetup(final FMLClientSetupEvent event) {

    }
}
