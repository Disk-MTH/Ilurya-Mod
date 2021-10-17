package fr.diskmth.ilurya.objects.creativetabs;

import fr.diskmth.ilurya.init.BlocksInit;
import fr.diskmth.ilurya.init.ItemsInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CreativeTabBase extends CreativeTabs
{
    public CreativeTabBase(String name) 
    {
        super(name);
        //this.setNoTitle();
        //this.setBackgroundImageName(name + ".png");
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(ItemsInit.LOGO);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public boolean hasSearchBar()
    {
        return false;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void displayAllRelevantItems(NonNullList<ItemStack> list)
    {
        super.displayAllRelevantItems(list);

        //platine
        list.add(new ItemStack(ItemsInit.PLATINE));
        list.add(new ItemStack(BlocksInit.PLATINE_BLOCK));
        list.add(new ItemStack(BlocksInit.PLATINE_ORE));
        list.add(new ItemStack(ItemsInit.PLATINE_SWORD));
        list.add(new ItemStack(ItemsInit.PLATINE_PICKAXE));
        list.add(new ItemStack(ItemsInit.PLATINE_AXE));
        list.add(new ItemStack(ItemsInit.PLATINE_SHOVEL));
        list.add(new ItemStack(ItemsInit.PLATINE_HELMET));
        list.add(new ItemStack(ItemsInit.PLATINE_CHESTPLATE));
        list.add(new ItemStack(ItemsInit.PLATINE_LEGGING));
        list.add(new ItemStack(ItemsInit.PLATINE_BOOTS));

        //iridium
        list.add(new ItemStack(ItemsInit.IRIDIUM));
        list.add(new ItemStack(BlocksInit.IRIDIUM_BLOCK));
        list.add(new ItemStack(BlocksInit.IRIDIUM_ORE));
        list.add(new ItemStack(ItemsInit.IRIDIUM_SWORD));
        list.add(new ItemStack(ItemsInit.IRIDIUM_PICKAXE));
        list.add(new ItemStack(ItemsInit.IRIDIUM_AXE));
        list.add(new ItemStack(ItemsInit.IRIDIUM_SHOVEL));
        list.add(new ItemStack(ItemsInit.IRIDIUM_HELMET));
        list.add(new ItemStack(ItemsInit.IRIDIUM_CHESTPLATE));
        list.add(new ItemStack(ItemsInit.IRIDIUM_LEGGING));
        list.add(new ItemStack(ItemsInit.IRIDIUM_BOOTS));

        //iluryte
        list.add(new ItemStack(ItemsInit.ILURYTE));
        list.add(new ItemStack(BlocksInit.ILURYTE_BLOCK));
        list.add(new ItemStack(BlocksInit.ILURYTE_ORE));
        list.add(new ItemStack(ItemsInit.ILURYTE_SWORD));
        list.add(new ItemStack(ItemsInit.ILURYTE_PICKAXE));
        list.add(new ItemStack(ItemsInit.ILURYTE_AXE));
        list.add(new ItemStack(ItemsInit.ILURYTE_SHOVEL));
        list.add(new ItemStack(ItemsInit.ILURYTE_HELMET));
        list.add(new ItemStack(ItemsInit.ILURYTE_CHESTPLATE));
        list.add(new ItemStack(ItemsInit.ILURYTE_LEGGING));
        list.add(new ItemStack(ItemsInit.ILURYTE_BOOTS));

        //colaria
        list.add(new ItemStack(ItemsInit.COLARIA_SHARD));
        list.add(new ItemStack(ItemsInit.COLARIA));
        list.add(new ItemStack(ItemsInit.COLARIA_COMPRESSED));
        list.add(new ItemStack(BlocksInit.COLARIA_ORE));
        list.add(new ItemStack(ItemsInit.COLARIA_SWORD));
        list.add(new ItemStack(ItemsInit.COLARIA_PICKAXE));
        list.add(new ItemStack(ItemsInit.COLARIA_HELMET));
        list.add(new ItemStack(ItemsInit.COLARIA_CHESTPLATE));
        list.add(new ItemStack(ItemsInit.COLARIA_LEGGING));
        list.add(new ItemStack(ItemsInit.COLARIA_BOOTS));
        list.add(new ItemStack(ItemsInit.COLARIA_PICKAXE_HEAD));
        list.add(new ItemStack(ItemsInit.COLARIA_PICKAXE_HANDLE));
        list.add(new ItemStack(ItemsInit.COLARIA_SWORD_BLADE));
        list.add(new ItemStack(ItemsInit.COLARIA_SWORD_HANDLE));

        //fishing
        list.add(new ItemStack(ItemsInit.FLYING_FISH));
        list.add(new ItemStack(ItemsInit.EEL));
        list.add(new ItemStack(ItemsInit.DEEP_LURKER));
        list.add(new ItemStack(ItemsInit.FLYING_FISH_FEATHER));

        //pillage
        list.add(new ItemStack(BlocksInit.X_RAY_BLOCK));

        //other
        list.add(new ItemStack(ItemsInit.NEUTRAL_STICK));
        list.add(new ItemStack(ItemsInit.HEAL_STICK));
        list.add(new ItemStack(ItemsInit.SPEED_STICK));
        list.add(new ItemStack(ItemsInit.STRENGHT_STICK));
        list.add(new ItemStack(ItemsInit.HASTE_STICK));
        list.add(new ItemStack(ItemsInit.FEATHER_FALLING_STICK));
        list.add(new ItemStack(ItemsInit.LOGO));
    }
}
