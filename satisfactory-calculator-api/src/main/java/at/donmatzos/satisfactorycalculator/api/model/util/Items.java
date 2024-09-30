package at.donmatzos.satisfactorycalculator.api.model.util;

import at.donmatzos.satisfactorycalculator.api.model.item.Item;
import at.donmatzos.satisfactorycalculator.api.model.item.ItemType;
import at.donmatzos.satisfactorycalculator.api.model.item.SolidFuelItem;
import at.donmatzos.satisfactorycalculator.api.model.item.StackableItem;
import at.donmatzos.satisfactorycalculator.api.model.recipe.Recipe;

import java.util.List;

public final class Items
{
    public static final Item ALIEN_REMAINS = new StackableItem("Alien Remains",
            "https://satisfactory.wiki.gg/images/e/e0/Hog_Remains.png",
            List.of(ItemType.BIOMASS, ItemType.CRAFTING_COMPONENT),
            new Recipe(),
            List.of(new Recipe(), new Recipe()),
            Constants.StackSize.FIFTY,
            false);
    public static final Item BIOMASS = new SolidFuelItem("Biomass",
            "https://satisfactory.wiki.gg/wiki/Biomass#/media/File:Biomass.png",
            List.of(ItemType.BIOMASS, ItemType.CRAFTING_COMPONENT, ItemType.FUEL),
            new Recipe(),
            List.of(new Recipe(), new Recipe()),
            Constants.StackSize.TWO_HUNDRED,
            true,
            12,
            180L);
    public static final Item LEAVES = new SolidFuelItem("Leaves",
            "https://satisfactory.wiki.gg/wiki/Leaves#/media/File:Leaves.png",
            List.of(ItemType.BIOMASS, ItemType.CRAFTING_COMPONENT, ItemType.FUEL),
            new Recipe(),
            List.of(new Recipe(), new Recipe()),
            Constants.StackSize.FIVE_HUNDRED,
            true,
            3,
            15L);
}
