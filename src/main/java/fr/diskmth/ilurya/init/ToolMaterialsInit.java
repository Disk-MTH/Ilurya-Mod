package fr.diskmth.ilurya.init;

import fr.diskmth.ilurya.utils.References;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class ToolMaterialsInit
{
    //platine
    public static Item.ToolMaterial PLATINE;
    public static Item.ToolMaterial PLATINE_SWORD;
    public static ItemArmor.ArmorMaterial PLATINE_ARMOR;

    //iridium
    public static Item.ToolMaterial IRIDIUM;
    public static Item.ToolMaterial IRIDIUM_SWORD;
    public static ItemArmor.ArmorMaterial IRIDIUM_ARMOR;

    //iluryte
    public static Item.ToolMaterial ILURYTE;
    public static Item.ToolMaterial ILURYTE_SWORD;
    public static ItemArmor.ArmorMaterial ILURYTE_ARMOR;

    //colaria
    public static Item.ToolMaterial COLARIA;
    public static Item.ToolMaterial COLARIA_SWORD;
    public static ItemArmor.ArmorMaterial COLARIA_ARMOR;

    public static void registerToolMaterials()
    {
        //platine
        PLATINE = new EnumHelper().addToolMaterial("platine", 4, 1951, 10.0f, 1.0f, 14);
        PLATINE_SWORD = new EnumHelper().addToolMaterial("platine_sword", 4, 1951, 1.0f, 13.0f, 14);
        PLATINE_ARMOR = new EnumHelper().addArmorMaterial("platine", References.MODID + ":platine", 150, new int[] {4, 7, 9, 4}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0f);

        //iridium
        IRIDIUM = new EnumHelper().addToolMaterial("iridium", 5, 2439, 12.0f, 1.0f, 12);
        IRIDIUM_SWORD = new EnumHelper().addToolMaterial("iridium_sword", 5, 2439, 1.0f, 19.0f, 12);
        IRIDIUM_ARMOR = new EnumHelper().addArmorMaterial("iridium", References.MODID + ":iridium", 187, new int[] {5, 8, 10, 5}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0f);

        //iluryte
        ILURYTE = new EnumHelper().addToolMaterial("iluryte", 6, 3049, 14.0f, 1.0f, 10);
        ILURYTE_SWORD = new EnumHelper().addToolMaterial("iluryte_sword", 6, 3049, 1.0f, 25.0f, 10);
        ILURYTE_ARMOR = new EnumHelper().addArmorMaterial("iluryte", References.MODID + ":iluryte", 235, new int[] {6, 9, 11, 6}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0f);

        //colaria
        COLARIA = new EnumHelper().addToolMaterial("colaria", 7, 3811, 20.0F, 1.0F, 8);
        COLARIA_SWORD = new EnumHelper().addToolMaterial("colaria_sword", 7, 3811, 1.0f, 32.0f, 8);
        COLARIA_ARMOR = new EnumHelper().addArmorMaterial("colaria", References.MODID + ":colaria", 293, new int[] {8, 11, 13, 8}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.5f);
    }
}