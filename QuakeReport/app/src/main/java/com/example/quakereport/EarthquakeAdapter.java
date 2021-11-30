package com.example.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {
    public EarthquakeAdapter(Context context, ArrayList<Earthquake> earthquakes){
        super(context,0,earthquakes);
    }

    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView==null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.earthquake_list_item, parent, false);
        }
            Earthquake currentEarthquake = getItem(position);
            TextView magnitudeView = listItemView.findViewById(R.id.magnitude);
            magnitudeView.setText(currentEarthquake.getMagnitude());
            TextView locationView = listItemView.findViewById(R.id.location);
            locationView.setText(currentEarthquake.getLocation());
            TextView dateView = listItemView.findViewById(R.id.date);
            dateView.setText(currentEarthquake.getDate());
        return listItemView;
    }
}
