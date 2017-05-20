package Mod.LemcramsMod.proxy;

import Mod.LemcramsMod.handlers.ItemHandler;

public class ClientProxy extends CommonProxy{
	
	 public void init() {
		  ItemHandler.registerRenders();
		 }

}
