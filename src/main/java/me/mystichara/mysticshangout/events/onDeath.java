package me.mystichara.mysticshangout.events;

import me.mystichara.mysticshangout.MysticsHangout;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.world.WorldLoadEvent;

public class onDeath implements Listener {

    @EventHandler
    public void OnDeath(PlayerDeathEvent event) {
        Player player = event.getEntity();
        player.sendTitle(MysticsHangout.Color("&cYou died!"), MysticsHangout.Color("&7Click respawn"),20,40,20);
    }

}
