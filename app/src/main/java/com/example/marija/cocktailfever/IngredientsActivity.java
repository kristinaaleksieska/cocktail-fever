package com.example.marija.cocktailfever;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class IngredientsActivity extends AppCompatActivity {
    private IngredientsListAdapter ingredientsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingredients);

        displayListView();
        checkButtonClick();
    }

    protected void displayListView() {
        ArrayList<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(new Ingredient("vodka", false));
        ingredients.add(new Ingredient("lemon juice", false));
        ingredients.add(new Ingredient("sugar", false));
        ingredients.add(new Ingredient("gin", false));

        ingredientsAdapter = new IngredientsListAdapter(this, R.layout.ingredient_info, ingredients);
        ListView ingredientsList = (ListView) findViewById(R.id.ingredients_list);
        ingredientsList.setAdapter(ingredientsAdapter);
    }

    @SuppressWarnings("ConstantConditions")
    protected void checkButtonClick() {
        Button findCocktails = (Button) findViewById(R.id.find_cocktails);

        findCocktails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ingredient.selectedIngredients.clear();
                ArrayList<Ingredient> ingredientsList = ingredientsAdapter.ingredientsList;
                for(int i = 0; i < ingredientsList.size(); i++) {
                    if(ingredientsList.get(i).isSelected()) {
                        Ingredient.selectedIngredients.add(ingredientsList.get(i));
                    }
                }
            }
        });
    }
}
