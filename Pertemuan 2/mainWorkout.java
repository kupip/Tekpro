public class mainWorkout {
	// Main program
	public static void main(String[] args) {
		Workout wo1 = new Workout();
		Workout wo2 = new Workout();
		
		wo1.setType("Cardio");
		wo2.setType("Strength");
		
		wo1.setDuration(45);
		wo2.setDuration(20);
		
		wo1.display();
		wo1.check();
		
		wo2.display();
		wo2.check();
	}
}