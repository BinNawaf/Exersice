import java.util.*;

public class task14 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(" Enter weight (kg) : ");
        double weight = input.nextDouble();

        System.out.println(" Enter height (m) :  ");
        double height = input.nextDouble();

        double BMI = weight / Math.pow(height, 2);

        System.out.println(" BMI =  " + BMI);

    }
}