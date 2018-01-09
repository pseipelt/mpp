package Utils;

import DataStorage.BioPlant;

/**
 *
 * @author Pascal
 */
public class BioPlantWithAmount {
    private int amount;
    private BioPlant plant;
    
    public BioPlantWithAmount(BioPlant plant, int amount) {
        this.amount = amount;
        this.plant = plant;
    }

    public int getAmount() {
        return amount;
    }
    
    public void addToAmount (int number) {
        this.amount += number;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public BioPlant getPlant() {
        return plant;
    }

    public void setPlant(BioPlant plant) {
        this.plant = plant;
    }
}
