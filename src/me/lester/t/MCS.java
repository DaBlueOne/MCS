package me.lester.t;

import me.lester.t.events.ChatEvent;
import me.lester.t.events.LogEvents;
import me.lester.t.events.MOTDEvent;
import me.lester.t.utils.FileLogger;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class MCS extends JavaPlugin
{

    public static FileLogger FILEL;
    public static boolean DEBUG;

    @Override
    public void onEnable()
    {

        FILEL = new FileLogger(this);
        registerEvents();

        DEBUG = true;

    }

    @Override
    public void onDisable()
    {

    }

    public void registerEvents()
    {

        PluginManager pm = Bukkit.getPluginManager();

        System.out.println("Registering Events...");
        pm.registerEvents(new LogEvents(), this);
        pm.registerEvents(new MOTDEvent(), this);
        pm.registerEvents(new ChatEvent(), this);
    }

}