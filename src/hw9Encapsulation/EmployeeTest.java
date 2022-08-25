package hw9Encapsulation;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Mizan");
		employee.setAge(19);
		employee.setSex('M');
		employee.setUsCitizen(true);

		System.out.println("Name of the employee: " + employee.getName() + "\nAge: " + employee.getAge() + "\nSex: "
				+ employee.getSex() + "\nIs employee a U.S. citizen?: " + employee.isUsCitizen());
	}

}
