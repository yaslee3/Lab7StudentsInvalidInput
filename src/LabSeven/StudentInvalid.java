package LabSeven;

import java.util.Scanner;

public class StudentInvalid {

	public static void main(String[] args) {// add IllegalArgumentException

		// Create a Scanner
		Scanner scan = new Scanner(System.in);

		// multidimensional array with names, hometown, and favor food
		String[][] studentNames = { { "Armani", "Detroit", "Salmon" }, { "CLark", "Detroit", "Pizza" },
				{ "Daniel", "Hamtramick", "Chinese" }, { "David", "Detroit", "Steak" },
				{ "DominiqueB", "Detroit", "Pizza" }, { "DominiqueE", "Detroit", "Shrimp" },
				{ "Elle", "Detroit", "Salmon" }, { "Jeseekia", "Detroit", "lasagna" },
				{ "Tricia", "Detroit", "MashPotatoe" }, { "Jennifer", "Detroit", "Italian" },
				{ "Johnny", "Detroit", "Thai" }, { " Kevin", "Detroit", "Tacos" }, { "Kim D", "Detroit", "Ice Cream" },
				{ "Nicole", "Detroit", "Mexican" }, { "Tricia", "Detroit", "MashPotatoe" },
				{ "Tyler", "Monroe", "Tacos" }, { "Yas", "Detroit", "Pizza" }, { "Zalika", "Detroit", "Pasta" } };
		// declare and initialize instance variables.
		String choice = "yes";

		// Prompt the user to ask about a particular student
		System.out.println("Welcome to our Java class!");
		while (choice.equalsIgnoreCase("yes")) {
			// System.out.println("Which student would you like to learn more about?(enter a number 1-20): ");

			// add for loop to take in name length
			for (int i = 0; i < studentNames.length; i++) {
				System.out.println((i + 1) + ". " + studentNames[i][0]);

			}

			// add println to enter a student number 1-20
			System.out.println("Which student would you like to learn more about? (enter a number between 1 and 18)");
			int input = scan.nextInt();// scan for number associated with student name
			scan.nextLine();
						// try catch is in a loop to check and see if input is from 1- 18
						while (input > 18 || input < 1) {
							try {
								throw new ArrayIndexOutOfBoundsException();
							} catch (ArrayIndexOutOfBoundsException e) {
								System.out
										.println("That student does not exist.  Please try again. (enter a number between 1-20)");
								input = scan.nextInt();
								scan.nextLine();
							}
						}
						 //sets a variable named personSelected to the index that
						// corresponds with the index #
						String personSelected = studentNames[input - 1][0];
						String factInput = " ";

						System.out.println("Student " + (input) + " is " + personSelected
								+ ". What would you like to know about " + personSelected
								+ "? (Hometown or favorite food)");

						// needed factInput because I needed to scan for a String
						factInput = scan.nextLine();
						// while loop to continue if it gets caught in try catch statement
						while (input <= 18 && input >= 1) {
							// if the user types in hometown and associates that to the
							// index # in the array
							if (factInput.equalsIgnoreCase("hometown")) {
								System.out.println(personSelected + "'s hometown is "
										+ studentNames[input - 1][1]
										+ ". Would you like to know more?");
								String choice1 = scan.nextLine();
								if (choice1.equalsIgnoreCase("yes")) {
									System.out
											.println("Please enter hometown or favorite food");
									factInput = scan.nextLine();
									continue;
								} else {
									break;
								}
							} else if (factInput.equalsIgnoreCase("favorite food")) {
								System.out.println(personSelected + "'s favorite food is "
										+ studentNames[input - 1][2]
										+ ". Would you like to know more?");
								String choice1 = scan.nextLine();
								if (choice1.equalsIgnoreCase("yes")) {
									System.out
											.println("Please enter hometown or favorite food");
									factInput = scan.nextLine();
									continue;
								} else {
									break;
								}
								// throws exception if they type in anything else outside of
								// hometown or favorite food
							} else {
								try {
									throw new IllegalArgumentException();
								} catch (IllegalArgumentException e) {
									System.out
											.println("that data does not exist. Please try again. Enter hometown or favorite food");
									factInput = scan.nextLine();
								}

							}
						}
						// ask the user if they want to continue
						System.out.println("Continue? (yes/no)");

						choice = scan.nextLine();
					}
					System.out.println("Ok. Bye!");
					scan.close();
	}
}
			
