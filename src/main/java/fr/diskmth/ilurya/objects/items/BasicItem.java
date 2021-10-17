package fr.diskmth.ilurya.objects.items;

import fr.diskmth.ilurya.Main;
import fr.diskmth.ilurya.init.ItemsInit;
import fr.diskmth.ilurya.utils.interfaces.IHasModel;
import net.minecraft.item.Item;

public class BasicItem extends Item implements IHasModel
{
    public BasicItem(String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(null);
        ItemsInit.ITEMS.add(this);
    }
    
    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRenderer(this, 0);
    }
}
