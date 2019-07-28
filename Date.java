package exercise2;

public class Date {

	private int month;
	private int day;
	private int year;
//constructor
	public Date(int mon, int d, int y) {
		month = mon;
		day = d;
		year = y;
	}
//Set and Get methods
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
//Other methods
	public String displayDate() {
		String dDate = month +"/"+ day +"/"+ year;
		return dDate;
	}

	public static void main(String[] args) {
		


	}

}
