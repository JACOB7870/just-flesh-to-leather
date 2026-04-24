package me.Jacob7870.justrottenfleshtoleather;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.CampfireRecipe;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.SmokingRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class Justrottenfleshtoleather extends JavaPlugin {

    @Override
    public void onEnable() {
        registerRecipes();
    }

    private void registerRecipes() {
        ItemStack result = new ItemStack(Material.LEATHER);
        RecipeChoice ingredient = new RecipeChoice.MaterialChoice(Material.ROTTEN_FLESH);
        float experience = 0.35f;

        // Furnace
        getServer().addRecipe(new FurnaceRecipe(new NamespacedKey(this, "flesh_to_leather_furnace"),
                result, ingredient, experience, 200));

        // Smoker
        getServer().addRecipe(new SmokingRecipe(new NamespacedKey(this, "flesh_to_leather_smoker"),
                result, ingredient, experience, 100));

        // Campfire
        getServer().addRecipe(new CampfireRecipe(new NamespacedKey(this, "flesh_to_leather_campfire"),
                result, ingredient, experience, 600));
    }
}