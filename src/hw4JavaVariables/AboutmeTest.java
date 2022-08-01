package hw4JavaVariables;

public class AboutmeTest {

	public static void main(String[] args) {

		AboutMe aboutMe = new AboutMe(); // Constructor initialized

		aboutMe.name = "Mizan"; // variables initialized
		aboutMe.age = 120;
		aboutMe.houseRent = 3800;
		aboutMe.annualSalary = 255000;
		aboutMe.fullAsset = 89006758l;
		aboutMe.height = 1.89657456f;
		aboutMe.grade = 3.2078966546789;
		aboutMe.sex = 'M';
		aboutMe.usCitizen = true;

		aboutMe.aboutMe(); // method initialized

		System.out.println("\n--------------------------\n");

		AboutMe aboutMe1 = new AboutMe(); // Constructor Initialized

		aboutMe1.name = "Alex"; // variables initialized
		aboutMe1.age = 118;
		aboutMe1.houseRent = 5500;
		aboutMe1.annualSalary = 350900;
		aboutMe1.fullAsset = 89006128l;
		aboutMe1.height = 1.79632145f;
		aboutMe1.grade = 3.888966546789;
		aboutMe1.sex = 'M';
		aboutMe1.usCitizen = false;

		aboutMe1.aboutMe(); // method initialized

	}

}
