import java.util.Scanner;

	public class Scores {
 	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);

	System.out.print("collect scoreNumbers: ");
	 int score = scanner.nextInt();

 	  if (score < 50) {
	  System.out.println("user has failed");
	}
	  else{
	 if (score >= 50) {
	System.out.println("user has passed");
      }
	}
	System.out.print(score);


	}

}