package fr.diskmth.ilurya.init;

import net.minecraft.entity.Entity;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RendersInit
{
    public static void registerRenders()
    {

    }

    private static void registerRenderer(Class<? extends Entity> entity, IRenderFactory<Entity> render)
    {
        RenderingRegistry.registerEntityRenderingHandler(entity, render);
    }
}
//registerRenderer(EntityPillerTNTPrimed.class, new RenderPillerTNTPrimed.RenderFactory());