package fr.diskmth.ilurya.objects.items;

import fr.diskmth.ilurya.Main;
import fr.diskmth.ilurya.init.ItemsInit;
import fr.diskmth.ilurya.utils.interfaces.IHasModel;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class PickaxeItem extends ItemPickaxe implements IHasModel
{
    private String typeOfPickaxe = "";

    public PickaxeItem (String name, ToolMaterial material) 
    {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        this.typeOfPickaxe = name;
        setCreativeTab(null);
        ItemsInit.ITEMS.add(this);
    }
    
    public boolean getIsRepairable(ItemStack input, ItemStack repair)
    {
        if(typeOfPickaxe.contains("platine") && repair.getItem() == ItemsInit.PLATINE)
        {
            return true;
        }

        else if(typeOfPickaxe.contains("iridium") && repair.getItem() == ItemsInit.IRIDIUM)
        {
            return true;
        }

        else if(typeOfPickaxe.contains("iluryte") && repair.getItem() == ItemsInit.ILURYTE)
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
