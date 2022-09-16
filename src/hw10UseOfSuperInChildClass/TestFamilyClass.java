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
		//System.out.println("<^<^<^<^<^<^<^>");

		/*
		 * Father f = new Father(); System.out.println("<-------------->"); Father f1 =
		 * new Father("Mohammed", 70, 'M', true);
		 * System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_"); f1.father();
		 * System.out.println("----------------------"); f1.fatherInfo("Mohammed", 70,
		 * 'M', true);
		 */

	}

}
