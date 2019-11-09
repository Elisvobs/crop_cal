package com.elisvobs.cropcalendar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void viewCrops(View view) {
        int id = view.getId();
        switch(id) {
            case R.id.bean:
                startActivity(new Intent(this, BeanActivity.class));
                break;
            case R.id.beet:
                startActivity(new Intent(this, BeetActivity.class));
                break;
            case R.id.brassica:
                startActivity(new Intent(this, BrassicaActivity.class));
                break;
            case R.id.carrot:
                startActivity(new Intent(this, CarrotActivity.class));
                break;
            case R.id.daisy:
                startActivity(new Intent(this, DaisyActivity.class));
                break;
            case R.id.cucurbit:
                startActivity(new Intent(this, CucurbitActivity.class));
                break;
            case R.id.onion:
                startActivity(new Intent(this, OnionActivity.class));
                break;
            case R.id.potato:
                startActivity(new Intent(this, PotatoActivity.class));
                break;
        }

    }
}