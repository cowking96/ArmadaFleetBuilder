package com.Cowking.ArmadaFleetBuilder.Model;


import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class UnitTest {

    @Test
    public void emptyConstruction(){
        Unit testUnit = new Unit();
        assertThat(testUnit.getName()).isNull();
        assertThat(testUnit.getPointCost()).isNull();
        assertThat(testUnit.getFaction()).isNull();
        assertThat(testUnit.getBaseUnit()).isNull();
        assertThat(testUnit.getImageURL()).isNull();
        assertThat(testUnit.getNumberOfCommanderSlots()).isNull();
        assertThat(testUnit.getNumberOfDefenseRetrofitSlots()).isNull();
        assertThat(testUnit.getNumberOfIonCannonSlots()).isNull();
        assertThat(testUnit.getNumberOfOffenseRetrofitSlots()).isNull();
        assertThat(testUnit.getNumberOfOfficerSlots()).isNull();
        assertThat(testUnit.getNumberOfOrdnanceSlots()).isNull();
        assertThat(testUnit.getNumberOfSupportTeamSlots()).isNull();
        assertThat(testUnit.getNumberOfTitleSlots()).isNull();
        assertThat(testUnit.getNumberOfTurboLaserSlots()).isNull();
        assertThat(testUnit.getNumberOfWeaponsTeamSlots()).isNull();
    }
}
