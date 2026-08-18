import java.util.*;

public class task22 {

    static Scanner input = new Scanner(System.in); 

    public static void main(String[] args) {

        System.out.println(" Enter first number : ");
        int first = input.nextInt();

        System.out.println(" Enter second number : ");
        int second = input.nextInt();


        int temp = first;
        first = second;
        second = temp;


        System.out.println(" After swapping : " + "\n first = " + first + "\n second " + second);



        

    }
}
