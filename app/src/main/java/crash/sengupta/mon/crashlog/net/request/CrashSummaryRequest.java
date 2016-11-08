package crash.sengupta.mon.crashlog.net.request;

import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.greenrobot.eventbus.EventBus;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import crash.sengupta.mon.crashlog.net.response.CrashResponse;

/**
 * Created by mondrita on 11/8/16.
 */
public class CrashSummaryRequest {
    public static final String TAG = CrashSummaryRequest.class.getSimpleName();

    public static final String CRASH_SUMMARY_REQUEST_URL = "https://developers.crittercism.com/v1.0/app/519d53101386202089000007/crash/summaries";

    public TokenRequest buildRequest() {
        TokenRequest jsonRequest = new TokenRequest
                (Request.Method.GET, CRASH_SUMMARY_REQUEST_URL, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Type listType = new TypeToken<List<CrashResponse>>() {
                        }.getType();
                        ArrayList<CrashResponse> crashResponse = new Gson().fromJson(response, listType);
                        Log.d(TAG, response);
                        EventBus.getDefault().post(crashResponse);
                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        error.printStackTrace();
                    }
                });
        return jsonRequest;

    }


}
