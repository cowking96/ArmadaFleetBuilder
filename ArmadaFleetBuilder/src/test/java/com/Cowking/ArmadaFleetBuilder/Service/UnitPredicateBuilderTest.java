package com.Cowking.ArmadaFleetBuilder.Service;

import com.querydsl.core.types.Predicate;
import org.junit.Test;


import static com.Cowking.ArmadaFleetBuilder.Model.Faction.EMPIRE;
import static com.Cowking.ArmadaFleetBuilder.Model.UnitType.SHIP;
import static com.google.common.truth.Truth.assertThat;
import static java.lang.Boolean.FALSE;

public class UnitPredicateBuilderTest {

    @Test
    public void should_build_predicate_for_given_name() {

        UnitPredicateBuilder unitPredicateBuilder = new UnitPredicateBuilder();

        Predicate predicate = unitPredicateBuilder.buildPredicate("Victory II", null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        assertThat(predicate.toString()).isEqualTo("eqIc(unit.name,Victory II)");
    }

    @Test
    public void should_build_null_predicate_for_empty_name() {

        UnitPredicateBuilder unitPredicateBuilder = new UnitPredicateBuilder();

        Predicate predicate = unitPredicateBuilder.buildPredicate(" ", null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        assertThat(predicate).isNull();
    }

    @Test
    public void should_build_predicate_for_name_starts_with() {

        UnitPredicateBuilder monsterPredicateBuilder = new UnitPredicateBuilder();

        Predicate predicate = monsterPredicateBuilder.buildPredicate("Vic", null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        assertThat(predicate.toString()).isEqualTo("eqIc(unit.name,Vic)");
    }

    @Test
    public void should_build_predicate_for_name_ends_with() {

        UnitPredicateBuilder monsterPredicateBuilder = new UnitPredicateBuilder();

        Predicate predicate = monsterPredicateBuilder.buildPredicate("ory", null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        assertThat(predicate.toString()).isEqualTo("eqIc(unit.name,ory)");
    }

    @Test
    public void should_build_predicate_for_name_contains() {

        UnitPredicateBuilder monsterPredicateBuilder = new UnitPredicateBuilder();

        Predicate predicate = monsterPredicateBuilder.buildPredicate("tor", null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        assertThat(predicate.toString()).isEqualTo("eqIc(unit.name,tor)");
    }

    @Test
    public void ShouldBuildPredicateForGivenFaction() {
        CardPredicateBuilder cardPredicateBuilder = new CardPredicateBuilder();
        Predicate predicate = cardPredicateBuilder.buildPredicate(null, null, null, EMPIRE, FALSE, FALSE);
        assertThat(predicate.toString()).isEqualTo("card.faction in [EMPIRE, NEUTRAL] && card.commander = false && card.unique = false");
    }

    @Test
    public void ShouldBuildPredicateForGivenPointCost() {
        CardPredicateBuilder cardPredicateBuilder = new CardPredicateBuilder();
        Predicate predicate = cardPredicateBuilder.buildPredicate(100, null, null, null, FALSE, FALSE);
        assertThat(predicate.toString()).isEqualTo("card.pointCost <= 100 && card.commander = false && card.unique = false");
    }

    @Test
    public void ShouldBuildPredicateForGivenUnitType() {
        UnitPredicateBuilder unitPredicateBuilder = new UnitPredicateBuilder();

        Predicate predicate = unitPredicateBuilder.buildPredicate(null, null, null, SHIP, null, null, null, null, null, null, null, null, null, null, null);
        assertThat(predicate.toString()).isEqualTo("unit.unitType = SHIP");
    }

    @Test
    public void ShouldBuildPredicateForGivenBaseUnit() {
        UnitPredicateBuilder unitPredicateBuilder = new UnitPredicateBuilder();

        Predicate predicate = unitPredicateBuilder.buildPredicate(null, null, null, null, "Victory", null, null, null, null, null, null, null, null, null, null);
        assertThat(predicate.toString()).isEqualTo("unit.baseUnit = Victory");
    }

    @Test
    public void ShouldBuildPredicateForGivenNumberOfDefenseRetrofitSlots() {
        UnitPredicateBuilder unitPredicateBuilder = new UnitPredicateBuilder();

        Predicate predicate = unitPredicateBuilder.buildPredicate(null, null, null, null, null, 1, null, null, null, null, null, null, null, null, null);
        assertThat(predicate.toString()).isEqualTo("unit.numberOfDefenseRetrofitSlots = 1");
    }

    @Test
    public void ShouldBuildPredicateForGivenNumberOfTurboLaserSlots() {
        UnitPredicateBuilder unitPredicateBuilder = new UnitPredicateBuilder();

        Predicate predicate = unitPredicateBuilder.buildPredicate(null, null, null, null, null, null, 1, null, null, null, null, null, null, null, null);
        assertThat(predicate.toString()).isEqualTo("unit.numberOfTurboLaserSlots = 1");

    }
    @Test
    public void ShouldBuildPredicateForGivenNumberOfIonCannonSlots() {
        UnitPredicateBuilder unitPredicateBuilder = new UnitPredicateBuilder();

        Predicate predicate = unitPredicateBuilder.buildPredicate(null, null, null, null, null, null, null, 1, null, null, null, null, null, null, null);
        assertThat(predicate.toString()).isEqualTo("unit.numberOfIonCannonSlots = 1");

    }

    @Test
    public void ShouldBuildPredicateForGivenNumberOfOrdnanceSlots() {
        UnitPredicateBuilder unitPredicateBuilder = new UnitPredicateBuilder();

        Predicate predicate = unitPredicateBuilder.buildPredicate(null, null, null, null, null, null, null, null, 1, null, null, null, null, null, null);
        assertThat(predicate.toString()).isEqualTo("unit.numberOfOrdnanceSlots = 1");

    }

    @Test
    public void ShouldBuildPredicateForGivenNumberOfTitleSlots() {
        UnitPredicateBuilder unitPredicateBuilder = new UnitPredicateBuilder();

        Predicate predicate = unitPredicateBuilder.buildPredicate(null, null, null, null, null, null, null, null, null, 1, null, null, null, null, null);
        assertThat(predicate.toString()).isEqualTo("unit.numberOfTitleSlots = 1");

    }


    @Test
    public void ShouldBuildPredicateForGivenNumberOfCommanderSlots() {
        UnitPredicateBuilder unitPredicateBuilder = new UnitPredicateBuilder();

        Predicate predicate = unitPredicateBuilder.buildPredicate(null, null, null, null, null, null, null, null, null, null, 1, null, null, null, null);
        assertThat(predicate.toString()).isEqualTo("unit.numberOfCommanderSlots = 1");

    }

    @Test
    public void ShouldBuildPredicateForGivenNumberOfOfficerSlots() {
        UnitPredicateBuilder unitPredicateBuilder = new UnitPredicateBuilder();

        Predicate predicate = unitPredicateBuilder.buildPredicate(null, null, null, null, null, null, null, null, null, null, null, 1, null, null, null);
        assertThat(predicate.toString()).isEqualTo("unit.numberOfOfficerSlots = 1");

    }

    @Test
    public void ShouldBuildPredicateForGivenNumberOfWeaponsTeamSlots() {
        UnitPredicateBuilder unitPredicateBuilder = new UnitPredicateBuilder();

        Predicate predicate = unitPredicateBuilder.buildPredicate(null, null, null, null, null, null, null, null, null, null, null, null, 1, null, null);
        assertThat(predicate.toString()).isEqualTo("unit.numberOfWeaponsTeamSlots = 1");

    }

    @Test
    public void ShouldBuildPredicateForGivenNumberOfSupportTeamSlots() {
        UnitPredicateBuilder unitPredicateBuilder = new UnitPredicateBuilder();

        Predicate predicate = unitPredicateBuilder.buildPredicate(null, null, null, null, null, null, null, null, null, null, null, null, null, 1, null);
        assertThat(predicate.toString()).isEqualTo("unit.numberOfSupportTeamSlots = 1");

    }

    @Test
    public void ShouldBuildPredicateForGivenNumberOfOffenseRetrofitSlots() {
        UnitPredicateBuilder unitPredicateBuilder = new UnitPredicateBuilder();

        Predicate predicate = unitPredicateBuilder.buildPredicate(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1);
        assertThat(predicate.toString()).isEqualTo("unit.numberOfOffenseRetrofitSlots = 1");

    }

}
