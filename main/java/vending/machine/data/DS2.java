package vending.machine.data;

// It is a concrete class of DataStore which stores data for VM-2.
public class DS2 extends DataStore {

	private int temp_p; // Temporary storage for price
	private int temp_v; // Temporary storage for coin value
	private int price;  // Final price of the drink
	private int cf;     // Current credit/funds inserted

	// Getter and Setter for temp_p
	public int getTemp_p() {
		return temp_p;
	}

	public void setTemp_p(int temp_p) {
		this.temp_p = temp_p;
	}

	// Getter and Setter for temp_v
	public int getTemp_v() {
		return temp_v;
	}

	public void setTemp_v(int temp_v) {
		this.temp_v = temp_v;
	}

	// Getter and Setter for price
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// Getter and Setter for cf
	public int getCf() {
		return cf;
	}

	public void setCf(int cf) {
		this.cf = cf;
	}
}
