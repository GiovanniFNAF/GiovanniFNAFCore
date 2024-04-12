package giovannifnaf.giovannifnafcore.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class RemoveVanish implements CommandExecutor, Listener {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String args[]) {
        if(label.equalsIgnoreCase("removevanish")) {
            return onRemoveVanish(sender);
        }
        return false;
    }

    public boolean onRemoveVanish(CommandSender sender) {
        Player player = (Player) sender;

        if(player.hasPermission("giovannifnafcore.removevanish")) {
            if(player.isInvisible()) {
               player.setInvisible(false);
               player.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "GIOVANNIFNAF CORE " + ChatColor.GRAY + "" + ChatColor.BOLD + "» " + ChatColor.GREEN + "Invisibilità rimossa!");
            } else {
                player.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "GIOVANNIFNAF CORE " + ChatColor.GRAY + "" + ChatColor.BOLD + "» " + ChatColor.RED + "Non sei invisibile!");
            }
        } else {
            player.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "GIOVANNIFNAF CORE " + ChatColor.GRAY + "" + ChatColor.BOLD + "» " + ChatColor.RED + "Comando Sconosciuto!");
        }
        return false;
    }
}
