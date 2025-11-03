package org.cafe.factory;

import org.cafe.cuisine.Dessert;
import org.cafe.cuisine.FirstCource;
import org.cafe.cuisine.MainCource;
import org.cafe.cuisine.japan.CaliforniaSet;
import org.cafe.cuisine.japan.KakiSoba;
import org.cafe.cuisine.japan.Mochi;

public class JapanCuisineFactory implements CuisineFactory{

    @Override
    public FirstCource getFirtstCource() {
        return new KakiSoba();
    }

    @Override
    public MainCource getMainCource() {
        return new CaliforniaSet();
    }

    @Override
    public Dessert getDessert() {
        return new Mochi();
    }
}
