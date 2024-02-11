package Controller;

import Model.*;
import Test.ProductTest;

import View.*;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        ProductTest productTest= new ProductTest();
        Controllers controllers = new Controllers();
        AppView appView= new AppView();
        ArrayList<Object> purchases= new ArrayList<>();

        productTest.testMethod(100, controllers.checkItem(purchases ,new ProductByQuantity("milk",10,10,false, false)));
        productTest.testMethod(45, controllers.checkItem(purchases ,new ProductByWeight("rice",10,4.5,false, false)));
        productTest.testTotal(145,appView.receipt(purchases,controllers.computeTotalPrice(purchases)));

    }

}