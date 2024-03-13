package macronutrients;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MealFactory mealFactory = MealFactory.getInstance();

        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("John", mealFactory::createCarb, mealFactory::createProtein, mealFactory::createFat, "No Restriction"));
        customers.add(new Customer("Jane", mealFactory::createCarb, mealFactory::createProtein, mealFactory::createFat, "Paleo"));
        customers.add(new Customer("Alice", mealFactory::createCarb, mealFactory::createProtein, mealFactory::createFat, "Vegan"));
        customers.add(new Customer("Bob", mealFactory::createCarb, mealFactory::createProtein, mealFactory::createFat, "Nut Allergy"));
        customers.add(new Customer("Eve", mealFactory::createCarb, mealFactory::createProtein, mealFactory::createFat, "No Restriction"));
        customers.add(new Customer("Dave", mealFactory::createCarb, mealFactory::createProtein, mealFactory::createFat, "Vegan"));

        for (Customer customer : customers) {
            customer.generateMeal();
        }
    }
}
