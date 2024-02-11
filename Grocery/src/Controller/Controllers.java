package Controller;

import Model.ProductByQuantity;
import Model.ProductByWeight;

import java.util.ArrayList;

public class Controllers {

    public Object checkItem(ArrayList<Object> purchases, Object object){

        for(int index=0; index<purchases.size(); index++) {
            if ((purchases.get(index) instanceof ProductByQuantity tempHolder) && (object instanceof ProductByQuantity productByQuantity)){

                if(productByQuantity.getProductName().equalsIgnoreCase(tempHolder.getProductName())){
                    purchases.remove(index);
                    productByQuantity.setQuantity(tempHolder.getQuantity());
                    productByQuantity.setTotalPrice();
                    break;
                }
            }

            else if(purchases.get(index) instanceof ProductByWeight tempHolder && object instanceof ProductByWeight productByWeight){
                if(productByWeight.getProductName().equalsIgnoreCase(tempHolder.getProductName())){
                    purchases.remove(index);
                    productByWeight.setWeight(tempHolder.getWeight());
                    productByWeight.setTotalPrice();

                    break;
                }
            }

        }
        purchases.add(object);
        return object;
    }

    public double computeTotalPrice(ArrayList<Object> purchases){
        double totalPrice=0;
        for (Object purchase : purchases) {
            if (purchase instanceof ProductByQuantity productByQuantity) {
                totalPrice += productByQuantity.getTotalPrice();

            } else if (purchase instanceof ProductByWeight productByWeight) {
                totalPrice += productByWeight.getTotalPrice();

            }
        }
        return totalPrice;

    }

}
