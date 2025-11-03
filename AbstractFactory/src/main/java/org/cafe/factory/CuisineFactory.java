package org.cafe.factory;

import org.cafe.cuisine.Dessert;
import org.cafe.cuisine.FirstCource;
import org.cafe.cuisine.MainCource;

public interface CuisineFactory {

    FirstCource getFirtstCource();
    MainCource getMainCource();
    Dessert getDessert();

}
