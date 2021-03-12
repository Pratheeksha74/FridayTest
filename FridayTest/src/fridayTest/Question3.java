package fridayTest;

import java.util.Scanner;

class MyNameException extends RuntimeException{
	public MyNameException(String msg) {
		super(msg);
	}
}

class Employee {
	private String firstName;
	private String lastName;
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	void validation() {
		if(firstName.equals("") && lastName.equals("")) {
			throw new NullPointerException("Entry Missing");
		} else {
			if(firstName.length() < 3 && lastName.length() < 3) {
				throw new MyNameException("Name should be minimum 3 characters");
			}
		}
	}
}

public class Question3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first name:");
		String firstName = scan.nextLine();
		System.out.println("Enter the last name:");
		String lastName = scan.nextLine();
		Employee emp = new Employee(firstName,lastName);
		emp.validation();

	}

}
