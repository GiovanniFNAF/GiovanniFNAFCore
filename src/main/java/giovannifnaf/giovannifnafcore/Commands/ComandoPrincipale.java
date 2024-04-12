package giovannifnaf.giovannifnafcore.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;

public class ComandoPrincipale implements CommandExecutor, Listener {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(label.equalsIgnoreCase("giovannifnafcore")) {
            return onComandoPrincipale(sender);
        }
        return false;
    }

    public boolean onComandoPrincipale(CommandSender sender) {
        if(sender.hasPermission("giovannifnaf.core")) {
            sender.sendMessage(ChatColor.GOLD + "Running " + ChatColor.BOLD + "GiovanniFNAF Core");
            return true;
        } else {
            sender.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "GIOVANNIFNAF CORE " + ChatColor.GRAY + "" + ChatColor.BOLD + "» " + ChatColor.RED + "Comando Sconosciuto!");
            return false;
        }
    }
}
