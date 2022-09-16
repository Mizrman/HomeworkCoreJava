package hw10UseOfSuperInChildClass;

public class TestFamilyClass {
	public static void main(String[] args) {
		Daughter d = new Daughter();
		System.out.println("~^~^~^~^~^~^~^~^~^~^~^~^~^~\n");
		Daughter d1 = new Daughter("January", 5);
		System.out.println("-------------------");
		d1.daughter();
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
		d1.daughterInfo("January", 5);

	}

}
