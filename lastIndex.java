package LittleThings;

/**
 * Examples of the method .lastIndexOf
 */

public class lastIndex {
	public static void main(String[] args) {
		String test = "This is a test";
	    String firstWords = test.substring(0, test.lastIndexOf(" "));
	    String lastWord = test.substring(test.lastIndexOf(" ") + 1);
	    
	    System.out.println(firstWords+"\n"+lastWord);
	}
}
