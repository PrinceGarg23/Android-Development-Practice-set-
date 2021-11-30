package com.example.quakereport;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);


        ArrayList<Earthquake> earthquakes = new ArrayList<Earthquake>();
        earthquakes.add(new Earthquake("7.2","San Francisco","June 21, 2020"));
        earthquakes.add(new Earthquake("7.2","London","June 21, 2020"));
        earthquakes.add(new Earthquake("7.2","Tokyo","June 21, 2020"));
        earthquakes.add(new Earthquake("7.2","Mexico City","June 21, 2020"));
        earthquakes.add(new Earthquake("7.2","Moscow","June 21, 2020"));
        earthquakes.add(new Earthquake("7.2","Rio de Janeiro","June 21, 2020"));
        earthquakes.add(new Earthquake("7.2","Paris","June 21, 2020"));


        EarthquakeAdapter adapter = new EarthquakeAdapter(this, earthquakes);
        ListView earthquakeListView = findViewById(R.id.list);
        earthquakeListView.setAdapter(adapter);
    }
}