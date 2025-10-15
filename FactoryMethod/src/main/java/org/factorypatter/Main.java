package org.factorypatter;

import org.factorypatter.client.Oven;

public class Main {
    public static void main(String[] args) {
        Oven oven = new Oven();
        oven.bake("apple");
        oven.bake("pepperoni");
    }
}