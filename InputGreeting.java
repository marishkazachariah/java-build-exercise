public class InputGreeting{
	public void getGreeting(){
		String input = "";
		System.out.println("What is your name?");
		input = System.console().readLine();
		System.out.println("Hello " + input);
		do {
			System.out.println("What is your name?");
			input = System.console().readLine();
			System.out.println("Hello " + input);
		} while (!input.equals("exit"));
		
		System.out.println("Goodbye!");
	}
}
