package com.example.marija.cocktailfever;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondPage extends AppCompatActivity {
    private Button recipesButton;
    private Button ingredientsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);

        recipesButton = (Button) findViewById(R.id.recipeBtn);
        ingredientsButton = (Button) findViewById(R.id.ingredientsBtn);

        recipesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondPage.this, MainActivity.class);
                startActivity(i);
            }
        });

        ingredientsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondPage.this, IngredientsActivity.class));
            }
        });
    }
}
