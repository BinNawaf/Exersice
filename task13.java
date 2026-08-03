import java.util.*;

public class task13 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        abood();

    }

    public static void abood() {
        System.out.println(" Enter x1 , x2 , y1 , y2 :  ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double m = ((y2 - y1) / (x2 - x1));
        System.out.println(" Slope = " + m);
    }

}
