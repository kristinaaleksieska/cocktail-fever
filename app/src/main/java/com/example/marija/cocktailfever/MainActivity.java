package com.example.marija.cocktailfever;


        import android.content.Intent;
        import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
        import android.support.v7.widget.Toolbar;
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

        List<String> accompliceIngredients = new ArrayList<>();

        toolbar = (Toolbar) findViewById(R.id.list_toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("Cocktails");

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        accompliceIngredients.add("50 ml Vodka");
        accompliceIngredients.add("25 ml Lemon Juice");
        accompliceIngredients.add(" 12,5ml Sugar Syrup");
        accompliceIngredients.add("Champagne");
        accompliceIngredients.add("3 Strawberries");

        List<String> americanoIngredients = new ArrayList<>();

        americanoIngredients.add("25 ml Campari");
        americanoIngredients.add("25 ml Sweet Vermouth");
        americanoIngredients.add("dash of Soda Water");
        americanoIngredients.add("Lemon Peel");

        List<String> blind_russianIngredients = new ArrayList<>();
        blind_russianIngredients.add("50 ml Vodka");
        blind_russianIngredients.add("20 ml Coffee Liqueur");
        blind_russianIngredients.add("30 ml Irish Cream Liqueur");

        List<String> bloody_maryIngredients = new ArrayList<>();
        bloody_maryIngredients.add("37,5 ml Peppered Vodka");
        bloody_maryIngredients.add("15 ml Sweet Vermouth");
        bloody_maryIngredients.add("35 ml Tomato Juice");
        bloody_maryIngredients.add("splash Red Wine");
        bloody_maryIngredients.add("6 splashes Worcestershire sauce");
        bloody_maryIngredients.add("10 dashes Tobasco sauce");
        bloody_maryIngredients.add("25 ml Lemon Juice");
        bloody_maryIngredients.add("10 dashes Salt");
        bloody_maryIngredients.add("10 dashes Pepper");
        bloody_maryIngredients.add("3 Cucumber slices");

        List<String> caipirinhaIngredients = new ArrayList<>();
        caipirinhaIngredients.add("50 ml Cachaca");
        caipirinhaIngredients.add("1/2 Lime");
        caipirinhaIngredients.add("1 teaspoon Brown Sugar");
        caipirinhaIngredients.add("Lime Wedge");

        List<String> cosmopolitianIngredients = new ArrayList<>();
        cosmopolitianIngredients.add("37,5 ml Citrus Vodka");
        cosmopolitianIngredients.add("12,5 ml Triple Sec");
        cosmopolitianIngredients.add("30 ml Cranberry Juice");
        cosmopolitianIngredients.add("1/2 squeezed lemon");
        cosmopolitianIngredients.add("12,5 ml Sugar Syrup");

        List<String> el_diabloIngredients = new ArrayList<>();
        el_diabloIngredients.add("37,5 ml Tequila");
        el_diabloIngredients.add("12,5 ml Crème de Cassis");
        el_diabloIngredients.add("12,5 ml Lime Juice");
        el_diabloIngredients.add("Ginger Beer");

        List<String> mai_taiIngredients = new ArrayList<>();
        mai_taiIngredients.add("20 ml Dark Rum");
        mai_taiIngredients.add("20 ml Light Rum");
        mai_taiIngredients.add("splash Demerara 20 ml Triple Sec");
        mai_taiIngredients.add("20 ml Lime Juice");
        mai_taiIngredients.add("10 ml Orgeat Syrup");
        mai_taiIngredients.add("Mint sprig");
        mai_taiIngredients.add("Orange wedge");

        List<String> margaritaIngredients = new ArrayList<>();
        margaritaIngredients.add("37,5 ml Tequila");
        margaritaIngredients.add("12,5 ml Triple Sec");
        margaritaIngredients.add("25 ml Lime Juice");
        margaritaIngredients.add("12,5 ml Simple Syrup");
        margaritaIngredients.add("salt");

        List<String> martiniIngredients = new ArrayList<>();
        martiniIngredients.add("50 ml Gin");
        martiniIngredients.add("10 ml Dry Vermouth");
        martiniIngredients.add("Lemon twist");

        List<String> mojitoIngredients = new ArrayList<>();
        mojitoIngredients.add("50 ml White Rum");
        mojitoIngredients.add("8 Mint leaves");
        mojitoIngredients.add("12,5 ml Sugar Syrup");
        mojitoIngredients.add("25 ml Lime Juice");
        mojitoIngredients.add("2 Mint sprigs");

        List painkillerIngredients = new ArrayList();
        painkillerIngredients.add("50 ml Dark Rum");
        painkillerIngredients.add("25 ml Coconut Cream");
        painkillerIngredients.add("100 ml Pineapple Juice");
        painkillerIngredients.add("25 ml Orange Juice");
        painkillerIngredients.add("Orange Wheel");


        List screwdriverIngredients = new ArrayList();
        screwdriverIngredients.add("50 ml Vodka");
        screwdriverIngredients.add("100 ml freshly squeezed Orange Juice");
        screwdriverIngredients.add("Lime wedge");


        List<String> tequila_sunriseIngredients = new ArrayList<>();
        tequila_sunriseIngredients.add("50 ml Tequila");
        tequila_sunriseIngredients.add("80 ml Orange Juice");
        tequila_sunriseIngredients.add("dash Grenadine Syrup");
        tequila_sunriseIngredients.add("Lime wedge");
        tequila_sunriseIngredients.add("Orange slice");

        List<String> tom_collinsIngredients = new ArrayList<>();
        tom_collinsIngredients.add("37,5 ml Gin");
        tom_collinsIngredients.add("25 ml Lemon Juice");
        tom_collinsIngredients.add("12,5 ml Sugar Syrup");
        tom_collinsIngredients.add("splash Soda Water");

        List<String> white_russianIngredients = new ArrayList<>();
        white_russianIngredients.add("37,5 ml Vodka");
        white_russianIngredients.add("25 ml Coffee Liqueur");
        white_russianIngredients.add("15 ml Cream");
        white_russianIngredients.add("15 ml Milk");
        white_russianIngredients.add("Chocolate Powder");
        white_russianIngredients.add("Coffee Bean");

        List<Cocktail> cocktails = new ArrayList<>();
        cocktails.add(new Cocktail("Accomplice", R.drawable.accomplice, accompliceIngredients, "\n" +
                "Muddle 2 strawberries in a Boston Mixing Glass. Add vodka, simple syrup and lemon juice. Fill with ice and shake for 10 seconds. Double strain into a chilled martini glass. Top-up with Champagne and garnish the glass with a strawberry."));
        cocktails.add(new Cocktail("Americano", R.drawable.americano22, americanoIngredients, "Begin by topping up long glass with cubed ice. Add both alcohols and top up with soda water. Stir with bar spoon to make sure ingredients are mixed properly. Garnish with a lemon zest and add 2 long straws."));
        cocktails.add(new Cocktail("Blind Russian", R.drawable.blind_russian, blind_russianIngredients, "Pour coffee liqueur and vodka into an Old-Fashioned glass filled with ice. Float Irish cream liqueur on top and stir slowly."));
        cocktails.add(new Cocktail("Bloody Mary", R.drawable.bloody_mary, bloody_maryIngredients, "Chill a highball glass with ice. Pour all the ingredients, apart from red wine, into mixing tin and add ice. Roll the mixing tin for 15 seconds. Taste. Add ice to glass and single strain the drink into a glass. Add  a splash of red wine and a dash of pepper. Garnish with 3 cucumber slices."));
        cocktails.add(new Cocktail("Caipirinha", R.drawable.caipirinha1, caipirinhaIngredients,"Cut 1/2 lime into 1/8 ths and add half of these to Rocks glass. Add teaspoon of brown sugar and muddle the ingredients. Add the rest of the lime and continue to muddle, to dissolve the sugar. Add the Cachaca and then add crushed ice on top. Stir to continue to dissolve the sugar. Add more crushed ice and continue to stir. Top up with crushed ice and garnish with lime wedge."));
        cocktails.add(new Cocktail("Cosmopolitian", R.drawable.cosmopolitan, cosmopolitianIngredients,"Chill coupe glass with soda water. Add all ingredients to mixing tin with ice. Shake for 10 to 15 seconds. Fine strain into the chilled coupe glass. Flame an orange peel and place in drink as garnish."));
        cocktails.add(new Cocktail("El Diablo",R.drawable.el_diablo,el_diabloIngredients,"Pour the tequila, cassis, and lime juice into a cocktail shaker filled with ice. Shake well. Strain into a Collins glass filled with ice. Top with ginger beer."));
        cocktails.add(new Cocktail("Mai Tai",R.drawable.mai_tai,mai_taiIngredients,"Add all ingredients into mixing tin. Fill mixing tin with cubed ice. Shake very hard for 10 seconds to achieve desired dilution. Fill goblet style glass with crushed ice and strain mixture into glass. Add a short straw, mint and a splash of demerara rum."));
        cocktails.add(new Cocktail("Margarita",R.drawable.margarita,margaritaIngredients,"Begin by half soaking rim of coupe glass with lime juice and then dab in salt. Use cloth to tidy up the glass for presentation. Add all ingredients into mixing tin with 2 ice cubes and dry shake for 10 seconds. Fill mixing tin with ice and shake for a further 10 – 15 seconds. Fine strain into the pre-prepared coupe glass."));
        cocktails.add(new Cocktail("Martini",R.drawable.martini,martiniIngredients,"Chill martini glass with soda water and ice. Fill mixing glass to top with ice. Add the dry vermouth to the mixing glass, giving a small stir to coat the ice with the vermouth. Drain out glass, leaving just the coating on the ice. Add the gin to the mixing glass. Stir for 15 seconds, always making sure that the glass is full to the brim with ice. Taste. Fine strain into chilled martini glass. Zest with lemon peel and add twist unto drink."));
        cocktails.add(new Cocktail("Mojito",R.drawable.mojito,mojitoIngredients,"Add the white rum to a highball glass. Add 8 – 10 mint leaves and sugar syrup and lime juice.Muddle with bar spoon. Add crushed ice and a splash of soda. Mix drink down with bar spoon. Taste. Top up with more crushed ice. Slap 2 mint sprigs to release essence and put into drink. Add small splash of soda and straw."));
        cocktails.add(new Cocktail("Painkiller",R.drawable.pain_killer,painkillerIngredients,"Add all ingredients into a mixing tin and top-up with cubed ice. Shake hard for 10 seconds. Fill a tall glass with crushed ice and strain mixture into glass. Garnish with orange wheel."));
        cocktails.add(new Cocktail("Screwdriver", R.drawable.screwdriver,screwdriverIngredients,"Add vodka into highball glass and fill up to the top with ice. Squeeze a lime wedge into drink and rim glass. Top up with freshly squeezed orange juice. Add straw and serve."));
        cocktails.add(new Cocktail("Tequila Sunrise",R.drawable.tequila_sunrise,tequila_sunriseIngredients,"Add tequila into highball glass. Top up with ice. Add freshly squeezed orange juice , squeeze of lime and dash of grenadine syrup."));
        cocktails.add(new Cocktail("Tom Collins",R.drawable.tom_collins,tom_collinsIngredients,"Chill highball glass with soda. Add the three ingredients into a mixing tin and fill tin up with ice. Shake for 10 -15 seconds. Taste. Fill highball with ice. Single strain into highball glass. Top up with soda and add straw. Garnish with lemon wedge."));
        cocktails.add(new Cocktail("White Russian",R.drawable.white_russian,white_russianIngredients,"For the perfect White Russian recipe add coffee liqueur to an old-fashioned glass. Add other ingredients to mixing tin and fill to brim with ice. Shake for 10 -15 seconds. Single strain the ingredients over the ice and coffee liqueur. Sprinkle with chocolate powder and garnish with coffee bean."));


        String[] Kokteli = {"Accomplice", "Americano", "Blind Russian", "Bloody Mary", "Caipirinha", "Cosmopolitan", "El Diablo", "Mai Tai",
                "Margarita", "Martini", "Mojito", "Painkiller", "Screwdriver", "Tequila Sunrise", "Tom Collins", "White Russian"};

        int[] images = {R.drawable.accomplice, R.drawable.americano22, R.drawable.blind_russian, R.drawable.bloody_mary,
                R.drawable.caipirinha1, R.drawable.cosmopolitan, R.drawable.el_diablo, R.drawable.mai_tai, R.drawable.margarita,
                R.drawable.martini, R.drawable.mojito, R.drawable.pain_killer, R.drawable.screwdriver, R.drawable.tequila_sunrise,
                R.drawable.tom_collins, R.drawable.white_russian};

        ListAdapter theAdapter = new myAdapter(this, cocktails);
        ListView listaKokteli = (ListView) findViewById(R.id.listaKokteli);

        listaKokteli.setAdapter(theAdapter);
        listaKokteli.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                                        @Override
                                                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                                            Cocktail item = (Cocktail) parent.getItemAtPosition(position);
                                                            String izbranKoktel = "You selected " +
                                                                    item.getName(); // Parent ti e izgledot na listata kako niza, i se zema elementot na pozicija position (position e
                                                            //pozicijata na elementot shto si go kliknala), se kastira vo Cocktail poshto vrakja Object.
                                                            Toast.makeText(MainActivity.this, izbranKoktel, Toast.LENGTH_SHORT).show();
                                                            Intent i = new Intent(MainActivity.this, CocktailInfoActivity.class);
                                                            i.putExtra("cocktail", item);
                                                            startActivity(i);
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
