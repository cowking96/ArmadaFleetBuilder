package com.Cowking.ArmadaFleetBuilder.Model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Unit {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @ManyToMany
    Set<Card> hasApllied;

    private String name;

    private int pointCost;

    @Enumerated(EnumType.STRING)
    private com.Cowking.ArmadaFleetBuilder.Model.Faction Faction;

    private String imageURL;

    private Enum Type;

    private String baseUnit;

    private int numberOfDefenseRetrofitSlots;

    private int numberOfTurboLaserSlots;

    private int numberOfIonCannonSlots;

    private int numberOfOrdnanceSlots;

    private int numberOfTitleSlots;

    private int numberOfCommanderSlots;

    private int numberOfOfficerSlots;

    private int numberOfWeaponsTeamSlots;

    private int numberOfSupportTeamSlots;

    private int numberOfOffenseRetrofitSlots;


    public Unit(Long id, String name, int pointCost, Enum faction, String imageURL, Enum type) {
        this.id = id;
        this.name = name;
        this.pointCost = pointCost;
        faction = faction;
        this.imageURL = imageURL;
        Type = type;
    }

    public Unit(){}
}
