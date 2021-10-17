package fr.diskmth.ilurya.init;

import java.util.ArrayList;
import java.util.List;

import fr.diskmth.ilurya.objects.blocks.BasicBlock;
import fr.diskmth.ilurya.objects.blocks.OreBlock;
import fr.diskmth.ilurya.objects.blocks.XRayBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlocksInit
{
    public static List<Block> BLOCKS = new ArrayList<Block>();

    //platine
    public static Block PLATINE_BLOCK = new BasicBlock("platine_block", Material.IRON, 5.0F, 10.0F, SoundType.METAL);
    public static Block PLATINE_ORE = new OreBlock("platine_ore", 3.0F, 5.0F, 3, SoundType.STONE);

    //iridium
    public static Block IRIDIUM_BLOCK = new BasicBlock("iridium_block", Material.IRON, 5.0F, 10.0F, SoundType.METAL);
    public static Block IRIDIUM_ORE = new OreBlock("iridium_ore", 3.0F, 5.0F, 3, SoundType.STONE, 1, 2, true, true, 5, 10);

    //iluryte
    public static Block ILURYTE_BLOCK = new BasicBlock("iluryte_block", Material.IRON, 5.0F, 10.0F, SoundType.METAL);
    public static Block ILURYTE_ORE = new OreBlock("iluryte_ore", 3.0F, 5.0F, 3, SoundType.STONE, 1, 2, false, true, 10, 15);

    //colaria
    public static Block COLARIA_ORE = new OreBlock("colaria_ore", 3.0F, 5.0F, 3, SoundType.STONE, 1, 2, false, true, 15, 20);

    //pillage
    public static Block X_RAY_BLOCK = new XRayBlock("x_ray_block", Material.ROCK);
}