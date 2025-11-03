package org.cafe;

import org.cafe.service.CafeService;

public class Main {
    public static void main(String[] args) {
        CafeService cafeService = new CafeService();
        cafeService.makeOrder("american");
        cafeService.makeOrder("japan");
        cafeService.makeOrder("ukrainian");
    }
}