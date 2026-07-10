package com.survivalplus;

import org.bukkit.plugin.java.JavaPlugin;

public class SurvivalPlus extends JavaPlugin {

    private static SurvivalPlus instance;

    @Override
    public void onEnable() {

        instance = this;

        saveDefaultConfig();

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
