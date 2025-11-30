package models;

public class Recipe {
    private String title;
    private String type;        // "Veg" or "Non-Veg"
    private String ingredients;
    private String steps;

    public Recipe(String title, String type, String ingredients, String steps) {
        this.title = title;
        this.type = type;
        this.ingredients = ingredients;
        this.steps = steps;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getSteps() {
        return steps;
    }
}
