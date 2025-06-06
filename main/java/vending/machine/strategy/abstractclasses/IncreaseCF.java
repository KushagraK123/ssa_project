package vending.machine.strategy.abstractclasses;

import vending.machine.data.DataStore;

// ABSTRACT STRATEGY PATTERN ELEMENT
// Abstract class for the strategy to handle increasing the current credit/funds.
public abstract class IncreaseCF {

    protected DataStore dataStore; // Reference to the associated DataStore

    // Abstract method to increase the current credit/funds in the data store
    public abstract void increaseCF();
}
