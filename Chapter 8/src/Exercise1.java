

// Exercise UEmployee

public class Exercise1 {
	
	public static void main(String[] args) {
		
		Person person = new Person("Nolan", "4556 NW AVE", 
			"65656848990940894894904094494489489", "Nolan4@gmail.com");
		

		Student student = new Student("Abol", "9098 City Street", "909299299049098994848849489489", 
			"Abol9@gmail.com", Student.SENIOR);
		
		
		

		Employee employee = new Employee("Noman", "3445 NE Street", "9090953780940499",
			"Noman3@gmail.com", 45, 90000);

		Faculty faculty = new Faculty("Solami", "90 NW Street", "904234239849948948988948948494894894894899",
			"solami9@gmail.com   ", 112, 80000, "    9am to 3:30pm", "Teacher");
		
		

		Staff staff = new Staff("Carty", "342 Street East", "893672899",
			"Carty@gmail.com", 1, 69000, "Helper");

		
		System.out.println(person.toString());
		
		System.out.println(student.toString());
		
		System.out.println(employee.toString());
		
		System.out.println(faculty.toString());
		
		System.out.println(staff.toString());
		
	}}
