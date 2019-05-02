package com.example.hugo.act111;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtid;
    EditText editname;
    EditText editprice;
    DBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtid = (TextView) findViewById(R.id.textView2);
        editname = (EditText) findViewById(R.id.editText2);
        editprice = (EditText) findViewById(R.id.editText4);
        dbHandler= new DBHandler(this, null, null, 1);

    }
    public void AddProduct(View v) {
        String name = editname.getText().toString();
        double price = Double.parseDouble(editprice.getText().toString());
        Product product = new Product(name, price);
        dbHandler.AddProduct(product);
        editname.setText("");
        editprice.setText("");
        txtid.setText("AGREGADO");
    }

    public void FindProduct(View v) {
        String name = editname.getText().toString();
        Product product = dbHandler.FindProduct(name);
        if (product == null) {
            txtid.setText("NO SE ENCONTRO");
        } else {
            txtid.setText("" + product.get_id());
            editname.setText(product.get_name());
            editprice.setText("" + product.get_price());
        }
    }

    public void DeleteProduct(View v) {
        String name = editname.getText().toString();
        if (dbHandler.DeleteProduct(name)) {
            editprice.setText("");
            editname.setText("");
            txtid.setText("BORRADO");
        } else {
            txtid.setText("NO SE ENCONTRO");
        }
    }
}
