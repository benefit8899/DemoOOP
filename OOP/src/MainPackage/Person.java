package MainPackage;

import java.util.Calendar;

/**
 * @author MIK
 * demo class, using overloading
 */
public class Person {
	private String fullname;
	private String contry;
	private Calendar birthday;

	//Calc age by get year of now from system - year of date of birthday, return -1 if birthday > toDate
	public int calcAge() {
		Calendar now = Calendar.getInstance();
		if(now.after(birthday))
			return now.get(Calendar.YEAR) - birthday.get(Calendar.YEAR);
		else
			return -1;
	}
	//Calc age by get year parameter toDate - year of date of birthday, return -1 if birthday > toDate 
	public int calcAge(Calendar toDate){
		if(toDate.after(birthday))
			return toDate.get(Calendar.YEAR) - birthday.get(Calendar.YEAR);
		else
			return -1;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getContry() {
		return contry;
	}

	public void setContry(String contry) {
		this.contry = contry;
	}

	public Calendar getBirdthday() {
		return birthday;
	}

	public void setBirdthday(Calendar birdthday) {
		this.birthday = birdthday;
	}

}
