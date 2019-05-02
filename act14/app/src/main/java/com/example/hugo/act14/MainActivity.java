package com.example.hugo.act14;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SensorEventListener{

    private Sensor sensor_proximidad;
    private SensorManager sensorManager;
    private TextView textView;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        button = (Button)  findViewById(R.id.button);

        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
       sensor_proximidad = sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY);


        if(sensor_proximidad != null){
            sensorManager.registerListener(this,sensor_proximidad,sensorManager.SENSOR_DELAY_NORMAL);

        }
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

               Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }


        });

    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
       if(sensorEvent.sensor.getType() == Sensor.TYPE_PROXIMITY){
            textView.setText("Sensor de Proximidad = "+ sensorEvent.values[0]);
        }

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}
