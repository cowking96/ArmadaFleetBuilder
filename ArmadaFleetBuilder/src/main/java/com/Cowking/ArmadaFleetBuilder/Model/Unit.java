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

    private Integer pointCost;

    @Enumerated(EnumType.STRING)
    private com.Cowking.ArmadaFleetBuilder.Model.Faction Faction;

    private String imageURL;

    private Enum unitType;

    private String baseUnit;

    public Unit(String name, Integer pointCost, com.Cowking.ArmadaFleetBuilder.Model.Faction faction, String imageURL, Enum unitType, String baseUnit, Integer numberOfDefenseRetrofitSlots, Integer numberOfTurboLaserSlots, Integer numberOfIonCannonSlots, Integer numberOfOrdnanceSlots, Integer numberOfTitleSlots, Integer numberOfCommanderSlots, Integer numberOfOfficerSlots, Integer numberOfWeaponsTeamSlots, Integer numberOfSupportTeamSlots, Integer numberOfOffenseRetrofitSlots) {
        this.name = name;
        this.pointCost = pointCost;
        Faction = faction;
        this.imageURL = imageURL;
        this.unitType = unitType;
        this.baseUnit = baseUnit;
        this.numberOfDefenseRetrofitSlots = numberOfDefenseRetrofitSlots;
        this.numberOfTurboLaserSlots = numberOfTurboLaserSlots;
        this.numberOfIonCannonSlots = numberOfIonCannonSlots;
        this.numberOfOrdnanceSlots = numberOfOrdnanceSlots;
        this.numberOfTitleSlots = numberOfTitleSlots;
        this.numberOfCommanderSlots = numberOfCommanderSlots;
        this.numberOfOfficerSlots = numberOfOfficerSlots;
        this.numberOfWeaponsTeamSlots = numberOfWeaponsTeamSlots;
        this.numberOfSupportTeamSlots = numberOfSupportTeamSlots;
        this.numberOfOffenseRetrofitSlots = numberOfOffenseRetrofitSlots;
    }

    private Integer numberOfDefenseRetrofitSlots;

    private Integer numberOfTurboLaserSlots;

    private Integer numberOfIonCannonSlots;

    private Integer numberOfOrdnanceSlots;

    private Integer numberOfTitleSlots;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPointCost() {
        return pointCost;
    }

    public void setPointCost(Integer pointCost) {
        this.pointCost = pointCost;
    }

    public com.Cowking.ArmadaFleetBuilder.Model.Faction getFaction() {
        return Faction;
    }

    public void setFaction(com.Cowking.ArmadaFleetBuilder.Model.Faction faction) {
        Faction = faction;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public Enum getUnitType() {
        return unitType;
    }

    public void setUnitType(Enum unitType) {
        this.unitType = unitType;
    }

    public String getBaseUnit() {
        return baseUnit;
    }

    public void setBaseUnit(String baseUnit) {
        this.baseUnit = baseUnit;
    }

    public Integer getNumberOfDefenseRetrofitSlots() {
        return numberOfDefenseRetrofitSlots;
    }

    public void setNumberOfDefenseRetrofitSlots(Integer numberOfDefenseRetrofitSlots) {
        this.numberOfDefenseRetrofitSlots = numberOfDefenseRetrofitSlots;
    }

    public Integer getNumberOfTurboLaserSlots() {
        return numberOfTurboLaserSlots;
    }

    public void setNumberOfTurboLaserSlots(Integer numberOfTurboLaserSlots) {
        this.numberOfTurboLaserSlots = numberOfTurboLaserSlots;
    }

    public Integer getNumberOfIonCannonSlots() {
        return numberOfIonCannonSlots;
    }

    public void setNumberOfIonCannonSlots(Integer numberOfIonCannonSlots) {
        this.numberOfIonCannonSlots = numberOfIonCannonSlots;
    }

    public Integer getNumberOfOrdnanceSlots() {
        return numberOfOrdnanceSlots;
    }

    public void setNumberOfOrdnanceSlots(Integer numberOfOrdnanceSlots) {
        this.numberOfOrdnanceSlots = numberOfOrdnanceSlots;
    }

    public Integer getNumberOfTitleSlots() {
        return numberOfTitleSlots;
    }

    public void setNumberOfTitleSlots(Integer numberOfTitleSlots) {
        this.numberOfTitleSlots = numberOfTitleSlots;
    }

    public Integer getNumberOfCommanderSlots() {
        return numberOfCommanderSlots;
    }

    public void setNumberOfCommanderSlots(Integer numberOfCommanderSlots) {
        this.numberOfCommanderSlots = numberOfCommanderSlots;
    }

    public Integer getNumberOfOfficerSlots() {
        return numberOfOfficerSlots;
    }

    public void setNumberOfOfficerSlots(Integer numberOfOfficerSlots) {
        this.numberOfOfficerSlots = numberOfOfficerSlots;
    }

    public Integer getNumberOfWeaponsTeamSlots() {
        return numberOfWeaponsTeamSlots;
    }

    public void setNumberOfWeaponsTeamSlots(Integer numberOfWeaponsTeamSlots) {
        this.numberOfWeaponsTeamSlots = numberOfWeaponsTeamSlots;
    }

    public Integer getNumberOfSupportTeamSlots() {
        return numberOfSupportTeamSlots;
    }

    public void setNumberOfSupportTeamSlots(Integer numberOfSupportTeamSlots) {
        this.numberOfSupportTeamSlots = numberOfSupportTeamSlots;
    }

    public Integer getNumberOfOffenseRetrofitSlots() {
        return numberOfOffenseRetrofitSlots;
    }

    public void setNumberOfOffenseRetrofitSlots(Integer numberOfOffenseRetrofitSlots) {
        this.numberOfOffenseRetrofitSlots = numberOfOffenseRetrofitSlots;
    }

    private Integer numberOfCommanderSlots;

    private Integer numberOfOfficerSlots;

    private Integer numberOfWeaponsTeamSlots;

    private Integer numberOfSupportTeamSlots;

    private Integer numberOfOffenseRetrofitSlots;



    public Unit(){}
}
