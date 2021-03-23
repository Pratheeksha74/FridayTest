package tuesdayTest;

import java.util.Scanner;

class InvalidCountryException extends RuntimeException{
	public InvalidCountryException(String msg) {
		super(msg);
	}
}

public class UserRegistration {
	public static void registerUser(String username, String country) {
		if(country.equalsIgnoreCase("INDIA")) {
			System.out.println("User registered successfully");
		} else {
			throw new InvalidCountryException("User outside India can't be registered");
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the username");
		String username = scan.nextLine();
		System.out.println("Enter your country");
		String country = scan.nextLine();
		registerUser(username,country);

	}

}
