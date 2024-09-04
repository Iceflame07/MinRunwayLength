import java.util.Scanner;

	public class Score1 {
 		
		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			int count = 0;

		while (count < 10){

			System.out.print("collect scoreNumbers: ");
	 		int score = scanner.nextInt();

 	 		if (score < 50) {
	  		  System.out.println("user has failed");
			}
	  		else{
	 		   if (score >= 50) {
			  System.out.println("user has passed");
     			 }

			}count = count + 1;
			

	}

}

}