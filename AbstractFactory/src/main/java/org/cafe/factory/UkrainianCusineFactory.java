package org.cafe.factory;

import org.cafe.cuisine.Dessert;
import org.cafe.cuisine.FirstCource;
import org.cafe.cuisine.MainCource;
import org.cafe.cuisine.ukrainian.Borch;
import org.cafe.cuisine.ukrainian.Syrniki;
import org.cafe.cuisine.ukrainian.Vareniki;

public class UkrainianCusineFactory implements CuisineFactory{

    @Override
    public FirstCource getFirtstCource() {
        return new Borch();
    }

    @Override
    public MainCource getMainCource() {
        return new Vareniki();
    }

    @Override
    public Dessert getDessert() {
        return new Syrniki();
    }
}
