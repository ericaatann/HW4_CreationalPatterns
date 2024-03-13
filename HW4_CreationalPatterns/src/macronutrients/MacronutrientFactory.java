package macronutrients;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

interface MacronutrientFactory {
    Macronutrient create();
}

class CarbsFactory implements MacronutrientFactory{
    private List<String> allowedCarbs = Arrays.asList("Bread", "Lentils", "Pistachio","Cheese");

    @Override
    public Macronutrient create(){
        Random rand = new Random();
        String carb = allowedCarbs.get(rand.nextInt(allowedCarbs.size()));
        return new Carbs(carb);
    }
}

class ProteinFactory implements MacronutrientFactory {
    private final List<String> allowedProteins = Arrays.asList("Fish", "Chicken", "Beef", "Tofu");

    @Override
    public Macronutrient create() {
        Random rand = new Random();
        String protein = allowedProteins.get(rand.nextInt(allowedProteins.size()));
        return new Protein(protein);
    }
}

class FatsFactory implements MacronutrientFactory {
    private final List<String> allowedFats = Arrays.asList("Avocado", "Sour cream", "Tuna", "Peanuts");

    @Override
    public Macronutrient create() {
        Random rand = new Random();
        String fat = allowedFats.get(rand.nextInt(allowedFats.size()));
        return new Fats(fat);
    }
}

