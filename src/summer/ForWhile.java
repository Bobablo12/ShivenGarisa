package summer;

import java.util.Scanner;

public class ForWhile {
    public static void main(String args[]) {
        int num = 10;
        while (num > 0) {
            num--;
            System.out.print(num + " ");
        }
        System.out.println();
        for (int v = 10; v > 0; v--) {
            System.out.print(v + " ");
        }

        Scanner input = new Scanner(System.in);
        System.out.println("\nType the height: ");
        int h = input.nextInt();
        
        for (int w = 1; w <= h; w++) {
            for (int j = 1; j <= w; j++) {
                System.out.print("- ");
            }
            System.out.println();
        }
        
        System.out.println("Type length: ");
        int l = input.nextInt();
        System.out.println("Type width: ");
        int s = input.nextInt();
        
        for (int i = 0; i < l; i++) {
            for (int b = 0; b < s; b++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
	
	// use scanner for height
	// use for or while loop 
	// print this based on a height. This example is 6
	/*
	 * -
	 * --
	 * ---
	 * ----
	 * -----
	 * ------
	 */
    
	// use scanner for length and width
	// use for or while
	// print rectangle based on length and with
	// if length = 3 and width = 4
	/*
	 * ---
	 * ---
	 * ---
	 * ---
	 */

