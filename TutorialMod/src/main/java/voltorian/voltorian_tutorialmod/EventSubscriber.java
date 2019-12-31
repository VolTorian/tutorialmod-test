package voltorian.voltorian_tutorialmod;

import voltorian.voltorian_tutorialmod.TutorialMod;
import voltorian.voltorian_tutorialmod.block.TestBlock;
import voltorian.voltorian_tutorialmod.init.ModBlocks;
import voltorian.voltorian_tutorialmod.item.TestShard;
//import voltorian.voltorian_tutorialmod.item.ItemFirstItem;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = TutorialMod.MODID)
public final class EventSubscriber
{
	@SubscribeEvent
	public static void registerBlocks(Register<Block> event)
	{
		final Block[] blocks = {
				new TestBlock().setRegistryName("first_block").setTranslationKey(TutorialMod.MODID + "." + "first_block"),
		};

		event.getRegistry().registerAll(blocks);
	}

	@SubscribeEvent
	public static void registerItems(Register<Item> event)
	{
		final Item[] items = {
				new TestShard("test_shard", "test_shard"),
		};

		final Item[] itemBlocks = {
                new ItemBlock(ModBlocks.TEST_BLOCK).setRegistryName(ModBlocks.TEST_BLOCK.getRegistryName()),
        };

		event.getRegistry().registerAll(items);
		event.getRegistry().registerAll(itemBlocks);
	}

}