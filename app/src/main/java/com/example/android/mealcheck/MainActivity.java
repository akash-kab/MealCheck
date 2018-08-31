package com.example.android.mealcheck;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import com.example.android.mealcheck.days.*;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        //when monday is clicked
        TextView monday = (TextView) findViewById(R.id.monday);
        //set click listener
        monday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mondayIntent = new Intent(MainActivity.this, MondayActivity.class);
                startActivity(mondayIntent);
            }
        });

        //when tuesday is clicked
        TextView tuesday = (TextView) findViewById(R.id.tuesday);
        //set click listener
        tuesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tuesdayIntent = new Intent(MainActivity.this, TuesdayActivity.class);
                startActivity(tuesdayIntent);
            }
        });

        //when wednesday is clicked
        TextView wednesday = (TextView) findViewById(R.id.wednesday);
        //set click listener
        wednesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wednesdayIntent = new Intent(MainActivity.this, WednesdayActivity.class);
                startActivity(wednesdayIntent);
            }
        });

        //when thursday is clicked
        TextView thursday = (TextView) findViewById(R.id.thursday);
        //set click listener
        thursday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent thursdayIntent = new Intent(MainActivity.this, ThursdayActivity.class);
                startActivity(thursdayIntent);
            }
        });

        //when friday is clicked
        TextView friday = (TextView) findViewById(R.id.friday);
        //set click listener
        friday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fridayIntent = new Intent(MainActivity.this, FridayActivity.class);
                startActivity(fridayIntent);
            }
        });

        //when saturday is clicked
        TextView saturday = (TextView) findViewById(R.id.saturday);
        //set click listener
        saturday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent saturdayIntent = new Intent(MainActivity.this, SaturdayActivity.class);
                startActivity(saturdayIntent);
            }
        });

        //when sunday is clicked
        TextView sunday = (TextView) findViewById(R.id.sunday);
        //set click listener
        sunday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sundayIntent = new Intent(MainActivity.this, SundayActivity.class);
                startActivity(sundayIntent);
            }
        });

        //Add Food from menu option
        TextView add = (TextView) findViewById(R.id.add_food);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newActivity = new Intent(MainActivity.this, FoodActivity.class);
                startActivity(newActivity);
            }
        });

/*
        // testing adapter and listview.
        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Beans"));
        words.add(new Word("Black Beans"));
        words.add(new Word("Testing"));
        words.add(new Word("Kidney Beans"));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        ListAdapter adapter = new ListAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
*/
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu options from the res/menu/settings_menu.xml file.
        // This adds menu items to the app bar.
        getMenuInflater().inflate(R.menu.settings_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // User clicked on a menu option in the app bar overflow menu
        switch (item.getItemId()) {
            case R.id.settings:
                // Do nothing for now
                return true;
            // Respond to a click on the "Add Food" menu option
            case R.id.add_food:
                // Do nothing for now
                return true;
            // Respond to a click on the "Delete all" menu option
            case R.id.delete_all:
                // Do nothing for now
                return true;
        }
        return super.onOptionsItemSelected(item);
    }



}
