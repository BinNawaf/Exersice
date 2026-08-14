import java.util.*;

public class task20 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println(" Enter a character is : ");
        String abood = input.next();
        char ch = abood.charAt(0);
        int asciicode = (int) ch;

        System.out.println(" The ASCII code is : " + asciicode);
    }
    
}
