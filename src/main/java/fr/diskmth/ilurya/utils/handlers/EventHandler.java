package fr.diskmth.ilurya.utils.handlers;

import fr.diskmth.ilurya.client.gui.GuiCustomMainMenu;
import fr.diskmth.ilurya.init.PotionsInit;
import fr.diskmth.ilurya.objects.items.StickItem;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiMultiplayer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemEnchantedBook;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.event.AnvilUpdateEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@EventBusSubscriber
public class EventHandler
{
    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void onOpenGui(GuiOpenEvent event)
    {
        if(event.getGui() != null && event.getGui().getClass() == GuiMainMenu.class)
        {
            //event.setGui(new GuiCustomMainMenu());
        }
        
        if(event.getGui() != null && event.getGui().getClass() == GuiMultiplayer.class)
        {
            //event.setGui(new GuiCustomMainMenu());
        }
    }
    
    @SubscribeEvent
    public static void livingEvent(LivingEvent.LivingUpdateEvent event)
    {
        /*if(event.getEntityLiving() instanceof EntityPlayer)
        {
            EntityPlayer player = (EntityPlayer)event.getEntityLiving();
            Block block = player.world.getBlockState(new BlockPos(player.posX, player.posY, player.posZ)).getBlock();

            if(block instanceof LadderBlock && block.getDefaultState().getBlock() == BlocksInit.PLATINE_BLOCK)
            {
                if(!player.isSneaking())

                    if(player.moveForward > 0.0F)
                    {
                        player.move(MoverType.SELF, 0.0D, 0.3D, 0.0D);
                    }
                    else
                    {
                        player.move(MoverType.SELF, 0.0D, -0.3D, 0.0D);
                    }
            }
        }*/
    }

    @SubscribeEvent
    public static void onAnvilUpdate(AnvilUpdateEvent event)
    {
        if((event.getLeft().getItem() instanceof StickItem) && (event.getRight().getItem() instanceof ItemEnchantedBook))
        {
            event.setCanceled(true);
        }
    }

    @SubscribeEvent
    public static void onPlayerTickCommon(TickEvent.PlayerTickEvent event)
    {
        if(event.player.isPotionActive(PotionsInit.FEATHER_FALLING_EFFECT))
        {
            event.player.fallDistance = 0;
        }
    }
}