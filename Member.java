
public class Member {
	private String name;
	private String surname;
	private char sex;
	private int date;
	private int month;
	private int year;
	
	public Member(String name, String surname, char sex, int date, int month, int year) {
		this.name = name;
		this.surname = surname;
		this.sex = sex;
		this.date = date;
		this.year = year;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public char getSex() {
		return sex;
	}
	
	public int getDate() {
		return date;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getYear() {
		return year;
	}
	
}
