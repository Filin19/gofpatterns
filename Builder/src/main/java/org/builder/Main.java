package org.builder;

import org.builder.entity.Pizza;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = Pizza.builder().addCheese().addBacon().addMushrooms().build();
        System.out.println(pizza);
    }
}