package vending.machine.abstract_factory;

import vending.machine.data.DS1;
import vending.machine.data.DataStore;
import vending.machine.strategy.abstractclasses.*;
import vending.machine.strategy.concrete1classes.*;

/**
 * ABSTRACT FACTORY PATTERN ELEMENT
 * Concrete Factory element for VM1.
 *
 * This class represents the concrete factory class used to handle creation of objects relevant to VM1.
 * Author: Kushagra Kasliwal
 */
public class ConcreteFactory1 extends AbstractFactory {

	private final DataStore dataStore;

	public ConcreteFactory1() {
		dataStore = new DS1(); // Initialize VM1-specific DataStore
	}

	@Override
	public DataStore getDataStore() {
		return dataStore; // Return the data store specific to VM1
	}

	@Override
	public DisposeAdditive getDisposeAdditive() {
		return new DisposeAdditive1(dataStore); // Strategy for disposing additives in VM1
	}

	@Override
	public DisposeDrink getDisposeDrink() {
		return new DisposeDrink1(dataStore); // Strategy for disposing drinks in VM1
	}

	@Override
	public ReturnCoins getReturnCoins() {
		return new ReturnCoins1(dataStore); // Strategy for returning coins in VM1
	}

	@Override
	public ZeroCF getZeroCF() {
		return new ZeroCF1(dataStore); // Strategy to reset current funds to zero in VM1
	}

	@Override
	public StorePrice getStorePrice() {
		return new StorePrice1(dataStore); // Strategy to store the price in VM1
	}

	@Override
	public IncreaseCF getIncreaseCF() {
		return new IncreaseCF1(dataStore); // Strategy to increase credit/funds in VM1
	}
}
