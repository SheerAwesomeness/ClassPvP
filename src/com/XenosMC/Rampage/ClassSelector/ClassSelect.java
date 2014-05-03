package com.XenosMC.Rampage.ClassSelector;
import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/**
 * Created by Thiemo on 3-5-2014.
 */


public class ClassSelect {

    /****************************************
     * * Brute Class! * *
     ****************************************/

    @SuppressWarnings("deprecation")
    public static void Brute (Player p) {

        p.getInventory().clear();
        p.setHealth(20.0);

        ItemStack ironsword = new ItemStack(Material.IRON_AXE);
        ItemStack apples = new ItemStack(Material.APPLE, 12);

        p.getInventory().addItem(ironsword);
        p.getInventory().addItem(apples);
        p.playEffect(p.getLocation(), Effect.GHAST_SHRIEK, 5);

        p.updateInventory();

    }

    /****************************************
     * * Assassin Class! * *
     ****************************************/

    @SuppressWarnings("deprecation")
    public static void Assassin (Player p) {

        p.getInventory().clear();
        p.setHealth(20.0);

        ItemStack ironsword = new ItemStack(Material.GOLD_SWORD);
        ItemStack apples = new ItemStack(Material.APPLE, 12);

        p.getInventory().addItem(ironsword);
        p.getInventory().addItem(apples);
        p.playEffect(p.getLocation(), Effect.GHAST_SHRIEK, 5);

        p.updateInventory();

    }

    /****************************************
     * * Marksman Class! * *
     ****************************************/

    @SuppressWarnings("deprecation")
    public static void Marksman (Player p) {

        p.getInventory().clear();
        p.setHealth(20.0);

        ItemStack goldsword = new ItemStack(Material.BOW);
        ItemStack apples = new ItemStack(Material.APPLE, 12);

        p.getInventory().addItem(goldsword);
        p.getInventory().addItem(apples);
        p.playEffect(p.getLocation(), Effect.GHAST_SHRIEK, 5);

        p.updateInventory();

    }

    /****************************************
     * * Spellbinder Class! * *
     ****************************************/

    @SuppressWarnings("deprecation")
    public static void Spellbinder (Player p) {



        ItemStack sbtool = new ItemStack(Material.BLAZE_POWDER);
        sbtool.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 5);

        p.getInventory().clear();
        p.setHealth(20.0);
        ItemStack apples = new ItemStack(Material.APPLE, 12);

        p.getInventory().addItem(sbtool);
        p.getInventory().addItem(apples);
        p.playEffect(p.getLocation(), Effect.GHAST_SHRIEK, 5);


        p.updateInventory();

    }

}
