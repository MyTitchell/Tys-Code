package YoutubePractice;
import java.util.Scanner;
public class LogicalOperators {

	public static void main(String[] args) {

		//Logical operators are used to connect to or more expressions
		
		//		&& = (AND) both conditions must be true
		//		|| = (OR) either condition must be true
		// 		! = (NOT) reverse boolean value of condition
		
		int temp = 25;
		 
		if(temp>30) {
			System.out.println("It is hot outside! ");	
		}
		
		else if (temp>=20 && temp<=30) {
			System.out.println("It is warm outside");
		}
		
		else {
			System.out.println("It is cold outside");
		}
			} 

	}
