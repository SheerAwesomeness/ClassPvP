package com.XenosMC.Rampage.Events;
import org.bukkit.ChatColor;
import com.XenosMC.Rampage.ClassSelector.ClassSelect;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

/**
 * Created by Thiemo on 3-5-2014.
 */

public class PlayerInteract implements Listener {
    public String title = ChatColor.BLACK + "[" + ChatColor.DARK_RED
            + "Rampage" + ChatColor.BLACK + "]";

    /****************************************
     * * Class Selector! * *
     ****************************************/

    @EventHandler
    public void onClick(InventoryClickEvent e) {
        if (e.getInventory().getName()
                .equalsIgnoreCase(ChatColor.WHITE + "Select your class!")) {
        }

        if (e.getSlot() == 0) {
            Player p = (Player) e.getWhoClicked();

            ClassSelect.Brute(p);
            e.setCancelled(true);

            p.closeInventory();

        }

        if (e.getSlot() == 2) {
            Player p = (Player) e.getWhoClicked();

            ClassSelect.Assassin(p);
            e.setCancelled(true);

            p.closeInventory();

        }

        if (e.getSlot() == 4) {
            Player p = (Player) e.getWhoClicked();

            if (p.hasPermission("class.vip")) {
                ClassSelect.Marksman(p);
            } else {
                p.sendMessage(this.title + ChatColor.DARK_RED
                        + " You must have VIP or higher to use this class!");
            }

            e.setCancelled(true);

            p.closeInventory();

        }

        if (e.getSlot() == 6) {
            Player p = (Player) e.getWhoClicked();

            if (p.hasPermission("class.vip")) {
                ClassSelect.Spellbinder(p);
            } else {
                p.sendMessage(this.title + ChatColor.DARK_RED
                        + " You must have VIP or higher to use this class!");
            }

            e.setCancelled(true);

            p.closeInventory();

        }

    }


}

