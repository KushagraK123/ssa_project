package vending.machine.state;

import vending.machine.op.OP;

/**
 * STATE PATTERN ELEMENT
 * It is the abstract class for all the states. StateContext interfaces with this state.
 * This class represents the abstract class for States. 
 * Child state classes give the concrete implementation for all the functions in the current class.
 * Author: Kushagra Kasliwal
 */
public abstract class State {
	static int[] A = new int[2]; // Static utility array, potentially used in state logic
	OP op; // Reference to the operations handler used to invoke business logic

	// Default (empty) implementations for all state methods
	public void create() {}
	public void coin(int x) {}
	public void card() {}
	public void setPrice() {}
	public void cancel() {}
	public void additive(int a) {}
	public void disposeDrink(int d) {}

	// Utility method to print a line separator for logging/debugging
	void printLine() {
		System.out.println("\n###########################\n");
	}
}
