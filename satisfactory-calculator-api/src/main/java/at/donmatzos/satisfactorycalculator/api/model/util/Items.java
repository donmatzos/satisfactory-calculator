package at.donmatzos.satisfactorycalculator.api.model.util;

import at.donmatzos.satisfactorycalculator.api.model.item.Item;
import at.donmatzos.satisfactorycalculator.api.model.item.ItemType;
import at.donmatzos.satisfactorycalculator.api.model.item.SolidFuelItem;
import at.donmatzos.satisfactorycalculator.api.model.item.StackableItem;
import at.donmatzos.satisfactorycalculator.api.model.recipe.Recipe;

import java.util.List;

public final class Items
{
    /* <------------------------ A -----------------------> */
    public static final Item ADAPTIVE_CONTROL_UNIT = new StackableItem("Adaptive Control Unit",
            "https://satisfactory.wiki.gg/images/b/be/Adaptive_Control_Unit.png",
            List.of(ItemType.PROJECT_ASSEMBLY_PART, ItemType.CRAFTING_COMPONENT),
            new Recipe(),
            List.of(new Recipe(), new Recipe()),
            Constants.StackSize.FIFTY,
            true,
            76368);
    public static final Item AI_EXPANSION_SERVER = new StackableItem("AI Expansion Server",
            "https://satisfactory.wiki.gg/images/9/97/AI_Expansion_Server.png",
            List.of(ItemType.PROJECT_ASSEMBLY_PART),
            new Recipe(),
            List.of(new Recipe(), new Recipe()),
            Constants.StackSize.FIFTY,
            true,
            597652);
    public static final Item AI_LIMITER = new StackableItem("AI Limiter",
            "https://satisfactory.wiki.gg/images/0/0d/AI_Limiter.png",
            List.of(ItemType.CRAFTING_COMPONENT, ItemType.EQUIPMENT_MATERIAL, ItemType.BUILDING_MATERIAL, ItemType.RESEARCH_MATERIAL),
            new Recipe(),
            List.of(new Recipe(), new Recipe()),
            Constants.StackSize.ONE_HUNDRED,
            true,
            920);
    public static final Item ALCLAD_ALUMINIUM_SHEET = new StackableItem("Alclad Aluminium Sheet",
            "https://satisfactory.wiki.gg/images/4/4e/Alclad_Aluminum_Sheet.png",
            List.of(ItemType.CRAFTING_COMPONENT, ItemType.EQUIPMENT_MATERIAL, ItemType.BUILDING_MATERIAL),
            new Recipe(),
            List.of(new Recipe(), new Recipe()),
            Constants.StackSize.TWO_HUNDRED,
            true,
            266);
    public static final Item ALIEN_DNA_CAPSULE = new StackableItem("Alien DNA Capsule",
            "https://satisfactory.wiki.gg/images/b/b3/Alien_DNA_Capsule.png",
            List.of(ItemType.BIOMASS, ItemType.RESEARCH_MATERIAL),
            new Recipe(),
            List.of(new Recipe(), new Recipe()),
            Constants.StackSize.FIFTY,
            false);
    public static final Item ALIEN_POWER_MATRIX = new StackableItem("Alien Power Matrix",
            "https://satisfactory.wiki.gg/images/f/fd/Alien_Power_Matrix.png",
            List.of(ItemType.ALIEN_TECH, ItemType.RESEARCH_MATERIAL),
            new Recipe(),
            List.of(new Recipe(), new Recipe()),
            Constants.StackSize.FIFTY,
            true,
            210);
    public static final Item ALIEN_PROTEIN = new StackableItem("Alien Protein",
            "https://satisfactory.wiki.gg/images/6/6f/Alien_Protein.png",
            List.of(ItemType.BIOMASS, ItemType.CRAFTING_COMPONENT, ItemType.RESEARCH_MATERIAL, ItemType.EQUIPMENT_MATERIAL),
            new Recipe(),
            List.of(new Recipe(), new Recipe()),
            Constants.StackSize.ONE_HUNDRED,
            false);
    public static final Item ALIEN_REMAINS = new StackableItem("Alien Remains",
            "https://satisfactory.wiki.gg/images/e/e0/Hog_Remains.png",
            List.of(ItemType.BIOMASS, ItemType.CRAFTING_COMPONENT, ItemType.RESEARCH_MATERIAL),
            new Recipe(),
            List.of(new Recipe(), new Recipe()),
            Constants.StackSize.FIFTY,
            false);
    public static final Item ALUMINIUM_CASING = new StackableItem("Aluminium Casing",
            "https://satisfactory.wiki.gg/images/4/40/Aluminum_Casing.png",
            List.of(ItemType.CRAFTING_COMPONENT, ItemType.EQUIPMENT_MATERIAL, ItemType.BUILDING_MATERIAL),
            new Recipe(),
            List.of(new Recipe(), new Recipe()),
            Constants.StackSize.TWO_HUNDRED,
            true,
            393);
    public static final Item ALUMINIUM_INGOT = new StackableItem("Aluminium Ingot",
            "https://satisfactory.wiki.gg/images/4/48/Aluminum_Ingot.png",
            List.of(ItemType.CRAFTING_COMPONENT),
            new Recipe(),
            List.of(new Recipe(), new Recipe()),
            Constants.StackSize.ONE_HUNDRED,
            true,
            131);
    public static final Item ALUMINIUM_SCRAP = new StackableItem("Aluminium Scrap",
            "https://satisfactory.wiki.gg/images/4/4b/Aluminum_Scrap.png",
            List.of(ItemType.CRAFTING_COMPONENT),
            new Recipe(),
            List.of(new Recipe(), new Recipe()),
            Constants.StackSize.FIVE_HUNDRED,
            true,
            27);
    public static final Item ASSEMBLY_DIRECTOR_SYSTEM = new StackableItem("Assembly Directory System",
            "https://satisfactory.wiki.gg/images/b/ba/Assembly_Director_System.png",
            List.of(ItemType.PROJECT_ASSEMBLY_PART, ItemType.CRAFTING_COMPONENT),
            new Recipe(),
            List.of(new Recipe(), new Recipe()),
            Constants.StackSize.FIFTY,
            true,
            500176);
    public static final Item AUTOMATED_WIRING = new StackableItem("Automated Wiring",
            "https://satisfactory.wiki.gg/images/f/f3/Automated_Wiring.png",
            List.of(ItemType.PROJECT_ASSEMBLY_PART, ItemType.CRAFTING_COMPONENT),
            new Recipe(),
            List.of(new Recipe(), new Recipe()),
            Constants.StackSize.FIFTY,
            true,
            1440);

    /* <------------------------ B -----------------------> */
    public static final Item BIOMASS = new SolidFuelItem("Biomass",
            "https://satisfactory.wiki.gg/wiki/Biomass#/media/File:Biomass.png",
            List.of(ItemType.BIOMASS, ItemType.CRAFTING_COMPONENT, ItemType.FUEL, ItemType.BUILDING_MATERIAL, ItemType.RESEARCH_MATERIAL),
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
