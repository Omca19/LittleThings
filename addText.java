package LittleThings;

/**
 * example of FileWriter
 * 
 * test file original content: "Am I empty?: "
 * 
 * After run "Am I empty?: No"
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class addText {
	public static void main(String[] args) throws IOException {
		BufferedWriter out = null;
		try {
		    out = new BufferedWriter(new FileWriter("src/LittleThings/test", true));
		    out.write("No");
		} catch (IOException e) {
		    // error processing code
		} finally {
		    if (out != null) {
		        out.close();
		        System.out.println("Finished");
		    }
		}
	}
}
