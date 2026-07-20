import java.util.*;

public class task9 {

    public static void main(String[] args) {
        Scanner dhoom = new Scanner(System.in);

        System.out.println(" Enter 3 digits number :");
        int number = dhoom.nextInt();

        int lastDigit = number % 10;
        int alba8i = number / 10;
        int middleDigit = alba8i % 10;
        int firstDigit = alba8i / 10;

        int sum = firstDigit + middleDigit + lastDigit;
        System.out.println(" sum of Digits = " + sum);

    }
}