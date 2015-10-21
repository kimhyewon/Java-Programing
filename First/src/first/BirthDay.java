package first;

public class BirthDay {
	private int day;
	private int month;
	private int year;
	
	public BirthDay(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getDay() {
		return day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getYear() {
		return year;
	}
	
	public boolean checkDay() {
		if(day >= 1 && day <= 31) {
			return true;
		}
		return false;
	}
	
	public boolean checkMonth() {
		if(month >= 1 && month <= 12) {
			return true;
		}
		return false;
	}
	
	public boolean checkYear() {
		if(year >= 0 && year <= 2100) {
			return true;
		}
		return false;
	}
	
	public boolean checkMonthyNumOfDay() { 	// 31일인 달은 true, 아니면 false 
		if(month <= 7 && month % 2 == 1 || month >= 8 && month % 2 == 0) {
			return true;
		}
		return false;
	}
	
	public boolean checkLeapYear() {	// 윤년이면 true, 아니면 false
		if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			return true;
		}
		return false;
	}
	
	public boolean checkValidate() {
		if(!checkDay()) return false;
		if(!checkMonth()) return false;
		if(!checkYear()) return false;
		
		if(!checkMonthyNumOfDay() && day == 31) {
			return false;
		}
		
		if(!checkLeapYear() && month == 2 && day >= 29) {
			return false;
		}

		return true;
	}
}