import java.util.*;

public class task26 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print(" Enter item price :  ");
        double price = input.nextDouble();

        System.out.print(" Enter quantity :  ");
        double quantity = input.nextDouble();


        System.out.print(" Enter sales tax rate (%) :  ");
        double rate = input.nextDouble();
        
        double totalWithOutTax = price * quantity;
        double tax = totalWithOutTax * (rate / 100.0);

        double total = totalWithOutTax + tax ; 

        System.out.println(" total cost =  " + total);


    }

}
