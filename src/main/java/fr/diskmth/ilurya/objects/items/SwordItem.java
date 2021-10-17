package fr.diskmth.ilurya.objects.items;

import fr.diskmth.ilurya.Main;
import fr.diskmth.ilurya.init.ItemsInit;
import fr.diskmth.ilurya.utils.interfaces.IHasModel;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class SwordItem extends ItemSword implements IHasModel
{
    private String typeOfSword = "";

    public SwordItem(String name, ToolMaterial material)
    {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        this.typeOfSword = name;
        setCreativeTab(null);
        ItemsInit.ITEMS.add(this);
    }

    public boolean getIsRepairable(ItemStack input, ItemStack repair)
    {
        if(typeOfSword.contains("platine") && repair.getItem() == ItemsInit.PLATINE)
        {
            return true;
        }

        else if(typeOfSword.contains("iridium") && repair.getItem() == ItemsInit.IRIDIUM)
        {
            return true;
        }

        else if(typeOfSword.contains("iluryte") && repair.getItem() == ItemsInit.ILURYTE)
        {
            return true;
        }

        else if(typeOfSword.contains("colaria") && repair.getItem() == ItemsInit.COLARIA)
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
