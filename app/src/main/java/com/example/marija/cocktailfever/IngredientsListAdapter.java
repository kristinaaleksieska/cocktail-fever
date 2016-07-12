package com.example.marija.cocktailfever;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Kristina on 6/23/2016.
 */
public class IngredientsListAdapter extends ArrayAdapter<Ingredient> {

    ArrayList<Ingredient> ingredientsList;
    Context context;

    public IngredientsListAdapter(Context context, int textViewResourceId, ArrayList<Ingredient> ingredientsList) {
        super(context, textViewResourceId, ingredientsList);
        this.ingredientsList = new ArrayList<>();
        this.ingredientsList.addAll(ingredientsList);
        this.context = context;
    }

    private class ViewHolder {
        TextView name;
        CheckBox check;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;

        if(convertView == null) {
            LayoutInflater vi = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = vi.inflate(R.layout.ingredient_info, null);

            holder = new ViewHolder();
            holder.name = (TextView) convertView.findViewById(R.id.ingredient_name);
            holder.check = (CheckBox) convertView.findViewById(R.id.check_box);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Ingredient ingredient = ingredientsList.get(position);
        holder.name.setText("");
        holder.check.setText(ingredient.getName());
        holder.check.setChecked(ingredient.isSelected());
        holder.check.setTag(ingredient);

        holder.check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox cb = (CheckBox) v;
                Ingredient ingredient = (Ingredient) cb.getTag();
                ingredient.setSelected(cb.isChecked());
            }
        });

        return convertView;
    }
}
