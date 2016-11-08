package crash.sengupta.mon.crashlog.net;

import crash.sengupta.mon.crashlog.net.request.TokenRequest;

/**
 * Created by mondrita on 11/8/16.
 */
public class RequestExecutor {

    public static void execute(TokenRequest stringRequest) {

        VolleySingleton.getRequestQueue().add(stringRequest);
    }

}
