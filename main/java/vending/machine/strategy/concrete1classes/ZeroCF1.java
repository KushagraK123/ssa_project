package vending.machine.strategy.concrete1classes;

import vending.machine.data.DS1;
import vending.machine.data.DataStore;
import vending.machine.strategy.abstractclasses.ZeroCF;

// CONCRETE STRATEGY CLASS FOR VM1
// Implements logic to reset current credit/funds for VM1.
public class ZeroCF1 extends ZeroCF {

    public ZeroCF1(DataStore dataStore) {
        this.dataStore = dataStore; // Assign the VM1-specific data store
    }

    @Override
    public void zeroCF() {
        DS1 dataStore = (DS1) this.dataStore; // Cast to DS1 to access float-based fields
        dataStore.setCf(0); // Reset current funds to zero
        System.out.println("Resetting coins entered to 0"); // Confirmation output
    }
}
