package pizza;

public interface PizzaBuilder {
    PizzaBuilder setSize(String size);
    PizzaBuilder addTopping(String topping);
    Pizza build();
}
