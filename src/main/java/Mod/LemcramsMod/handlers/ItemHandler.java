package Mod.LemcramsMod.handlers;

import Mod.LemcramsMod.items.ItemPoweredNetherStar;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemHandler {
	
	/*Item variables*/
	
public static Item PoweredNetherStar;

	
	public static void init(){
		
		PoweredNetherStar = new ItemPoweredNetherStar("PoweredNetherStar", CreativeTabs.MATERIALS);

		
	 }
	 
	 public static void register(){
		 GameRegistry.register(PoweredNetherStar);

		 
		 
	 }
	 
	 public static void registerRenders(){
			registerRender(PoweredNetherStar);

		 
		 
	 }
	 
	 public static void registerRender(Item item){
		 	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));

		 
	 }

}
