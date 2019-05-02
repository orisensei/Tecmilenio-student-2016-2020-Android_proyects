package com.example.hugo.act5;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        final EditText e1, e2, e3;
        final ToggleButton a1, a2, a3;

        a1 = (ToggleButton)  findViewById(R.id.toggleButton);
        a2 = (ToggleButton)  findViewById(R.id.toggleButton4);
        a3 = (ToggleButton)  findViewById(R.id.toggleButton5);
        Button btn = (Button) findViewById(R.id.button);
            e1 = (EditText) findViewById(R.id.editText);
            e2 = (EditText) findViewById(R.id.editText2);
            e3 = (EditText) findViewById(R.id.editText3);

            final TextView Resultado = (TextView) findViewById(R.id.editText4);

            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int aux1 = Integer.valueOf(e1.getText().toString());
                    int aux2 = Integer.valueOf(e2.getText().toString());
                    int aux3 = Integer.valueOf(e3.getText().toString());
                    if((a1.isChecked())&&(a2.isChecked())&&(a3.isChecked()))
                    {
                    int resultado = aux1 + aux2 + aux3;
                    Resultado.setText(""+resultado);
                    }else if((a1.isChecked())&&(a2.isChecked())){
                        int resultado = aux1 + aux2;
                        Resultado.setText(""+resultado);
                    }else if((a1.isChecked())&&(a3.isChecked())){
                        int resultado = aux1 + aux3;
                        Resultado.setText(""+resultado);
                    }else if((a2.isChecked())&&(a3.isChecked())){
                        int resultado = aux2 + aux3;
                        Resultado.setText(""+resultado);
                    }else if(a1.isChecked()){
                        int resultado = aux1;
                        Resultado.setText(""+resultado);
                    }
                    else if(a2.isChecked()){
                        int resultado = aux2;
                        Resultado.setText(""+resultado);
                    }
                    else if(a3.isChecked()){
                        int resultado = aux3;
                        Resultado.setText(""+resultado);
                    }
                    else{
                        Resultado.setText("carrito vacio");
                    }
                }
            });

        Button salir;

        salir = (Button) findViewById(R.id.button11);


        salir.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }

        });
    }
}
