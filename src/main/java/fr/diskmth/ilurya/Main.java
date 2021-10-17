package fr.diskmth.ilurya;

import fr.diskmth.ilurya.init.RendersInit;
import fr.diskmth.ilurya.utils.References;
import fr.diskmth.ilurya.utils.handlers.RegistryHandler;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION)
public class Main
{
    @SidedProxy
    public static ServerProxy proxy;

    public static Logger logger;

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        proxy.preInit();
        RegistryHandler.preInitRegistries();
    }

    @EventHandler
    public static void init(FMLInitializationEvent event)
    {
        proxy.init();
        RegistryHandler.initRegistries();
    }

    @EventHandler
    public static void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit();
        RegistryHandler.postInitRegistries();
    }

    @EventHandler
    public static void serverStart(FMLServerStartingEvent event)
    {

    }

    public static class ServerProxy
    {
        public void registerItemRenderer(Item item, int meta)
        {

        }

        public void registerVariantRenderer(Item item, int meta, String filename, String id)
        {

        }

        public void registerEntityRenderers()
        {

        }

        public void preInit()
        {

        }

        public void init()
        {

        }

        public void postInit()
        {

        }
    }

    public static class ClientProxy extends ServerProxy
    {
        @Override
        public void registerItemRenderer(Item item, int meta)
        {
            ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), "inventory"));
        }

        @Override
        public void registerVariantRenderer(Item item, int meta, String filename, String id)
        {
            super.registerVariantRenderer(item, meta, filename, id);
        }

        @Override
        public void registerEntityRenderers()
        {
            super.registerEntityRenderers();
        }

        @Override
        public void preInit()
        {
            super.preInit();
        }

        @Override
        public void init()
        {
            super.init();
            RendersInit.registerRenders();
        }

        @Override
        public void postInit()
        {
            super.postInit();
        }
    }
}
