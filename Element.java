import java.util.Scanner;
   public class Element {
      public static void main(String[] args) {

	int[] listOfElement = {1, 2, 3, 10, 13, 34};

	Scanner input = new Scanner(System.in);
	int largest = Integer.MIN_VALUE;

	   for(int i = 0; i < listOfElement.length; i++) {
		int element = input.nextInt();
	      if(largest > element) {
		  largest = element;
	}
	}
	        System.out.println("Zhe largest element is: " + largest);

   }

}