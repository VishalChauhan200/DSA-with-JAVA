import java.util.Scanner;
public class F_While_numadd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        // to print the numbers by taking input
        /* 
        System.out.println("Enter the value of n :");
        int n = sc.nextInt();

        int num = 1;

        while (num <= n) {
            System.out.println("num :"+num );
            num++;
        } */

        //print sum of first n natural number

        System.out.println("enter the value of n :");

        int n = sc.nextInt();

        int sum= 0;
        int num= 1;

        while(num<=n){
            System.out.println(num);
            sum = sum +num;
            num++;
        }
        System.out.println(sum);
    }
}
