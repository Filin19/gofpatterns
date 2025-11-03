package org.cafe.service;

import org.cafe.factory.CuisineFactory;
import org.cafe.factory.MenuFactory;

public class CafeService {


    public void makeOrder(String cuisineType) {
        CuisineFactory factory = MenuFactory.choseCuisine(cuisineType);
        System.out.println("Here your order sir/mam");
        factory.getFirtstCource().taste();
        factory.getMainCource().taste();
        factory.getDessert().taste();
    }
}
