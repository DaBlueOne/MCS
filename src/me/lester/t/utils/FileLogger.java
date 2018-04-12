package me.lester.t.utils;

import org.bukkit.plugin.java.JavaPlugin;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileLogger
{
    public File FILE;
    private JavaPlugin _pl;

    public FileLogger(JavaPlugin pl)
    {

        _pl = pl;

        makeNewFile("login");
        makeNewFile("chat");

    }

    public File makeNewFile(String type)
    {

        String date = DateTimeFormatter.ofPattern("HH:mm:ss").format(LocalDateTime.now());

        File file = new File(_pl.getDataFolder().getAbsolutePath() + "\\" + date + type + ".txt");
        if (!file.exists())
        {
            try
            {
                if (file.createNewFile())
                {
                    System.out.println("File created" + file.getName());
                }
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }

        FILE = file;

        return file;
    }

    public void writeNewData(String type, String data)
    {
        try
        {
            String date = DateTimeFormatter.ofPattern("HH:mm:ss").format(LocalDateTime.now());
            BufferedWriter bw = new BufferedWriter(new FileWriter(_pl.getDataFolder().getAbsolutePath() + "\\" + date + type + ".txt", true));

            bw.write(data);
            bw.newLine();
            bw.close();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public File getFile(String date, String type)
    {
        String dir = _pl.getDataFolder().getAbsolutePath() + "\\" + date + type + ".txt";

        return new File(dir);
    }
}