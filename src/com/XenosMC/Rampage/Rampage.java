package com.XenosMC.Rampage;


import java.util.ArrayList;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.XenosMC.Rampage.Events.PlayerInteract;

/**
 * Created by Thiemo on 3-5-2014.
 */


public class Rampage extends JavaPlugin {
    public final Logger logger = Logger.getLogger("Minecraft");
    public String title = ChatColor.BLACK + "[" + ChatColor.DARK_RED
            + "Rampage" + ChatColor.BLACK + "]";

    @Override
    public void onEnable() {
        PluginDescriptionFile file = this.getDescription();
        this.logger.info(file.getName() + " is enabled! Wiehoow! :)");

        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new PlayerInteract(), this);

    }

    @Override
    public void onDisable() {
        PluginDescriptionFile file = this.getDescription();
        this.logger.info(file.getName() + " is disabled! Awhh! :(");
    }



    /****************************************
     *                                      *
     *          Class Selector!             *
     *                                      *
     ****************************************/

    public void classSelect(Player p, Human h) {
        Inventory KitSelect = Bukkit.createInventory(null, 9, ChatColor.WHITE
                + "Select your class!");

        /** Brute Class **/
        ItemStack basic = new ItemStack(Material.IRON_AXE);
        ItemMeta basicmeta = basic.getItemMeta();
        basicmeta.setDisplayName(ChatColor.GRAY + "Brute!");
        ArrayList<String> lore = new ArrayList<String>();
        basicmeta.setLore(lore);

        basic.setItemMeta(basicmeta);

        KitSelect.setItem(0, basic);

        /** Assassin Class **/
        ItemStack basic3 = new ItemStack(Material.GOLD_SWORD);
        ItemMeta basicmeta3 = basic3.getItemMeta();
        basicmeta3.setDisplayName(ChatColor.GRAY + "Assassin!");
        ArrayList<String> lore3 = new ArrayList<String>();
        basicmeta3.setLore(lore3);

        basic3.setItemMeta(basicmeta3);

        KitSelect.setItem(2, basic3);

        /** Marksman Class **/
        ItemStack basic5 = new ItemStack(Material.BOW);
        ItemMeta basicmeta5 = basic5.getItemMeta();
        basicmeta5.setDisplayName(ChatColor.GRAY + "Marksman!" + ChatColor.GOLD
                + " [VIP]");
        ArrayList<String> lore5 = new ArrayList<String>();
        basicmeta5.setLore(lore5);

        basic5.setItemMeta(basicmeta5);

        KitSelect.setItem(4, basic5);

        /** Spellbinder Class **/
        ItemStack basic7 = new ItemStack(Material.BLAZE_POWDER);
        ItemMeta basicmeta7 = basic7.getItemMeta();
        basicmeta7.setDisplayName(ChatColor.GRAY + "Spellbinder!"
                + ChatColor.GOLD + " [VIP]");
        ArrayList<String> lore7 = new ArrayList<String>();
        basicmeta7.setLore(lore7);

        basic7.setItemMeta(basicmeta7);

        KitSelect.setItem(6, basic7);

        p.openInventory(KitSelect);
    }

    /****************************************
     * * Rampage Commands! * *
     ****************************************/

    public boolean onCommand(CommandSender sender, Command cmd, String arg2,
                             String[] args) {
        Player p = (Player) sender;
        if ((cmd.getName().equalsIgnoreCase("rampage")))

        {
            if (args.length == 0) {
                sendHelpMessage(sender);
            } else if (args.length == 1) {
                if (args[0].equalsIgnoreCase("command1")) {
                    p.sendMessage(this.title + ChatColor.WHITE
                            + " Nothing happend..");
                }

                else if (args[0].equalsIgnoreCase("help")) {
                    sendHelpMessage(sender);

                    {
                    }
                }

                else if (args[0].equalsIgnoreCase("class")) {

                    classSelect(p, null);
                    {
                    }
                }

            }

        }
        return false;
    }

    private void sendHelpMessage(CommandSender sender) {
        Player p = (Player) sender;
        p.sendMessage(ChatColor.DARK_RED
                + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        p.sendMessage(ChatColor.WHITE + "All the commands of Rampage!");
        p.sendMessage(ChatColor.DARK_RED + " ");
        p.sendMessage(ChatColor.WHITE + "/rampage class - Choose your class!");
        p.sendMessage(ChatColor.WHITE + "/rampage help - Displays this list!");
        p.sendMessage(ChatColor.DARK_RED
                + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

    }

}

