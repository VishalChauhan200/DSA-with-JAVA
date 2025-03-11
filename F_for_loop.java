import java.util.Scanner;
public class F_for_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of n:");
        int n = sc.nextInt();

        System.out.println("Decrement value :");
        // decrement value loop
        for(int i = n;i>=1;i-- ){
            System.out.println(i);
        }

        System.out.println("Incerement value :");
        //Increment value loop
        for(int i = 1;i<=n;i++ ){
            System.out.println(i);
        }
    
    }
    
}
