package top.hyreon.blastmine;

import org.bukkit.plugin.java.JavaPlugin;

public class SuperBlastMine extends JavaPlugin {

    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(new BlastListener(), this);

    }

}

