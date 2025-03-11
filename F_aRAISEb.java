import java.util.Scanner;
public class F_aRAISEb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =2;
        int b = 5;
        int ans = 1;

        for(int i = 1 ; i <=b;i++){
            ans = ans*a;
        }
        System.out.println("ans of a^b : "+ans);
    }
}
