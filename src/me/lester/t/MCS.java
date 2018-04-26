package me.lester.t;

import me.lester.t.commands.*;
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
        RegisterEvents();
        RegisterCommands();

        DEBUG = true;

    }

    @Override
    public void onDisable()
    {
    }

    private void RegisterCommands()
    {

        System.out.println("Registering Commands...");
        this.getCommand("survival").setExecutor(new SGMS());
        this.getCommand("creative").setExecutor(new SGMC());
        this.getCommand("smite").setExecutor(new SmiteC());
        this.getCommand("day").setExecutor(new TimeC());
        this.getCommand("night").setExecutor(new TimeC());
        this.getCommand("server").setExecutor(new ServerC());
    }

    private void RegisterEvents()
    {

        PluginManager pm = Bukkit.getPluginManager();

        System.out.println("Registering Events...");
        pm.registerEvents(new LogEvents(), this);
        pm.registerEvents(new MOTDEvent(), this);
        pm.registerEvents(new ChatEvent(), this);
    }
}