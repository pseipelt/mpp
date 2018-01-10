package de.myplantparadise.mpp.Utils;

import de.myplantparadise.mpp.DataStorage.Plant;

/**
 *
 * @author Pascal
 */
public class PlantWithNeighborStats {
    private int badNr;
    private int goodNr;
    private Plant plant;
    
    public PlantWithNeighborStats(Plant plant, int good, int bad) {
        this.goodNr = good;
        this.badNr = bad;
        this.plant = plant;
    }

    public void addToBadNr(int number) {
        this.badNr += number;
    }
    
    public void addToGoodNr(int number) {
        this.goodNr += number;
    }
    
    public int getBadNr() {
        return badNr;
    }

    public void setBadNr(int badNr) {
        this.badNr = badNr;
    }

    public int getGoodNr() {
        return goodNr;
    }

    public void setGoodNr(int goodNr) {
        this.goodNr = goodNr;
    }

    public Plant getPlant() {
        return plant;
    }

    public void setPlant(Plant plant) {
        this.plant = plant;
    }
    
    public int getSortIndicatorGood() {
        return this.goodNr - 2 * this.badNr;
    }
    
    public int getSortIndicatorBad() {
        return this.badNr - 2 * this.goodNr;
    }
}
