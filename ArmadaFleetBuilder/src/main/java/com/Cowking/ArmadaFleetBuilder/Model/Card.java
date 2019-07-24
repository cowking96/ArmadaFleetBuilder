package com.Cowking.ArmadaFleetBuilder.Model;

import javax.persistence.*;
import java.util.Set;

import static java.lang.Boolean.FALSE;

@Entity
public class Card {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @ManyToMany
    Set<Unit> isAppliedTo;

    private String name;

    private Integer pointCost;

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

    public Slot getSlot() {
        return slot;
    }

    public void setSlot(Slot slot) {
        this.slot = slot;
    }

    public String getRequiredShip() {
        return requiredShip;
    }

    public void setRequiredShip(String requiredShip) {
        this.requiredShip = requiredShip;
    }

    public Faction getFaction() {
        return faction;
    }

    public void setFaction(Faction faction) {
        this.faction = faction;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @Enumerated(EnumType.STRING)
    private Slot slot;

    private String requiredShip;

    @Enumerated(EnumType.STRING)
    private Faction faction;

    private String imageURL;

    private boolean commander;

    public Card(String name, Integer pointCost, Slot slot, String requiredShip, Faction faction, String imageURL, boolean commander, boolean unique, boolean modification) {
        this.name = name;
        this.pointCost = pointCost;
        this.slot = slot;
        this.requiredShip = requiredShip;
        this.faction = faction;
        this.imageURL = imageURL;
        this.commander = commander;
        this.unique = unique;
        this.modification = modification;
    }

    private boolean unique;

    private boolean modification;

    public boolean isCommander() {
        return commander;
    }

    public void setCommander(boolean commander) {
        this.commander = commander;
    }

    public boolean isUnique() {
        return unique;
    }

    public void setUnique(boolean unique) {
        this.unique = unique;
    }

    public boolean isModification() {
        return modification;
    }

    public void setModification(boolean modification) {
        this.modification = modification;
    }

    public Card(){
    }
}

