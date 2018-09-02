package com.deston.poetry.base.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.deston.poetry.R;
import com.deston.poetry.base.BaseFragment;
import com.deston.poetry.base.DiscoveryGridAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by deston on 2018/8/15
 */
public class DiscoveryFragment extends BaseFragment {
    private RecyclerView mRecyclerView;
    private DiscoveryGridAdapter mAdapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_discovery, null);
        initViews(view);
        return view;
    }

    private void initViews(View view) {
        mRecyclerView = view.findViewById(R.id.list);
        test();
    }
    private void test() {
        List<String> data = new ArrayList<>();
        data.add("唐诗");
        data.add("宋词");
        data.add("元曲");
        data.add("现代诗");
        mAdapter = new DiscoveryGridAdapter(data);
        GridLayoutManager layoutManager = new GridLayoutManager(getContext(), 3);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }
}
