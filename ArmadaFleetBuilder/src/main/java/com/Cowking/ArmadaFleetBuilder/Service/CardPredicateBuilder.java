package com.Cowking.ArmadaFleetBuilder.Service;

import com.Cowking.ArmadaFleetBuilder.Model.Card;
import com.Cowking.ArmadaFleetBuilder.Model.Faction;
import com.Cowking.ArmadaFleetBuilder.Model.Slot;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Predicate;
import org.springframework.stereotype.Service;
import com.Cowking.ArmadaFleetBuilder.Model.QCard;
import java.util.ArrayList;
import java.util.List;


@Service
public class CardPredicateBuilder {

   public Predicate buildPredicate(Integer pointCost, Slot slot, String requiredShip, Faction faction, boolean isCommander, boolean unique) {

        BooleanBuilder builder = new BooleanBuilder();

        if(pointCost != null){
            builder = builder.and(QCard.card.pointCost.loe(pointCost));
        }

        if (faction != null){

            List<Faction> factionList = new ArrayList<>();
            factionList.add(faction);
            factionList.add(Faction.NEUTRAL);

            builder = builder.and(QCard.card.faction.in(factionList));

        }

        if (slot != null){
            List<Slot> slotList = new ArrayList<>();
            slotList.add(slot);
            builder = builder.and(QCard.card.slot.in(slotList));
        }

        if(requiredShip != null){
            builder = builder.and(QCard.card.requiredShip.eq(requiredShip));
        }


        builder = builder.and(QCard.card.isCommander.eq(isCommander));

        builder = builder.and(QCard.card.unique.eq(unique));


        return builder.getValue();
    }

}
