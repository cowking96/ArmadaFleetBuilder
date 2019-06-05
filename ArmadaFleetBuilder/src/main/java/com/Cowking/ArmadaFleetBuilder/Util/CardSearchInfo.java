package com.Cowking.ArmadaFleetBuilder.Util;

import com.Cowking.ArmadaFleetBuilder.Model.Slot;

public class CardSearchInfo {

    private String name;

    private Float pointCost;

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

    public boolean commander() {
        return commander;
    }

    public void setCommander(boolean commander) {
        commander = commander;
    }

    public boolean unique() {
        return unique;
    }

    public void setUnique(boolean unique) {
        unique = unique;
    }

    private String faction;

    private Slot slot;

    private String requiredShip;

    private boolean commander;

    private boolean unique;

    public void setName(String name) {
        this.name = name;
    }

    public void setPointCost(Float pointCost) {
        this.pointCost = pointCost;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }

    public String getName() {
        return name;
    }

    public Float getPointCost() {
        return pointCost;
    }

    public String getFaction() {
        return faction;
    }





}
