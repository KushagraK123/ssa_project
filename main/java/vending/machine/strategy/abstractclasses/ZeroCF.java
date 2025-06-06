package vending.machine.strategy.abstractclasses;

import vending.machine.data.DataStore;

// ABSTRACT STRATEGY PATTERN ELEMENT
// Abstract class for the strategy to reset the current funds/credit to zero.
public abstract class ZeroCF {

    protected DataStore dataStore; // Reference to the associated DataStore

    // Abstract method to reset current funds (cf) to zero
    public abstract void zeroCF();
}
