package question3;

public class Main {

	public static void main(String[] args) {
		Deposit deposit = new Deposit(50000, 7, 8.5);
		deposit.calcAmt(); // Call the calculation method before displaying
		deposit.display();
	}

}
