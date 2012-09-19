package com.pl.MYCRAFTisbest.CraftMe;

import java.io.File;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class CraftMe extends JavaPlugin implements Listener {

	public void onEnable(){
		loadRecipes();
		try{
			File file = new File(getDataFolder(), File.separator + "config.yml");
			if (!file.exists()){
				getConfig().addDefault("Cobweb", true);
				getConfig().addDefault("Glowstone", true);
				getConfig().options().copyDefaults(true);
				saveConfig();
			}
			}
			catch (ClassCastException e)
			{
				
				
			}

	}
	
	
	private void loadRecipes() {
	
		if (getConfig().getBoolean("Cobweb"))return;{

    	ItemStack cobwebItem = new ItemStack(Material.WEB);
    
    	ShapedRecipe cobweb = new ShapedRecipe(cobwebItem);
    

    	cobweb.shape(
    			"SSS",
    			"SWS",
    			"SSS");
    	cobweb.setIngredient('S', Material.STRING);  
    	cobweb.setIngredient('W', Material.WOOL);
    	Bukkit.addRecipe(cobweb);

		}
}
}

