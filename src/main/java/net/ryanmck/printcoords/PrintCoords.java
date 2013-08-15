package net.ryanmck.printcoords;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public final class PrintCoords extends JavaPlugin
{
	
	@Override
    public void onEnable() {
		getCommand("coords").setExecutor(new CommandListener());
		
		PluginDescriptionFile pdfFile = this.getDescription();
		getLogger().info(pdfFile.getName() + " version " + pdfFile.getVersion() + " has been enabled.");
    }
 
    @Override
    public void onDisable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		getLogger().info(pdfFile.getName() + " has been disabled.");
    }
    
}
