package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Create a new arraylist named "words" of String data type to store the numbers
        ArrayList<String> words = new ArrayList<String>();

        // Initialize the values into the array
        words.add("One");
        words.add("Two");
        words.add("Three");
        words.add("Four");
        words.add("Five");
        words.add("Six");
        words.add("Seven");
        words.add("Eight");
        words.add("Nine");
        words.add("Ten");

        // Add the numbers into the layout using java code
        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        for (int i = 0; i < words.size(); i++){
            TextView wordView = new TextView(this);
            wordView.setText(words.get(i));
            rootView.addView(wordView);
        }

        /*int i = 0;
        while (i< words.size()){
            TextView wordView = new TextView(this);
            wordView.setText(words.get(i));
            rootView.addView(wordView);
            i++;
        }*/

    }
}