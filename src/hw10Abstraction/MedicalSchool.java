package hw10Abstraction;

public abstract class MedicalSchool extends NursingSchool implements LawSchool{ // One inheritance is possible using the 'extends' keyword
	public abstract void anatomyLab();
	/* Only two keywords "extends" and "implement" used here to inherit one abstract class and an Interface
	 * An abstract class can inherit another regular class or an abstract via "extends" keyword and inherit
	 * multiple Interface via "implements" keyword.
	 * Only one inheritance is possible by an Abstract or a regular class and vice versa
	 */
	public void biochemistryLab() {
		System.out.println("Something");
	}

}
