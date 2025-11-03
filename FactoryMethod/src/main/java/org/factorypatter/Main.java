package org.factorypatter;

import org.factorypatter.service.OvenService;
import org.factorypatter.dishes.Dish;

public class Main {
    public static void main(String[] args) {
        OvenService ovenService = new OvenService();
        Dish dish1 = ovenService.bake("apple");
        Dish dish2 = ovenService.bake("pepperoni");
        dish1.smell();
        dish2.smell();
    }
}