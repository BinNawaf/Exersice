
// حاسبة العمر
// Age Calculator

import java.util.*;

public class task1{

public static void main ( String[] args) {

Scanner input = new Scanner(System.in);

System.out.println("Enter the current Year");
double currentYear = input.nextDouble();

System.out.println("Enter the birth Year");
double birthYear = input.nextDouble();

double age = currentYear - birthYear;

System.out.println("Age = " + age);
}     

}

