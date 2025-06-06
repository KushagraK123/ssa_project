package vending.machine.strategy.concrete2classes;

import vending.machine.data.DS2;
import vending.machine.data.DataStore;
import vending.machine.strategy.abstractclasses.IncreaseCF;

// CONCRETE STRATEGY CLASS FOR VM2
// Implements logic to increase credit/funds for VM2.
public class IncreaseCF2 extends IncreaseCF {

    public IncreaseCF2(DataStore dataStore) {
        this.dataStore = dataStore; // Assign the VM2-specific data store
    }

    @Override
    public void increaseCF() {
        DS2 dataStore = (DS2) this.dataStore; // Cast to DS2 to access integer fields
        dataStore.setCf(dataStore.getCf() + dataStore.getTemp_v()); // Add temp coin value to current funds
        System.out.println("Added coins, total coins are " + dataStore.getCf()); // Display updated credit
    }
}
