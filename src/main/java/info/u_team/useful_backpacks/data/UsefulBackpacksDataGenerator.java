package info.u_team.useful_backpacks.data;

import info.u_team.u_team_core.data.GenerationData;
import info.u_team.useful_backpacks.UsefulBackpacksMod;
import info.u_team.useful_backpacks.data.provider.*;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@EventBusSubscriber(modid = UsefulBackpacksMod.MODID, bus = Bus.MOD)
public class UsefulBackpacksDataGenerator {
	
	@SubscribeEvent
	public static void data(GatherDataEvent event) {
		final GenerationData data = new GenerationData(UsefulBackpacksMod.MODID, event);
		if (event.includeServer()) {
			data.addProvider(UsefulBackpacksItemTagsProvider::new);
			data.addProvider(UsefulBackpacksRecipesProvider::new);
		}
		if (event.includeClient()) {
			data.addProvider(UsefulBackpacksLanguagesProvider::new);
			data.addProvider(UsefulBackpacksItemModelsProvider::new);
		}
	}
}
