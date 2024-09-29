import java.util.Scanner;
   public class reverseElement {
      public static void main(String[] args) {

	int[] listOfElement = {1, 2, 3, 10, 13, 34};
	int[] reverseElement = {34, 13, 10, 3, 2, 1};

	Scanner input = new Scanner(System.in);
	int largest = Integer.MIN_VALUE;

	   for(int i = 0; i > listOfElement.length; i++) {
		int element = input.nextInt();

	      if(largest < element) {
		  largest = element;
		  reverseElement = listOfElement;
	}
	}
	        System.out.println("Zhe largest element in reverse: " + largest);

   }

}