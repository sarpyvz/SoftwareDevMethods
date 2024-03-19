import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = 1;
		Scanner scanner = new Scanner(System.in);
		
		
		while (choice != 0) {
			System.out.println("1. Create Customer \n"
					+ "2. Create a new DVD  \n"
					+ "3. Create a new DVD with genre \n"
					+ "4. Display Customer Information \n"
					+ "5. Display DVD Information \n"
					+ "6. Display number of Customers\n"
					+ "0. Exit");
			
			choice = scanner.nextInt();
			System.out.println();
			
			if (choice == 1 ) {
				Customer customer = new Customer();
				Customer.customerArray[Customer.customerCount] = customer;
			}
			
			else if (choice == 2 ) {
				DVD dvd = new DVD();
				DVD.dvdArray[DVD.dvdCount] = dvd; 
			}
			
			else if (choice == 3 ) {
				String inputGenre;
				System.out.println("Enter genre");
				inputGenre = scanner.next();
				DVD dvd = new DVD(inputGenre);
				DVD.dvdArray[DVD.dvdCount] = dvd;
			}
			
			else if (choice == 4) {
				int inputID;
				System.out.println("Enter customer id");
				inputID = scanner.nextInt();
				for (int i = 1; i <= Customer.customerCount; i++) {
					if ( Customer.customerArray[i].getId() == inputID ) {
						Customer.customerArray[i].displayCustomerInfo();
						break;
					}
					else if ( i == Customer.customerCount ) {
						System.out.println("Given id not found");
					}

				}
				
				
			}
			
			else if (choice == 5) {
				int inputID;
				System.out.println("Enter DVD id");
				inputID = scanner.nextInt();
				for (int i = 1; i <= DVD.dvdCount; i++) {
					if ( DVD.dvdArray[i].getId() == inputID ) {
						DVD.dvdArray[i].displayDvdInfo();
						break;
					}
					else if ( i == DVD.dvdCount ) {
						System.out.println("Given id not found");

					}
				}
				
			}
			else if (choice == 6) {
				System.out.printf("Number of Customers: %d \n", Customer.customerCount);

			}
			else if (choice == 0) {
				break;
			}
		}
		
	}

}
