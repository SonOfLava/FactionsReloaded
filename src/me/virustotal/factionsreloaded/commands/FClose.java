package me.virustotal.factionsreloaded.commands;

import org.bukkit.entity.Player;

import me.virustotal.factionsreloaded.objects.FPlayer;

public class FClose {
	
	public static boolean doCommand(Player player)
	{
	
		FPlayer fPlayer = FPlayer.getFPlayer(player);
		if(fPlayer.getFaction().equals("none"))
		{
		
			return true;
		}
		
		//send message closed, close faction
		return true;
	}

}
