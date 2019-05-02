package com.example.hugo.act111;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Hugo on 18/10/2017.
 */

public class DBHandler extends SQLiteOpenHelper {



    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "productsBD.db";
    public static final String TABLE_PRODUCTS = "products";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PRICE = "price";


    public DBHandler(Context context, String name,
                     SQLiteDatabase.CursorFactory factory, int version) {

        super(context, DATABASE_NAME, factory, DATABASE_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {


        String CREATE_PRODUCTS_TABLE = "CREATE TABLE " + TABLE_PRODUCTS +
                " (" + COLUMN_ID + "INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_NAME + "TEXT " +
                COLUMN_PRICE + "DOUBLE " +
                ")";
        sqLiteDatabase.execSQL(CREATE_PRODUCTS_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        sqLiteDatabase.execSQL("DROP TABLE IF EXIST " + TABLE_PRODUCTS);
        onCreate(sqLiteDatabase);

    }

    public void AddProduct(Product product){

        ContentValues values = new ContentValues();
        values.put(COLUMN_NAME, product.get_name());
        values.put(COLUMN_PRICE, product.get_price());
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        sqLiteDatabase.insert(TABLE_PRODUCTS, null, values);
    }

    public Product FindProduct(String name){
        String query = "SELECT * FROM " + TABLE_PRODUCTS +
                "WHERE " + COLUMN_NAME + " = " +
                "\"" + name + "\"";
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery(query,null);
        Product product = new Product();
        if(cursor.moveToFirst()){
            product.set_id(Integer.parseInt(cursor.getString(0)));
            product.set_name(cursor.getString(1));
            product.set_price(Double.parseDouble(cursor.getString(2)));
            cursor.close();
        }
        else{
            product = null;
        }
        sqLiteDatabase.close();
        return product;
    }


    public boolean DeleteProduct(String name){

        boolean result = false;

        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Product product = FindProduct(name);
        if(product != null){
            String query = "DELETE FROM " + TABLE_PRODUCTS +
                    "WHERE " + COLUMN_NAME + " = " +
                    "\"" + name + "\"";
            sqLiteDatabase.execSQL(query);
            result = true;
        }
        sqLiteDatabase.close();
        return  result;
    }
}
