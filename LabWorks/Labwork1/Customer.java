import java.util.Scanner;

public class Customer {


	int id ;
	String name;
	String surname;
	int age;
	int PostCode ;
	String email;

	public Customer() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter id ");
		id = scanner.nextInt();
		System.out.println("Enter name ");
		name = scanner.nextLine();
		scanner.nextLine();
		System.out.println("Enter surname ");
		surname = scanner.nextLine();
		scanner.nextLine();
		System.out.println("Enter age ");
		age = scanner.nextInt();
		System.out.println("Enter postal code ");
		PostCode = scanner.nextInt();
		System.out.println("Enter email ");
		email = scanner.nextLine();
		scanner.nextLine();

	}
	
	
	
}
