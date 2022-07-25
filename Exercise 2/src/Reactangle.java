import java.util.Scanner;
public class Reactangle {
    public static void main(String[] args) {
        float base,height;
        double area;
        System.out.println("base of reactangle:");
        Scanner base1=new Scanner(System.in);
        base=base1.nextFloat();
        System.out.println("height of reactangle:");
        height=base1.nextFloat();
        area=base*height;
        System.out.println("area of Reactangle"+area);

    }
}