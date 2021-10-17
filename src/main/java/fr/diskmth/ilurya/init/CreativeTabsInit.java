package fr.diskmth.ilurya.init;

import fr.diskmth.ilurya.objects.creativetabs.CreativeTabBase;
import net.minecraft.creativetab.CreativeTabs;

public class CreativeTabsInit
{
    public static CreativeTabs ILURYA_TAB_1;

    public static void registerCreativetabs()
    {
        ILURYA_TAB_1 = new CreativeTabBase("ilurya_tab_1");
    }
}