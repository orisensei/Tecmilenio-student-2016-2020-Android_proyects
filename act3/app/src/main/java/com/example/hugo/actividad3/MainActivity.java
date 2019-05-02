package com.example.hugo.actividad3;
//librerias
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.support.v4.view.GestureDetectorCompat;

/*
* Hugo Eduardo Matos Uribe
* 2757307
* 20/08/2017
* actividad 3: Colores
* Desarrollo de aplicaciones en plataforma Android
*  version 4 y 7
*
*
* */



public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,
    GestureDetector.OnDoubleTapListener {

    private ConstraintLayout we;
    private TextView wel;
    private GestureDetectorCompat gestureDetector;
//eventos
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        we = (ConstraintLayout) findViewById(R.id.we);
        wel = (TextView) findViewById(R.id.textView);
        this.gestureDetector = new GestureDetectorCompat(this,this);
        gestureDetector.setOnDoubleTapListener(this);
    }

// colores segun el gesto o toque////////////////////////////////////////////////////////////
    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        wel.setText("un solo toque");
        we.setBackgroundColor(Color.BLUE);
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        wel.setText("doble toque");
        we.setBackgroundColor(Color.YELLOW);
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        wel.setText("un doble toque");
        we.setBackgroundColor(Color.RED);
        return true;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        wel.setText("para abajo");
        we.setBackgroundColor(Color.BLACK);
        return true;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
        wel.setText("en la prensa");
        we.setBackgroundColor(Color.GREEN);

    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        wel.setText("un solo toque arriba");
        we.setBackgroundColor(Color.MAGENTA);
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        wel.setText("scroll");
        we.setBackgroundColor(Color.GRAY);
        return true;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        wel.setText("un solo toque extenso");
        we.setBackgroundColor(Color.CYAN);

    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        wel.setText("un vuelo");
        we.setBackgroundColor(Color.DKGRAY);
        return false;
    }



//fin del programa



}

