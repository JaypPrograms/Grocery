package Test;


import Model.ProductByQuantity;
import Model.ProductByWeight;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    private double total;
    private  double result;

    @Test
    public void getResult( ){
        assertEquals(result, total);

    }

    public void testMethod(double result, Object object ){
        if(object instanceof ProductByQuantity productByQuantity){
            this.total=productByQuantity.getTotalPrice();
        }

        else if(object instanceof ProductByWeight productByWeight){
            this.total= productByWeight.getTotalPrice();
        }
        this.result=result;
        this.getResult();
    }

    public void testTotal(double result, double total){
        this.result=result;
        this.total=total;
        getResult();
    }
}