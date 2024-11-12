package question1;

import java.util.Scanner;

public class Employee {
	String name;
	double salary;
	int age;

	public void setData(String name, double salary, int age) {
		this.name = name;
		this.salary = salary;
		this.age = age;
	}

	void displayData() {
		System.out.println("Name: " + name + ", Salary: " + salary + ",Age: " + age);
	}

	public static void main(String[] args) {
		Employee emp1, emp2;
		emp1 = new Employee();
		emp1.name = "Joseph";
		emp1.salary = 65784.50;
		emp1.age = 25;
		emp2 = new Employee();
		String name = "";
		double salary = 0.0;
		int age = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name: ");
		name = input.nextLine();
		System.out.print("Enter your salary: ");
		salary = input.nextDouble();
		System.out.print("Enter your age: ");
		age = input.nextInt();
		emp2.setData(name, salary, age);
		emp1.displayData();
		emp2.displayData();
		input.close();
		if (emp1.age > emp2.age) {
			System.out.println(emp1.name + " is older");
		} else if (emp1.age < emp2.age) {
			System.out.println(emp2.name + " is older");
		} else {
			System.out.println("Both are of the same age");
		}
	}
}
