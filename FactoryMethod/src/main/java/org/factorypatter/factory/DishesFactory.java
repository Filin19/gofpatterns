package org.factorypatter.factory;

import org.factorypatter.dishes.ApplePie;
import org.factorypatter.dishes.Dish;
import org.factorypatter.dishes.Pizza;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class DishesFactory {

    private static final Map<String, Supplier<Dish>> dishes = new HashMap<>();

    static {
        dishes.put("apple", ApplePie::new);
        dishes.put("pepperoni", Pizza::new);
    }

    public static Dish choseDish(String ingredient) {
        Supplier<Dish> dish = dishes.get(ingredient);
        if (dish == null) {
            throw new IllegalArgumentException("there no dish with this ingredient: " + ingredient);
        }

        return dish.get();
    }
}
