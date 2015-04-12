package LittleThings;

import java.io.IOException;

/**
 * Whenever I need to add text to a file
 *
 */

public class callAddTo extends addText{
	public static void main(String[] args) throws IOException {
		addText now = new addText();
		
		now.addTo("C:\\test\\one.txt","I work?");
	}

}
