package me.lester.t;

import me.lester.t.commands.SGMC;
import me.lester.t.commands.SGMS;
import me.lester.t.events.ChatEvent;
import me.lester.t.events.LogEvents;
import me.lester.t.events.MOTDEvent;
import me.lester.t.utils.FileLogger;
import org.bukkit.Bukkit;
import org.bukkit.command.SimpleCommandMap;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.lang.reflect.Field;

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

        PluginManager pm = Bukkit.getPluginManager();
        SimpleCommandMap commandMap = null;
        Field commandMapField = null;

        try
        {
            commandMapField = Bukkit.getPluginManager().getClass()
                    .getDeclaredField("commandMap");
            commandMapField.setAccessible(true);
        } catch (NoSuchFieldException e)
        {
            e.printStackTrace();
        }
        try
        {
            commandMap = (SimpleCommandMap) commandMapField.get(pm);
        } catch (IllegalAccessException e)
        {
            e.printStackTrace();
        }

        commandMap.register("creative", "creative", new SGMC());
        commandMap.register("survival", "survival", new SGMS());
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