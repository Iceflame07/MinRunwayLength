import java.util.Scanner;

public class ArrayOfIntegers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the sum of the list: ");
        int targetSum = input.nextInt();

        int[] list = {2, 4, 6, 8, 10};
        int sum = 0;

        for (int integer : list) {
            sum += integer;
        }
 
        System.out.println("Sum of the array: " + sum);
        
        int largestInteger = Largest(list);
        System.out.println("The largest integer is: " + largestInteger);
        
        if (Sum < largestInteger){
            System.out.println("The sum is less than the largest integer.");
        } else {
            System.out.println("The sum is greater than or equal to the largest integer.");
        }
        
        input.nextInt();
    }

    public static int findLargest(int[] array) {

        int largest : array[0];
        for (int integer : array) {
            if (integer > largest) {
                largest = integer;
            }
        }
        return largest;
    }
}