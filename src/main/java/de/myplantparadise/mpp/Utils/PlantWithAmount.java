package de.myplantparadise.mpp.Utils;

import de.myplantparadise.mpp.DataStorage.Plant;
import java.io.Serializable;

/**
 *
 * @author Pascal
 */
public class PlantWithAmount implements Serializable {
    private int amount;
    private Plant plant;
    
    public PlantWithAmount(Plant plant, int amount) {
        this.amount = amount;
        this.plant = plant;
    }

    public int getAmount() {
        return amount;
    }
    
    public Integer getAmountToCompare() {
        return - amount;
    }
    
    public void addToAmount (int number) {
        this.amount += number;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Plant getPlant() {
        return plant;
    }

    public void setPlant(Plant plant) {
        this.plant = plant;
    }
}
