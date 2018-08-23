package com.deston.poetry.ui.card;

import android.view.View;
import android.widget.TextView;

import com.deston.poetry.R;
import com.deston.poetry.model.PoemCardModel;
import com.deston.poetry.ui.ICardView;

public class PoemCardView implements ICardView<PoemCardModel> {
    private TextView mAuthorTv;
    private TextView mTitleTv;
    private TextView mContentTv;
    @Override
    public int layoutId() {
        return R.layout.item_poem;
    }

    @Override
    public void bindViews(View view) {
        mAuthorTv = view.findViewById(R.id.poem_author_tv);
        mContentTv = view.findViewById(R.id.poem_content_tv);
        mTitleTv = view.findViewById(R.id.poem_title_tv);
    }

    @Override
    public void onRefresh(PoemCardModel data) {
        mAuthorTv.setText(data.author);
        mContentTv.setText(data.content);
        mTitleTv.setText(data.title);
    }

    @Override
    public void onClick(int position, PoemCardModel data) {

    }
}
