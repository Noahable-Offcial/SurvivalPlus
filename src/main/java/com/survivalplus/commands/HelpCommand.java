package com.survivalplus.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.survivalplus.managers.PopupManager;

public class HelpCommand implements CommandExecutor {


    @Override
    public boolean onCommand(
            CommandSender sender,
            Command command,
            String label,
            String[] args) {


        if (!(sender instanceof Player player)) {

            sender.sendMessage("Only players can use this command!");

            return true;
        }


        PopupManager.title(
                player,
                "§6SurvivalPlus",
                "§eCommands"
        );


        player.sendMessage("""
                
                §6===== SurvivalPlus =====
                
                §e/spawn
                §e/shop
                §e/home
                §e/randomtp
                §e/balance
                §e/pay
                
                §7More commands coming soon!
                
                """);


        return true;
    }
}
