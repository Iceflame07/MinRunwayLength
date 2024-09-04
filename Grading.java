import java.util.Scanner;

	public class Grading {
 		
		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			int count = 1;

		while (count < 20){

			System.out.print("collect scoreNumbers: ");
	 		int score = scanner.nextInt();

 	 		if (score < 60) {
	  		  System.out.println("you don't pass the exam");
			}
	  		else{
	 		   if (score >= 60) {
			  System.out.println("you pass the exam");
     			 }

			}count = count + 1;
			

	}

}

}