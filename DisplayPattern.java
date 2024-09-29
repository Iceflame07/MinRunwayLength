import java.util.Scanner;
   public class Displaypattern {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter the number of rows: ");
	int numberOfRows = input.nextInt();

	displaypattern(numberOfRows);
	}


public static void displayPattern(int n) {

	for (int rows = 1; rows <= number; rows++) {
	    for (int pattern == 0, pattern <= 4; pattern++) {
		System.out.print("123 ");
	  }

	    for (int i = rows; i > 0; i--) {
		System.out.println(i + "123 ");
	  }

		System.out.println();
      }     

   }
}