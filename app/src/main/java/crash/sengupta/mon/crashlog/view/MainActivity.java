package crash.sengupta.mon.crashlog.view;

import android.app.ProgressDialog;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.dgreenhalgh.android.simpleitemdecoration.linear.DividerItemDecoration;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;

import crash.sengupta.mon.crashlog.R;
import crash.sengupta.mon.crashlog.net.response.CrashResponse;
import crash.sengupta.mon.crashlog.presenter.CrashSummaryPresenter;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;

    LinearLayoutManager mLayoutManager;
    ProgressDialog mProgressBar;
    CrashAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        new CrashSummaryPresenter().getCrashSummaries();

    }

    public void initUI() {
        mRecyclerView = (RecyclerView) findViewById(R.id.recycleView);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        Drawable dividerDrawable = ContextCompat.getDrawable(this, R.drawable.divider);
        mRecyclerView.addItemDecoration(new DividerItemDecoration(dividerDrawable));
        adapter = new CrashAdapter();
        mRecyclerView.setAdapter(adapter);
        mProgressBar = new ProgressDialog(this);
        mProgressBar.setMessage("Downloading Crash Summary...");
        mProgressBar.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        mProgressBar.setIndeterminate(true);
        mProgressBar.show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (!EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().register(this);
        }
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public void onCrashSummaryDownloaded(ArrayList<CrashResponse> allCrashResponseArrayList) {
        EventBus.getDefault().removeStickyEvent(allCrashResponseArrayList);
        mProgressBar.dismiss();
        adapter.updateData(allCrashResponseArrayList);
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (!EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mProgressBar != null) {
            mProgressBar.dismiss();
        }
    }
}
