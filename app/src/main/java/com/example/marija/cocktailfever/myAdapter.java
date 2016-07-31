package com.example.marija.cocktailfever;


import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


class myAdapter extends ArrayAdapter<Cocktail> {


    public myAdapter(AppCompatActivity context, List<Cocktail> values) {
        super(context, R.layout.row_layout2, values);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater theInflater = LayoutInflater.from(getContext());
        View theView = theInflater.inflate(R.layout.row_layout2, parent, false);
        Cocktail cocktail = getItem(position);

        TextView theTextView = (TextView) theView.findViewById(R.id.TextView1);
        theTextView.setText(cocktail.getName());

        theTextView.setAlpha(0.87f);
        ImageView theImageView = (ImageView) theView.findViewById(R.id.imageView1);
//        theImageView.setImageResource(cocktail.getImageId());
        switch(Character.toLowerCase(cocktail.getName().charAt(0))) {
            case 'a':
                theImageView.setImageResource(R.drawable.letter_a);
                break;
            case 'b':
                theImageView.setImageResource(R.drawable.letter_b);
                break;
            case 'c':
                theImageView.setImageResource(R.drawable.letter_c);
                break;
            case 'd':
                theImageView.setImageResource(R.drawable.letter_d);
                break;
            case 'e':
                theImageView.setImageResource(R.drawable.letter_e);
                break;
            case 'f':
                theImageView.setImageResource(R.drawable.letter_f);
                break;
            case 'g':
                theImageView.setImageResource(R.drawable.letter_g);
                break;
            case 'h':
                theImageView.setImageResource(R.drawable.letter_h);
                break;
            case 'i':
                theImageView.setImageResource(R.drawable.letter_i);
                break;
            case 'j':
                theImageView.setImageResource(R.drawable.letter_j);
                break;
            case 'k':
                theImageView.setImageResource(R.drawable.letter_k);
                break;
            case 'l':
                theImageView.setImageResource(R.drawable.letter_l);
                break;
            case 'm':
                theImageView.setImageResource(R.drawable.letter_m);
                break;
            case 'n':
                theImageView.setImageResource(R.drawable.letter_n);
                break;
            case 'o':
                theImageView.setImageResource(R.drawable.letter_o);
                break;
            case 'p':
                theImageView.setImageResource(R.drawable.letter_p);
                break;
            case 'q':
                theImageView.setImageResource(R.drawable.letter_q);
                break;
            case 'r':
                theImageView.setImageResource(R.drawable.letter_r);
                break;
            case 's':
                theImageView.setImageResource(R.drawable.letter_s);
                break;
            case 't':
                theImageView.setImageResource(R.drawable.letter_t);
                break;
            case 'u':
                theImageView.setImageResource(R.drawable.letter_u);
                break;
            case 'v':
                theImageView.setImageResource(R.drawable.letter_v);
                break;
            case 'w':
                theImageView.setImageResource(R.drawable.letter_w);
                break;
            case 'x':
                theImageView.setImageResource(R.drawable.letter_x);
                break;
            case 'y':
                theImageView.setImageResource(R.drawable.letter_y);
                break;
            case 'z':
                theImageView.setImageResource(R.drawable.letter_z);
                break;

        }

        return theView;

    }
}
