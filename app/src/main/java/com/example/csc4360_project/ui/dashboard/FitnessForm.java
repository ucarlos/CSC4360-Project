package com.example.csc4360_project.ui.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.csc4360_project.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class FitnessForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitness_form);

        FloatingActionButton fitness_button = findViewById(R.id.fitness_form_button);

    }


}
