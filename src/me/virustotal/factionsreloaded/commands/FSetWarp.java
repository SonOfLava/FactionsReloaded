package me.virustotal.factionsreloaded.commands;

import me.virustotal.factionsreloaded.ConfigHandler;
import me.virustotal.factionsreloaded.objects.FPlayer;

import org.bukkit.entity.Player;

public class FSetWarp {

	public static boolean doCommand(Player player)
	{
		FPlayer fPlayer = FPlayer.getFPlayer(player);
		if(fPlayer.getFaction().equals("none"))
		{
			player.sendMessage(ConfigHandler.fSetWarpNoFaction);
			return true;
		}
		
		player.sendMessage(ConfigHandler.fSetwarpNoArgs);
		return true;
	}
	
	public static boolean doCommandWithArgs(Player player, String arg)
	{
		
		return true;
	}
	
}
