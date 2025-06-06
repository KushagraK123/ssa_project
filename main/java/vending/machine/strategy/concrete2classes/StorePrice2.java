package vending.machine.strategy.concrete2classes;

import vending.machine.data.DS2;
import vending.machine.data.DataStore;
import vending.machine.strategy.abstractclasses.StorePrice;

// CONCRETE STRATEGY CLASS FOR VM2
// Implements logic to store the drink price for VM2.
public class StorePrice2 extends StorePrice {

    public StorePrice2(DataStore dataStore) {
        this.dataStore = dataStore; // Assign the VM2-specific data store
    }

    @Override
    public void storePrice() {
        DS2 dataStore = (DS2) this.dataStore; // Cast to DS2 to access integer-based fields
        dataStore.setPrice(dataStore.getTemp_p()); // Store the temporary price as the final drink price
        System.out.println("New price for the drink is " + dataStore.getPrice()); // Print confirmation
    }
}