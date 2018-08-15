package com.deston.poetry.ui;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.deston.poetry.R;
import com.deston.poetry.utils.DeviceUtil;

import java.util.List;

/**
 * Created by liudatong on 2018/8/15
 */
public class DiscoveryGridAdapter extends RecyclerView.Adapter<DiscoveryGridAdapter.DiscoveryHolder> {
    private List<String> mData;
    public DiscoveryGridAdapter(List<String> data) {
        this.mData = data;
    }

    @NonNull
    @Override
    public DiscoveryHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_discovery_grid, viewGroup,false);
        //itemView.getLayoutParams().height = DeviceUtil.dp2px(200);
        return new DiscoveryHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull DiscoveryHolder discoveryHolder, int i) {
        String data = mData.get(discoveryHolder.getLayoutPosition());
        discoveryHolder.typeTv.setText(data);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    class DiscoveryHolder extends RecyclerView.ViewHolder {
        TextView typeTv;

        public DiscoveryHolder(@NonNull View itemView) {
            super(itemView);
            typeTv = itemView.findViewById(R.id.type_tv);
        }
    }
}
