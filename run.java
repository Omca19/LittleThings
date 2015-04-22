import java.lang.Runnable;

/**
 * Example of how to indirectly pass a method as a param into another
 * method. PS I'm cool
 * 
 * @author Oisin
 *
 */

public class run {
	public static void main(String[] args) {
        // Here, we can declare a little bundle of code
        Runnable r = new Runnable() {
            public void run() {
                System.out.println("Hello, world!");
            }
        };

        // It won't do anything though until we tell it
        r.run();

        // Even cooler, we can pass runnables into other functions.
        // It basically lets us bundle in a bunch of actions!
        Runnable sayDone = new Runnable() {
            public void run() {
                System.out.println("Done!");
            }
        };
        doComplexThing(sayDone);
    }

	private static void doComplexThing(Runnable r) {
		try {
		    Thread.sleep(4000); //1000 is 1 second     
	        r.run();
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
    }
}
