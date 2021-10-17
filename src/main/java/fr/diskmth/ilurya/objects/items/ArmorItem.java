package fr.diskmth.ilurya.objects.items;

import fr.diskmth.ilurya.Main;
import fr.diskmth.ilurya.init.ItemsInit;
import fr.diskmth.ilurya.utils.interfaces.IHasModel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ArmorItem extends ItemArmor implements IHasModel
{
    private String typeOfArmor = "";

    public ArmorItem(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn)
    {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        setUnlocalizedName(name);
        setRegistryName(name);
        this.typeOfArmor = name;
        setCreativeTab(null);
        ItemsInit.ITEMS.add(this);
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
    {
        super.onArmorTick(world, player, itemStack);
    }

    public boolean getIsRepairable(ItemStack input, ItemStack repair)
    {
        if(typeOfArmor.contains("platine") && repair.getItem() == ItemsInit.PLATINE)
        {
            return true;
        }

        else if(typeOfArmor.contains("iridium") && repair.getItem() == ItemsInit.IRIDIUM)
        {
            return true;
        }

        else if(typeOfArmor.contains("iluryte") && repair.getItem() == ItemsInit.ILURYTE)
        {
            return true;
        }

        else if(typeOfArmor.contains("colaria") && repair.getItem() == ItemsInit.COLARIA)
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
