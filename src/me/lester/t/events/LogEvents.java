package me.lester.t.events;

import me.lester.t.MCS;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogEvents implements Listener
{

    @EventHandler
    public void onPlayerLogin(PlayerJoinEvent e)
    {

        String date = DateTimeFormatter.ofPattern("HH:mm:ss").format(LocalDateTime.now());

        e.setJoinMessage(ChatColor.YELLOW + "Join> " + ChatColor.GREEN + e.getPlayer().getName() + "");
        MCS.FILEL.writeNewData("login", "Join: " + e.getPlayer().getName() + " @ " + date);
    }

    @EventHandler
    public void onPlayerLogout(PlayerQuitEvent e)
    {

        String date = DateTimeFormatter.ofPattern("HH:mm:ss").format(LocalDateTime.now());

        e.setQuitMessage(ChatColor.YELLOW + "Quit> " + ChatColor.GREEN + e.getPlayer().getName() + "");
        MCS.FILEL.writeNewData("login", "Quit: " + e.getPlayer().getName() + " @ " + date);
    }
}