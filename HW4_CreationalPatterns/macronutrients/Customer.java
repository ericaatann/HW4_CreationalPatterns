package macronutrients;

class Customer {
    private final String name;
    private final MacronutrientFactory carbsFactory;
    private final MacronutrientFactory proteinFactory;
    private final MacronutrientFactory fatsFactory;
    private final String dietPlan;

    public Customer(String name, MacronutrientFactory carbsFactory, MacronutrientFactory proteinFactory, MacronutrientFactory fatsFactory, String dietPlan) {
        this.name = name;
        this.carbsFactory = carbsFactory;
        this.proteinFactory = proteinFactory;
        this.fatsFactory = fatsFactory;
        this.dietPlan = dietPlan;
    }

    public void generateMeal() {
        Macronutrient carb = carbsFactory.create();
        Macronutrient protein = proteinFactory.create();
        Macronutrient fat = fatsFactory.create();

        System.out.println(name + "'s meal: (" + dietPlan + "): " + carb.getName() + ", " + protein.getName() + ", " + fat.getName());
    }
}

