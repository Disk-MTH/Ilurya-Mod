package fr.diskmth.ilurya.objects.blocks;

import fr.diskmth.ilurya.Main;
import fr.diskmth.ilurya.init.BlocksInit;
import fr.diskmth.ilurya.init.ItemsInit;
import fr.diskmth.ilurya.utils.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class XRayBlock extends Block implements IHasModel
{
    public XRayBlock(String name, Material material)
    {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setHardness(3.0F);
        setResistance(5.0F);
        setSoundType(SoundType.GLASS);
        setCreativeTab(null);
        BlocksInit.BLOCKS.add(this);
        ItemsInit.ITEMS.add(new ItemBlock(this).setRegistryName(name));
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer func_180664_k()
    {
        return BlockRenderLayer.CUTOUT_MIPPED;
    }

    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0);
    }
}