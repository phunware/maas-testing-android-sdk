package com.phunware.core.sample;

import android.app.Application;

import com.phunware.core.PwActivityLifecycleCallback;
import com.phunware.core.PwLog;

import com.phunware.lib.Switch;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        PwLog.setShowLog(true);
        this.registerActivityLifecycleCallbacks(new PwActivityLifecycleCallback());

        Switch s = new Switch("", "");

    }
}
