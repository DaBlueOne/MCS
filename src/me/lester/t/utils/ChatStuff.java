package me.lester.t.utils;

import org.bukkit.ChatColor;

public class ChatStuff
{

    public static String cmdM(String module, String msg)
    {
        return ChatColor.RED + "[" + ChatColor.YELLOW + module + ChatColor.RED + "] " + msg;
    }

}