package summer;
import java.util.Scanner;

public class Imtro {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
	    System.out.print("Insert a number: ");
	    int number = input.nextInt();
	    System.out.print("Insert a number: ");
	    int num = input.nextInt();
        int area = num*number;
        System.out.println(area);

	    input.nextLine(); // This line you have to add (It consumes the \n character)
        System.out.println("Insert a word: ");
        String hi = input.nextLine();
        System.out.println("Insert a word: ");
        String whats = input.nextLine();
        System.out.println("Insert a word: ");
        String up = input.nextLine();
        String sen = hi + " " + whats + " " + up + ".";
        System.out.println(sen);
	    

	    // find the area of rectangle with 2 integers after scanning
	    // print 3 strings after scanning them

	}
}
