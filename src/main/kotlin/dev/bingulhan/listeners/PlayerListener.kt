package dev.bingulhan.listeners

import org.bukkit.ChatColor
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

//interfaces join internal class like classes
class PlayerListener : Listener {

    @EventHandler
    fun onPlayerJoin(join : PlayerJoinEvent) {

        join.player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&aWelcome to server!"))
        join.joinMessage = null;

    }
}