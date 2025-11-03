package org.cafe.cuisine.american;

import org.cafe.cuisine.Dessert;

public class ApplePie implements Dessert {

    @Override
    public void taste() {
        System.out.println("Taste like a pie from my grandma");
    }
}
