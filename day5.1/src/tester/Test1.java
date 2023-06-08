package tester;
import com.app.core.Faculty;
import com.app.core.Person;
import com.app.core.Student;

public class Test1 {

	public static void main(String[] args) {
		
		Student student1 = new Student("Rama","Seth",2020,"PG-DAC",123456,75);
//		System.out.println(student1.toString());
		System.out.println(student1);
		Person p;
		p = student1;// upacasting
		System.out.println(p);//run time polymorphism //indirect referencing
		p = new Faculty("Kiran","Majumdar",10,"javaReact NOSql");
		System.out.println(p);//run time polymorphism
		
		Object o;
		o = new Student("Rama","Seth",2020,"PG-DAC",123456,75);//upcasting
		System.out.println(o);
	}

}
