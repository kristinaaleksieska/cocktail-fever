package com.example.marija.cocktailfever;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Kristina on 6/10/2016.
 */
public class Cocktail implements Serializable {
    private String name;
    private int imageId;
    private List<String> ingredients;
    private String howToMake;

    public Cocktail(String name, int imageId, List<String> ingredients, String howToMake) {
        this.name = name;
        this.imageId = imageId;
        this.ingredients = ingredients;
        this.howToMake = howToMake;
    }

    public String getHowToMake() {
        return howToMake;
    }

    public void setHowToMake(String howToMake) {
        this.howToMake = howToMake;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }
}
