import java.util.*;

public class task25 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print(" Enter v0 , v1 and time : ");

        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();


        double formula = (v1 - v0)/ t;

        System.out.println(  "Average accleration = " + formula + " m/s^2 ");

    }

}
