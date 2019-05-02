package com.example.hugo.actividad9recibodemensajes;
import android.Manifest;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtNombreDestino, txtNumeroTelefono, txtMensaje;
    Button EnviarMensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtNombreDestino = (EditText)findViewById(R.id.txtNombreDestino);
        txtNumeroTelefono= (EditText)findViewById(R.id.txtNumeroTelefono);
        txtMensaje=(EditText)findViewById(R.id.txtMensaje);

        EnviarMensaje =(Button)findViewById(R.id.btnEnviar);

    }

    public void EnviarMensaje(View v){


        String numTel = txtNumeroTelefono.getText().toString();
        String datosCompletos = txtNombreDestino.getText().toString()
                + " " + txtMensaje.getText().toString();

        try{
            int permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS);
            if(permissionCheck != PackageManager.PERMISSION_GRANTED){
                Toast.makeText(getApplicationContext(), "No tienes los permisos necesarios para enviar SMS.", Toast.LENGTH_LONG).show();
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.SEND_SMS}, 225);
            }
            else{
                Log.i("Mensaje","tienes los permiso para enviar SMS");
            }
            SmsManager sms = SmsManager.getDefault();
            sms.sendTextMessage(numTel, null, datosCompletos, null,null);
            Toast.makeText(getApplicationContext(), "SMS Enviado.", Toast.LENGTH_LONG).show();
        }

        catch (Exception e){
            Toast.makeText(getApplicationContext(), "SMS no enviado." + e.getMessage().toString(), Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
    }

}


