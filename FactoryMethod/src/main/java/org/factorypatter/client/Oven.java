package org.factorypatter.client;

import org.factorypatter.dishes.Dish;
import org.factorypatter.factory.DishesFactory;

public class Oven {

    public void bake(String ingredient) {
        System.out.println("Baking dish");
        Dish dish = DishesFactory.choseDish(ingredient);
        dish.smell();
    }
}
