package giovannifnaf.giovannifnafcore.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;

public class GivvaCibo implements CommandExecutor, Listener {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(label.equalsIgnoreCase("cibo")) {
            return onGivvaCibo(sender);
        }
        return false;
    }

    public boolean onGivvaCibo(CommandSender sender) {
        if(sender.hasPermission("giovannifnafcore.cibo")) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "minecraft:give @p minecraft:cooked_porkchop 16");
            sender.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "GIOVANNIFNAF CORE " + ChatColor.GRAY + "" + ChatColor.BOLD + "» " + ChatColor.GREEN + "TI ho dato del cibo!");
            return true;
        } else {
            sender.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "GIOVANNIFNAF CORE " + ChatColor.GRAY + "" + ChatColor.BOLD + "» " + ChatColor.RED + "Comando Sconosciuto!");
            return false;
        }
    }
}
