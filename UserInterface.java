public class UserInterface(){
	/**
	 *  interact with the user
	 */
	public void showUI(Person person) {
		System.out.println("What do you want to do?");
		System.out.println("1. Show person's full name");
		System.out.println("2. Change person's first name");
		System.out.println("3. Change person's last name");
		System.out.println("4. View all info on person");
		System.out.println("5. Change person's email address");
		System.out.println("6. Exit the program");

		String command = System.console().readLine();
		
		while (!command.equals("6")) {
			switch(command) {
				case 1:
					System.out.println("Full name is: " + person.firstName + " " + person.lastName);
					break;
				case 2:
					System.out.println("What's the person's first name?");
					person.firstName = System.console().readLine();
					break;
				case 3:	
					System.out.println("What's the person's last name?");
					person.lastName = System.console().readLine();
					break;
				case 4:
					System.out.println("Info on person: \n"person.firstName + "\n" + person.lastName + "\n" + person.age + "\n" + person.gender + "\n" + person.email);
					break;
				case 5:
					System.out.println("What's the person's email address?");
					person.email = System.console().readLine();
					break;
				default:
					System.out.println("Invalid input");
					
			}
			System.out.println("What do you want to do?");
                	System.out.println("1. Show person's full name");
                	System.out.println("2. Change person's first name");
                	System.out.println("3. Change person's last name");
                	System.out.println("4. View all info on person");
                	System.out.println("5. Change person's email address");
                	System.out.println("6. Exit the program");
			command = System.console().readLine();
		}
	}
}