package io.github.twosquirrels.squirrelwallets;

import org.bukkit.plugin.java.JavaPlugin;

public final class SquirrelWallets extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Enabled SquirrelWallets");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Disabled SquirrelWallets");
    }
}
