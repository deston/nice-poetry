package com.deston.poetry.ui.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.deston.poetry.R;
import com.deston.poetry.model.PoemCardModel;
import com.deston.poetry.ui.BaseFragment;
import com.deston.poetry.ui.HomeAdapter;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends BaseFragment {
    private RecyclerView  mRecyclerView;
    private HomeAdapter mAdapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, null);
        initViews(view);
        return view;
    }
    private void initViews(View view) {
        mRecyclerView = view.findViewById(R.id.list);
        mAdapter = new HomeAdapter();
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setAdapter(mAdapter);
        test();
    }
    private void test() {
        List<PoemCardModel> models = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            PoemCardModel model = new PoemCardModel();
            model.author = "[唐] 李白";
            model.title = "静夜思";
            model.content = "床前明月光，疑是地上霜。\n举头望明月，低头思故乡。";
            models.add(model);
        }
        mAdapter.addData(models);
    }
}
