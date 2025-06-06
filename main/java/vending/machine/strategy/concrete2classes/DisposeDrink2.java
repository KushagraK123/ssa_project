package vending.machine.strategy.concrete2classes;

import vending.machine.data.DS2;
import vending.machine.data.DataStore;
import vending.machine.strategy.abstractclasses.DisposeDrink;

// CONCRETE STRATEGY CLASS FOR VM2
// Implements drink disposal logic for VM2 (supports only coffee).
public class DisposeDrink2 extends DisposeDrink {

    public DisposeDrink2(DataStore dataStore) {
        this.dataStore = dataStore; // Assign the VM2-specific data store
    }

    @Override
    public void disposeDrink(int d) {
        if (d == 0) {
            System.out.println(" Disposing drink COFFEE"); // Option 0: Coffee
        } else {
            System.out.println(" Invalid Drink Option"); // Invalid input handling
        }
    }
}