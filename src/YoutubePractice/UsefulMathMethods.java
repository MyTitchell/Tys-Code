package YoutubePractice;
import java.util.Scanner;
public class UsefulMathMethods {

	public static void main(String[] args) {

		//double x = 3.14;
		//double y = -10;
		
		
		//double z = Math.round(x);
		//double z = Math.sqrt(y);		// Square roots
		//double z = Math.abs(x, y);	// number without negative
		//double z = Math.max(x, y);   //compares both values to see which is higher
		//System.out.println(z);
		
		double x; 
		double y;
		double z;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter side x: ");
		x = scanner.nextDouble();
		System.out.println("Enter side y: ");
		y = scanner.nextDouble();
		
		z = Math.sqrt((x * x) + (y * y));
		
		System.out.println("The hypotenuse is: " + z);
		
		scanner.close();
		
	}

}
