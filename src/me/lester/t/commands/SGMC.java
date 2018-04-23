package me.lester.t.commands;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SGMC implements CommandExecutor
{

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String cmdLabel, String[] args)
    {
        Player pl = (Player) sender;

        if (args.length == 0 && cmdLabel.equalsIgnoreCase("creative"))
        {
            if (pl.getGameMode() == GameMode.CREATIVE)
            {

                pl.sendMessage(ChatColor.RED + "[" + ChatColor.YELLOW + "GameMode" + ChatColor.RED + "] " + ChatColor.GOLD + "You're already in Creative mode.");
                return true;
            }

            pl.setGameMode(GameMode.CREATIVE);
            pl.sendMessage(ChatColor.RED + "[" + ChatColor.YELLOW + "GameMode" + ChatColor.RED + "] " + ChatColor.GOLD + "Your gamemode has been changed to " + ChatColor.YELLOW + "Creative" + ChatColor.GOLD + ".");
            return true;
        }

        return false;
    }
}