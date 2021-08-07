package com.example.androidnotification;

import android.app.Application;
import com.onesignal.OneSignal;

public class MyApplication extends Application {
    private static final String ONESIGNAL_APP_ID = "6e8da9e6-4053-4e56-a7cf-52f5025af558";

    @Override
    public void onCreate() {
        super.onCreate();

        // Enable verbose OneSignal logging to debug issues if needed.
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);

        // OneSignal Initialization
        OneSignal.initWithContext(this);
        OneSignal.setAppId(ONESIGNAL_APP_ID);
    }
}
