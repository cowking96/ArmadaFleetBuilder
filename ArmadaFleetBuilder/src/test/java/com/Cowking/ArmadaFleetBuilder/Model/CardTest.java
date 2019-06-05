package com.Cowking.ArmadaFleetBuilder.Model;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class CardTest {

    @Test
    public void empty_Construction(){
        Card testCard = new Card();
        assertThat(testCard.getFaction()).isNull();
        assertThat(testCard.getImageURL()).isNull();
        assertThat(testCard.getName()).isNull();
        assertThat(testCard.getPointCost()).isNull();
        assertThat(testCard.getRequiredShip()).isNull();
        assertThat(testCard.getSlot()).isNull();

    }

}
