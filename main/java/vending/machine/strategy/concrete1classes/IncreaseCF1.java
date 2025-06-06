package vending.machine.strategy.concrete1classes;

import vending.machine.data.DS1;
import vending.machine.data.DataStore;
import vending.machine.strategy.abstractclasses.IncreaseCF;

// CONCRETE STRATEGY CLASS FOR VM1
// Implements logic to increase credit/funds for VM1.
public class IncreaseCF1 extends IncreaseCF {

    public IncreaseCF1(DataStore dataStore) {
        this.dataStore = dataStore; // Assign the VM1-specific data store
    }

    @Override
    public void increaseCF() {
        DS1 dataStore = (DS1) this.dataStore; // Cast to DS1 to access float-based methods
        dataStore.setCf(dataStore.getCf() + dataStore.getTemp_v()); // Add temp coin value to current funds
        System.out.println("Added coins, total coins are " + dataStore.getCf()); // Display updated credit
    }
}
