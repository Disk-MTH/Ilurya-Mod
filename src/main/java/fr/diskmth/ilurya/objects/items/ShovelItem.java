package fr.diskmth.ilurya.objects.items;

import fr.diskmth.ilurya.Main;
import fr.diskmth.ilurya.init.ItemsInit;
import fr.diskmth.ilurya.utils.interfaces.IHasModel;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class ShovelItem extends ItemSpade implements IHasModel
{
    private String typeOfShovel = "";

    public ShovelItem (String name, ToolMaterial material) 
    {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        this.typeOfShovel = name;
        setCreativeTab(null);
        ItemsInit.ITEMS.add(this);
    }
    
    public boolean getIsRepairable(ItemStack input, ItemStack repair)
    {
        if(typeOfShovel.contains("platine") && repair.getItem() == ItemsInit.PLATINE)
        {
            return true;
        }

        else if(typeOfShovel.contains("iridium") && repair.getItem() == ItemsInit.IRIDIUM)
        {
            return true;
        }

        else if(typeOfShovel.contains("iluryte") && repair.getItem() == ItemsInit.ILURYTE)
        {
            return true;
        }

        else
        {
            return false;
        }
    }
    
    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRenderer(this, 0);
    }
}
