package com.github.prinzpommes;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;




public class MOTD implements Listener {



	private static String PrivateJoinMessage;

	public MOTD(Recipe plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}

@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
	message(event);
}
	
@EventHandler
	
public static void message(PlayerJoinEvent event) {

			Recipe.getCFGL();
			PrivateJoinMessage = Configloader.getPrivatJoinMessage();
			 if (PrivateJoinMessage == null) {
				 PrivateJoinMessage = "online%";
				 }
			PrivateJoinMessage = PrivateJoinMessage.replace("online%",
					ChatColor.GRAY + "Online ("
							+ Bukkit.getServer().getOnlinePlayers().length
							+ "/" + Bukkit.getMaxPlayers() + "): "
							+ listPlayers());
}



	public static String listPlayers() {


		Player ar[] = Bukkit.getOnlinePlayers();
		String liste = "";
		for (Player p : Bukkit.getOnlinePlayers()) {


			if (p.equals(ar[Bukkit.getOnlinePlayers().length - 1])) {


				liste += p.getDisplayName();
			} else {


				liste += p.getDisplayName() + ", ";
			}
		}


		return liste;
	}


}

