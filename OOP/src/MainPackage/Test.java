package MainPackage;


import TestPackage.Student;
import java.util.Calendar;

/**
 * @author MIK Class main
 * demo some way to using object, class,...
 */
public class Test {
	public static void main(String[] args) {

		OngGiaNoel santa = new OngGiaNoel();
		santa.setName("Santa Claus");
		santa.move();
		// Thể hiện tính kế thừa và bao đóng
		MainPackage.Student studen001 = new MainPackage.Student();
		Calendar calendar = Calendar.getInstance();
		calendar.set(1995, 11, 01);
		studen001.setFullname("Van Loi");
		studen001.setContry("Viet Nam");
		studen001.setBirdthday(calendar);
		studen001.setId("A200111001");
		int age = studen001.calcAge(); 		// Age = 22
		System.out.println(age);

		// Thể hiện tính trừu tượng
		Duck donal = new Duck();
		donal.move();						//swimming
		// Thể hiện tính đa hình
		WildDuck donalf = new WildDuck();
		donalf.move();						//flying
		
		// Thể hiện package;
		TestPackage.Student studentT = new Student();
		studentT.say();
	}
}
