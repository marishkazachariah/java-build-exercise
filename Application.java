public class Application {
	public void run() {
		UserInterface userInterface = new UserInterface();
		Person person = new Person("Mary", "Jones", "woman", 32, "maryjones@hotmail.com");

		userInterface.showUI(person); 
	}
}
