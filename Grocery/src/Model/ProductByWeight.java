package Model;

public class ProductByWeight extends Product{

    private double weight;
    public ProductByWeight(String productName, double productPrice, double weight, boolean isSale, boolean isBuyOneTakeOne) {
        super(productName, productPrice, isSale, isBuyOneTakeOne);
        this.weight=weight;
        this.setTotalPrice();
    }

    public void setWeight(double addWeight){
        this.weight+=addWeight;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setTotalPrice(){
        if(this.getIsSale()){
            this.setTotalPriceByWeight();
        }
        else{
            this.setTotalPrice(this.weight*this.getProductPrice());
        }
    }

    public void setTotalPriceByWeight(){
        if (this.isBuyOneTakeOne()) {
            this.setTotalPrice((this.weight-((int) this.weight/2))*this.getProductPrice());
        }
        else {
            this.setTotalPrice(this.getProductPrice()*(this.weight-((int) this.weight/3)));
        }
    }

    public String toString() {
        return String.format("%-20s\n%-20s %-20s %-20s" ,this.getProductName(), (this.weight+ "KG") ,this.getProductPrice(), getTotalPrice());
    }

}

