import java.util.Scanner;
public class F_count_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int  n = sc.nextInt();
       // int sumofdigits = 0;
        int numofdigits=0;
        int orignal_n= n;

        // count number
        
          while(n>0){
           n = n/10;
            numofdigits++;
          }
         System.out.println(numofdigits);


        // sumofnumber
       /*  while(n >0){
            sumofdigits += n%10;
            n /= 10;
           
        }
       System.out.println("sum of "+orignal_n +"="+ sumofdigits );
*/
    }
}