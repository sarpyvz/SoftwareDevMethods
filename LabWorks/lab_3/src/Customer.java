import java.util.Scanner;

public class Customer {

	private int id ;
	private String name;
	private String surname;
	private int age;
	private int PostCode ;
	private String email;
	
	static Customer[] customerArray = new Customer[10];
	static int customerCount = 0;
	
	public Customer() {
		
		customerCount++;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter id ");
		id = scanner.nextInt();
		scanner.nextLine();

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
		scanner.nextLine();
		System.out.println("Enter email ");
		email = scanner.nextLine();
		scanner.nextLine();
	}
	
	
	
	
	public void displayCustomerInfo() {
		System.out.println("id: " + this.id);
		System.out.println("name: " + this.name);
		System.out.println("surname: " + this.surname);
		System.out.println("age: " + this.age);
		System.out.println("PostCode: " + this.PostCode);
		System.out.println("email: " + this.email);
		
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getSurname() {
		return surname;
	}




	public void setSurname(String surname) {
		this.surname = surname;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public int getPostCode() {
		return PostCode;
	}




	public void setPostCode(int postCode) {
		PostCode = postCode;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}
	
	
}


