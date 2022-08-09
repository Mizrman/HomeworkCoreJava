package hw6IfElseCondition01;

public class Voter {
	public static void main(String[] args) {
		int myAge = 20;

		if (myAge == 18) {
			System.out.println("\nI am a Voter");
		} else if (myAge < 18) {
			System.out.println("\nI am not a Voter");

		} else if (myAge > 18) {
			System.out.println("\nI am a Voter");

		} else {
			System.out.println("\nPlease add a Valid age");
		}

	}

}
