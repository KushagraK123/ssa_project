package vending.machine.mda_efsm;

import vending.machine.abstract_factory.AbstractFactory;
import vending.machine.abstract_factory.ConcreteFactory2;
import vending.machine.data.DS2;

/**
 * Model Architecture Element
 * Input Processor for MDA Architecture

 * This class represents VM2 component Implementation which addresses all the needs of VM2 operations.
 * It processes input commands, handles validation, and delegates state transitions to the MDAEFSM.
 * Author: Kushagra Kasliwal
 */
public class VM2 {
    MDAEFSM mdaEfsm; // State machine controller
    AbstractFactory factory; // Abstract factory to create VM2-specific components
    DS2 dataStore; // Data store used by VM2 for temporary and permanent data

    public VM2() {
        factory = new ConcreteFactory2(); // Initializes factory specific to VM2
        mdaEfsm = new MDAEFSM(factory); // Initializes MDAEFSM with VM2's factory
        dataStore = (DS2) factory.getDataStore(); // Gets the concrete data store for VM2
    }

    public void CREATE(int p) {
        // Creates the vending machine with the initial drink price if valid
        if(p > 0) {
            dataStore.setTemp_p(p);
            mdaEfsm.create();
        }else {
            System.out.println("Invalid: please enter a positive value for p");
        }
    }

    public void COIN(int v) {
        // Accepts coin, adds value, and signals MDAEFSM based on whether funds are sufficient
        if(v > 0) {
            dataStore.setTemp_v(v);

            if(dataStore.getCf() + v >= dataStore.getPrice()) {
                mdaEfsm.coin(1); // Sufficient credit
            }else {
                mdaEfsm.coin(0); // Insufficient credit
            }

        }else {
            System.out.println("Invalid: please enter a positive value for v");
        }
    }

    public void SUGAR() {
        // Adds sugar as an additive
        mdaEfsm.additive(0);
    }

    public void CREAM() {
        // Adds cream as an additive
        mdaEfsm.additive(1);
    }

    public void COFFEE() {
        // Dispenses coffee
        mdaEfsm.disposeDrink(0);
    }

    public void InsertCups(int n) {
        // Adds cups to the inventory if input is valid
        if(n > 0) {
            mdaEfsm.insertCups(n);
        }else {
            System.out.println("Invalid: please enter a positive value for cups");
        }
    }

    public void SetPrice(int p) {
        // Sets a new price for the drinks
        if(p > 0) {
            dataStore.setTemp_p(p);
            mdaEfsm.setPrice();
        }else {
            System.out.println("Invalid: please enter a positive price for the drink");
        }
    }

    public void CANCEL() {
        // Cancels the current transaction
        mdaEfsm.cancel();
    }
}
