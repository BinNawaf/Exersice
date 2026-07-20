import java.util.*;

public class task7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" Enter total second :  ");

        int totalSeconds = input.nextInt();
        int hours = totalSeconds / 3600;
        int alba8i = totalSeconds  % 3600;
        int minutes = alba8i / 60;
        int seconds = alba8i %60;

        System.out.println(totalSeconds + " seconds (s)  = " + hours + " hours (s) " + minutes + " minute (s) " + seconds + " second (s) ");

    }
}