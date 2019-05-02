package com.example.hugo.ac11;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.hugo.ac11.Product.COLUMN_NAME;
import static com.example.hugo.ac11.Product.COLUMN_PRICE;
import static com.example.hugo.ac11.Product.TABLE_PRODUCTS;


public class MainActivity extends AppCompatActivity {
    pro pro = new pro();
    Product admin = new Product(this, null, null, 1);
    TextView txtid = (TextView) findViewById(R.id.textView);
    EditText editname = (EditText) findViewById(R.id.editText2);
    EditText editprice = (EditText) findViewById(R.id.editText4);
    private Product producto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void Addproduct(View v) {
        String name = editname.getText().toString();
        double price = Double.parseDouble(editprice.getText().toString());
        pro pro = new pro(name, price);
        AddProduct(producto);
        editname.setText("");
        txtid.setText("agregado");
    }

    public void Findproduct(View v) {
        String name = editname.getText().toString();
        pro pro = FindProduct(name);
        if (pro == null) {
            txtid.setText("NO SE ENCONTRO");
        } else {
            txtid.setText("" + pro.get_id());
            editname.setText(pro.get_name());
            editprice.setText("" + pro.get_price());
        }
    }

    public void DeleteProduct(View v) {
        String name = editname.getText().toString();
        if (DeleteProduct(name)) {
            editprice.setText("");
            editname.setText("");
            txtid.setText("Borrado");
        } else {
            txtid.setText("no se encontro");
        }
    }



    public void AddProduct(Product producto){

        ContentValues values = new ContentValues();
        values.put(COLUMN_NAME, pro.get_name());
        values.put(COLUMN_PRICE, pro.get_price());
        SQLiteDatabase sqLiteDatabase = admin.getWritableDatabase();
        sqLiteDatabase.insert(TABLE_PRODUCTS,null,values);
    }

public com.example.hugo.ac11.pro FindProduct(String name){
    String query = "SELECT * FROM " + TABLE_PRODUCTS +
            "WHERE " + COLUMN_NAME + " = " +
            "\"" + name + "\"";
    SQLiteDatabase sqLiteDatabase = admin.getWritableDatabase();
    Cursor cursor = sqLiteDatabase.rawQuery(query,null);
   if(cursor.moveToFirst()){
       pro.set_id(Integer.parseInt(cursor.getString(0)));
       pro.set_name(cursor.getString(1));
       pro.set_price(Double.parseDouble(cursor.getString(2)));
       cursor.close();
   }
   else{
       pro = null;
   }
    sqLiteDatabase.close();
    return pro;
}
public boolean DeleteProduct(String name){
    boolean result = false;

    SQLiteDatabase sqLiteDatabase = admin.getWritableDatabase();
    com.example.hugo.ac11.pro producte = FindProduct(name);
    if(producte != null){
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