package com.deston.poetry.ui;

import android.view.View;

import com.deston.poetry.model.CardModel;

public interface ICardView<T extends CardModel> {
    int layoutId();
    void bindViews(View view);
    void onRefresh(T data);
    void onClick(int position, T data);
}
