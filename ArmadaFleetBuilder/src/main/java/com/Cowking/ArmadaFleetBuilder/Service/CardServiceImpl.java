package com.Cowking.ArmadaFleetBuilder.Service;

import com.Cowking.ArmadaFleetBuilder.Model.Card;
import com.Cowking.ArmadaFleetBuilder.Model.Faction;
import com.Cowking.ArmadaFleetBuilder.Model.Slot;
import com.Cowking.ArmadaFleetBuilder.Util.CardSearchInfo;
import com.Cowking.ArmadaFleetBuilder.dao.CardRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.function.Predicate;

@Service
public class CardServiceImpl implements CardService {


    private CardRepository cardRepository;
    private CardPredicateBuilder cardPredicateBuilder;

   @Override
    public Iterable<Card> findCards(CardSearchInfo cardSearchInfo) {
       return null;

    }

    private Iterable<Card> find(String name, Integer pointCost, Slot slot, Faction faction, boolean commander, boolean unique, String requiredShip){
        Predicate predicate = (Predicate) cardPredicateBuilder.buildPredicate(pointCost,slot,requiredShip,faction,commander,unique);
        return  null;

    }



}
