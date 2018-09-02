package com.deston.poetry.home.card.model;

import android.support.annotation.Keep;

import com.deston.poetry.base.CardTypes;
import com.deston.poetry.model.CardModel;
@Keep
public class PoemCardModel extends CardModel {
    public String title;
    public String author;
    public String content;

    @Override
    public int getType() {
        return CardTypes.CARD_POEM;
    }
}
