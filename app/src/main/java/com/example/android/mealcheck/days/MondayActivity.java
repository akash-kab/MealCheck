package com.example.android.mealcheck.days;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.android.mealcheck.AddFoodActivity;
import com.example.android.mealcheck.MainActivity;
import com.example.android.mealcheck.R;
import com.example.android.mealcheck.Word;

import java.util.ArrayList;
import com.example.android.mealcheck.ListAdapter;

public class MondayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedIntenseState) {
        super.onCreate(savedIntenseState);

        setContentView(R.layout.food_activity);


        // testing adapter and listview to make sure food is being added.
        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Beans"));
        words.add(new Word("Black Beans"));
        words.add(new Word("Testing"));
        words.add(new Word("Kidney Beans"));


        // Create an {@link ListAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        ListAdapter adapter = new ListAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu options from the res/menu/food_menu.xml file.
        // This adds menu items to the app bar.
        getMenuInflater().inflate(R.menu.food_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // User clicked on a menu option in the app bar overflow menu
        switch (item.getItemId()) {
            case R.id.add_food:
                Intent newActivity = new Intent(MondayActivity.this, AddFoodActivity.class);
                startActivity(newActivity);

                // Do nothing for now
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
