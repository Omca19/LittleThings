package Stuff;

import java.io.IOException;
/**
 * 
 * Example to reference classes from other packages
 * 
 */
import LittleThings.addText;

public class fromAnotherPackage extends addText {
	public static void main(String[] args) throws IOException {
		addText now = new addText();
		
		now.addTo("C:\\test\\two.txt","I work?");
	}

}
