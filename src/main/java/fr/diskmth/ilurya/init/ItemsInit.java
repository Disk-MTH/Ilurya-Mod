package fr.diskmth.ilurya.init;

import java.util.ArrayList;
import java.util.List;

import fr.diskmth.ilurya.objects.items.*;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.*;

public class ItemsInit
{
    public static List<Item> ITEMS = new ArrayList<Item>();

    //platine
    public static Item PLATINE = new BasicItem("platine");
    public static ItemSword PLATINE_SWORD = new SwordItem("platine_sword", ToolMaterialsInit.PLATINE_SWORD);
    public static ItemPickaxe PLATINE_PICKAXE = new PickaxeItem("platine_pickaxe", ToolMaterialsInit.PLATINE);
    public static AxeItem PLATINE_AXE = new AxeItem("platine_axe", ToolMaterialsInit.PLATINE);
    public static ItemSpade PLATINE_SHOVEL = new ShovelItem("platine_shovel", ToolMaterialsInit.PLATINE);
    public static ItemArmor PLATINE_HELMET = new ArmorItem("platine_helmet", ToolMaterialsInit.PLATINE_ARMOR, 1, EntityEquipmentSlot.HEAD);
    public static ItemArmor PLATINE_CHESTPLATE = new ArmorItem("platine_chestplate", ToolMaterialsInit.PLATINE_ARMOR, 1, EntityEquipmentSlot.CHEST);
    public static ItemArmor PLATINE_LEGGING = new ArmorItem("platine_legging", ToolMaterialsInit.PLATINE_ARMOR, 2, EntityEquipmentSlot.LEGS);
    public static ItemArmor PLATINE_BOOTS = new ArmorItem("platine_boots", ToolMaterialsInit.PLATINE_ARMOR, 1, EntityEquipmentSlot.FEET);

    //iridium
    public static Item IRIDIUM = new BasicItem("iridium");
    public static ItemSword IRIDIUM_SWORD = new SwordItem("iridium_sword", ToolMaterialsInit.IRIDIUM_SWORD);
    public static ItemPickaxe IRIDIUM_PICKAXE = new PickaxeItem("iridium_pickaxe", ToolMaterialsInit.IRIDIUM);
    public static AxeItem IRIDIUM_AXE = new AxeItem("iridium_axe", ToolMaterialsInit.IRIDIUM);
    public static ItemSpade IRIDIUM_SHOVEL = new ShovelItem("iridium_shovel", ToolMaterialsInit.IRIDIUM);
    public static ItemArmor IRIDIUM_HELMET = new ArmorItem("iridium_helmet", ToolMaterialsInit.IRIDIUM_ARMOR, 1, EntityEquipmentSlot.HEAD);
    public static ItemArmor IRIDIUM_CHESTPLATE = new ArmorItem("iridium_chestplate", ToolMaterialsInit.IRIDIUM_ARMOR, 1, EntityEquipmentSlot.CHEST);
    public static ItemArmor IRIDIUM_LEGGING = new ArmorItem("iridium_legging", ToolMaterialsInit.IRIDIUM_ARMOR, 2, EntityEquipmentSlot.LEGS);
    public static ItemArmor IRIDIUM_BOOTS = new ArmorItem("iridium_boots", ToolMaterialsInit.IRIDIUM_ARMOR, 1, EntityEquipmentSlot.FEET);

    //iluryte
    public static Item ILURYTE = new BasicItem("iluryte");
    public static ItemSword ILURYTE_SWORD = new SwordItem("iluryte_sword", ToolMaterialsInit.ILURYTE_SWORD);
    public static ItemPickaxe ILURYTE_PICKAXE = new PickaxeItem("iluryte_pickaxe", ToolMaterialsInit.ILURYTE);
    public static AxeItem ILURYTE_AXE = new AxeItem("iluryte_axe", ToolMaterialsInit.ILURYTE);
    public static ItemSpade ILURYTE_SHOVEL = new ShovelItem("iluryte_shovel", ToolMaterialsInit.ILURYTE);
    public static ItemArmor ILURYTE_HELMET = new ArmorItem("iluryte_helmet", ToolMaterialsInit.ILURYTE_ARMOR, 1, EntityEquipmentSlot.HEAD);
    public static ItemArmor ILURYTE_CHESTPLATE = new ArmorItem("iluryte_chestplate", ToolMaterialsInit.ILURYTE_ARMOR, 1, EntityEquipmentSlot.CHEST);
    public static ItemArmor ILURYTE_LEGGING = new ArmorItem("iluryte_legging", ToolMaterialsInit.ILURYTE_ARMOR, 2, EntityEquipmentSlot.LEGS);
    public static ItemArmor ILURYTE_BOOTS = new ArmorItem("iluryte_boots", ToolMaterialsInit.ILURYTE_ARMOR, 1, EntityEquipmentSlot.FEET);

    //colaria
    public static Item COLARIA_SHARD = new BasicItem("colaria_shard");
    public static Item COLARIA = new BasicItem("colaria");
    public static Item COLARIA_COMPRESSED = new BasicItem("colaria_compressed");
    public static ItemSword COLARIA_SWORD = new SwordItem("colaria_sword", ToolMaterialsInit.COLARIA_SWORD);
    public static SuperPickaxeItem COLARIA_PICKAXE = new SuperPickaxeItem("colaria_pickaxe", ToolMaterialsInit.COLARIA);
    public static ItemArmor COLARIA_HELMET = new ArmorItem("colaria_helmet", ToolMaterialsInit.COLARIA_ARMOR, 1, EntityEquipmentSlot.HEAD);
    public static ItemArmor COLARIA_CHESTPLATE = new ArmorItem("colaria_chestplate", ToolMaterialsInit.COLARIA_ARMOR, 1, EntityEquipmentSlot.CHEST);
    public static ItemArmor COLARIA_LEGGING = new ArmorItem("colaria_legging", ToolMaterialsInit.COLARIA_ARMOR, 2, EntityEquipmentSlot.LEGS);
    public static ItemArmor COLARIA_BOOTS = new ArmorItem("colaria_boots", ToolMaterialsInit.COLARIA_ARMOR, 1, EntityEquipmentSlot.FEET);
    public static Item COLARIA_PICKAXE_HEAD = new BasicItem("colaria_pickaxe_head");
    public static Item COLARIA_PICKAXE_HANDLE = new BasicItem("colaria_pickaxe_handle");
    public static Item COLARIA_SWORD_BLADE = new BasicItem("colaria_sword_blade");
    public static Item COLARIA_SWORD_HANDLE = new BasicItem("colaria_sword_handle");

    //fishing
    public static Item FLYING_FISH = new BasicItem("flying_fish");
    public static Item EEL = new BasicItem("eel");
    public static Item DEEP_LURKER = new BasicItem("deep_lurker");
    public static Item FLYING_FISH_FEATHER = new BasicItem("flying_fish_feather");

    //other
    public static Item NEUTRAL_STICK = new BasicItem("neutral_stick");
    public static StickItem HEAL_STICK = new StickItem("heal_stick", 3);
    public static StickItem SPEED_STICK = new StickItem("speed_stick", 3);
    public static StickItem STRENGHT_STICK = new StickItem("strenght_stick", 3);
    public static StickItem HASTE_STICK = new StickItem("haste_stick", 3);
    public static StickItem FEATHER_FALLING_STICK = new StickItem("feather_falling_stick", 3);
    public static Item LOGO = new BasicItem("logo");
}