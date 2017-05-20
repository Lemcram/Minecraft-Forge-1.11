package Mod.LemcramsMod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModItems extends Item {
	public ModItems(String name, CreativeTabs tab){
		  setUnlocalizedName(name);
		  setRegistryName(name);
		  setCreativeTab(tab);
		 }
		 
	public ModItems(String name, CreativeTabs tab, int stacksize){
		  setUnlocalizedName(name);
		  setRegistryName(name);
		  setCreativeTab(tab);
		  setMaxStackSize(stacksize);
		 }

}
