package giovannifnaf.giovannifnafcore;

import giovannifnaf.giovannifnafcore.Commands.ComandoPrincipale;
import giovannifnaf.giovannifnafcore.Commands.GivvaCibo;
import giovannifnaf.giovannifnafcore.Commands.Vanish;
import giovannifnaf.giovannifnafcore.Commands.RemoveVanish;
import giovannifnaf.giovannifnafcore.Events.PlayerJoin;

import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin ;

public final class GiovanniFNAFCore extends JavaPlugin implements CommandExecutor, Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("GiovanniFNAF Core avviato con successo!");
        getServer().getPluginManager().registerEvents(this, this);
        getCommand("giovannifnafcore").setExecutor(new ComandoPrincipale());
        getCommand("vanish").setExecutor(new Vanish());
        getCommand("cibo").setExecutor(new GivvaCibo());
        getCommand("removevanish").setExecutor(new RemoveVanish());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("GiovanniFNAF Core disabilitato con successo!");
    }
}
