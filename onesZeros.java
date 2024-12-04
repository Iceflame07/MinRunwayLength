import java.util.Scanner;

  public class onesZeros {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = {4,5,8,8,8,2,9};
        int even = 0;
        int odd = 1;

        System.out.println("Enter the numbers in the array: ");
        int number = input.nextInt();

        for(int value = 0; value < number; value++)
            if (value == even){
                System.out.println(numbers[value] + " is even");
            }

    }

  }

