package vending.machine.strategy.concrete2classes;

import vending.machine.data.DS2;
import vending.machine.data.DataStore;
import vending.machine.strategy.abstractclasses.ZeroCF;

// CONCRETE STRATEGY CLASS FOR VM2
// Implements logic to reset current credit/funds for VM2.
public class ZeroCF2 extends ZeroCF {

    public ZeroCF2(DataStore dataStore) {
        this.dataStore = dataStore; // Assign the VM2-specific data store
    }

    @Override
    public void zeroCF() {
        DS2 dataStore = (DS2) this.dataStore; // Cast to DS2 to access integer-based fields
        dataStore.setCf(0); // Reset current credit/funds to zero
        System.out.println("Resetting coins entered to 0"); // Confirmation message
    }
}