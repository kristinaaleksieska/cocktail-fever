package com.example.marija.cocktailfever;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.app.Activity;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.list_toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("Cocktails");

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);


        String[] Kokteli = {"Accomplice", "Americano", "Blind Russian", "Bloody Mary", "Caipirinha", "Cosmopolitan", "El Diablo", "Mai Tai",
                "Margarita", "Martini", "Mojito", "Painkiller", "Screwdriver", "Tequila Sunrise", "Tom Collins", "White Russian"};

        int[] images = {R.drawable.accomplice, R.drawable.americano22, R.drawable.blind_russian, R.drawable.bloody_mary,
                R.drawable.caipirinha1, R.drawable.cosmopolitan, R.drawable.el_diablo, R.drawable.mai_tai, R.drawable.margarita,
                R.drawable.martini, R.drawable.mojito, R.drawable.pain_killer, R.drawable.screwdriver, R.drawable.tequila_sunrise,
                R.drawable.tom_collins, R.drawable.white_russian};

        ListAdapter theAdapter = new myAdapter(this, CocktailData.cocktails);
        ListView listaKokteli = (ListView) findViewById(R.id.listaKokteli);

        listaKokteli.setAdapter(theAdapter);

        listaKokteli.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Cocktail item = (Cocktail) adapterView.getItemAtPosition(i);
                Intent intent = new Intent(MainActivity.this, CocktailInfoActivity.class);
                intent.putExtra("cocktail", item);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
