package org.factorypatter;

import org.factorypatter.client.Oven;
import org.factorypatter.dishes.ApplePie;
import org.factorypatter.dishes.Dish;

public class Main {
    public static void main(String[] args) {
        Oven oven = new Oven();
        Dish dish1 = oven.bake("apple");
        Dish dish2 = oven.bake("pepperoni");
        dish1.smell();
        dish2.smell();
    }
}