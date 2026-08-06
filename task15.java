import java.util.*;

public class task15 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(" Enter temperature in Celsius :  ");
        double C = input.nextDouble();

        double formula = ((C * 9 / 5) + 32);

        System.out.println(C + " C = " + formula + " F ");
    }
}