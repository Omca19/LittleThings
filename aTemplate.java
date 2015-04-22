import java.util.*;

public class A {
	private static boolean print = false;
	
	public static void main(String[] args) {
		solve();
	}

	public static void solve() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); in.nextLine();

		for(int i = 0; i < n; i++) {
			String[] line = in.nextLine().split(" ");
			int[] array = new int[line.length];
			for(int j = 0; j < array.length; j++) {
				array[j] = Integer.parseInt(line[j]);
			}
			printArray(array);









			
			
		
		}
	}

	public static void printArray(int[] array) {
		if(print) System.out.println(Arrays.toString(array));
	}

	public static void printArray(int[][] array) {
		if(print) System.out.println(Arrays.deepToString(array));
	}

	public static void printArray(String[] array) {
		if(print) System.out.println(Arrays.toString(array));
	}

	public static void printArray(String[][] array) {
		if(print) System.out.println(Arrays.deepToString(array));
	}
}
