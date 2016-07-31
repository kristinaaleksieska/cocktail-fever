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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ingredient that = (Ingredient) o;

        return name != null ? name.equals(that.name) : that.name == null;

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    public static ArrayList<Ingredient> selectedIngredients = new ArrayList<>();
}
