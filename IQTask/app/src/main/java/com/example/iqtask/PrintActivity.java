package com.example.iqtask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class PrintActivity extends AppCompatActivity {
    TextView text;
    String name;
    String age;
    String branch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_print);

        Intent intent = getIntent();
        name = intent.getStringExtra("name");
        age = intent.getStringExtra("age");
        branch = intent.getStringExtra("branch");

        text = findViewById(R.id.text);
        text.setText("Hi "+name+"\nYour Age is "+age+"\nYour branch is "+branch);
    }
}