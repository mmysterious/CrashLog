package crash.sengupta.mon.crashlog.presenter;

import crash.sengupta.mon.crashlog.net.RequestExecutor;
import crash.sengupta.mon.crashlog.net.request.CrashSummaryRequest;

/**
 * Created by mondrita on 11/8/16.
 */
public class CrashSummaryPresenter {
    public void getCrashSummaries() {
        RequestExecutor.execute(new CrashSummaryRequest().buildRequest());
    }
}
