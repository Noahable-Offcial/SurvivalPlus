package com.survivalplus;

import org.bukkit.plugin.java.JavaPlugin;

import com.survivalplus.commands.HelpCommand;

public class SurvivalPlus extends JavaPlugin {

    private static SurvivalPlus instance;

    @Override
    public void onEnable() {

        instance = this;

        saveDefaultConfig();

        // Register Commands
        getCommand("help").setExecutor(new HelpCommand());

        getLogger().info("================================");
        getLogger().info(" SurvivalPlus Enabled!");
        getLogger().info(" Version 1.0");
        getLogger().info("================================");
    }


    @Override
    public void onDisable() {

        getLogger().info("SurvivalPlus Disabled!");

    }


    public static SurvivalPlus getInstance() {
        return instance;
    }
}
