package com.Cowking.ArmadaFleetBuilder.Service;

import com.Cowking.ArmadaFleetBuilder.Model.Card;
import com.Cowking.ArmadaFleetBuilder.Util.CardSearchInfo;

public interface CardService {

    public Iterable<Card> findCards(CardSearchInfo cardSearchInfo);
}
