package Model;

public class ProductByQuantity extends Product{


    private int quantity;

    public ProductByQuantity(String productName, double productPrice, int quantity, boolean isSale, boolean isBuyOneTakeOne) {
        super(productName, productPrice, isSale,isBuyOneTakeOne );
        this.quantity=quantity;
        this.setTotalPrice();
    }


    public void setTotalPrice(){
        if(this.getIsSale()){
            this.setTotalPriceByQuantity();
        }
        else{
            this.setTotalPrice(this.quantity*this.getProductPrice());
        }
    }

    public void setQuantity(int addQuantity){

        this.quantity+=addQuantity;
    }

    public void setTotalPriceByQuantity(){
        if (this.isBuyOneTakeOne()) {
            this.setTotalPrice((this.quantity-(this.quantity/2))*this.getProductPrice());
        }
        else {
            this.setTotalPrice(this.getProductPrice()*(this.quantity-(this.quantity/3)));
        }
    }

    public int getQuantity() {
        return quantity;
    }


    public String toString() {
        return String.format("%-20s\n%-20s %-20s %-20s", this.getProductName(), (this.quantity+"Pc") ,this.getProductPrice(), getTotalPrice());
    }

}

