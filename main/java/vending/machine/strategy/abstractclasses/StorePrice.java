package vending.machine.strategy.abstractclasses;

import vending.machine.data.DataStore;

// ABSTRACT STRATEGY PATTERN ELEMENT
// Abstract class for the strategy to handle storing the price of a drink.
public abstract class StorePrice {

    protected DataStore dataStore; // Reference to the associated DataStore

    // Abstract method to store the drink price into the data store
    public abstract void storePrice();
}
