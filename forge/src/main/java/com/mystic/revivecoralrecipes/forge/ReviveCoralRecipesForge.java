package com.mystic.revivecoralrecipes.forge;

import com.mystic.revivecoralrecipes.ReviveCoralRecipes;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ReviveCoralRecipes.MOD_ID)
public class ReviveCoralRecipesForge {
    public ReviveCoralRecipesForge() {
        ReviveCoralRecipes.init();
    }
}