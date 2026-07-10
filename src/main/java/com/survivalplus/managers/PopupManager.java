package com.survivalplus.managers;

import org.bukkit.entity.Player;

public class PopupManager {


    public static void title(
            Player player,
            String title,
            String subtitle) {


        player.sendTitle(
                title,
                subtitle,
                10,
                40,
                10
        );

    }


    public static void actionBar(
            Player player,
            String message) {


        player.sendActionBar(message);

    }
}
