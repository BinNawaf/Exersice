import java.util.*;

public class task17 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Long miliSecond = System.currentTimeMillis();
        Long totalSecond = miliSecond / 1000;
        int currentSecond = (int) (totalSecond % 60);
        Long totalMinutes = totalSecond / 60;
        int currentMinutes = (int) (totalMinutes % 60);
        Long totalHours = totalMinutes / 60;
        int currentHours = (int) (totalHours % 24);

        System.out.println(" Current time (GMT) :  " + currentHours + " : " + currentMinutes + " : " + currentSecond );

    }
}