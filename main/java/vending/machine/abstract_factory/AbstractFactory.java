package vending.machine.abstract_factory;

import vending.machine.data.DataStore;
import vending.machine.strategy.abstractclasses.*;

/*
 * ABSTRACT FACTORY PATTERN ELEMENT
 * This abstract factory class declares abstract methods for creating
 * family objects used in vending machine operations.
 */
public abstract class AbstractFactory {

	/* Below are abstract methods */

	// Returns the concrete DataStore object
	public abstract DataStore getDataStore();

	// Returns the strategy for disposing additives (e.g., sugar, cream)
	public abstract DisposeAdditive getDisposeAdditive();

	// Returns the strategy for disposing drinks (e.g., coffee, chocolate)
	public abstract DisposeDrink getDisposeDrink();

	// Returns the strategy for returning coins (either all or change)
	public abstract ReturnCoins getReturnCoins();

	// Returns the strategy for resetting the credit/funds to zero
	public abstract ZeroCF getZeroCF();

	// Returns the strategy for storing the drink price
	public abstract StorePrice getStorePrice();

	// Returns the strategy for increasing the credit/funds
	public abstract IncreaseCF getIncreaseCF();
}
