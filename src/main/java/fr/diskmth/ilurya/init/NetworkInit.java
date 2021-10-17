package fr.diskmth.ilurya.init;

import fr.diskmth.ilurya.utils.References;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;

public class NetworkInit
{
    public static SimpleNetworkWrapper NETWORK;

    public static void registerNetwork()
    {
        NETWORK = NetworkRegistry.INSTANCE.newSimpleChannel(References.MODID);
    }

    //NETWORK.registerMessage(ExamplePacket.Handler.class, ExamplePacket.class, 0, Side.SERVER);
}