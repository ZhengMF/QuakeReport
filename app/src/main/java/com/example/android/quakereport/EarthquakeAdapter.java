package com.example.android.quakereport;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by mf on 17/04/2018.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter(Activity context, ArrayList<Earthquake> earthquakes) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, earthquakes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Earthquake} object located at this position in the list
        Earthquake currentEarthquake = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID mag_text_view
        TextView magTextView = (TextView) listItemView.findViewById(R.id.mag_text_view);
        // Get the magnitude from the earthquake object and
        // set this text on the mag TextView
        magTextView.setText(currentEarthquake.getMagnitude());

        // Find the TextView in the list_item.xml layout with the ID loc_text_view
        TextView locTextView = (TextView) listItemView.findViewById(R.id.loc_text_view);
        // Get the location from the earthquake object and
        // set this text on the loc TextView
        locTextView.setText(currentEarthquake.getLocation());

        // Find the TextView in the list_item.xml layout with the ID time_text_view
        TextView timeTextView = (TextView) listItemView.findViewById(R.id.time_text_view);
        // Get the time from the earthquake object and
        // set this text on the time TextView
        timeTextView.setText(currentEarthquake.getTime());


        return listItemView;
    }


}
