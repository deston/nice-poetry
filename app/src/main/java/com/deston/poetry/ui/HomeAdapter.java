package com.deston.poetry.ui;


import com.deston.poetry.ui.card.PoemCardView;

public class HomeAdapter extends BaseAdapter {
    @Override
    public void registerCard() {
        addCard(CardTypes.CARD_POEM, new PoemCardView());
    }

}
