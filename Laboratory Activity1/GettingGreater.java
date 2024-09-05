import java.util.Scanner;

class GettingGreater{
    public static void main(String args[]){
        System.out.println("Getting the Greater Value");
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first character: ");
        char ch1 = input.next().charAt(0);
        int num1 = (int)ch1;
        System.out.print("Enter the second character:");
        char ch2 = input.next().charAt(0);
        int num2 = (int)ch2;
        System.out.println("------------------------------");
        System.out.println("The character greater value is: "+ (char)Math.max(ch1,ch2));
        System.out.println("------------------------------");

        System.out.println("Showing the ASCII Codes");
        System.out.println(ch1 + ":" + num1);
        System.out.println(ch2 + ":" + num2);

        
    }
}