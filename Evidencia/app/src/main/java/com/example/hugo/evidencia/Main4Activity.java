package com.example.hugo.evidencia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {
    private Button siguiente;
    private Switch checo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        siguiente = (Button) findViewById(R.id.button2);
        checo = (Switch) findViewById(R.id.switch2);
        siguiente.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if (checo.isChecked()){
                Intent intent = new Intent(Main4Activity.this, Main5Activity.class);
                startActivity(intent);}
                else{
                    Toast.makeText(Main4Activity.this, "No se selecciono el pedido",
                            Toast.LENGTH_LONG).show();
                }
            }


        });
    }
}
