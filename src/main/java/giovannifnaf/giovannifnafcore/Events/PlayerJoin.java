package giovannifnaf.giovannifnafcore.Events;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        if(event.getPlayer().hasPermission("giovannifnafcore.join")) {
            event.getPlayer().sendMessage(ChatColor.GREEN + "Benvenuto nel server di test della VanillaFNAF!");
            event.getPlayer().sendMessage(ChatColor.GREEN + "Questo server verrà utilizzato solo in caso di " + ChatColor.BOLD + "TEST " + ChatColor.GREEN + "di vari plugin per la VanillaFNAF.");
            event.getPlayer().sendMessage(ChatColor.GREEN + "In caso tu avessi il possesso della console di questo server, ti preghiamo di spegnerlo quando avrai finito i tuoi test.");
            event.getPlayer().sendMessage(ChatColor.GREEN + "Questo per liberare spazio al server della VanillaFNAF.");
            event.getPlayer().sendMessage(ChatColor.GREEN + "Detto questo, buon test!");
        }
    }
}
