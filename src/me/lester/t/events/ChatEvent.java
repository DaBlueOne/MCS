package me.lester.t.events;

import me.lester.t.MCS;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatEvent implements Listener
{

    @EventHandler
    public void onPlayerChatEvent(AsyncPlayerChatEvent e)
    {

        e.setFormat(ChatColor.AQUA + e.getPlayer().getDisplayName() + ChatColor.WHITE + ": " + ChatColor.RED + e.getMessage());
        MCS.FILEL.writeNewData("chat", e.getPlayer().getDisplayName() + ": " + e.getMessage());
    }
}