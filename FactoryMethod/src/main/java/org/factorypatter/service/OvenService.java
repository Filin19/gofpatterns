package org.factorypatter.service;

import org.factorypatter.dishes.Dish;
import org.factorypatter.factory.DishesFactory;

public class OvenService {

    public Dish bake(String ingredient) {
        return DishesFactory.choseDish(ingredient);
    }
}
