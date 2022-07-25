import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        double pi=3.141592;
        double r,area;
        System.out.println("Enter the radius of circle:");
        Scanner radius=new Scanner(System.in);
        r=radius.nextFloat();
        area=pi*r*r;
        System.out.println("Area of circle=pi*radius^2");
        System.out.println("Radius= "+ r);
        System.out.println("Area of circle= "+area);

    }
}
