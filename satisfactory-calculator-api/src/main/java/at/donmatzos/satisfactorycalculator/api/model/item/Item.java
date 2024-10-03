package at.donmatzos.satisfactorycalculator.api.model.item;

import at.donmatzos.satisfactorycalculator.api.model.recipe.Recipe;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public abstract class Item
{
    @Setter
    private String name;

    @Setter
    private String imageUrl;

    private final Set<ItemType> itemTypes = new HashSet<>();

    @JsonIgnore
    @Setter
    private Recipe recipe;

    @JsonIgnore
    private final List<Recipe> alternateRecipes = new ArrayList<>();

    public boolean isCraftingComponent()
    {
        return itemTypes.contains(ItemType.CRAFTING_COMPONENT);
    }

    public void addItemType(ItemType itemType)
    {
        itemTypes.add(itemType);
    }

    public void addItemTypes(List<ItemType> itemTypes)
    {
        for (ItemType itemType : itemTypes)
        {
            addItemType(itemType);
        }
    }

    public void addAlternateRecipe(final Recipe alternateRecipe)
    {
        alternateRecipes.add(alternateRecipe);
    }

    public void addAlternateRecipes(final List<Recipe> alternateRecipes)
    {
        for (Recipe alternateRecipe : alternateRecipes)
        {
            addAlternateRecipe(alternateRecipe);
        }
    }

    public Item(final String name, final String imageUrl, final List<ItemType> itemTypes, final Recipe recipe, final List<Recipe> alternateRecipes)
    {
        this.name = name;
        this.imageUrl = imageUrl;
        addItemTypes(itemTypes);
        this.recipe = recipe;
        addAlternateRecipes(alternateRecipes);
    }

}
