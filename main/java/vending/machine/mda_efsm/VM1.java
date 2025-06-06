package vending.machine.mda_efsm;

import vending.machine.abstract_factory.AbstractFactory;
import vending.machine.abstract_factory.ConcreteFactory1;
import vending.machine.data.DS1;

/**
 * Model Architecture Element
 * Input Processor for MDA Architecture

 * This class represents VM1 component Implementation which addresses all the needs of VM1 operations.
 * Handles user interactions and passes inputs to the MDAEFSM (state machine).
 * Uses Abstract Factory to get appropriate data store and operation classes.

 * Author: Kushagra Kasliwal
 */
public class VM1 {
	MDAEFSM mdaEfsm; // State machine that manages the vending machine's state transitions
	AbstractFactory factory; // Abstract Factory to provide components like DataStore and actions
	DS1 dataStore; // Specific data store used by VM1

	/*
	 * Constructor to initialize abstract factory, datastore and mdaefsm objects
	 */
	public VM1() {
		factory = new ConcreteFactory1(); // Initialize concrete factory for VM1
		mdaEfsm = new MDAEFSM(factory); // Initialize the MDAEFSM with the factory
		dataStore = (DS1) factory.getDataStore(); // Retrieve and cast data store specific to VM1
	}

	public void create(float p) {
		// Sets the temporary price and triggers creation if valid
		if(p > 0) {
			dataStore.setTemp_p(p);
			mdaEfsm.create();
		}else {
			System.out.println("Invalid: please enter a positive value for p");
		}
	}

	public void coin(float v) {
		// Adds coin value to credit and invokes MDA logic depending on sufficiency of funds
		if(v > 0) {
			dataStore.setTemp_v(v);

			if(dataStore.getCf() + v >= dataStore.getPrice()) {
				mdaEfsm.coin(1); // Sufficient funds
			}else {
				mdaEfsm.coin(0); // Insufficient funds
			}

		}else {
			System.out.println("Invalid: please enter a positive value for v");
		}
	}

	public void card(float x) {
		// Accepts card payment if it has sufficient balance
		if(x >= dataStore.getPrice()) {
			mdaEfsm.card();
		}else {
			System.out.println("Invalid: Insufficient funds in the card!");
		}
	}

	public void sugar() {
		// Adds sugar as an additive
		mdaEfsm.additive(0);
	}

	public void cappuccino() {
		// Dispenses cappuccino drink
		mdaEfsm.disposeDrink(0);
	}

	public void chocolate() {
		// Dispenses chocolate drink
		mdaEfsm.disposeDrink(1);
	}

	public void insert_cups(int n) {
		// Adds cups to the vending machine inventory
		if(n > 0) {
			mdaEfsm.insertCups(n);
		}else {
			System.out.println("Invalid: please enter a positive value for cups");
		}
	}

	public void set_price(float p) {
		// Sets a new price for the drink
		if(p > 0) {
			dataStore.setTemp_p(p);
			mdaEfsm.setPrice();
		}else {
			System.out.println("Invalid: please enter a positive price for the drink");
		}
	}

	public void cancel() {
		// Cancels the ongoing transaction
		mdaEfsm.cancel();
	}
}
