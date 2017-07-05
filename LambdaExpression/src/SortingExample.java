import java.util.ArrayList;
import java.util.List;


public class SortingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> personsList= new ArrayList<Person>();
		personsList.add(new Person("Mohan","Ijjada", 25, 10000));
		personsList.add(new Person("Teja","Gatla",24, 50000));
		System.out.println("**********Before Sorting*************");
		for(Person person : personsList){
			System.out.println(person);
		}
		System.out.println("*********After Sorting With First Name**************");
		personsList.sort((Person p1, Person p2)->p1.getFirstName().compareTo(p2.getFirstName()));
		personsList.forEach((person)->System.out.println(person));
		System.out.println("*********After Sorting With Last Name**************");
		personsList.sort((Person p1, Person p2)->p1.getLastName().compareTo(p2.getLastName()));
		personsList.forEach((person)->System.out.println(person));
		System.out.println("*********After Sorting With Age**************");
		personsList.sort((Person p1, Person p2)->p1.getAge()-(p2.getAge()));
		personsList.forEach((person)->System.out.println(person));
		System.out.println("*********After Sorting With Salary**************");
		personsList.sort((Person p1, Person p2)->p1.getSalary()-(p2.getSalary()));
		personsList.forEach((person)->System.out.println(person));
		
	}

}
