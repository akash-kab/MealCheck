package com.example.android.mealcheck;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.android.mealcheck.dataSQL.DatabaseHelper;
import com.example.android.mealcheck.dataSQL.Contract.MealEntry;

import java.util.ArrayList;
import java.util.List;

public class AddFoodActivity extends AppCompatActivity {

    DatabaseHelper mdHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addfood);
    }



    LinearLayout myLayout = null;
    int idFood;
    int editTextID;
    EditText enterText;
    List<String> foodNames = new ArrayList<String>();


    int b = 0;
    int k = 0;
    public void addButton(View view) {

        if (b == 0) {
            addFirstFood();
            b++;
        }

        if (k > 0) {
            addMoreFood();
        }

        enterText = new EditText(AddFoodActivity.this);
        myLayout = (LinearLayout) findViewById(R.id.myLinearLayout);
        enterText.setHint("Enter food here");
        enterText.setId(idFood++);
        editTextID = enterText.getId();

        enterText.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        ));

        myLayout.addView(enterText);
        k++;
    }


    //Add from first EditText
    public void addFirstFood() {
        EditText firstEntry = (EditText) findViewById(R.id.firstFood);
        appendText(firstEntry);
        return;
    }

    public void addMoreFood() {
        EditText moreEntries = (EditText) findViewById(editTextID);
        appendText(moreEntries);
        return;

    }


    public void appendText(EditText idFood) {

        foodNames.add(idFood.getText().toString());
        int index = foodNames.size() - 1;
        TextView addFood = (TextView) findViewById(R.id.summText);
        addFood.append("Index: " + index + ": " + foodNames.get(index) + "\n");
        return;
    }


    public void addToDB() {
        SQLiteDatabase db = mdHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        for (int i = 0; i < foodNames.size(); i++) {
            values.put(MealEntry.COLUMN_MEAL_NAME, foodNames.get(i));
        }

        //depending on what activity we came from, we add it to the respectful table.
        db.insert(MealEntry.TABLE_MONDAY, null, values);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu options from the res/menu/addfood_done.xml file.
        // This adds menu items to the app bar.
        getMenuInflater().inflate(R.menu.addfood_done, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // User clicked on a menu option in the app bar overflow menu
        switch (item.getItemId()) {
            case R.id.done:
                addToDB();
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}