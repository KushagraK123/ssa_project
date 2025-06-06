package vending.machine.strategy.concrete1classes;

import vending.machine.data.DS1;
import vending.machine.data.DataStore;
import vending.machine.strategy.abstractclasses.StorePrice;

// CONCRETE STRATEGY CLASS FOR VM1
// Implements logic to store the drink price for VM1.
public class StorePrice1 extends StorePrice {

    public StorePrice1(DataStore dataStore) {
        this.dataStore = dataStore; // Assign the VM1-specific data store
    }

    @Override
    public void storePrice() {
        DS1 dataStore = (DS1) this.dataStore; // Cast to DS1 to use float-based setters/getters
        dataStore.setPrice(dataStore.getTemp_p()); // Store temporary price as final price
        System.out.println("New price for the drink is " + dataStore.getPrice()); // Confirm updated price
    }
}
