package LittleThings;

/**
 * Examples of relatively quick ways to read in files
 * 
 * 
 */

//Method1
import java.util.Scanner;
import java.io.File;

//Method2
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class quickInput {
	public static void main(String[] args) throws IOException {
		
		//Method1 ....... @SuppressWarnings() is just to remove a thing annoying me
		@SuppressWarnings("resource")
		String content1 = new Scanner(new File("src/LittleThings/example")).useDelimiter("\\Z").next();
		System.out.println(content1);
		
		//Method2
		String content2 =new String(Files.readAllBytes(Paths.get("src/LittleThings/example")));
		System.out.println(content2);
	}
}
