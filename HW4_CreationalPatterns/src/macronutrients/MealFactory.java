package macronutrients;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

class MealFactory {
    private static MealFactory instance;
    private final MacronutrientFactory carbsFactory;
    private final MacronutrientFactory proteinFactory;
    private final MacronutrientFactory fatsFactory;

    private MealFactory() {
        carbsFactory = new CarbsFactory();
        proteinFactory = new ProteinFactory();
        fatsFactory = new FatsFactory();
    }

    public static MealFactory getInstance() {
        if (instance == null) {
            instance = new MealFactory();
        }
        return instance;
    }

    public Macronutrient createCarb() {
        return carbsFactory.create();
    }

    public Macronutrient createProtein() {
        return proteinFactory.create();
    }

    public Macronutrient createFat() {
        return fatsFactory.create();
    }
}
