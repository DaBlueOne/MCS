package me.lester.t.events;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

public class MOTDEvent implements Listener
{

    @EventHandler
    public void onServerListRefresh(ServerListPingEvent e)
    {


        e.setMotd(ChatColor.RED + "Bolstridge Room Server" + "\n" + ChatColor.AQUA + "Custom Coded by DaBlueOne");
    }
}