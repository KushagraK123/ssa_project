package vending.machine.data;

// DS1 is a concrete DataStore class used by VM1. It holds runtime data such as temporary and final values
// for price and credit. It extends the abstract DataStore class.
public class DS1 extends DataStore {

	private float temp_p; // Temporary storage for price
	private float temp_v; // Temporary storage for coin value
	private float price;  // Final price of the drink
	private float cf;     // Current credit/funds inserted

	// Getter and Setter for temp_p
	public float getTemp_p() {
		return temp_p;
	}

	public void setTemp_p(float temp_p) {
		this.temp_p = temp_p;
	}

	// Getter and Setter for temp_v
	public float getTemp_v() {
		return temp_v;
	}

	public void setTemp_v(float temp_v) {
		this.temp_v = temp_v;
	}

	// Getter and Setter for price
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	// Getter and Setter for cf
	public float getCf() {
		return cf;
	}

	public void setCf(float cf) {
		this.cf = cf;
	}
}
