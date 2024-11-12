package question7.academics;

import java.util.Scanner;

public class Student {
	protected String name;
	protected int roll;

	public void inputDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter student name: ");
		name = scanner.nextLine();
		System.out.print("Enter roll number: ");
		roll = scanner.nextInt();
		scanner.close();
	}

	public void showDetails() {
		System.out.println("Name: " + name);
		System.out.println("Roll Number: " + roll);
	}
}
