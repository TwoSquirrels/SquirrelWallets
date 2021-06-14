package io.github.twosquirrels.squirrelwallets;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * SquirrelWallets
 * @version 1.0-SNAPSHOT
 * @since 1.0-SNAPSHOT
 * @author TwoSquirrels
 */
public final class SquirrelWallets extends JavaPlugin {

    /**
     * This is TestClass
     * @since 1.0-SNAPSHOT
     * @author TwoSquirrels
     */
    private static class TestClass {
        private static class TestClass2 {
            // This is TestClass3
            private static class TestClass3 {

            }
        }
        /*
        This is TestClass4
        Descriptions
        */
        private static class TestClass4 {

        }
    }

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
