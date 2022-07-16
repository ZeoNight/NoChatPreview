package dev.zeonight.nochatpreview;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.apache.commons.logging.Log;

import java.util.logging.Logger;

@Environment(EnvType.CLIENT)
public class Main implements ClientModInitializer {
    public static Logger LOGGER = Logger.getLogger("NoChatPreview");
    @Override
    public void onInitializeClient() {
        LOGGER.info("NoChatPreview Enabled");
    }
}
