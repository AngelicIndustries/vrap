package industries.angelic.vrap.gui;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.gui.GuiScreen;

import cpw.mods.fml.client.config.ConfigGuiType;
import cpw.mods.fml.client.config.DummyConfigElement;
import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;
import industries.angelic.vrap.VintageResourcifyApiPlugin;
import industries.angelic.vrap.VrapConfig;

public class VrapConfigGui extends GuiConfig {

    public VrapConfigGui(GuiScreen parent) {
        super(parent, buildElements(), VintageResourcifyApiPlugin.MODID, false, false, "vrap.config.title");
    }

    private static List<IConfigElement> buildElements() {
        List<IConfigElement> list = new ArrayList<>();
        list.add(
            new DummyConfigElement<String>(
                "curseForgeTokenUrl",
                VrapConfig.getCurseForgeTokenUrl(),
                ConfigGuiType.STRING,
                "vrap.config.token-url") {

                @Override
                public void set(String value) {
                    VrapConfig.setCurseForgeTokenUrl(value);
                }
            });
        return list;
    }
}
