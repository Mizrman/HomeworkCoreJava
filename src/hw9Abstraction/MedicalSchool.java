package hw9Abstraction;

public abstract class MedicalSchool extends NursingSchool { // One inheritance is possible using the 'extends' keyword
	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("Something");

	}
	
	public MedicalSchool() {
		
	}

}
