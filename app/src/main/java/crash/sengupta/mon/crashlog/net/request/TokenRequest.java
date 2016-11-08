package crash.sengupta.mon.crashlog.net.request;

/**
 * Created by mondrita on 11/8/16.
 */

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public final class TokenRequest extends StringRequest {

    private static final String AUTH_TOKEN = "Bearer 5a839540a09f12373e52c7c82680318e";

    private final Map<String, String> headers = new HashMap<String, String>();

    TokenRequest(int method, String url, Response.Listener<String> listener,
                 Response.ErrorListener errorListener) {
        super(method, url, listener, errorListener);
    }

    @Override
    public Map<String, String> getHeaders() throws AuthFailureError {
        Map<String, String> headerMap = new HashMap<String, String>();

        headerMap.put("Authorization", AUTH_TOKEN);

        return headerMap;

    }


}
