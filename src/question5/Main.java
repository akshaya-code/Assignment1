package question5;

public class Main {
	public static void main(String[] args) {
		CSE cseStudent = new CSE(80, 75, 90);
		NonCSE nonCseStudent = new NonCSE(70, 85, 82);

		cseStudent.getPercentage();
		nonCseStudent.getPercentage();
	}
}