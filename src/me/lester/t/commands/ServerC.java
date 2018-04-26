package me.lester.t.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ServerC implements CommandExecutor
{
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String cmdLabel, String[] args)
    {

        Player pl = (Player) sender;

        if (cmdLabel.equalsIgnoreCase("server"))
        {

            if (args.length == 0)
            {
                pl.sendMessage(ChatColor.RED + "[" + ChatColor.YELLOW + "CmdM" + ChatColor.RED + "] " + ChatColor.GOLD + "Not enough args.");
                return true;
            }

            if (args[1].equalsIgnoreCase("info"))
            {
                pl.sendMessage(ChatColor.RED + "[" + ChatColor.YELLOW + "Server" + ChatColor.RED + "] " + ChatColor.GOLD + "Bukkit v1.12, MCS V1.2, MC V1.12. Thanks");
                return true;
            }

            if (args[1].equalsIgnoreCase("say"))
            {

                Bukkit.broadcastMessage(ChatColor.RED + "[" + ChatColor.YELLOW + "Server" + ChatColor.RED + "] " +);

                return true;
            }

        }

        return false;
    }
}
