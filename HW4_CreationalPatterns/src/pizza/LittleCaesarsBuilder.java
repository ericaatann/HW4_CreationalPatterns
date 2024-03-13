package pizza;

class LittleCaesarsBuilder implements PizzaBuilder{
    private Pizza pizza;

    public LittleCaesarsBuilder(){
        pizza = new Pizza("Little Caesar's");
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