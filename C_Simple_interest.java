
import java.util.Scanner;

public class C_Simple_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          
            System.out.println("enter principle :");
            float pr = sc.nextFloat();

            System.out.println("Enter the rate of interest :");
            float ra = sc.nextFloat();

            System.out.println("Enter time :");
            float tm = sc.nextFloat();

            float result = (pr*ra*tm)/100;

            System.out.println("Enter Principle :"+ pr);
            System.out.println("Enter rate of Interest :"+ ra);
            System.out.println("Enter Time :"+ tm);

            System.out.println("Simple Intrest :"+ result);







    }
    
}
