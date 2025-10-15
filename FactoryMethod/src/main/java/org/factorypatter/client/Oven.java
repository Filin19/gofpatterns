package org.factorypatter.client;

import org.factorypatter.dishes.Dish;
import org.factorypatter.factory.DishesFactory;

public class Oven {

    public Dish bake(String ingredient) {
        return DishesFactory.choseDish(ingredient);
    }
}
