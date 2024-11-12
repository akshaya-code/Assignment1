package question3;

class Deposit {
	long principal;
	int time;
	double rate;
	double totalAmt;

	// Constructor overloads
	public Deposit() {
		/* default values if required */

	}

	public Deposit(long principal, int time, double rate) {
		/* initialize fields */
		this.principal = principal;
		this.time = time;
		this.rate = rate;
	}

	public Deposit(long principal, int time) {
		/* set default rate */
		this.principal = principal;
		this.time = time;
		this.rate = 7.5;

	}

	public Deposit(long principal, double rate) {
		/* set default time */
		this.principal = principal;
		this.time = 5;
		this.rate = rate;

	}

	// Method to calculate total amount
	void calcAmt() {
		totalAmt = principal + (principal * rate * time) / 100;
	}

	// Method to display details
	void display() {
		System.out.println(
				"Principal: " + principal + ", Time: " + time + ", Rate: " + rate + ", Total Amount: " + totalAmt);
	}
}
