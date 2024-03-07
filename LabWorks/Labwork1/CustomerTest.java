import java.util.Scanner;

public class CustomerTest {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Ahmet = 1;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Customer #1");
		Customer customer1 = new Customer();
		System.out.println("Customer #2");
		Customer customer2 = new Customer();
		System.out.println("Customer #3");
		Customer customer3 = new Customer();
		
		while (Ahmet != 0) {
			System.out.println("1. Display Customer #1\n "
					+ "2. Display Customer #2\n"
					+ "3. Display Customer #3\n"
					+ " 0. Exit");
			
			Ahmet = scanner.nextInt();
			
			if (Ahmet == 1 ) {
				System.out.println("id: " + customer1.id);
				System.out.println("name: " + customer1.name);
				System.out.println("surname: " + customer1.surname);
				System.out.println("age: " + customer1.age);
				System.out.println("PostCode: " + customer1.PostCode);
				System.out.println("email: " + customer1.email);

			}
			
			else if (Ahmet == 2 ) {
				System.out.println("id: " + customer2.id);
				System.out.println("name: " + customer2.name);
				System.out.println("surname: " + customer2.surname);
				System.out.println("age: " + customer2.age);
				System.out.println("PostCode: " + customer2.PostCode);
				System.out.println("email: " + customer2.email);

			}
			
			else if (Ahmet == 3 ) {
				System.out.println("id: " + customer3.id);
				System.out.println("name: " + customer3.name);
				System.out.println("surname: " + customer3.surname);
				System.out.println("age: " + customer3.age);
				System.out.println("PostCode: " + customer3.PostCode);
				System.out.println("email: " + customer3.email);

			}
		}
		
	}

}
