import java.util.*;

public class task8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" Enter an amount in SAR : ");
        int amount = input.nextInt();
        int hundreds = amount / 100;
        int remainder = amount % 100;
        int fifties = remainder / 50;
        remainder = remainder % 50;
        int tens = remainder / 10;
        remainder = remainder % 10;
        int fives = remainder / 5;
        remainder = remainder % 5;
        int ones = remainder / 1;

        System.out.println(" Resolt = ");
        System.out.println("100 SAR : " + hundreds);
        System.out.println(" 50 SAR :" + fifties);
        System.out.println(" 10 SAR : " + tens);
        System.out.println(" 5 SAR : " + fives);
        System.out.println(" 1 SAR : " + ones);

    }
}