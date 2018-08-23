package com.deston.poetry.model;

import com.deston.poetry.ui.CardTypes;

public class PoemCardModel extends CardModel {
    public String title;
    public String author;
    public String content;

    @Override
    public int getType() {
        return CardTypes.CARD_POEM;
    }
}
