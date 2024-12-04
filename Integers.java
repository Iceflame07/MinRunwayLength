  import java.util.Scanner;

	public class Integers{
	public static void main(String[] arg){
   
    	Scanner input = new Scanner(System.in);

  		System.out.println("number 1");
	    double numberOne = input.nextDouble();

		System.out.println("number 2");
        double numberTwo = input.nextDouble();

		if (numberOne == numberTwo){
			System.out.println("the two numbers are equal");
	    } else if (numberOne > numberTwo){
			System.out.println("the two numbers are equal");
		} else if (numberTwo < numberOne){
			System.out.println("the numbers are equal");
		} else {
			System.out.println("invalid");

	  }
	}
	};