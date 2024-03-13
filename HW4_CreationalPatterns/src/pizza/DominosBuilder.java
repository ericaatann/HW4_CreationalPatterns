package pizza;

class DominosBuilder implements PizzaBuilder{
    private Pizza pizza;

    public DominosBuilder(){
        pizza = new Pizza("Domino's");
    }

    @Override
    public PizzaBuilder setSize(String size){
        pizza.setSize(size);
        return this;
    }

    @Override
    public PizzaBuilder addTopping(String topping){
        pizza.addTopping(topping);
        return this;
    }

    @Override
    public Pizza build(){
        return pizza;
    }
}