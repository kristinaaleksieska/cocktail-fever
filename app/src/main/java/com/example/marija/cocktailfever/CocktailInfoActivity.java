package com.example.marija.cocktailfever;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class CocktailInfoActivity extends AppCompatActivity {

    private TextView cocktailTitle;
    private ImageView cocktailImage;
    private TextView cocktailHowTo;
    private TextView cocktailIngredients;
    private TextView  cocktailHowToTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cocktail_info);

        Bundle extras = getIntent().getExtras();

        Cocktail cocktail = (Cocktail) extras.getSerializable("cocktail");

        cocktailTitle = (TextView) findViewById(R.id.cocktailTitle);
        cocktailImage = (ImageView) findViewById(R.id.cocktailImage);
        cocktailHowTo = (TextView) findViewById(R.id.cocktailHowTo);
        cocktailIngredients = (TextView) findViewById(R.id.cocktailIngredients);
        cocktailHowToTitle = (TextView) findViewById(R.id.cocktailHowToTitle);

        List<String> list = cocktail.getIngredients();

        String ingredients = "";

        if(list != null) {
            for(int i = 0; i < list.size(); i++) {
                ingredients += list.get(i);
                ingredients += "\n";
            }
        }

        cocktailTitle.setText(cocktail.getName());
        cocktailImage.setImageResource(cocktail.getImageId());
        cocktailHowTo.setText(cocktail.getHowToMake());
        cocktailIngredients.setText(ingredients);
        cocktailHowToTitle.setText("How to make " + cocktail.getName());

        cocktailTitle.setAlpha(0.87f);
        cocktailHowToTitle.setAlpha(0.87f);
        cocktailHowTo.setAlpha(0.87f);
        cocktailIngredients.setAlpha(0.87f);
    }
}
