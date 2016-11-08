package crash.sengupta.mon.crashlog;

import android.app.Application;

/**
 * Created by mondrita on 11/8/16.
 */
public class CrashLogApp extends Application {
    private static CrashLogApp mcrashLogAppInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mcrashLogAppInstance = this;
    }

    public static CrashLogApp getInstance() {
        return mcrashLogAppInstance;
    }

}
