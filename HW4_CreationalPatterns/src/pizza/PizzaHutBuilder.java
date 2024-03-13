package pizza;

class PizzaHutBuilder implements PizzaBuilder{
    private Pizza pizza;

    public PizzaHutBuilder(){
        pizza = new Pizza("Pizza Hut");
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
