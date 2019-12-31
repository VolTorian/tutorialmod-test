package voltorian.voltorian_tutorialmod.item;

import voltorian.voltorian_tutorialmod.TutorialMod;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TestShard extends Item
{
	public TestShard(String registryName, String unlocalizedName)
	{
		setTranslationKey(TutorialMod.MODID + "." + unlocalizedName);
		setRegistryName(registryName);
		//setCreativeTab(TutorialMod.INVESTITURE_TAB);
	}
}