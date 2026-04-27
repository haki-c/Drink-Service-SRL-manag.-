import java .util.*;

public class Product{
    
    private String name;
    private int price;

    Product(String name, int price){
        
        this.name = name;
        this.price = price;
    }

    Product(){
        
        name = "";
        price = 0;
    }

    // Getters
    public String getName() {
     
        return name;        
    }

    public int getPrice() {
        return price;
    }   

    // Setters
    public void setName(String name) {
     
        this.name = name;   
    }

    public void setPrice(int price) {
        this.price = price;
    }   


}