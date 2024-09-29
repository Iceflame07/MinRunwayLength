import java.util.Scanner;
public class scoresCounter{
  public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter scoresCounter:");
	int number = input.nextInt();

	int[] scoresCounter = new int[number];

	for(int i = 0; i < number; i++) {
		System.out.print("Enter index:");
		int score = input.nextInt();
		scoresCounter[i] = score;
        }

	for(int i = 0; i < number; i++) {
		System.out.print(scoresCounter[i]);
	}

  }
	
}