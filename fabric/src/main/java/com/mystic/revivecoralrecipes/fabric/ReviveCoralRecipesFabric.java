package com.mystic.revivecoralrecipes.fabric;

import com.mystic.revivecoralrecipes.ReviveCoralRecipes;
import net.fabricmc.api.ModInitializer;

public class ReviveCoralRecipesFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ReviveCoralRecipes.init();
    }
}