package vending.machine.strategy.abstractclasses;

import vending.machine.data.DataStore;

// ABSTRACT STRATEGY PATTERN ELEMENT
// Abstract class for the strategy to handle disposal of drink additives (e.g., sugar, cream).
public abstract class DisposeAdditive {

    protected DataStore dataStore; // Reference to the data store used by the strategy

    // Abstract method to dispose additives based on the selection array A
    public abstract void disposeAdditive(int[] A);
}
