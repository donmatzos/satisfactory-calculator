package at.donmatzos.satisfactorycalculator.api.model.item;

import at.donmatzos.satisfactorycalculator.api.model.recipe.Recipe;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StackableItem extends Item
{
    private int stackSize;

    private boolean isSinkable;

    private int sinkPoints = 0;

    public StackableItem(final String name,
                         final String imageUrl,
                         final List<ItemType> types,
                         final Recipe recipe,
                         final List<Recipe> alternateRecipes,
                         final int stackSize,
                         final boolean isSinkable,
                         final int sinkPoints) {
        super(name, imageUrl, types, recipe, alternateRecipes);
        this.stackSize = stackSize;
        this.isSinkable = isSinkable;
        this.sinkPoints = sinkPoints;
    }

    public StackableItem(final String name,
                         final String imageUrl,
                         final List<ItemType> types,
                         final Recipe recipe,
                         final List<Recipe> alternateRecipes,
                         final int stackSize,
                         final boolean isSinkable) {
        super(name, imageUrl, types, recipe, alternateRecipes);
        this.stackSize = stackSize;
        this.isSinkable = isSinkable;
    }

}
