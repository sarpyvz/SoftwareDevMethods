import java.util.Scanner;

public class DVD {
	
	static DVD[] dvdArray = new DVD[10];
	
	static int dvdCount = 0;
	
	Scanner scanner = new Scanner(System.in);
	
	private int id;
	private Date rentDate;
	private String title;
	private String artist;
	private String genre;
	private int length;
	

	
	public DVD() {
		dvdCount++;
		
		this.genre = "Other";
		System.out.println("Enter id");
		id = scanner.nextInt();
		System.out.println("Enter title");
		title = scanner.next();
		System.out.println("Enter artist");
		artist = scanner.next();
		System.out.println("Enter length");
		length = scanner.nextInt();
				
	}

	public DVD(String genre) {
		dvdCount++;
				
		this.genre = genre;
		System.out.println("Enter id");
		id = scanner.nextInt();
		System.out.println("Enter title");
		title = scanner.next();
		System.out.println("Enter artist");
		artist = scanner.next();
		System.out.println("Enter length");
		length = scanner.nextInt();
		
		
	}
	
	public void displayDvdInfo() {
		System.out.println("id: " + this.id);
		System.out.println("title: " + this.title);
		System.out.println("artist: " + this.artist);
		System.out.println("genre: " + this.genre);
		System.out.println("length(in minutes): " + this.length);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getRentDate() {
		return rentDate;
	}

	public void setRentDate(Date rentDate) {
		this.rentDate = rentDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

}
