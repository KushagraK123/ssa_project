package vending.machine.strategy.concrete1classes;

import vending.machine.data.DS1;
import vending.machine.data.DataStore;
import vending.machine.strategy.abstractclasses.DisposeDrink;

// CONCRETE STRATEGY CLASS FOR VM1
// Implements drink disposal logic specific to VM1 (cappuccino and chocolate).
public class DisposeDrink1 extends DisposeDrink {

    public DisposeDrink1(DataStore dataStore) {
        this.dataStore = dataStore; // Assign the VM1-specific data store
    }

    @Override
    public void disposeDrink(int d) {
        if (d == 0) {
            System.out.println(" Disposing drink cappuccino"); // Option 0: Cappuccino
        } else if (d == 1) {
            System.out.println(" Disposing drink chocolate"); // Option 1: Chocolate
        } else {
            System.out.println(" Invalid Drink Option"); // Invalid input handling
        }
    }
}
