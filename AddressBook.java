import java.util.Scanner;

public class AddressBook {
	
	public static void main(String[] args) {
		
		try (Scanner myDetails = new Scanner(System.in)) {
			System.out.println("Enter firstName, lastName, city, state, country, zipcode and phoneNumber:");
			
			// String input
			String firstName = myDetails.nextLine();
			String lastName =  myDetails.nextLine();
			String city = myDetails.nextLine();
			String state = myDetails.nextLine();
			String country = myDetails.nextLine();
			
			// Numerical input
			int zipcode = myDetails.nextInt();
			int phoneNumber = myDetails.nextInt();
			
			// Input by user
			System.out.println("First Name: " + firstName);
			System.out.println("Last Name: " + lastName);
			System.out.println("City: " + city);
			System.out.println("State: " + state);
			System.out.println("Country: " + country);
			System.out.println("Zip Code: " + zipcode);
			System.out.println("Phone NUmber: " + phoneNumber);
			
		
			System.out.println("Enter a number to perform the following operations");
			Scanner sc=new Scanner(System.in);
			switch (sc.nextInt()) {
			
			  case 1:
				  		System.out.println("Edit the address");
				  		break;
			  case 2:
				  		System.out.println("Edit phone number");
				  		break;
			  case 3:
				  		System.out.println("Delete a person's information");
				  		break;
			  case 4:
				  		System.out.println("Add a person's information");
				  		break;
			  case 5:
				  		System.out.println("Fetch a person's information");
				  		break;
			  case 6:
				  		System.out.println("Exit the addess book");
				  		break;
			  default:
						System.out.println("Error:Enter a valid input");
						break;
					}
			
			}
					
		}
		
	
}

