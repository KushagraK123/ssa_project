package vending.machine.strategy.concrete2classes;

import vending.machine.data.DS2;
import vending.machine.data.DataStore;
import vending.machine.strategy.abstractclasses.ReturnCoins;

// CONCRETE STRATEGY CLASS FOR VM2
// Implements coin return logic for VM2.
public class ReturnCoins2 extends ReturnCoins {

    public ReturnCoins2(DataStore dataStore) {
        this.dataStore = dataStore; // Assign the VM2-specific data store
    }

    // Return all inserted coins (used on cancel)
    public void returnCoinsAll() {
        DS2 dataStore = (DS2) this.dataStore; // Cast to DS2 for integer operations
        if (dataStore.getCf() > 0) {
            System.out.println("Returning coins " + dataStore.getCf()); // Display returned amount
            dataStore.setCf(0); // Reset current funds to zero
        }
    }

    // Return only excess coins (used when credit exceeds price)
    @Override
    public void returnCoinsChange() {
        DS2 dataStore = (DS2) this.dataStore; // Cast to DS2 for integer operations
        System.out.println("Returning extra coins = " + (dataStore.getCf() - dataStore.getPrice())); // Display change
        dataStore.setCf(dataStore.getPrice()); // Retain only the required amount for the drink
    }
}