package net.ryanmck.printcoords;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandListener implements CommandExecutor {
	
	//On command run
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		//If the command was /coords
		if(label.equalsIgnoreCase("coords")) {
			//If the command was sent by the console
			if(!(sender instanceof Player)) {
				sender.sendMessage("This command can only be run by a player.");
				
				return true;
			}
			//If the command was sent by the player
			else {
				final Player player = (Player)sender;
				
				if(player.hasPermission("printcoords.coords")) {
					//Get the player's location
					final Location location = player.getLocation();

					//Assign the x, y, and z location of the player to int variables
					int xloc = location.getBlockX();
					int zloc = location.getBlockZ();
					int yloc = location.getBlockY();
					
					//Put the x, y, and z coordinates in string variables
					String xcoord = Integer.toString(xloc);
					String zcoord = Integer.toString(zloc);
					String ycoord = Integer.toString(yloc);
					
					//Make the coordinate announcement
					player.chat("X: " + xcoord + "  Z: " + zcoord + "  Y: " + ycoord);
					
					return true;
				}
				return true;
			}
		}
		return false;
	}
	
}
