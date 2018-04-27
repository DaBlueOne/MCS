package me.lester.t.events;

import me.lester.t.utils.ChatStuff;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathEvent implements Listener
{

    public void onPlayerDeath(PlayerDeathEvent e)
    {
        Player pl = e.getEntity();
        e.setDeathMessage(ChatStuff.cmdM("Death", ChatColor.GOLD + pl.getDisplayName() + " was killed by a" + e.getEntityType()));
    }

}