package question7.academics;


import java.util.Scanner;

public class Test extends Student {
    protected int mark1;
    protected int mark2;

    @Override
    public void inputDetails() {
        super.inputDetails();  // Call Student's inputDetails
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter mark1: ");
        mark1 = scanner.nextInt();
        System.out.print("Enter mark2: ");
        mark2 = scanner.nextInt();
        scanner.close();
    }

    @Override
    public void showDetails() {
        super.showDetails();  // Call Student's showDetails
        System.out.println("Mark1: " + mark1);
        System.out.println("Mark2: " + mark2);
    }

    public int getTotalMarks() {
        return mark1 + mark2;
    }
}
