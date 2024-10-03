package at.donmatzos.satisfactorycalculator.api.model.item;

import at.donmatzos.satisfactorycalculator.api.model.recipe.Recipe;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class HealingItem extends StackableItem
{
    private int regeneratedHp;

    public HealingItem(final String name,
                         final String imageUrl,
                         final List<ItemType> types,
                         final Recipe recipe,
                         final List<Recipe> alternateRecipes,
                         final int stackSize,
                         final boolean isSinkable,
                         final int sinkPoints,
                         final int regeneratedHp)
    {
        super(name, imageUrl, types, recipe, alternateRecipes, stackSize, isSinkable, sinkPoints);
        this.regeneratedHp = regeneratedHp;
    }

    public HealingItem(final String name,
                       final String imageUrl,
                       final List<ItemType> types,
                       final Recipe recipe,
                       final List<Recipe> alternateRecipes,
                       final int stackSize,
                       final boolean isSinkable,
                       final int regeneratedHp)
    {
        super(name, imageUrl, types, recipe, alternateRecipes, stackSize, isSinkable);
        this.regeneratedHp = regeneratedHp;
    }
}
