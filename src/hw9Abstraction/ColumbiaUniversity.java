package hw9Abstraction;

public class ColumbiaUniversity extends MedicalSchool { /*
														 * A regular class can inherit one regular class or an abstract
														 * class using 'extends' keyword
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

}
