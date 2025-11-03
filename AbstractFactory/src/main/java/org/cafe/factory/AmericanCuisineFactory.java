package org.cafe.factory;

import org.cafe.cuisine.Dessert;
import org.cafe.cuisine.FirstCource;
import org.cafe.cuisine.MainCource;
import org.cafe.cuisine.american.ApplePie;
import org.cafe.cuisine.american.Hamburger;
import org.cafe.cuisine.american.TomatoSoup;

public class AmericanCuisineFactory implements CuisineFactory {

    @Override
    public FirstCource getFirtstCource() {
        return new TomatoSoup();
    }

    @Override
    public MainCource getMainCource() {
        return new Hamburger();
    }

    @Override
    public Dessert getDessert() {
        return new ApplePie();
    }
}
