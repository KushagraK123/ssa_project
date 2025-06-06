package vending.machine.abstract_factory;

import vending.machine.data.DS2;
import vending.machine.data.DataStore;
import vending.machine.strategy.abstractclasses.*;
import vending.machine.strategy.concrete2classes.*;

/**
 * ABSTRACT FACTORY PATTERN ELEMENT
 * Concrete Factory element for VM2.
 * This class represents the concrete factory class used to handle creation of objects relevant to VM2.
 * Author: Kushagra Kasliwal
 */
public class ConcreteFactory2 extends AbstractFactory {

	private final DataStore dataStore;

	public ConcreteFactory2() {
		dataStore = new DS2(); // Initialize VM2-specific DataStore
	}

	@Override
	public DataStore getDataStore() {
		return dataStore; // Return the data store specific to VM2
	}

	@Override
	public DisposeAdditive getDisposeAdditive() {
		return new DisposeAdditive2(dataStore); // Strategy for disposing additives in VM2
	}

	@Override
	public DisposeDrink getDisposeDrink() {
		return new DisposeDrink2(dataStore); // Strategy for disposing drinks in VM2
	}

	@Override
	public ReturnCoins getReturnCoins() {
		return new ReturnCoins2(dataStore); // Strategy for returning coins in VM2
	}

	@Override
	public ZeroCF getZeroCF() {
		return new ZeroCF2(dataStore); // Strategy to reset current funds to zero in VM2
	}

	@Override
	public StorePrice getStorePrice() {
		return new StorePrice2(dataStore); // Strategy to store the price in VM2
	}

	@Override
	public IncreaseCF getIncreaseCF() {
		return new IncreaseCF2(dataStore); // Strategy to increase credit/funds in VM2
	}
}
