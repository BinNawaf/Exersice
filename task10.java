import java.util.*;

public class task10{
static Scanner dhoom = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(" Enter five numbers :  ");
        double num1 = dhoom.nextDouble();
        double num2 = dhoom.nextDouble();
        double num3 = dhoom.nextDouble();
        double num4 = dhoom.nextDouble();
        double num5 = dhoom.nextDouble();

        double average = ( num1 + num2 + num3 + num4 + num5 ) / 5.0;

        System.out.println(" Average = " + average);


    }
}