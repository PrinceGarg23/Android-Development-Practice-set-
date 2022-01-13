package com.example.iqtask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name;
    EditText age;
    EditText branch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.NameText);
        age = findViewById(R.id.AgeText);
        branch = findViewById(R.id.BranchText);
    }
    public void submitDetails(View view){
        Intent intent = new Intent(MainActivity.this,PrintActivity.class)
                .putExtra("name",name.getText().toString())
                .putExtra("age", age.getText().toString())
                .putExtra("branch",branch.getText().toString());

        startActivity(intent);
    }
}