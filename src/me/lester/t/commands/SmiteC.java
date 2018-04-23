package me.lester.t.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SmiteC implements CommandExecutor
{
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String cmdLabel, String[] args)
    {
        Player pl = (Player) sender;
        if (cmdLabel.equalsIgnoreCase("smite") && args.length == 1)
        {
            Player pl2 = Bukkit.getPlayer(args[0]);

            pl.sendMessage(ChatColor.RED + "[" + ChatColor.YELLOW + "Smite" + ChatColor.RED + "] " + ChatColor.GOLD + "Smiting player " + ChatColor.GREEN + args[0] + ChatColor.GOLD + ".");
            pl2.setGameMode(GameMode.SURVIVAL);
            pl2.getWorld().strikeLightning(pl2.getLocation());

            return true;
        }
        else
            pl.sendMessage(ChatColor.RED + "[" + ChatColor.YELLOW + "CmdM" + ChatColor.RED + "] " + ChatColor.GOLD + "Not enough args. Enter name of player.");

        return false;
    }
}