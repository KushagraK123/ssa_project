package vending.machine.strategy.abstractclasses;

import vending.machine.data.DataStore;

// ABSTRACT STRATEGY PATTERN ELEMENT
// Abstract class for the strategy to handle coin return logic in the vending machine.
public abstract class ReturnCoins {

    protected DataStore dataStore; // Reference to the associated DataStore

    // Abstract method to return only the excess change after a transaction
    public abstract void returnCoinsChange();

    // Abstract method to return all inserted coins (typically on cancel)
    public abstract void returnCoinsAll();
}
