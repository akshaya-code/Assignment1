package question4;

class Employee {
	String name;
	int age;

	// Constructor
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

class HR extends Employee {
	int Eid;
	double salary;

	// Constructor
	public HR(String name, int age, int Eid, double salary) {
		super(name, age);
		this.Eid = Eid;
		this.salary = salary;
	}

	void displayDetails() {
		System.out.println("Name: " + name + ", Age: " + age + ", Eid: " + Eid + ", Salary: " + salary);
	}
}
