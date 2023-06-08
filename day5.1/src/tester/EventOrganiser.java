package tester;

import java.util.Scanner;

import com.app.core.Faculty;
import com.app.core.Person;
import com.app.core.Student;

public class EventOrganiser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter max no of participants");
		Person[] participants = new Person[sc.nextInt()];// array of refs
		boolean exit = false;
		int counter = 0;
		while (!exit) {
			System.out.println("Options 1. Register Student 2. Register Faculty 3. Display Details of all participants"
					+ "4. Display specific participant details 5. Invoke subclass specific functionality 100.Exit");

			System.out.println("Enter choice");

			switch (sc.nextInt()) {

			case 1: // student registration
				if (counter < participants.length) {
					System.out.println("Enter student details- firstName, lastName,  gradYear,  course,  fees, marks");
					// up casting
					participants[counter++] = new Student(sc.next(), sc.next(), sc.nextInt(), sc.next(),
							sc.nextDouble(), sc.nextInt());
				} else {
					System.out.println("Event full!!!!");
				}

				break;

			case 2:// Faculty registration
				if (counter < participants.length) {
					System.out.println("Enter Faculty deatails-fistname , lastname , experiance in yrs , sme");
					participants[counter++] = new Faculty(sc.next(), sc.next(), sc.nextInt(), sc.nextLine());
				} else {
					System.out.println("Event Full!!!");
				}

				break;

			case 3:// display details of all participants
				for (Person p : participants) {
					if (p != null)
						System.out.println(p);
				}

				break;

			case 4:
				System.out.println("Enter seat no -");
				int index = sc.nextInt() - 1;

				if (index >= 0 && index < counter) {
					System.out.println(participants[index]);
				} else {
					System.out.println("Inavlid seat number...");
				}

				break;
				
			case 5 :System.out.println("Enter seat no -");
			        index = sc.nextInt() - 1;
 	
				
				break;
			case 100:
				exit = true;
				break;

			}
		}
		sc.close();
	}
}
