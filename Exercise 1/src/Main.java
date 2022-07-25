import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the salary of Employee:");
        float sal=sc.nextFloat();
        System.out.println("Enter the working hours of Employee");
        float no_of_hours=sc.nextFloat();

        Employee emp=new Employee();
        emp.getinfo(sal,no_of_hours);
        emp.addsal();
        emp.addwork();
        emp.printsal();

    }
}