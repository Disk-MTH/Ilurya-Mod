package fr.diskmth.ilurya.objects.blocks;

import fr.diskmth.ilurya.Main;
import fr.diskmth.ilurya.init.BlocksInit;
import fr.diskmth.ilurya.init.ItemsInit;
import fr.diskmth.ilurya.utils.interfaces.IHasModel;
import net.minecraft.block.BlockLadder;
import net.minecraft.block.SoundType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;

public class LadderBlock extends BlockLadder implements IHasModel
{
    public LadderBlock(String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(null);
        setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
        setSoundType(SoundType.LADDER);
        BlocksInit.BLOCKS.add(this);
        ItemsInit.ITEMS.add(new ItemBlock(this).setRegistryName(name));
    }

    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0);
    }
}