package question4;

public class Main {

	  public static void main(String[] args) {
	    // Create an Employee object
	    Employee employee = new Employee("John Doe", 30);

	    // Create an HR object
	    HR hr = new HR("Jane Smith", 35, 12345, 80000.00);

	    // Display Employee details (inherited from HR)
	    System.out.println("Employee Details:");
	    //employee.displayDetails(); // This won't work as Employee doesn't have displayDetails

	    // Display HR details
	    System.out.println("\nHR Details:");
	    hr.displayDetails();
	  }
	}