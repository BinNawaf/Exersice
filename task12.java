import java.util.*;

public class task12{
static Scanner input = new Scanner (System.in);
    public static void main(String[] args) {
        System.out.println(" Enter principal :  ");
        double principal = input.nextDouble();

        System.out.println(" Enter annual interest rate (%) :  ");
        double annualRate = input.nextDouble();

        System.out.println(" Enter time in years :  ");
        int years = input.nextInt();

        double rateInDecimal = annualRate / 100.0;
        double interest = principal * rateInDecimal * years;
        double totalAmount = principal + interest;

        System.out.println(" Interest earned = " + interest);
        System.out.println("Total amount = " + totalAmount);
    }
}