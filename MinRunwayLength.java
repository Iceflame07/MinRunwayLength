import java.util.Scanner;

public class MinRunwayLength {
public static void main(string[] arg){

Scanner input = new scanner(System.in);

		System.out.print("Enter speed:");
	double speed = input.nextDouble();

		System.out.print("Enter acceleration:");
	double acceleration = input.nextDouble();

		System.out.print("Enter meterPerSecond:");
	double meterPerSecond = input.nextDouble();

	Double MinRunwayLength = acceleration * meterPerSecond * Math.
pow(1.0035,12);
		System.out.print("Acceleration" + MinRunwayLength);		
}
}