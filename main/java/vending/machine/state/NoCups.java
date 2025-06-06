package vending.machine.state;

import vending.machine.op.OP;

/*
 * STATE PATTERN ELEMENT
 * Concrete class for the S0 state. StateContext will interface with this state.
 *
 * This class represents the concrete class for S0 state.
 */
public class NoCups extends State {

	public NoCups(OP op) {
		this.op = op; // Assign the operations handler to this state
	}

	/*
	 * Handles the coin input in NoCups state.
	 * Since no cups are present, it increases the credit and returns all inserted coins.
	 */
	@Override
	public void coin(int x) {
		printLine(); // Print visual separator
		System.out.println("No Cups present!"); // Notify user that cups are not available
		op.increaseCF(); // Increase credit/funds with inserted coin
		op.returnCoinsAll(); // Return all coins to the user
		printLine(); // Print visual separator
	}
}
