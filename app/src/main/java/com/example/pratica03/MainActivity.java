package com.example.pratica03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mapa(View view) {
        String tag = view.getTag().toString();
        Intent it = new Intent(getBaseContext(),Tela2.class);
        Bundle params = new Bundle();
        if(tag.equals("1")){
            params.putDouble("lat",-19.465517);
            params.putDouble("long",-42.562370);
        }
        else if(tag.equals("2")){
            params.putDouble("lat",-20.757104);
            params.putDouble("long",-42.876503);
        }
        else if(tag.equals("3")){
            params.putDouble("lat",-20.765010);
            params.putDouble("long",-42.868479);
        }
        else if(tag.equals("4")){
            finish();
        }
        it.putExtras(params);
        startActivity(it);
    }
}