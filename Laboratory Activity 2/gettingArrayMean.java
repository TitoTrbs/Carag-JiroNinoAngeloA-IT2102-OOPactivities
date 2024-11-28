import java.util.Scanner;

public class gettingArrayMean { 
    public static double getArrayMean(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num; 
        }
        return (double) sum / array.length;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: " );
            numbers[i] = scanner.nextInt();
        }

        double mean = getArrayMean(numbers);

        System.out.println("Mean of array is: " + mean);

        scanner.close();
    }
}
