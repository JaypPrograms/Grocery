package Model;

public abstract class Product {

    private final String productName;
    private final double productPrice;
    private double totalPrice;
    private final boolean isSale;
    private final boolean isBuyOneTakeOne;


    public Product(String productName, double productPrice, boolean isSale, boolean isBuyOneTakeOne){
        this.productName=productName;
        this.productPrice=productPrice;
        this.isSale=isSale;
        this.isBuyOneTakeOne=isBuyOneTakeOne;

    }

    public boolean isBuyOneTakeOne() {
        return isBuyOneTakeOne;
    }


    public String getProductName() {
        return productName;
    }


    public double getProductPrice() {
        return productPrice;
    }


    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public boolean getIsSale() {
        return isSale;
    }





    public abstract String toString();


}
