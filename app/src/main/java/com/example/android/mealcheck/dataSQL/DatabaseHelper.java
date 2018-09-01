package com.example.android.mealcheck.dataSQL;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.android.mealcheck.dataSQL.Contract.MealEntry;

public class DatabaseHelper extends SQLiteOpenHelper {


    private static final String DATABASE_NAME = "mealTrack.db";

    private static final int DATABASE_VERSION = 1;


    //CREATE MONDAY TABLE
    String CREATE_MONDAY_TABLE = "CREATE TABLE IF NOT EXISTS " + MealEntry.TABLE_MONDAY + "("
            + MealEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + MealEntry.COLUMN_MEAL_NAME + "TEXT NOT NULL, "
            + MealEntry.COLUMN_CHECKED + "INTEGER DEFAULT 0);";

    //CREATE TUESDAY
    String CREATE_TUESDAY_TABLE = "CREATE TABLE IF NOT EXISTS " + MealEntry.TABLE_TUESDAY + "("
            + MealEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + MealEntry.COLUMN_MEAL_NAME + "TEXT NOT NULL, "
            + MealEntry.COLUMN_CHECKED + "INTEGER DEFAULT 0);";

    //CREATE WEDNESDAY
    String CREATE_WEDNESDAY_TABLE = "CREATE TABLE IF NOT EXISTS " + MealEntry.TABLE_WEDNESDAY + "("
            + MealEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + MealEntry.COLUMN_MEAL_NAME + "TEXT NOT NULL, "
            + MealEntry.COLUMN_CHECKED + "INTEGER DEFAULT 0);";

    //CREATE THURSDAY
    String CREATE_THURSDAY_TABLE = "CREATE TABLE IF NOT EXISTS " + MealEntry.TABLE_THURSDAY + "("
            + MealEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + MealEntry.COLUMN_MEAL_NAME + "TEXT NOT NULL, "
            + MealEntry.COLUMN_CHECKED + "INTEGER DEFAULT 0);";

    //CREATE FRIDAY
    String CREATE_FRIDAY_TABLE = "CREATE TABLE IF NOT EXISTS " + MealEntry.TABLE_FRIDAY + "("
            + MealEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + MealEntry.COLUMN_MEAL_NAME + "TEXT NOT NULL, "
            + MealEntry.COLUMN_CHECKED + "INTEGER DEFAULT 0);";

    //CREATE SATURDAY
    String CREATE_SATURDAY_TABLE = "CREATE TABLE IF NOT EXISTS " + MealEntry.TABLE_SATURDAY + "("
            + MealEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + MealEntry.COLUMN_MEAL_NAME + "TEXT NOT NULL, "
            + MealEntry.COLUMN_CHECKED + "INTEGER DEFAULT 0);";

    //CREATE SUNDAY
    String CREATE_SUNDAY_TABLE = "CREATE TABLE IF NOT EXISTS " + MealEntry.TABLE_SUNDAY + "("
            + MealEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + MealEntry.COLUMN_MEAL_NAME + "TEXT NOT NULL, "
            + MealEntry.COLUMN_CHECKED + "INTEGER DEFAULT 0);";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(CREATE_MONDAY_TABLE);
        db.execSQL(CREATE_TUESDAY_TABLE);
        db.execSQL(CREATE_WEDNESDAY_TABLE);
        db.execSQL(CREATE_THURSDAY_TABLE);
        db.execSQL(CREATE_FRIDAY_TABLE);
        db.execSQL(CREATE_SATURDAY_TABLE);
        db.execSQL(CREATE_SUNDAY_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + MealEntry.TABLE_MONDAY);
        db.execSQL("DROP TABLE IF EXISTS " + MealEntry.TABLE_TUESDAY);
        db.execSQL("DROP TABLE IF EXISTS " + MealEntry.TABLE_WEDNESDAY);
        db.execSQL("DROP TABLE IF EXISTS " + MealEntry.TABLE_THURSDAY);
        db.execSQL("DROP TABLE IF EXISTS " + MealEntry.TABLE_FRIDAY);
        db.execSQL("DROP TABLE IF EXISTS " + MealEntry.TABLE_SATURDAY);
        db.execSQL("DROP TABLE IF EXISTS " + MealEntry.TABLE_SUNDAY);

        //create new tables
        onCreate(db);

    }

}
