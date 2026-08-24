import java.util.* ;
public class task24 {

    static Scanner input = new Scanner(System.in) ;
    
    public static void main(String[] args) {
        
        System.out.println("Enter sphere radius : ");
        double radius = input.nextDouble(); 

        double V = ((4.0 / 3.0 ) * Math.PI * Math.pow(radius, 3)) ; 

        double A = ((4 * Math.PI * Math.pow(radius, 2)))  ; 

        System.out.println("Volume = " + V);
        System.out.println("Surface Area = " + A);
    }
}