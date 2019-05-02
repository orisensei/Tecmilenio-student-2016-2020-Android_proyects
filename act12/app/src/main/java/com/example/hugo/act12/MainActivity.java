package com.example.hugo.act12;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton imagen, imagen1, imagen2, imagen3, imagen4, imagen5, imagen6, imagen7, imagen8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagen = (ImageButton) findViewById(R.id.imageButton);
        imagen1 = (ImageButton) findViewById(R.id.imageButton2);
        imagen2 = (ImageButton) findViewById(R.id.imageButton3);
        imagen3 = (ImageButton) findViewById(R.id.imageButton4);
        imagen4 = (ImageButton) findViewById(R.id.imageButton5);
        imagen5 = (ImageButton) findViewById(R.id.imageButton6);
        imagen6 = (ImageButton) findViewById(R.id.imageButton7);
        imagen7 = (ImageButton) findViewById(R.id.imageButton8);
        imagen8 = (ImageButton) findViewById(R.id.imageButton9);

        imagen.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){

                Intent intent = new Intent (MediaStore.ACTION_IMAGE_CAPTURE);

                startActivityForResult(intent,0);

            }
        });
        imagen1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent = new Intent (MediaStore.ACTION_IMAGE_CAPTURE);

                startActivityForResult(intent,1);
            }
        });
        imagen2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent = new Intent (MediaStore.ACTION_IMAGE_CAPTURE);

                startActivityForResult(intent,2);
            }
        });
        imagen3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent = new Intent (MediaStore.ACTION_IMAGE_CAPTURE);

                startActivityForResult(intent,3);
            }
        });
        imagen4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent = new Intent (MediaStore.ACTION_IMAGE_CAPTURE);

                startActivityForResult(intent,4);
            }
        });
        imagen5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent = new Intent (MediaStore.ACTION_IMAGE_CAPTURE);

                startActivityForResult(intent,5);
            }
        });
        imagen6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent = new Intent (MediaStore.ACTION_IMAGE_CAPTURE);

                startActivityForResult(intent,6);
            }
        });
        imagen7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent = new Intent (MediaStore.ACTION_IMAGE_CAPTURE);

                startActivityForResult(intent,7);
            }
        });
        imagen8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent = new Intent (MediaStore.ACTION_IMAGE_CAPTURE);

                startActivityForResult(intent,8);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        switch(requestCode){
            case 0:
                Bitmap bp = (Bitmap) data.getExtras().get("data");
                imagen.setImageBitmap(bp);
                break;
            case 1:
                Bitmap bp1 = (Bitmap) data.getExtras().get("data");
                imagen1.setImageBitmap(bp1);
                break;
            case 2:
                Bitmap bp2 = (Bitmap) data.getExtras().get("data");
                imagen2.setImageBitmap(bp2);
                break;
            case 3:
                Bitmap bp3 = (Bitmap) data.getExtras().get("data");
                imagen3.setImageBitmap(bp3);
                break;
            case 4:
                Bitmap bp4 = (Bitmap) data.getExtras().get("data");
                imagen4.setImageBitmap(bp4);
                break;
            case 5:
                Bitmap bp5 = (Bitmap) data.getExtras().get("data");
                imagen5.setImageBitmap(bp5);
                break;
            case 6:
                Bitmap bp6 = (Bitmap) data.getExtras().get("data");
                imagen6.setImageBitmap(bp6);
                break;
            case 7:
                Bitmap bp7 = (Bitmap) data.getExtras().get("data");
                imagen7.setImageBitmap(bp7);
                break;
            case 8:
                Bitmap bp8 = (Bitmap) data.getExtras().get("data");
                imagen8.setImageBitmap(bp8);
                break;
        }
    }


}




