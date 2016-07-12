package com.example.marija.cocktailfever;

import java.util.ArrayList;

/**
 * Created by Kristina on 6/23/2016.
 */
public class Ingredient {
    private String name;
    private boolean isSelected;

    public Ingredient() {
        name = null;
        isSelected = false;
    }

    public Ingredient(String name, boolean isSelected) {
        this.name = name;
        this.isSelected = isSelected;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public static ArrayList<Ingredient> selectedIngredients = new ArrayList<>();
}
