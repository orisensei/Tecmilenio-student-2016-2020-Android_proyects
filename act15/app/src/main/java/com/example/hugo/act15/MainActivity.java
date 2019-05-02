package com.example.hugo.act15;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText ed1;
    private EditText ed2;
    private EditText ed3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button3);
        ed1 = (EditText) findViewById(R.id.editText4);
        ed2 = (EditText) findViewById(R.id.editText5);
        ed3 = (EditText) findViewById(R.id.editText6);

        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                double resul = (1093.61)*Double.parseDouble(ed1.getText().toString());
                ed1.setText(""+ resul);

                double resul2 = (1000000)*Double.parseDouble(ed2.getText().toString());
                ed2.setText(""+ resul2);

                double resul3 = (2.20462)*Double.parseDouble(ed3.getText().toString());
                ed3.setText(""+ resul3);
            }

        });
    }
}
