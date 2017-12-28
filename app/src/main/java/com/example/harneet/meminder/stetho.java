package com.example.harneet.meminder;

import android.app.Application;

import com.facebook.stetho.Stetho;

/**
 * Created by Harneet on 12/28/2017.
 */

public class stetho extends Application {
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}
