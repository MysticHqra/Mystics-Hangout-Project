package me.mystichara.mysticshangout.events;

import me.mystichara.mysticshangout.MysticsHangout;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.WorldLoadEvent;
import org.bukkit.plugin.Plugin;

public class onWorldLoad implements Listener {

    Plugin plugin = MysticsHangout.getPlugin(MysticsHangout.class);

    @EventHandler
    public void ServerStartup(WorldLoadEvent e) {

        plugin.getServer().dispatchCommand(plugin.getServer().getConsoleSender(),"npc select 4");
        plugin.getServer().dispatchCommand(plugin.getServer().getConsoleSender(),"sentinel guard");
        plugin.getLogger().info(MysticsHangout.Color("Bengali is guarding the house by default"));

    }
}
