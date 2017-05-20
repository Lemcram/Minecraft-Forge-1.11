package Mod.LemcramsMod.proxy;

import Mod.LemcramsMod.handlers.ItemHandler;

public class CommonProxy implements IProxy{
	
	public void preInit() {
		ItemHandler.init();
		ItemHandler.register();

	 }

	 public void init() {
	  
	 }

	 public void postInit() {
	  
	 }

}
