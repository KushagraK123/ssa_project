package vending.machine.mda_efsm;

import vending.machine.abstract_factory.AbstractFactory;
import vending.machine.op.OP;
import vending.machine.state.*;

/**
 * MDA ARCHITECTURE ELEMENT
 * Meta model for MDA Architecture.
 -
 * This class represents platform independent logic for all its clients i.e., VM1, VM2.
 * Separation of this functionality allows for reduced effort during maintenance and when new clients are added.
 * Author: Kushagra Kasliwal
 *
 */
public class MDAEFSM {
	int cups; // Tracks number of available cups
	State[] states = new State[4]; // Array holding all possible states
	State currState; // Current active state

	// Constructor initializes the EFSM with appropriate states using abstract factory
	public MDAEFSM(AbstractFactory abstractFactory) {
		OP op = new OP(abstractFactory); // Initialize OP with abstract factory
		states[0] = new Start(op); // Start state
		states[1] = new NoCups(op); // NoCups state
		states[2] = new Idle(op); // Idle state
		states[3] = new CoinInserted(op); // CoinInserted state
		currState = states[0]; // Set initial state to Start
		cups = 0; // Initialize cup count
	}

	/*
	 * Handles the create action. Allowed only in Start state.
	 */
	public void create(){
		if(currState == states[0]) {
			currState.create();
			currState = states[1]; // Transition to NoCups state
			System.out.println("CREATE SUCCESSFUL");
		}else {
			System.out.println("Invalid State for Action => CREATE");
		}
	}

	/*
	 * Handles coin insertion based on current state and sufficiency of funds.
	 */
	public void coin(int f){
		if(currState == states[1] || currState == states[3]) {
			// No state transition, just process coin
			currState.coin(f);
		} else if(currState == states[2]) {
			currState.coin(f);
			if(f == 1) {
				// Transition to CoinInserted state if funds are sufficient
				currState = states[3];
			}
		}else {
			System.out.println("Invalid State for Action => COIN");
		}
	}

	/*
	 * Adds cups. Allowed in NoCups or Idle states.
	 */
	public void insertCups(int c){
		if(currState == states[1] || currState == states[2]) {
			this.cups += c;
			System.out.printf("Added %d cups, new cups count is %d\n", c, cups );
			if(currState == states[1]) {
				currState = states[2]; // Transition to Idle if previously NoCups
			}
		}else {
			System.out.println("Invalid State for Action => INSERT CUPS");
		}
	}

	/*
	 * Handles card payment. Allowed only in Idle state.
	 */
	public void card(){
		if(currState == states[2]) {
			currState.card();
			this.currState = states[3]; // Transition to CoinInserted
		}else {
			System.out.println("Invalid State for Action => CARD");
		}
	}

	/*
	 * Cancels the transaction. Allowed only in CoinInserted state.
	 */
	public void cancel(){
		if(currState == states[3]) {
			currState.cancel();
			currState = states[2];
		}else {
			System.out.println("Invalid State for Action => CANCEL");
		}
	}

	/*
	 * Sets the drink price. Allowed only in Idle state.
	 */
	public void setPrice(){
		if(currState == states[2]) {
			currState.setPrice();
		}else {
			System.out.println("Invalid State for Action => SET PRICE");
		}
	}

	/*
	 * Dispenses the selected drink. Allowed only in CoinInserted state.
	 * Decreases cup count and transitions state based on remaining cups.
	 */
	public void disposeDrink(int d){
		if(currState == states[3]) {
			currState.disposeDrink(d);
			this.cups--;
			if(this.cups == 0) {
				currState = states[1]; // NoCups if no cups left
			}else {
				currState = states[2]; // Otherwise return to Idle
			}
		}else {
			System.out.println("Invalid State for Action => DISPOSE DRINK");
		}
	}

	/*
	 * Adds selected additive. Allowed only in CoinInserted state.
	 */
	public void additive(int a){
		if(currState == states[3]) {
			currState.additive(a);
		} else {
			System.out.println("Invalid State for Action => ADDITIVE");
		}
	}
}
