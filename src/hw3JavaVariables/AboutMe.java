package hw3JavaVariables;

public class AboutMe {

	public String fullName; // variable declared

	public byte myAge = 21; // variable initialized
	public short idNum = 10500;
	public int annualSalary = 250000;
	public long housePrice = 25234238230948l;
	public float myHeight = 1.882345f;
	public double taxPercent = 35.3456593889385566755;
	public char firstInitial = 'M';
	public boolean infoClassification = false;

	public static void main(String[] args) {

		AboutMe aboutMe = new AboutMe();

		System.out.println("Good afternoon! \nMy Full name is classified, so expect to see 'null': " + aboutMe.fullName
				+ "\nHowever, below some of my information are posted:");

		System.out.println("\nMy age: " + aboutMe.myAge + "\nMy ID number: " + aboutMe.idNum + "\nMy Annual Income: "
				+ aboutMe.annualSalary + "\nMy House Price: " + aboutMe.housePrice + "\nMy Height: " + aboutMe.myHeight
				+ "\nMy Tax Percentage: " + aboutMe.taxPercent + "\nMy First name initial: " + aboutMe.firstInitial
				+ "\nMy information is classified: " + aboutMe.infoClassification);

	}

}
