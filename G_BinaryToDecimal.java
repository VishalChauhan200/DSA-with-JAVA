import java.util.*;
public class G_BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("enter binary num :");
        int binary_num = sc.nextInt();
        
        int ans = 0;
        int pow = 1;

        while (binary_num>0){
            int unit_digit = binary_num%10;
            ans = ans +(unit_digit*pow);
            binary_num = binary_num/10;
            pow = pow*2;
        }
        System.out.println(ans);*/

        System.out.println("Enter Decimal number :");
        int decimal_num = sc.nextInt();

        int ans = 0;
        int pow = 1;
        
        while (decimal_num>0){        
            int parity = decimal_num%2;
            ans = ans +(parity*pow);
            pow = pow * 10;
            decimal_num=decimal_num/2;
            
        }
        System.out.println(ans);




    }
}
