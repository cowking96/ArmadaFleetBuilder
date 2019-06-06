package com.Cowking.ArmadaFleetBuilder.Service;

import com.Cowking.ArmadaFleetBuilder.Model.*;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Predicate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UnitPredicateBuilder {

    public Predicate buildPredicate(String name, Integer pointCost, com.Cowking.ArmadaFleetBuilder.Model.Faction faction, Enum unitType, String baseUnit, Integer numberOfDefenseRetrofitSlots, Integer numberOfTurboLaserSlots, Integer numberOfIonCannonSlots, Integer numberOfOrdnanceSlots, Integer numberOfTitleSlots, Integer numberOfCommanderSlots, Integer numberOfOfficerSlots, Integer numberOfWeaponsTeamSlots, Integer numberOfSupportTeamSlots, Integer numberOfOffenseRetrofitSlots) {

        BooleanBuilder builder = new BooleanBuilder();

        if (pointCost != null) {
            builder = builder.and(QUnit.unit.pointCost.loe(pointCost));
        }

        if (faction != null) {

            List<Faction> factionList = new ArrayList<>();
            factionList.add(faction);
            factionList.add(Faction.NEUTRAL);

            builder = builder.and(QUnit.unit.Faction.in(factionList));

        }

        if (name != null) {
            if (name.trim().length() > 0) {
                builder = nameParameter(builder, name);
            }
        }

        if (unitType != null) {


            builder = builder.and(QUnit.unit.unitType.eq(unitType));

        }

        if (baseUnit !=null){
            builder = builder.and(QUnit.unit.baseUnit.eq(baseUnit));
        }

        if(numberOfDefenseRetrofitSlots != null){
            builder = builder.and(QUnit.unit.numberOfDefenseRetrofitSlots.eq(numberOfDefenseRetrofitSlots));
        }

        if(numberOfTurboLaserSlots != null){
            builder = builder.and(QUnit.unit.numberOfTurboLaserSlots.eq(numberOfTurboLaserSlots));
        }

        if(numberOfIonCannonSlots != null){
            builder = builder.and(QUnit.unit.numberOfIonCannonSlots.eq(numberOfIonCannonSlots));
        }

        if(numberOfOrdnanceSlots != null){
            builder = builder.and(QUnit.unit.numberOfOrdnanceSlots.eq(numberOfOrdnanceSlots));
        }

        if(numberOfTitleSlots != null){
            builder = builder.and(QUnit.unit.numberOfTitleSlots.eq(numberOfTitleSlots));
        }

        if(numberOfCommanderSlots != null){
            builder = builder.and(QUnit.unit.numberOfCommanderSlots.eq(numberOfCommanderSlots));
        }

        if(numberOfOfficerSlots != null){
            builder = builder.and(QUnit.unit.numberOfOfficerSlots.eq(numberOfOfficerSlots));
        }

        if(numberOfWeaponsTeamSlots != null){
            builder = builder.and(QUnit.unit.numberOfWeaponsTeamSlots.eq(numberOfWeaponsTeamSlots));
        }

        if(numberOfSupportTeamSlots != null){
            builder = builder.and(QUnit.unit.numberOfSupportTeamSlots.eq(numberOfSupportTeamSlots));
        }

        if(numberOfOffenseRetrofitSlots != null){
            builder = builder.and(QUnit.unit.numberOfOffenseRetrofitSlots.eq(numberOfOffenseRetrofitSlots));
        }

        return builder.getValue();
    }


        private BooleanBuilder nameParameter (BooleanBuilder builder, String name){
            int length = name.length();

            if (name.startsWith("*") && name.endsWith("*")) {
                return builder.and((QUnit.unit.name.containsIgnoreCase(name.substring(1, length - 1))));
            }

            if (name.startsWith("*")) {
                return builder = builder.and((QUnit.unit.name.endsWithIgnoreCase(name.substring(1, length))));
            }

            if (name.endsWith("*")) {
                return builder = builder.and((QUnit.unit.name.startsWithIgnoreCase((name.substring(0, length - 1)))));
            } else {
                return builder = builder.and(QUnit.unit.name.equalsIgnoreCase(name));
            }
        }

    }

