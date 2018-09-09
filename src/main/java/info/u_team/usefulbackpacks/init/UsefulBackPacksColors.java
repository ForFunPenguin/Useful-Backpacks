package info.u_team.usefulbackpacks.init;

import info.u_team.usefulbackpacks.item.ItemBackPack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraftforge.fml.relauncher.*;

@SideOnly(Side.CLIENT)
public class UsefulBackPacksColors {
	
	private static ItemColors itemcolors;
	
	public static void init() {
		Minecraft minecraft = Minecraft.getMinecraft();
		itemcolors = minecraft.getItemColors();
		item();
	}
	
	private static void item() {
		ItemBackPack backpacks = UsefulBackPacksItems.backpack;
		itemcolors.registerItemColorHandler((stack, index) -> {
			return backpacks.getColor(stack);
		}, backpacks);
	}
}
