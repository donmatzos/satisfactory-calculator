package at.donmatzos.satisfactorycalculator.impl.controller;

import at.donmatzos.satisfactorycalculator.api.model.recipe.Recipe;
import at.donmatzos.satisfactorycalculator.api.model.util.Items;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
@RequestMapping("/api/test")
@RestController("Testing...")
public class TestController
{
    @GetMapping("/recipe")
    public Recipe getTestRecipe() {
        return new Recipe.Builder()
                .setProduct(Items.BIOMASS)
                .setQuantity(5)
                .setProductionTimeInSeconds(5F)
                .setIsAlternate(false)
                .addIngredient(Items.LEAVES, 10)
                .build();
    }
}
