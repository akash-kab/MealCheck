package com.example.android.mealcheck;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class AddFoodActivity extends AppCompatActivity {

    LinearLayout myLayout = null;
    Button btnAdd = null;
    int editTextID;


    ArrayList<String> foodNames = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addfood);
        foodNames.add(new String(getFoodName(R.id.firstFood)));


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
                enterText.setId(View.generateViewId());
                editTextID = enterText.getId();

                foodNames.add(new String(getFoodName(editTextID)));
            }
        });

    }

    private String getFoodName(int food_id) {
        EditText food = (EditText) findViewById(food_id);
        String name = food.getText().toString();
        return name;
    }

    public ArrayList<String> getList() {
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
