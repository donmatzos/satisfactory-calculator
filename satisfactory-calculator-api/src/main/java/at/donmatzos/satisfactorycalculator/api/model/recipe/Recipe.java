package at.donmatzos.satisfactorycalculator.api.model.recipe;

import at.donmatzos.satisfactorycalculator.api.model.item.Item;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor
@Getter
public class Recipe implements Processable
{
    private Item product;

    private int quantity;

    private float productionTimeInSeconds;

    private boolean isAlternate;

    private final Map<Item, Integer> ingredients = new HashMap<>();

    private Recipe(Builder builder) {
        this.product = builder.product;
        this.quantity = builder.quantity;
        this.productionTimeInSeconds = builder.productionTimeInSeconds;
        this.isAlternate = builder.isAlternate;
        this.ingredients.putAll(builder.ingredients); // Copy ingredients
    }

    @Override
    public String getProcessingBuilding()
    {
        return "";
    }

    public static class Builder {
        private Item product;
        private int quantity;
        private float productionTimeInSeconds;
        private boolean isAlternate;
        private final Map<Item, Integer> ingredients = new HashMap<>();

        public Builder setProduct(Item product) {
            this.product = product;
            return this;
        }

        public Builder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder setProductionTimeInSeconds(float productionTimeInSeconds) {
            this.productionTimeInSeconds = productionTimeInSeconds;
            return this;
        }

        public Builder setIsAlternate(boolean isAlternate) {
            this.isAlternate = isAlternate;
            return this;
        }

        public Builder addIngredient(Item ingredient, int quantity) {
            this.ingredients.put(ingredient, quantity);
            return this;
        }

        public Recipe build() {
            return new Recipe(this);
        }
    }

}
