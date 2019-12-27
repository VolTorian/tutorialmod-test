package voltorian.voltorian_tutorialmod.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import voltorian.voltorian_tutorialmod.TutorialMod;

@ObjectHolder(TutorialMod.MODID)
public class ModItems
{
	public static final Item TEST_SHARD = null;

	@EventBusSubscriber(modid = TutorialMod.MODID)
	public static class RegistrationHandler
	{
		@SubscribeEvent
		public static void registerItems(Register<Item> event)
		{
			final Item[] items = {
					new Item().setRegistryName(TutorialMod.MODID, "test_shard").setTranslationKey(TutorialMod.MODID + "." + "test_shard").setCreativeTab(CreativeTabs.MISC)
			};

			event.getRegistry().registerAll(items);
		}
	}
}