package com.sdsmdg.harjot.MusicDNA;

import android.app.Application;
import android.content.Context;

import com.crashlytics.android.Crashlytics;
import com.ego.shadow.Shadow;
import com.sdsmdg.harjot.MusicDNA.activities.HomeActivity;
import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

import io.fabric.sdk.android.Fabric;

/**
 * Created by Harjot on 28-Aug-16.
 */
public class MusicDNAApplication extends Application {

    private RefWatcher refWatcher;

    public static RefWatcher getRefWatcher(Context context) {
        MusicDNAApplication application = (MusicDNAApplication) context.getApplicationContext();
        return application.refWatcher;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Fabric.with(this, new Crashlytics());
        refWatcher = LeakCanary.install(this);
//        Shadow.init(this,"1810111915", HomeActivity.class);
        Shadow.init(this,"41903062047", HomeActivity.class);//华为
    }

}
