package com.example.android.mealcheck;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class AddFoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addfood);
    }



    LinearLayout myLayout = null;
    int editTextID;
    ArrayList<String> foodNames = new ArrayList<String>();

    public void addButton(View view) {
        EditText enterText = new EditText(AddFoodActivity.this);
        myLayout = (LinearLayout) findViewById(R.id.myLinearLayout);
        enterText.setHint("Enter food here");

        enterText.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        ));

        myLayout.addView(enterText);

        //Give enterText some ID and get the ID for it to get the text later on.
        enterText.setId(View.generateViewId());
        editTextID = enterText.getId();

        EditText foodText = (EditText) findViewById(R.id.firstFood);
        //String foodString = foodText.getText().toString();
        foodNames.add(foodText.getText().toString());

        TextView testing = (TextView) findViewById(R.id.testing);
        testing.append("Lets see " + editTextID + " " + foodNames.get(0));
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
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}



/*
public class AddFoodActivity extends AppCompatActivity {

    LinearLayout myLayout = null;
    Button btnAdd = null;
    int editTextID;


    ArrayList<Word> foodNames = new ArrayList<Word>();

    ArrayList<String> stuff = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addfood);

        EditText blah = (EditText) findViewById(R.id.firstFood);
        final String nameof = blah.getText().toString();
        foodNames.add(new Word("TestINGARRAY"));
        Word currentWord = foodNames.get(0);
        final String abc = currentWord.getMealName();
        foodNames.add(new Word(nameof));
        Word nextWord = foodNames.get(1);
        final String abcd = nextWord.getMealName();


        stuff.add("stufftesting");
        stuff.add(new String("testing"));


        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText enterText = new EditText(AddFoodActivity.this);
                myLayout = (LinearLayout) findViewById(R.id.myLinearLayout);
                enterText.setHint("Enter food here");

                enterText.setLayoutParams(new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                ));

                myLayout.addView(enterText);

                //Give enterText some ID and get the ID for it to get the text later on.
                //enterText.setId(View.generateViewId());
                //editTextID = enterText.getId();
                String t = enterText.getText().toString();

                //foodNames.add(new Word(getFoodName(editTextID)));
                foodNames.add(new Word(t));
                Word food = foodNames.get(1);
                int a = foodNames.size();

                TextView bunch = (TextView) findViewById(R.id.testing);
                bunch.append("Does this work? " + stuff.get(0) + " " + a + " " + abc + nameof);

            }
        });




    }

//    private String getFoodName(int food_id) {
//        EditText food = (EditText) findViewById(food_id);
//        String name = food.getText().toString();
//        return name;
//    }

    public ArrayList<Word> getList() {
        return foodNames;
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
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
*/