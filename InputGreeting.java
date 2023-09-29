public class InputGreeting{
	public static void main(String[] args){
		String input = "";
		System.out.println("What is your name?");
		input = System.console().readLine();
		System.out.println("Hello " + input);

		while(!input.equals("exit")) {
			System.out.println("What is your name?");
			input = System.console().readLine();
			System.out.println("Hello " + input);
		}
	}
}
