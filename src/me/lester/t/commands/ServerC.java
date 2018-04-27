package me.lester.t.commands;

import me.lester.t.utils.ChatStuff;
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

            if (args.length == 0 || args[0].equalsIgnoreCase("help"))
            {

                pl.sendMessage(ChatStuff.cmdM("Server", ChatColor.GREEN + "Info" + ChatColor.RED + ": Gets info of the server version and plugin version"));
                pl.sendMessage(ChatStuff.cmdM("Server", ChatColor.GREEN + "Say" + ChatColor.RED + " Broadcast a message to the entire server."));
                pl.sendMessage(ChatStuff.cmdM("Server", ChatColor.GREEN + "Help" + ChatColor.RED + ": Shows the help message of the Server command."));

                return true;
            }

            if (args.length == 0)
            {
                pl.sendMessage(ChatColor.RED + "[" + ChatColor.YELLOW + "CmdM" + ChatColor.RED + "] " + ChatColor.GOLD + "Not enough args.");
                return true;
            }

            if (args[0].equalsIgnoreCase("info"))
            {
                pl.sendMessage(ChatStuff.cmdM("Server", "Bukkit version: 1.12  MCS version: 1.2, Minecraft version 1.12."));
                return true;
            }

            if (args[0].equalsIgnoreCase("say"))
            {

                if (args.length > 1)
                {
                    String msg = "";

                    for (int i = 1; i < args.length; i++)
                    {
                        String arg = (args[i] + " ");
                        msg = msg + arg;
                    }

                    Bukkit.broadcastMessage(ChatColor.RED + "[" + ChatColor.YELLOW + "Server" + ChatColor.RED + "] " + msg);
                    return true;
                }
                if (args.length < 2)
                {
                    pl.sendMessage(ChatColor.RED + "[" + ChatColor.YELLOW + "CmdM" + ChatColor.RED + "] " + ChatColor.GOLD + "Not enough args for 'say'");
                    return false;
                }
            }
        }

        return false;
    }
}
