package com.example.hugo.act6;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.AutoTransition;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Scene scene1, scene2;
    private Transition transition;
    private boolean start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout baseLayout = (RelativeLayout)findViewById(R.id.base);

        ViewGroup startViews = (ViewGroup)getLayoutInflater()
                .inflate(R.layout.activity_main, baseLayout, false);


        ViewGroup endViews = (ViewGroup)getLayoutInflater()
                .inflate(R.layout.activity_main2, baseLayout, false);

        scene1 = new Scene(baseLayout, startViews);
        scene2 = new Scene(baseLayout, endViews);

        transition = new AutoTransition();
        transition.setDuration(5000);
        transition.setInterpolator(new AccelerateDecelerateInterpolator());

        start=true;

        Button btn = (Button) findViewById(R.id.button);
        final EditText ed1 = (EditText) findViewById(R.id.editText);
        final  EditText ed2 = (EditText) findViewById(R.id.editText2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String ax = String.valueOf(ed1.getText().toString());
                String ay = String.valueOf(ed2.getText().toString());

                Toast.makeText(getApplicationContext(),
                       "fecha de la cita: " + ax + "\n" +"nombre del paciente: "+ ay +"\n\n"+
                               "datos guardados satisfactoriamente"
                        , Toast.LENGTH_LONG).show();

                    if(start) {
                        TransitionManager.go(scene2, transition);
                        start=false;
                    }
                    else {
                        TransitionManager.go(scene1, transition);
                        start=true;
                    }


            }
        });
    }


}