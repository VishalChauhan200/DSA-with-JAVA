import java.util.Scanner;
public class A_HELLO {

    public static void main(String[] args) {
       
        int square;
      
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number :");
        int a=sc.nextInt();
        square=a*a;
    
        System.out.println("square is:"+square);
    }
}