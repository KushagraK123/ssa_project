package vending.machine.state;

import vending.machine.op.OP;

/**
 * STATE PATTERN ELEMENT
 * Concrete class for the S1 state. StateContext will interface with this state.
 * This class represents the concrete class for S1 state.
 */
public class Idle extends State {

	public Idle(OP op) {
		this.op = op; // Assign the operations handler
	}

	@Override
	public void coin(int x) {
		op.increaseCF(); // Increase the current funds when a coin is inserted
	}

	@Override
	public void card() {
		printLine(); // Visual separator
		System.out.println("Card Inserted"); // Notify user of card input
		op.returnCoinsAll(); // Return any previously inserted coins
		A = new int[2]; // Reset additive selections
		op.zeroCF(); // Reset credit/funds
		printLine(); // Visual separator
	}

	@Override
	public void setPrice() {
		printLine(); // Visual separator
		op.storePrice(); // Store the new price for the drink
		printLine(); // Visual separator
	}
}
