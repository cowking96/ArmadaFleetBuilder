package com.Cowking.ArmadaFleetBuilder.Service;

import com.Cowking.ArmadaFleetBuilder.Model.Slot;
import com.querydsl.core.types.Predicate;
import org.junit.Test;

import static com.Cowking.ArmadaFleetBuilder.Model.Faction.EMPIRE;
import static com.google.common.truth.Truth.assertThat;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class CardPredicateBuilderTest {

    @Test
    public void ShouldBuildPredicateForGivenPointCost(){
        CardPredicateBuilder cardPredicateBuilder = new CardPredicateBuilder();
        Predicate predicate = cardPredicateBuilder.buildPredicate(100,null,null,null,FALSE,FALSE);
        assertThat(predicate.toString()).isEqualTo("card.pointCost <= 100 && card.isCommander = false && card.unique = false");
    }

    @Test
    public void ShouldBuildPredicateForunique(){
        CardPredicateBuilder cardPredicateBuilder = new CardPredicateBuilder();
        Predicate predicate = cardPredicateBuilder.buildPredicate(null,null,null,null,TRUE,FALSE);
        assertThat(predicate.toString()).isEqualTo("card.isCommander = true && card.unique = false");
    }



    @Test
    public void ShouldBuildPredicateForGivenSlot(){
        CardPredicateBuilder cardPredicateBuilder = new CardPredicateBuilder();
        Predicate predicate = cardPredicateBuilder.buildPredicate(null, Slot.TURBOLASER,null,null,FALSE,FALSE);
        assertThat(predicate.toString()).isEqualTo("card.slot = TURBOLASER && card.isCommander = false && card.unique = false");
    }

    @Test
    public void ShouldBuildPredicateForRequiredShip(){
        CardPredicateBuilder cardPredicateBuilder = new CardPredicateBuilder();
        Predicate predicate = cardPredicateBuilder.buildPredicate(null,null,"Victory",null,FALSE,FALSE);
        assertThat(predicate.toString()).isEqualTo("card.requiredShip = Victory && card.isCommander = false && card.unique = false");
    }

    @Test
    public void ShouldBuildPredicateForGivenFaction(){
        CardPredicateBuilder cardPredicateBuilder = new CardPredicateBuilder();
        Predicate predicate = cardPredicateBuilder.buildPredicate(null,null,null,EMPIRE,FALSE,FALSE);
        assertThat(predicate.toString()).isEqualTo("card.faction in [EMPIRE, NEUTRAL] && card.isCommander = false && card.unique = false");
    }
}
