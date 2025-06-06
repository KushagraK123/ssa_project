package vending.machine.state;

import vending.machine.op.OP;

/**
 * STATE PATTERN ELEMENT
 * Concrete class for the Start state. StateContext will interface with this state.
 *
 * This class represents the concrete class for Start state.
 * Author: Kushagra Kasliwal
 */
public class Start extends State {

	public Start(OP op) {
		this.op = op; // Assign the operations handler
		A = new int[2]; // Initialize static utility array
	}

	@Override
	public void create() {
		printLine(); // Print a visual separator
		op.storePrice(); // Invoke operation to store the price
		printLine(); // Print a visual separator
	}
}
