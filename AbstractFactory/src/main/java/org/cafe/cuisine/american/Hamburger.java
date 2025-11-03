package org.cafe.cuisine.american;

import org.cafe.cuisine.MainCource;

public class Hamburger implements MainCource {

    @Override
    public void taste() {
        System.out.println("I eat much better and cheaper in MacDonald's");
    }
}
