package com.example.firebasedemo1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView mName;
    List<modelName> l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l = new ArrayList<>();
        mName = findViewById(R.id.nametext);
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance("https://fir-demo1-b85fb-default-rtdb.firebaseio.com/");
        DatabaseReference databaseReference = firebaseDatabase.getReference("names");
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    l.clear();

                for(DataSnapshot dataSnapshot1:dataSnapshot.getChildren()){

                    modelName modelName=dataSnapshot1.getValue(com.example.firebasedemo1.modelName.class);
                    l.add(modelName);

                }
                String a = "";
                for(int i=0;i<l.size();i++){
                    a+=l.get(i).getName()+" ";
                }
                mName.setText(a);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


    }
}