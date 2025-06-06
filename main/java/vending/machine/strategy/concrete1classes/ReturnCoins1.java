package vending.machine.strategy.concrete1classes;

import vending.machine.data.DS1;
import vending.machine.data.DataStore;
import vending.machine.strategy.abstractclasses.ReturnCoins;

// CONCRETE STRATEGY CLASS FOR VM1
// Implements coin return logic for VM1.
public class ReturnCoins1 extends ReturnCoins {

    public ReturnCoins1(DataStore dataStore) {
        this.dataStore = dataStore; // Assign the VM1-specific data store
    }

    // Return all inserted coins (used on cancel)
    public void returnCoinsAll() {
        DS1 dataStore = (DS1) this.dataStore; // Cast to DS1 to access float values
        if (dataStore.getCf() > 0) {
            System.out.println("Returning coins " + dataStore.getCf()); // Print returned amount
            dataStore.setCf(0); // Reset credit to zero
        }
    }

    // Return only excess coins (used when payment exceeds price)
    public void returnCoinsChange() {
        DS1 dataStore = (DS1) this.dataStore; // Cast to DS1 to access float values
        if(dataStore.getCf() > 0)
            System.out.println("Returning extra coins = " + (dataStore.getCf() - dataStore.getPrice())); // Calculate and print change
        dataStore.setCf(dataStore.getPrice()); // Set cf to price (retain only the needed amount)
    }
}
