package fr.diskmth.ilurya.objects.items;

import fr.diskmth.ilurya.Main;
import fr.diskmth.ilurya.init.ItemsInit;
import fr.diskmth.ilurya.init.PotionsInit;
import fr.diskmth.ilurya.utils.interfaces.IHasModel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class StickItem extends Item implements IHasModel
{
    private String typeOfStick = "";

    public StickItem(String name, int MaxDamage)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setMaxStackSize(1);
        this.typeOfStick = name;
        setMaxDamage(MaxDamage - 1);
        setCreativeTab(null);
        ItemsInit.ITEMS.add(this);
    }

    @Override public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
        if(!worldIn.isRemote)
        {
            ItemStack stack = playerIn.getHeldItem(EnumHand.MAIN_HAND);

            if(typeOfStick.contains("heal"))
            {
                playerIn.addPotionEffect(new PotionEffect(MobEffects.INSTANT_HEALTH, 1, 2));
                stack.damageItem(1, playerIn);
                if(!playerIn.capabilities.isCreativeMode)
                {
                    playerIn.getCooldownTracker().setCooldown(this, 300);
                }
                return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
            }

            /*================================================================================================================*/

            else if(typeOfStick.contains("speed"))
            {
                playerIn.addPotionEffect(new PotionEffect(MobEffects.SPEED, 3600, 1));
                stack.damageItem(1, playerIn);
                if(!playerIn.capabilities.isCreativeMode)
                {
                    playerIn.getCooldownTracker().setCooldown(this, 300);
                }
                return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));

            }

            /*================================================================================================================*/

            else if(typeOfStick.contains("strenght"))
            {
                playerIn.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 3600, 1));
                stack.damageItem(1, playerIn);
                if(!playerIn.capabilities.isCreativeMode)
                {
                    playerIn.getCooldownTracker().setCooldown(this, 300);
                }
                return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));

            }

            /*================================================================================================================*/

            else if(typeOfStick.contains("haste"))
            {
                playerIn.addPotionEffect(new PotionEffect(MobEffects.HASTE, 3600, 1));
                stack.damageItem(1, playerIn);
                if(!playerIn.capabilities.isCreativeMode)
                {
                    playerIn.getCooldownTracker().setCooldown(this, 300);
                }
                return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));

            }

            /*================================================================================================================*/

            else if(typeOfStick.contains("feather_falling"))
            {
                playerIn.addPotionEffect(new PotionEffect(PotionsInit.FEATHER_FALLING_EFFECT, 3600));
                stack.damageItem(1, playerIn);
                if(!playerIn.capabilities.isCreativeMode)
                {
                    playerIn.getCooldownTracker().setCooldown(this, 300);
                }
                return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));

            }
            else
            {
                return new ActionResult<ItemStack>(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
            }
        }
        else
        {
            return new ActionResult<ItemStack>(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
        }
    }

    @Override public boolean isEnchantable(ItemStack stack)
    {
        return false;
    }

    @Override public void registerModels()
    {
        Main.proxy.registerItemRenderer(this, 0);
    }
}
