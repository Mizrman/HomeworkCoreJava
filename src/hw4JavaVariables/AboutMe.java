package hw4JavaVariables;

public class AboutMe {

	public String name; // variables declared
	public byte age;
	public short houseRent;
	public int annualSalary;
	public long fullAsset;
	public float height;
	public double grade;
	public char sex;
	public boolean usCitizen;

	public AboutMe() { // Constructor declared
		System.out.println("This is about us:");

	}

	public void aboutMe() { // Method implemented

		System.out.println("\nName: " + name + "\nAge: " + age + "\nMonthly rent: " + houseRent + "\nAnnual salary: "
				+ annualSalary + "\nTotal asset: " + fullAsset + "\nHeight: " + height + "\nGPA: " + grade
				+ "\nGender: " + sex + "\nIs a citizen: " + usCitizen);

	}

}
