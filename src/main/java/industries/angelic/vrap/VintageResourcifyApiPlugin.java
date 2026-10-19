package industries.angelic.vrap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(
    modid = VintageResourcifyApiPlugin.MODID,
    name = VintageResourcifyApiPlugin.NAME,
    version = Tags.VERSION,
    acceptedMinecraftVersions = "[1.7.10]",
    dependencies = VintageResourcifyApiPlugin.RESOURCIFY_DEPENDENCIES,
    guiFactory = "industries.angelic.vrap.gui.VrapGuiFactory",
    customProperties = { @Mod.CustomProperty(k = "license", v = "WTFPL"),
        @Mod.CustomProperty(k = "issueTrackerUrl", v = "https://github.com/AngelicIndustries/vrap/issues"),
        @Mod.CustomProperty(k = "iconFile", v = "assets/vrap/logo.png") },
    acceptableRemoteVersions = "*")
public class VintageResourcifyApiPlugin {

    public static final String MODID = "vrap";
    public static final String NAME = "Vintage Resourcify API Plugin";
    public static final String VINTAGE_RESOURCIFY_MODID = "vintage-resourcify";
    public static final String RESOURCIFY_DEPENDENCIES = "required-after:" + VINTAGE_RESOURCIFY_MODID + "@[1.0.6,);";
    public static final Logger LOG = LogManager.getLogger(MODID);

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        LOG.info("Found Vintage Resourcify using mod id {}", VINTAGE_RESOURCIFY_MODID);
        VrapConfig.load(event.getSuggestedConfigurationFile());
        CurseTokenProvider.registerResourcifyConfigHook();
        CurseTokenProvider.fetchAndApplyAsync("game boot");
    }

    public static boolean isResourcifyLoaded() {
        return Loader.isModLoaded(VINTAGE_RESOURCIFY_MODID);
    }
}
