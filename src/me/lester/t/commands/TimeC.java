package me.lester.t.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TimeC implements CommandExecutor
{
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String cmdLabel, String[] args)
    {
        Player pl = (Player) sender;

        if (cmdLabel.equalsIgnoreCase("night") && args.length == 0)
        {

            pl.getWorld().setTime(13000);
            pl.sendMessage(ChatColor.RED + "[" + ChatColor.YELLOW + "Time" + ChatColor.RED + "] " + ChatColor.GOLD + "Time set to Night.");
            return true;
        }

        if (cmdLabel.equalsIgnoreCase("day") && args.length == 0)
        {

            pl.getWorld().setTime(0);
            pl.sendMessage(ChatColor.RED + "[" + ChatColor.YELLOW + "Time" + ChatColor.RED + "] " + ChatColor.GOLD + "Time set to Day.");
            return true;
        }

        return false;
    }
}
