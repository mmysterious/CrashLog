package crash.sengupta.mon.crashlog.view;


import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import crash.sengupta.mon.crashlog.CrashLogApp;
import crash.sengupta.mon.crashlog.R;
import crash.sengupta.mon.crashlog.net.response.CrashResponse;

/**
 * Created by mondrita on 11/8/16.
 */
public class CrashAdapter extends RecyclerView.Adapter<CrashAdapter.ViewHolder> {

    public static final String TAG = CrashLogApp.class.getSimpleName();

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public View mView;
        public CardView mCardView;
        public TextView mTxtNameView;

        public ViewHolder(View v) {
            super(v);
            mView = v;
            mCardView = (CardView) v.findViewById(R.id.cardView);
            mTxtNameView = (TextView) v.findViewById(R.id.crashName);
        }
    }

    private List<CrashResponse> mDataset;

    CrashAdapter() {
        this.mDataset = new ArrayList<CrashResponse>();
    }

    @Override
    public CrashAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.crash_item_layout, parent, false);
        CrashAdapter.ViewHolder viewHolder = new CrashAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mTxtNameView.setText(mDataset.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public void updateData(List<CrashResponse> mDataset) {
        this.mDataset = mDataset;
        notifyDataSetChanged();
    }


}
