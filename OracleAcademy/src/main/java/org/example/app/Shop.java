package org.example.app;


import org.example.data.ProductManager;
import org.example.data.ProductManagerException;
import org.example.data.Rating;

import java.math.BigDecimal;

public class Shop {
    public static void main(String[] args) {

        ProductManager pm = new ProductManager("en-GB");

        //pm.printProductReport(101);

        /*
        pm.createProduct(164, "kombucha", BigDecimal.valueOf(1.99),
                Rating.NOT_RATED);
        pm.reviewProduct(164, Rating.ONE_STAR, "Looks like tea but is it?");
        pm.reviewProduct(164, Rating.FOUR_STAR, "Fine Tea");
        pm.reviewProduct(164, Rating.FOUR_STAR, "This is not tea");
        pm.reviewProduct(164, Rating.FIVE_STAR, "Perfect");
        pm.dumpData();
        pm.restoreData();
        pm.printProductReport(164);



        pm.printProducts(p -> p.getPrice().floatValue() < 2,
                (p1,p2) -> p2.getRating().ordinal() - p1.getRating().ordinal());
        */


    }




}