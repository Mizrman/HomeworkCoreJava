package hw10UseOfSuperInChildClass;

public class Father {
	String name;
	int age;
	char sex;
	boolean usCitizen;
	String familyName;

	public Father() {
		System.out.println("Default Constructor from Father Class!");

	}

	public Father(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println(
				"Father's name: " + name + "\nHis age: " + age + "\nSex: " + sex + "\nHe's a ciizen: " + usCitizen);
	}

	public void father() {
		System.out.println("This is from Father Method!");
	}

	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("Name: " + name + "\nAge: " + age + "\nSex: " + sex + "\nIs a U.S. citizen?: " + usCitizen);

	}

}
