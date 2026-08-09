import java.util.*;

public class task16 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(" Enter total minutes :  ");
        int minutes = input.nextInt();

        final int totalInYears = 525600 ; 
        final int totalminutesInDay = 1440 ;

        int years = minutes / totalInYears;
        int remaining = minutes % totalInYears ; 
        int days = remaining / totalminutesInDay ;

        System.out.println( minutes+ " minutes is approximately "+years+" year(s) and "+days+" days(s) ");
        
    }
}
