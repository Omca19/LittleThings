package LittleThings;

/**
 * Gets the name of the current running method
 *	Prints:		    main
 *			    loop
 *			    loop
 *			    main
 *
 */

public class methodName {
	public static void main(String[] args) {
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println(methodName);
		loop(2);
		System.out.println(methodName);
	}
	
	
	static void loop(int k){
		for (int i = 0; i < k; i++) {
			String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
			System.out.println(methodName);
		}
	}
}
