package com.example.marija.cocktailfever;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class IngredientsActivity extends AppCompatActivity {
    private IngredientsListAdapter ingredientsAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingredients);


        CocktailData.init();

        displayListView();
        checkButtonClick();
    }

    protected void displayListView() {
        ArrayList<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(new Ingredient("brown sugar", false));
        ingredients.add(new Ingredient("cachaca", false));
        ingredients.add(new Ingredient("campari", false));
        ingredients.add(new Ingredient("champagne", false));
        ingredients.add(new Ingredient("chocolate powder", false));
        ingredients.add(new Ingredient("citrus vodka", false));
        ingredients.add(new Ingredient("coconut cream", false));
        ingredients.add(new Ingredient("coffee bean", false));
        ingredients.add(new Ingredient("coffee liqueur", false));
        ingredients.add(new Ingredient("cranberry juice", false));
        ingredients.add(new Ingredient("cream", false));
        ingredients.add(new Ingredient("Crème de Cassis", false));
        ingredients.add(new Ingredient("cucumber slices", false));
        ingredients.add(new Ingredient("dark rum", false));
        ingredients.add(new Ingredient("Demerara rum", false));
        ingredients.add(new Ingredient("dry vermouth", false));
        ingredients.add(new Ingredient("gin", false));
        ingredients.add(new Ingredient("ginger beer", false));
        ingredients.add(new Ingredient("grenadine syrup", false));
        ingredients.add(new Ingredient("irish cream liqueur", false));
        ingredients.add(new Ingredient("lemon", false));
        ingredients.add(new Ingredient("lemon juice", false));
        ingredients.add(new Ingredient("light rum", false));
        ingredients.add(new Ingredient("lime", false));
        ingredients.add(new Ingredient("lime juice", false));
        ingredients.add(new Ingredient("milk", false));
        ingredients.add(new Ingredient("mint", false));
        ingredients.add(new Ingredient("orange", false));
        ingredients.add(new Ingredient("orange juice", false));
        ingredients.add(new Ingredient("orgeat syrup", false));
        ingredients.add(new Ingredient("pepper", false));
        ingredients.add(new Ingredient("peppered vodka", false));
        ingredients.add(new Ingredient("pineapple juice", false));
        ingredients.add(new Ingredient("red wine", false));
        ingredients.add(new Ingredient("salt", false));
        ingredients.add(new Ingredient("simple syrup", false));
        ingredients.add(new Ingredient("soda water", false));
        ingredients.add(new Ingredient("strawberries", false));
        ingredients.add(new Ingredient("sugar syrup", false));
        ingredients.add(new Ingredient("sweet vermouth", false));
        ingredients.add(new Ingredient("tabasco sauce", false));
        ingredients.add(new Ingredient("tequila", false));
        ingredients.add(new Ingredient("tomato juice", false));
        ingredients.add(new Ingredient("triple sec", false));
        ingredients.add(new Ingredient("vodka", false));
        ingredients.add(new Ingredient("white rum", false));
        ingredients.add(new Ingredient("worcestershire sauce", false));



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
                for (int i = 0; i < ingredientsList.size(); i++) {
                    if (ingredientsList.get(i).isSelected()) {
                        Ingredient.selectedIngredients.add(ingredientsList.get(i));
                    }
                }
                List<Cocktail> cocktailsToDisplay = new ArrayList<Cocktail>();

                for (int i = 0; i < CocktailData.cocktails.size(); i++) {
                    Cocktail c = CocktailData.cocktails.get(i);
                    boolean hasAllIngredients = true;
                    boolean[] hasIngredient = new boolean[c.getIngredients().size()];
                    for (int j = 0; j < c.getIngredients().size(); j++) {
                        String cocktailIngredient = c.getIngredients().get(j);
                        for (int k = 0; k < Ingredient.selectedIngredients.size(); k++) {
                            Ingredient ingredient = Ingredient.selectedIngredients.get(k);
                            if (cocktailIngredient.trim().toLowerCase().contains(ingredient.getName().trim().toLowerCase())) {
                                hasIngredient[j] = true;
                                break;
                            }
                        }
                    }
                    for (int j = 0; j < hasIngredient.length; j++) {
                        if (!hasIngredient[j]) {
                            hasAllIngredients = false;
                            break;
                        }
                    }
                    if (hasAllIngredients) {
                        cocktailsToDisplay.add(c);
                    }
                }
                if (cocktailsToDisplay.size() == 0) {
                    Toast.makeText(IngredientsActivity.this, "No cocktails with those ingredients available.", Toast.LENGTH_LONG).show();
                } else {
                    displayAlertWithList(cocktailsToDisplay);
                }
            }
        });
    }

    protected void displayAlertWithList(List<Cocktail> elementsList) {
        AlertDialog.Builder builder;
        final AlertDialog alertDialog;

        LayoutInflater inflater = (LayoutInflater)IngredientsActivity.this.getSystemService(LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.available_cocktails_layout, null);

        ListView cocktailsList = (ListView) layout.findViewById(R.id.available_cocktails);

        ListAdapter cocktailsListAdapter = new myAdapter(this, elementsList);

        cocktailsList.setAdapter(cocktailsListAdapter);

        cocktailsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Cocktail item = (Cocktail) parent.getItemAtPosition(position);
                Intent i = new Intent(IngredientsActivity.this, CocktailInfoActivity.class);
                i.putExtra("cocktail", item);
                startActivity(i);
            }
        });

        builder = new AlertDialog.Builder(this);
        builder.setView(layout);
        alertDialog = builder.create();
        alertDialog.setCancelable(true);
        alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        alertDialog.show();
    }
}
