package summer;
import java.util.Scanner;
import java.lang.Math;
public class MathPractice {
	public static void main (String args[]) {
		//double k = Math.pow(j, i);
		//System.out.println(k);
		//int m = Math.abs(j);
		//System.out.println(m);
		//int n = Math.max(i, 5);
		//System.out.println(n);

		Scanner input = new Scanner(System.in);
		System.out.println("Type the radius: ");
		int r = input.nextInt();
		System.out.println("Type the height: ");
		int h = input.nextInt();
		System.out.println("Type the length: ");
		int l = input.nextInt();
		System.out.println("Type the width: ");
		int w = input.nextInt();
		System.out.println("Type the Base Area: ");
		int b = input.nextInt();
		double o = Math.sqrt(4);
		System.out.println(o);
		double area = Math.pow(r, 2)*Math.PI;
		System.out.println(area);
		double cy = Math.pow(r, 2)*h*Math.PI;
		System.out.println(cy);
		double sphere = Math.pow(r, 3)*(4/3)*Math.PI; 
		System.out.println(sphere);
		double py = (l*w*h)/3;
		System.out.println(py);
		double prism = l*w*b*0.5;
		System.out.println(prism);

		// area of circle (radius), volume of cylinder (height, radius), sphere
		// pyramid, triangular prism
		// grade calculator (use scanner to enter a grade), rock paper scissors
	}
}
