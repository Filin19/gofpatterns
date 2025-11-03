package org.cafe.factory;

import java.util.HashMap;
import java.util.Map;

public class MenuFactory {

    private static final Map<String, CuisineFactory> cuisineMap = new HashMap<>();

    static {
        cuisineMap.put("american", new AmericanCuisineFactory());
        cuisineMap.put("japan", new JapanCuisineFactory());
        cuisineMap.put("ukrainian", new UkrainianCusineFactory());
    }

    public static CuisineFactory choseCuisine(String cuisineType) {
        CuisineFactory factory = cuisineMap.get(cuisineType);
        if (factory == null) {
            throw new IllegalArgumentException("there no this type cuisine: " + cuisineType);
        }

        return factory;
    }
}
