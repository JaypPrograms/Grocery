package View;

import java.util.ArrayList;
public class AppView {

    public double receipt(ArrayList<Object> purchase, double totalPrice){


        System.out.println("\nReceipt:");

        for(Object output: purchase){
            System.out.println(output+"\n");
        }
        System.out.println("------------------------------------------------------");
        System.out.format("%-41s %-10s","Total:", totalPrice );
//        System.out.format("\n%-41s %-10s","Change:" ,change-totalPrice);

        return totalPrice;
    }

}
