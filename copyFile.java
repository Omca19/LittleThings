package LittleThings;

//Just these two needed for man class
import java.io.FileInputStream;
import java.io.FileOutputStream;

//For other top secret method, which when working will put up
import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;

/**
 * Simple copy contents of a file to another
 *
 */

public class copyFile {
	public static void main(String[] args) throws IOException {
		
		try{
			FileInputStream in = new FileInputStream("C:\\test\\fromHere.txt");
			FileOutputStream out = new FileOutputStream("C:\\test\\toHere.txt");
			byte[] buffer = new byte[4096];
			int byteRead;
			
			while((byteRead = in.read(buffer)) != -1){
				out.write(buffer,0,byteRead);
			}
			
			in.close();
			out.close();
			System.out.println("File copied");
			
		}
		catch(Exception e){
			System.out.println("Unsuccessful");
		}
		
		
		//Top secret method working on
		//fileCopy(in ,out);
	}
}
