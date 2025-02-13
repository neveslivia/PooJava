package Entities;



public class Product{
    public String name;
    public Double price;
    public int quantity;

    public double totalValueIInStock(){
        return this.price * this.quantity;
    }
    public void addProducts(int quantity){
        this.quantity += quantity;
    }
    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return name
        +", $"
        +String.format("%.2f",price)
        + ", "
        + quantity
        + " units, Total: $"
        + String.format("%.2f", totalValueIInStock()) ;




    }
}
