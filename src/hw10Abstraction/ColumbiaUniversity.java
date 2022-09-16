package hw10Abstraction;

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool { 
	/* One keyword "extends" being used here to inherit another regular class
	 * Keyword "implements" used to inherit two interfaces, University and VocationalSchool
	 * A regular class can inherit one regular class or an abstract
	 class using 'extends' keyword
	 * A regular class can inherit more than one interface using the keyword "implements"
	 */
	
	// public abstract void chemistry();---> Abstract method can not be processed
	// without making this regular class into an Abstract class.

	public void biology() {
		System.out.println("Somtehing");

	}

	public ColumbiaUniversity() {

	}

	@Override
	public void anatomyLab() {

	}

	@Override
	public void hygiene() {

	}

	@Override
	public void lawInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void laboratory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void languageClub() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void classSize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playGround() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void teacher() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void vocationalInfo() {
		// TODO Auto-generated method stub
		
	}

}
