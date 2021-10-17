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

public class BasicBlock extends Block implements IHasModel
{
    public BasicBlock(String name, Material material, float hardness, float resistance, SoundType sound)
    {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setHardness(hardness);;
        setResistance(resistance);
        setSoundType(sound);
        setCreativeTab(null);
        BlocksInit.BLOCKS.add(this);
        ItemsInit.ITEMS.add(new ItemBlock(this).setRegistryName(name));
    }

    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0);
    }
}
