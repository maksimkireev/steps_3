package com.example.steps_3;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

import androidx.annotation.NonNull;

public class MyLocListener implements LocationListener {
    private LocListenerInterface locListenerInterface;

    @Override
    public void onLocationChanged(@NonNull Location location) {
        locListenerInterface.OnLocationChanged(location);
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {
        LocationListener.super.onStatusChanged(provider, status, extras);
    }

    @Override
    public void onProviderEnabled(@NonNull String provider) {
        LocationListener.super.onProviderEnabled(provider);
    }

    @Override
    public void onProviderDisabled(@NonNull String provider) {
        LocationListener.super.onProviderDisabled(provider);
    }

    public void setLocListenerInterface(LocListenerInterface locListenerInterface) {
        this.locListenerInterface = locListenerInterface;
    }
}
