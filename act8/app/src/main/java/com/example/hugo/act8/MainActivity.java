package com.example.hugo.act8;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tx1 = (TextView) findViewById(R.id.textView3);
        TextView tx2 = (TextView) findViewById(R.id.textView5);
        TextView tx3 = (TextView) findViewById(R.id.textView7);
        TextView tx4 = (TextView) findViewById(R.id.textView9);
        TextView tx5 = (TextView) findViewById(R.id.textView11);

        tx1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE)
                        != PackageManager.PERMISSION_GRANTED){
                        ActivityCompat.requestPermissions
                            (MainActivity.this, new String[]{Manifest.permission.CALL_PHONE},1);
                }
                else {
                    Intent n = new Intent(Intent.ACTION_CALL);
                    n.setData(Uri.parse("tel:333-638-8402"));
                    startActivity(n);

                }
            }
        });
        tx2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE)
                        != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions
                            (MainActivity.this, new String[]{Manifest.permission.CALL_PHONE},1);
                }
                else {
                    Intent n = new Intent(Intent.ACTION_CALL);
                    n.setData(Uri.parse("tel:214-343-2324"));
                    startActivity(n);

                }
            }
        });
        tx3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE)
                        != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions
                            (MainActivity.this, new String[]{Manifest.permission.CALL_PHONE},1);
                }
                else {
                    Intent n = new Intent(Intent.ACTION_CALL);
                    n.setData(Uri.parse("tel:323-423-4332"));
                    startActivity(n);

                }
            }
        });
        tx4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE)
                        != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions
                            (MainActivity.this, new String[]{Manifest.permission.CALL_PHONE},1);
                }
                else {
                    Intent n = new Intent(Intent.ACTION_CALL);
                    n.setData(Uri.parse("tel:523-322-3442"));
                    startActivity(n);

                }
            }
        });
        tx5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE)
                        != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions
                            (MainActivity.this, new String[]{Manifest.permission.CALL_PHONE},1);
                }
                else {
                    Intent n = new Intent(Intent.ACTION_CALL);
                    n.setData(Uri.parse("tel:686-865-7579"));
                    startActivity(n);

                }
            }
        });
    }
}
