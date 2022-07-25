import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        float side,area;
        System.out.println("enter the side of square:");
        Scanner side1=new Scanner(System.in);
        side=side1.nextFloat();
        area=side*side;
        System.out.println("Area of spuare "+area);
    }
}
