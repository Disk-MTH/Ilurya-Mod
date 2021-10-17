package fr.diskmth.ilurya.objects.network;

import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class ExamplePacket implements IMessage
{
    private String isBlocking;

    public ExamplePacket()
    {
    }

    public ExamplePacket(String text)
    {
        this.isBlocking = text;
    }

    @Override
    public void fromBytes(ByteBuf buf)
    {
        isBlocking = ByteBufUtils.readUTF8String(buf);
    }

    @Override
    public void toBytes(ByteBuf buf)
    {
        ByteBufUtils.writeUTF8String(buf, isBlocking);
    }

    public static class Handler implements IMessageHandler<ExamplePacket, IMessage>
    {
        @Override
        public IMessage onMessage(ExamplePacket message, MessageContext ctx)
        {
            return null;
        }
    }
}
