package com.example.pratica03;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;

import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Tela2 extends FragmentActivity implements OnMapReadyCallback {
    private GoogleMap map;
    public LatLng POS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela2);
        Intent it = getIntent();
        Bundle params = it.getExtras();
        double lat = params.getDouble("lat");
        double longe = params.getDouble("long");
        POS = new LatLng(lat,longe);
        ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.mapa)).getMapAsync(this);

    }
    @Override
    public void onMapReady(GoogleMap googleMap){
        map = googleMap;
        map.addMarker(new MarkerOptions().position(POS));
        map.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        CameraUpdate update = CameraUpdateFactory.newLatLngZoom(POS,15);
        map.animateCamera(update);
    }
}
