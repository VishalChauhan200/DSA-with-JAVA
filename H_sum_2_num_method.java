import java.util.Scanner;

class Algebra {
    int add (int a, int b ){
        int ans =  a+ b;
        return ans;
    }
}

public class H_sum_2_num_method {
    public static void main(String[] args) {

          Algebra obj = new Algebra();
          Scanner sc = new Scanner(System.in);
          System.out.println("enter the value of a");
          int a = sc.nextInt();
          System.out.println("enter the value of b");
          int b = sc.nextInt();

          System.out.println("sum of two integer is :");
          int ans = obj.add(a,b);
          System.out.println(ans);
    }
    
}