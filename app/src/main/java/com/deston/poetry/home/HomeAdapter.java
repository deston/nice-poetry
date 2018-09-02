package com.deston.poetry.home;


import com.deston.poetry.base.BaseAdapter;
import com.deston.poetry.base.CardTypes;
import com.deston.poetry.home.card.PoemCardView;

public class HomeAdapter extends BaseAdapter {
    @Override
    public void registerCard() {
        addCard(CardTypes.CARD_POEM, new PoemCardView());
    }

}
