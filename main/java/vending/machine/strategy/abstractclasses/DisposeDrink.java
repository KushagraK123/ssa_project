package vending.machine.strategy.abstractclasses;

import vending.machine.data.DataStore;

// ABSTRACT STRATEGY PATTERN ELEMENT
// Abstract class for the strategy to handle the disposal (dispensing) of drinks.
public abstract class DisposeDrink {

    protected DataStore dataStore; // Reference to the associated DataStore

    // Abstract method to be implemented for dispensing a drink based on selection index d
    public abstract void disposeDrink(int d);
}
