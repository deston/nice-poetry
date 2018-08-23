package com.deston.poetry.ui;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.deston.poetry.model.CardModel;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseAdapter extends RecyclerView.Adapter<BaseAdapter.ViewHolder> {
    private final List<CardModel> mData = new ArrayList<>();
    private final SparseArray<ICardView> mViewTypes = new SparseArray<>();

    public BaseAdapter() {
        super();
        registerCard();
    }

    public void addData(List<? extends CardModel> data) {
        mData.addAll(data);
        notifyDataSetChanged();
    }
    public void addCard(int carType, ICardView card) {
        mViewTypes.put(carType, card);
    }
    public abstract void registerCard();

    @Override
    public int getItemViewType(int position) {
        return mData.get(position).getType();
    }

    @NonNull
    @Override
    public BaseAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        ICardView card = mViewTypes.get(viewType);
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(card.layoutId(), viewGroup, false);
        card.bindViews(itemView);
        return new ViewHolder(itemView, card);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void onBindViewHolder(@NonNull BaseAdapter.ViewHolder viewHolder, int position) {
        CardModel card = mData.get(position);
        viewHolder.mICardView.onRefresh(card);
    }


    @Override
    public int getItemCount() {
        return mData.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {
        private @NonNull
        ICardView mICardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
        public ViewHolder(@NonNull View itemView, @NonNull ICardView card) {
            super(itemView);
            mICardView = card;
        }
    }
}
