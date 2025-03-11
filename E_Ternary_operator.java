 import java.util.Scanner;
 public class E_Ternary_operator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the number:");
            int num = sc.nextInt();

            String ans;
            ans = (num %2 == 0) ? "even" : " odd";
            System.out.println("Ans is :"+ ans);
        
    }
}
