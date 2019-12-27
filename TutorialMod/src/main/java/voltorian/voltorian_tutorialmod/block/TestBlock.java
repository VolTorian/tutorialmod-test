package voltorian.voltorian_tutorialmod.block;

import voltorian.voltorian_tutorialmod.TutorialMod;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class TestBlock extends Block
{
	public TestBlock()
	{
		super(Material.ROCK);
		setCreativeTab(CreativeTabs.MISC);
		setSoundType(SoundType.STONE);
	}
}