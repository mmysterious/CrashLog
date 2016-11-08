package crash.sengupta.mon.crashlog.net;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

import crash.sengupta.mon.crashlog.CrashLogApp;

/**
 * Created by mondrita on 11/8/16.
 */
public class VolleySingleton {

    private static RequestQueue mRequestQueue;

    private VolleySingleton() {
    }

    public static RequestQueue getRequestQueue() {
        if (mRequestQueue == null) {
            mRequestQueue = Volley.newRequestQueue(CrashLogApp.getInstance().getApplicationContext());
        }
        return mRequestQueue;
    }
}
