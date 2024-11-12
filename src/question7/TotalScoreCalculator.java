package question7;

import question7.academics.Test;
import question7.sports.Sports;

public class TotalScoreCalculator extends Test implements Sports {

	public void calculateGrandTotal() {
		int academicTotal = getTotalMarks();
		int sportsTotal = score1 + score2;
		int grandTotal = academicTotal + sportsTotal;
		System.out.println("Academic Total: " + academicTotal);
		System.out.println("Sports Total: " + sportsTotal);
		System.out.println("Grand Total: " + grandTotal);
	}

}
