package ca.evannosich.FleshToLeather;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class FleshToLeather extends JavaPlugin {

    @Override
    public void onEnable() {

        ItemStack leatherItem = new ItemStack(Material.LEATHER);

        NamespacedKey leatherKey = new NamespacedKey(this, "LEATHER");

        float experience = 0.35f;

        int cookingTime = 200;

        FurnaceRecipe leatherRecipe = new FurnaceRecipe(leatherKey, leatherItem, Material.ROTTEN_FLESH, experience, cookingTime);

        Bukkit.addRecipe(leatherRecipe);
    }

    @Override
    public void onDisable() {

    }

}
