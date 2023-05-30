package com.example.steps_3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.PatternMatcher;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements LocListenerInterface {
    private TextView number_steps, distance, calories, activity_time;
    private Location lastLocation;
    private LocationManager locationManager;
    private MyLocListener myLocListener;

    private int num_step;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_gl2);
        init();
    }

    private void init() {
        number_steps = findViewById(R.id.number_steps);
        distance = findViewById(R.id.distance);
        calories = findViewById(R.id.calories);
        activity_time = findViewById(R.id.activity_time);

        locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        myLocListener = new MyLocListener();

        myLocListener.setLocListenerInterface(this);
        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,
                5, 1/10,   //НАСТРОЙКИ ТОЧНОСТИ GPS
                myLocListener);
    }



    @Override
    public void OnLocationChanged(Location loc) {
        if(loc.hasSpeed() && lastLocation != null){
            num_step += lastLocation.distanceTo(loc);
        }
        lastLocation = loc;
        number_steps.setText((int) (num_step/0.75));
        distance.setText(num_step);
        calories.setText((int) (num_step * 1.3125));
        activity_time.setText((int) (num_step * 0.02));

    }
}