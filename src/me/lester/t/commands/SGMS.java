package me.lester.t.commands;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.BukkitCommand;
import org.bukkit.entity.Player;

public class SGMS extends BukkitCommand
{

    public SGMS()
    {
        super("Survival");
    }

    @Override
    public boolean execute(CommandSender sender, String cmdLabel, String[] args)
    {
        Player pl = (Player) sender;

        if (args.length == 0 && cmdLabel.equalsIgnoreCase("survival"))
        {
            pl.setGameMode(GameMode.SURVIVAL);
            pl.sendMessage(ChatColor.RED + "[" + ChatColor.YELLOW + "GameMode" + ChatColor.RED + "] " + ChatColor.GOLD + "Your gamemode has been changed to " + ChatColor.YELLOW + "Survival " + ChatColor.GOLD + ".");
            return true;
        }

        return false;
    }
}