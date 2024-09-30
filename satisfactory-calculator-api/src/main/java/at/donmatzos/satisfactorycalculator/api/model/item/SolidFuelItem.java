package at.donmatzos.satisfactorycalculator.api.model.item;

import at.donmatzos.satisfactorycalculator.api.model.recipe.Recipe;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class SolidFuelItem extends StackableItem
{
    private long energy;

    public long getStackEnergy()
    {
        return energy * (long) getStackSize();
    }

    public SolidFuelItem(final String name,
                         final String imageUrl,
                         final List<ItemType> types,
                         final Recipe recipe,
                         final List<Recipe> alternateRecipes,
                         final int stackSize,
                         final boolean isSinkable,
                         final int sinkPoints,
                         final long energy)
    {
        super(name, imageUrl, types, recipe, alternateRecipes, stackSize, isSinkable, sinkPoints);
        this.energy = energy;
    }

    public SolidFuelItem(final String name,
                         final String imageUrl,
                         final List<ItemType> types,
                         final Recipe recipe,
                         final List<Recipe> alternateRecipes,
                         final int stackSize,
                         final boolean isSinkable,
                         final long energy)
    {
        super(name, imageUrl, types, recipe, alternateRecipes, stackSize, isSinkable);
        this.energy = energy;
    }


}

//name = "";
//getItemTypes().addAll(List.of(ItemType.BIOMASS));
//imageUrl = "";
//stackSize = Constants.StackSize.ONE_HUNDRED;
//isSinkable = true;
//sinkPoints = 3;
//energy = 15L;
