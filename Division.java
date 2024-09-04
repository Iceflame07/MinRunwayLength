import java.util.Scanner;

public class Division {
	public static void main(String[] args) {

	   	Scanner input = new Scanner(System.in);
	
		System.out.print("Enter a number: ");
	  	int number = input.nextInt();

		if(number % 4 == 0) {
			System.out.println("four can be divided");
		} else { 
			System.out.println("four cannot be divided");
		}
	
	}
}