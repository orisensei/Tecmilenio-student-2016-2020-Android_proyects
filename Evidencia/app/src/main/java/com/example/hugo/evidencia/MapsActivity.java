package com.example.hugo.evidencia;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnInfoWindowClickListener{

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        // Add a marker in Sydney and move the camera
        LatLng cocinita = new LatLng(20.6719972,-103.3877523);
        mMap.addMarker(new MarkerOptions().position(cocinita).title("Cocinita la minerva"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(cocinita));
     //   UiSettings uiSettings = mMap.getUiSettings();
        mMap.setMinZoomPreference(19.0f);
        mMap.setMaxZoomPreference(19.0f);
        mMap.setOnInfoWindowClickListener(this);
       /* uiSettings.setZoomGesturesEnabled(false);
        uiSettings.setScrollGesturesEnabled(false);
        uiSettings.setRotateGesturesEnabled(false);*/
    }


    @Override
    public void onInfoWindowClick(Marker marker) {
        Toast.makeText(this, "Cocinita la Minerva te ofrece gran variedad de platillos Mexicanos...\n" +
                        "Con el tipico sazón casero \n" +
                        "A bajo costo\n" +
                        "Con muy buena ubicación \n" +
                        "Ven y conócenos !!!",
                Toast.LENGTH_LONG).show();
    }
}

