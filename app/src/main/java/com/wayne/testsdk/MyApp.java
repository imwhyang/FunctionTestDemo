package com.wayne.testsdk;

import android.app.Application;
import android.content.Context;

import androidx.annotation.NonNull;

import com.innovation.animal.breedfunctionsdk.SDK;

/**
 * Description:
 * <p>
 * CreateTime：2021/03/17  18:20
 */
public class MyApp extends Application  {
//    private AppLifecycles mAppDelegate;


    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
//        if (mAppDelegate == null) {
//            this.mAppDelegate = new AppDelegate(base);
//        }
//        this.mAppDelegate.attachBaseContext(base);
    }

    @Override
    public void onCreate() {
        super.onCreate();
//        if (mAppDelegate != null) {
//            this.mAppDelegate.onCreate(this);
//        }
        SDK.init(this);
    }

//
//    @Override
//    public void onTerminate() {
//        super.onTerminate();
//        if (mAppDelegate != null) {
//            this.mAppDelegate.onTerminate(this);
//        }
//    }

//    @NonNull
//    @Override
//    public AppComponent getAppComponent() {
//        Preconditions.checkNotNull(mAppDelegate, "%s cannot be null", AppDelegate.class.getName());
//        Preconditions.checkState(mAppDelegate instanceof App, "%s must be implements %s", mAppDelegate.getClass().getName(), App.class.getName());
//        return ((App) mAppDelegate).getAppComponent();
//    }
}