import java.util.Scanner;

public class IT24103648Lab3Q4 {
    public static void main(String[] args) {
        
        Scanner digit = new Scanner(System.in);
        
        
        System.out.print("Enter a five-digit number: ");
        int number = digit.nextInt();
        
        
        if (number < 10000 || number > 99999) {
            System.out.println("Error: Please enter a valid five-digit number.");
        } else {
            // Separate each digit
            int digit1 = number / 10000;
            int digit2 = (number / 1000) % 10;
            int digit3 = (number / 100) % 10;
            int digit4 = (number / 10) % 10;
            int digit5 = number % 10;
            
            
            System.out.printf("%d %d %d %d %d\n", digit1, digit2, digit3, digit4, digit5);
        }
        
        
        digit.close();
    }
}