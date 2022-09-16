package hw10UseOfSuperInChildClass;

public class Daughter extends Father {
	String birthMonth;
	int age;

	public Daughter() {
		super(); //Only one super method can be called from Parent class.
				// Either it can go in default or parameterized constructor of child class.
		System.out.println("Default Constructor from Daughter class!");
	}

	public Daughter(String birthMonth, int age) {
		super("Mohammed", 70, 'M', true);//super method called from parent parameterized constructor.
		super.familyName = "ShahJahan";//super keyword called variable from Parent class.
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Family Name: " + familyName);
		System.out.println("Daughter's birth month is on: " + birthMonth + "\nAge: " + age);
	}

	public void daughter() {
		super.father();// super keyword called from parent (implemented) method.
		System.out.println("It is printed under \'DAUGHTER\' method!");

	}

	public void daughterInfo(String birthMonth, int age) {
		super.fatherInfo("Mohammed", 70, 'M', true);//called from parent parameterized method.
		super.familyName = "ShahJahan";
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Family Name: " + familyName);
		System.out.println("Daughter's birth month is on: " + birthMonth + "\nAge: " + age);

	}

}
