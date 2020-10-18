package me.mystichara.mysticshangout;

import me.mystichara.mysticshangout.commands.Bengali;
import me.mystichara.mysticshangout.events.onDeath;
import me.mystichara.mysticshangout.events.onWorldLoad;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class MysticsHangout extends JavaPlugin implements Listener {

    public static String Color(String str) {
        return ChatColor.translateAlternateColorCodes('&', str);
    }

    @Override
    public void onEnable() {
        getLogger().info("Plugin by MysticHara");
        getServer().getPluginManager().registerEvents(this,this);
        getServer().getPluginManager().registerEvents(new onDeath(),this);
        getServer().getPluginManager().registerEvents(new onWorldLoad(),this);
        getCommand("bengali").setExecutor(new Bengali());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Shutting down Plugin101");
    }

    //Events

    @EventHandler
    public void onBedLeave(PlayerBedLeaveEvent e) {
        Player player = e.getPlayer();
        Bukkit.broadcastMessage(ChatColor.GREEN + player.getDisplayName() + Color("&c has left the bed!"));
    }

    @EventHandler
    public void onBedEnter(PlayerBedEnterEvent e) {
        Player player = e.getPlayer();
        Bukkit.broadcastMessage(ChatColor.GREEN + player.getDisplayName() + Color("&c has entered a bed!"));
    }

    //Commands

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        //Mystics Hangout info command
        if(command.getName().equals("mystic")) {
            String[] msg = {Color("&cMysticsHangout-1.0 by MysticHqra"),Color("&cPremium Custom Plugin")};
            if(sender instanceof Player) {
                Player player = (Player)sender;
                player.sendMessage(msg[0]+"\n"+msg[1]);
            }
            else
                System.out.println(msg[0]+"\n"+msg[1]);
        }



        return true;
    }
}