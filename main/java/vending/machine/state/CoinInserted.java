package vending.machine.state;

import vending.machine.op.OP;

/**
 * STATE PATTERN ELEMENT
 * Concrete class for the S2 state. StateContext will interface with this state.
 * This class represents the concrete class for S2 state.
 */
public class CoinInserted extends State {

	public CoinInserted(OP op) {
		this.op = op; // Assign the operations handler
	}

	@Override
	public void coin(int x) {
		printLine(); // Visual separator
		op.increaseCF(); // Increase current credit/funds
		op.returnCoinsChange(); // Return any extra change if credit exceeds price
		printLine(); // Visual separator
	}

	@Override
	public void additive(int a) {
		printLine(); // Visual separator
		if (A[a] == 0) {
			A[a] = 1; // Additive selected
		} else {
			A[a] = 0; // Additive deselected if already selected
		}
		System.out.println("Additive Pressed"); // Confirmation message
		printLine(); // Visual separator
	}

	@Override
	public void disposeDrink(int d) {
		printLine(); // Visual separator
		op.disposeAdditive(A); // Dispense selected additives
		op.disposeDrink(d); // Dispense selected drink
		op.returnCoinsChange(); // Return any remaining change
		op.zeroCF(); // Reset current funds to zero
		A = new int[2]; // Reset additive selections
		printLine(); // Visual separator
	}

	@Override
	public void cancel() {
		printLine(); // Visual separator
		op.returnCoinsAll(); // Return all inserted coins
		op.zeroCF(); // Reset current funds
		A = new int[2]; // Reset additive selections
		printLine(); // Visual separator
	}
}
