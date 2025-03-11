import java.util.*;

public class F_Qs_while {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //print thr sum of the stream of integers in the input.


        int num = sc.nextInt();
        int sum = 0;

        while(num != 10){
            sum = sum + num ;
            num = sc.nextInt();

        }
        System.out.println(sum);

    }
}