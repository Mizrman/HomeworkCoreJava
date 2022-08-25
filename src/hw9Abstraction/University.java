package hw9Abstraction;

public interface University extends College, Hospital {
/* Line#3 interface University extends to inherit College, and University inheritance*/
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
