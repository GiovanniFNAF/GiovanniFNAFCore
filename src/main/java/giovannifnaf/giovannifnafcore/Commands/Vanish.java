package giovannifnaf.giovannifnafcore.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class Vanish implements CommandExecutor, Listener {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(label.equalsIgnoreCase("vanish")) {
            return onVanish(sender);
        }
        return false;
    }

    public boolean onVanish(CommandSender sender) {
        Player player = (Player) sender;

        if(player.hasPermission("giovannifnafcore.staff")) {
            if(!player.isInvisible()) {
                player.setInvisible(true);
                player.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "GIOVANNIFNAF CORE " + ChatColor.GRAY + "" + ChatColor.BOLD + "» " + ChatColor.GREEN + "Vanish abilitata!");
                player.setDisplayName(player.getDisplayName());
            } else {
                player.setInvisible(false);
                player.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "GIOVANNIFNAF CORE " + ChatColor.GRAY + "" + ChatColor.BOLD + "» " + ChatColor.GREEN + "Vanish disabilitata!");
            }
        } else {
            player.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "GIOVANNIFNAF CORE " + ChatColor.GRAY + "" + ChatColor.BOLD + "» " + ChatColor.RED + "Comando Sconosciuto!");
            return false;
        }
        return true;
    }
}