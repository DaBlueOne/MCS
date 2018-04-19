package me.lester.t.events;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MOTDEvent implements Listener
{


    @EventHandler
    public void onServerListRefresh(ServerListPingEvent e)
    {
        String time = DateTimeFormatter.ofPattern("HH:ss").format(LocalDateTime.now());

        e.setMotd(ChatColor.RED + "Bolstridge Room Server" + "\n" + ChatColor.AQUA + "Custom Coded by DaBlueOne");
    }

    enum periods
    {
        P1(733, 828),
        P2(834, 924),
        P3(930, 1020),
        P4(1026, 1116),
        P5(1122, 1212),
        P6(1218, 1308),
        P7(1314, 1402),
        P8(1410, 1500);


        int start_ = 0;
        int end_ = 0;

        periods(int start, int end)
        {
            start_ = start;
            end_ = end;
        }

        public int getStart()
        {
            return start_;
        }

        public int getEnd_()
        {
            return end_;
        }
    }
}