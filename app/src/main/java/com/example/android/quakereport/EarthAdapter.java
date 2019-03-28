package com.example.android.quakereport;

import android.app.Activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by sof on 28/03/2019.
 */

public class EarthAdapter extends ArrayAdapter<Earth> {

    int color;

    public EarthAdapter(Activity context, ArrayList<Earth> objects,int color) {
        super(context, 0, objects);
        this.color = color;
    }

    @Override
    public View getView(int position,View convertView,ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Earth currentEarthQuake = getItem(position);

        TextView magTextView = (TextView) listItemView.findViewById(R.id.mag);

        magTextView.setText(""+currentEarthQuake.getMagnitude());

        TextView numberTextView = (TextView) listItemView.findViewById(R.id.date);

        numberTextView.setText(currentEarthQuake.getDate());

        TextView placeTextView = (TextView) listItemView.findViewById(R.id.place);

        placeTextView.setText(currentEarthQuake.getPlace());


        return listItemView;
    }
}
