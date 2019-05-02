package com.example.hugo.ac11;

/**
 * Created by Hugo on 18/10/2017.
 */

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class Product extends SQLiteOpenHelper {



    private static final String DATABASE_NAME = "ANDROID_DB.db";
    private static final int DATABASE_VERSION = 1;
    public static final String TABLE_PRODUCTS = "products";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PRICE = "price";


    public Product(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {

        super(context, DATABASE_NAME, factory, DATABASE_VERSION);

    }

    @Override

    public void onCreate(SQLiteDatabase db) {


        String CREATE_PRODUCTS_TABLE = "CREATE TABLE " + TABLE_PRODUCTS +
                " (" + COLUMN_ID + "INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_NAME + "TEXT " +
                COLUMN_PRICE + "DOUBLE " +
                ")";
        db.execSQL(CREATE_PRODUCTS_TABLE);

    }

    @Override

    public void onUpgrade(SQLiteDatabase db, int version1, int version2) {

       db.execSQL("DROP TABLE IF EXIST " + TABLE_PRODUCTS);
        onCreate(db);

    }

}
