import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the multiplication table: ");
        int maxNumber = scanner.nextInt();
        int[][] table = new int[maxNumber + 1][maxNumber + 1];

        for (int i = 0; i <= maxNumber; i++) {
            for (int j = 0; j <= maxNumber; j++) {
                table[i][j] = i * j;
            }
        }
        System.out.println("Multiplication Table:");
        for (int i = 1; i <= maxNumber; i++) {
            for (int j = 1; j <= maxNumber; j++) {
                System.out.printf("%4d", table[i][j]); 
            }
            System.out.println(); 
        }
        scanner.close(); 
    }
}
