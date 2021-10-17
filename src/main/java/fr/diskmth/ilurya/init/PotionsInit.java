package fr.diskmth.ilurya.init;

import fr.diskmth.ilurya.objects.brewing.CustomEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class PotionsInit
{
    //effects
    public static final Potion FEATHER_FALLING_EFFECT = new CustomEffect("feather_falling_effect", false, 4175871, "feather_falling_effect");

    //potions
    //feather_falling
    public static final PotionType FEATHER_FALLING = new PotionType("feather_falling", new PotionEffect[] {new PotionEffect(FEATHER_FALLING_EFFECT, 3600)}).setRegistryName("feather_falling");
    public static final PotionType LONG_FEATHER_FALLING = new PotionType("feather_falling", new PotionEffect[] {new PotionEffect(FEATHER_FALLING_EFFECT, 9600)}).setRegistryName("long_feather_falling");
    //haste
    public static final PotionType HASTE = new PotionType("haste", new PotionEffect[] {new PotionEffect(MobEffects.HASTE, 3600)}).setRegistryName("haste");
    public static final PotionType LONG_HASTE = new PotionType("haste", new PotionEffect[] {new PotionEffect(MobEffects.HASTE, 9600)}).setRegistryName("long_haste");
    public static final PotionType STRONG_HASTE = new PotionType("haste", new PotionEffect[] {new PotionEffect(MobEffects.HASTE, 1800, 1)}).setRegistryName("strong_haste");
    //blindness
    public static final PotionType BLINDNESS = new PotionType("blindness", new PotionEffect[] {new PotionEffect(MobEffects.BLINDNESS, 900)}).setRegistryName("blindness");
    public static final PotionType LONG_BLINDNESS = new PotionType("blindness", new PotionEffect[] {new PotionEffect(MobEffects.BLINDNESS, 1800)}).setRegistryName("long_blindness");

    public static void registerPotions()
    {
        potionDefaultLongEffect(FEATHER_FALLING, LONG_FEATHER_FALLING, FEATHER_FALLING_EFFECT);
        potionDefaultLongStrong(HASTE, LONG_HASTE, STRONG_HASTE);
        potionDefaultLong(BLINDNESS, LONG_BLINDNESS);
    }

    private static void potionDefaultLongEffect(PotionType defaultPotion, PotionType longPotion, Potion effect)
    {
        ForgeRegistries.POTIONS.register(effect);
        ForgeRegistries.POTION_TYPES.register(defaultPotion);
        ForgeRegistries.POTION_TYPES.register(longPotion);
    }

    private static void potionDefaultLongStrong(PotionType defaultPotion, PotionType longPotion, PotionType strongPotion)
    {
        ForgeRegistries.POTION_TYPES.register(defaultPotion);
        ForgeRegistries.POTION_TYPES.register(longPotion);
        ForgeRegistries.POTION_TYPES.register(strongPotion);
    }

    private static void potionDefaultLong(PotionType defaultPotion, PotionType longPotion)
    {
        ForgeRegistries.POTION_TYPES.register(defaultPotion);
        ForgeRegistries.POTION_TYPES.register(longPotion);
    }
}