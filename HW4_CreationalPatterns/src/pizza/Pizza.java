package pizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza{
    private String size;
    private List<String> toppings;
    private String chain;

    public Pizza(String chain) {
        this.chain = chain;
        toppings = new ArrayList<>();
    }

    public void setSize(String size){
        this.size = size;
    }

    public void addTopping(String topping){
        this.toppings.add(topping);
    }

    public void eat(){
        System.out.println(chain + " Pizza - Size: " + size + ", Toppings: " + String.join(", ", toppings));
    }
}
