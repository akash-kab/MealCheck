package com.example.android.mealcheck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
