import java.util.Score;

    public class ScoreNumber {
    public static void main(String[] args) {

	  Score score = new Score(System.in);

	  System.out.print("Guess ScoreNumber between 27 and maximum; ");
	  int number = score.nextInt();

	  if(number == 27) {
	  System.out.println("weldone");

	}

	  else {

	    System.out.println("wrong number");
	}


}


}