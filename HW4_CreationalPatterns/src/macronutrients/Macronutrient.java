package macronutrients;

interface Macronutrient {
    String getName();
}

class Carbs implements Macronutrient{
    private final String name;

    public Carbs(String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return name;
    }
}

class Protein implements Macronutrient{
    private final String name;

    public Protein(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

class Fats implements Macronutrient {
    private final String name;

    public Fats(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
