package hw10Abstraction;

public interface University extends College, Hospital {
	/* Two keywords used for the inheritance in interface
	 * An interface can inherit one to multiple interfaces by using keyword 'extends'
	 * An interface can not inherit a regular class or abstract class
	 */
 //Line#3 interface University extends to inherit College, and University inheritance
	public void classSize();
	public void playGround();
	public void teacher();
	// public University() {} ----> Interface can not have constructors because
	// there is no object to be created.
	default void gymnasium() {
	}
	public static void library() {
	}

}
