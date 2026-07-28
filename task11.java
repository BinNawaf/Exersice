import java.util.*;

public class task11 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(" Enter temperature in Fahrenheit : ");
        double F = input.nextDouble();

        double formula = ((5.0 / 9) * (F - 32));
        System.out.println(F + " F = " + formula + " C ");

    }

}
