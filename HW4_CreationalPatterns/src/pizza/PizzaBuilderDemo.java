package pizza;

public class PizzaBuilderDemo {
    public static void main(String[] args){
        // Pizza Hut Large with 3 toppings
        PizzaBuilder builder = new PizzaHutBuilder();
        Pizza pizza1 = builder.setSize("Large").addTopping("Pepperoni").addTopping("Bacon").addTopping("Onions").build();
        pizza1.eat();

        // Pizza Hut Small with 2 toppings
        builder = new PizzaHutBuilder();
        Pizza pizza2 = builder.setSize("Small").addTopping("Mushrooms").addTopping("Olives").build();
        pizza2.eat();

        // Little Caesar's Medium with 8 toppings
        builder = new LittleCaesarsBuilder();
        Pizza littleCaesarsMedium = builder.setSize("Medium").addTopping("Mushrooms").addTopping("Olives").addTopping("Chicken")
                .addTopping("Extra Cheese").addTopping("Peppers").addTopping("Sausage").addTopping("Ham").addTopping("Beef").build();
        littleCaesarsMedium.eat();

        // Little Caesar's Small with 6 toppings
        builder = new LittleCaesarsBuilder();
        Pizza littleCaesarsSmall = builder.setSize("Small").addTopping("Pesto").addTopping("Chicken")
                .addTopping("Bacon").addTopping("Onions").addTopping("Extra Cheese").addTopping("Tomato and Basil").build();
        littleCaesarsSmall.eat();

        // Domino's Small with 1 topping
        builder = new DominosBuilder();
        Pizza dominosSmall = builder.setSize("Small").addTopping("Spicy Pork").build();
        dominosSmall.eat();

        // Domino's Large with 3 toppings
        builder = new DominosBuilder();
        Pizza dominosLarge = builder.setSize("Large").addTopping("Beef").addTopping("Mushrooms").addTopping("Olives").build();
        dominosLarge.eat();
    }
}
