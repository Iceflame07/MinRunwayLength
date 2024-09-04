import java.util.Scanner;

    public class RandomNumber {
    public static void main(String[] args) {

	  Scanner scanner = new Scanner(System.in);

	  System.out.print("Generate RandomNumber between 1 and 10; ");
	  int number = scanner.nextInt();
	
	  if(number == 7) {
	     System.out.println("Good job");
       }
	  else   {
	     System.out.println("wrong number");	

       }


    }



}