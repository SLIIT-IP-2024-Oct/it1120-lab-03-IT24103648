import java.util.Scanner;

public class IT24103648Lab3Q2 {
    public static void main(String[] args) {
        Scanner salary = new Scanner(System.in);
        System.out.print("Enter the monthly salary: ");
        double monthlySalary = salary.nextDouble();
        
        
        System.out.print("Enter the number of OT hours: ");
        double otHours = salary.nextDouble();
        
        System.out.print("Enter the OT hourly rate: ");
        double otHourlyRate = salary.nextDouble();
        
        double otAmount = otHours * otHourlyRate;
        
        
        double totalSalary = monthlySalary + otAmount;
        
       
        System.out.print( otAmount);
        System.out.print(totalSalary);
        
        
        salary.close();
    }
}