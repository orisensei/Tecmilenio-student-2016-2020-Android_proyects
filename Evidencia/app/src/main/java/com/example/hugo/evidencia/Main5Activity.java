package com.example.hugo.evidencia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {

    private Button enviar;
    private EditText direccion;
    private EditText zp;
    private EditText tel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        enviar = (Button) findViewById(R.id.button3);
        direccion = (EditText) findViewById(R.id.editText);
        zp = (EditText) findViewById(R.id.editText3);
        tel = (EditText) findViewById(R.id.editText4);


        enviar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(enviar.isClickable()) {
                    if (tel.getText().toString().toString().isEmpty() && direccion.getText().toString().toString().isEmpty() && zp.getText().toString().toString().isEmpty()) {
                        Toast.makeText(Main5Activity.this, "por favor coloca todos los datos de tu envio", Toast.LENGTH_SHORT).show();
                      //  return;
                    } else if(tel.getText().toString().toString().isEmpty() && direccion.getText().toString().toString().isEmpty()) {
                        Toast.makeText(Main5Activity.this, "por favor coloca todos los datos de tu envio", Toast.LENGTH_SHORT).show();
                    }else if(tel.getText().toString().toString().isEmpty() && zp.getText().toString().toString().isEmpty()){
                        Toast.makeText(Main5Activity.this, "por favor coloca todos los datos de tu envio", Toast.LENGTH_SHORT).show();
                    }else if(direccion.getText().toString().toString().isEmpty() && zp.getText().toString().toString().isEmpty()){
                        Toast.makeText(Main5Activity.this, "por favor coloca todos los datos de tu envio", Toast.LENGTH_SHORT).show();
                    }else if(tel.getText().toString().toString().isEmpty()){
                        Toast.makeText(Main5Activity.this, "por favor coloca todos los datos de tu envio", Toast.LENGTH_SHORT).show();
                    }
                    else if(direccion.getText().toString().toString().isEmpty()){
                        Toast.makeText(Main5Activity.this, "por favor coloca todos los datos de tu envio", Toast.LENGTH_SHORT).show();
                    }else if(zp.getText().toString().toString().isEmpty()){
                        Toast.makeText(Main5Activity.this, "por favor coloca todos los datos de tu envio", Toast.LENGTH_SHORT).show();
                    }else{
                        enviar.setOnClickListener(new View.OnClickListener(){

                            @Override
                            public void onClick(View v) {

                               Intent intent = new Intent(Main5Activity.this, Main6Activity.class);
                               startActivity(intent);
                                sendEmail();
                            }

                        });

                    }
                }

            }

        });

    }
    protected void sendEmail() {

        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"AL02757307@tecmilenio.mx"}); //mail
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Paquete de comida la cocinita la minerva");
        emailIntent.putExtra(Intent.EXTRA_TEXT, direccion.getText().toString()+"\n" + zp.getText().toString()+"\n" + tel.getText().toString());

        try {
            startActivity(Intent.createChooser(emailIntent, "enviado..."));
            finish();
            Log.e("Test correo:", "Fin envio");

        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(Main5Activity.this, "no hay correo electronico.", Toast.LENGTH_SHORT).show();
        }
    }


}
