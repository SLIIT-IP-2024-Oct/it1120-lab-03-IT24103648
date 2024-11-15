import java.util.Scanner;

public class IT24103648Lab3Q1A {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
         System.out.print("Enter the price per kilogram of rice: ");
         double pricePerKg = input.nextDouble();
        
        System.out.print("Enter the number of kilograms you want to buy: ");
        double quantityKg = input.nextDouble();
        
        
        double totalAmount = pricePerKg * quantityKg;
        
       
        System.out.println(totalAmount);
        
        
        input.close();
    }
}