package Utils;

import DataStorage.BioPlant;

/**
 *
 * @author Pascal
 */
public class BioPlantWithNeighborStats {
    private int badNr;
    private int goodNr;
    private BioPlant plant;
    
    public BioPlantWithNeighborStats(BioPlant plant, int good, int bad) {
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

    public BioPlant getPlant() {
        return plant;
    }

    public void setPlant(BioPlant plant) {
        this.plant = plant;
    }
    
    public int getSortIndicatorGood() {
        return this.goodNr - 2 * this.badNr;
    }
    
    public int getSortIndicatorBad() {
        return this.badNr - 2 * this.goodNr;
    }
}
