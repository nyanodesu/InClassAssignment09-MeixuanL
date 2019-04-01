package com.example.inclassassignment09_meixuanl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference myRef = database.getReference("Pokemon");
    private DatabaseReference myPokemonRef = database.getReference("Multiple Pokemon");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void setString(View view){
        myRef.setValue("I'm a String!");
    }

    public void addPokemon(View view){
        myPokemonRef.push().setValue(new Pokemon("Pikachu","Pokemon Red and Green",1));
    }
}
