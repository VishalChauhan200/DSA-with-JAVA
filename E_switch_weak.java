import java.util.Scanner;

public class E_switch_weak {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE DAY :");

        int day = sc.nextInt();
        
        switch (day) {
                case 1:
                System.out.println("MONDAY");
                break;
                case 2:
                System.out.println("TUESDAY");
                break;
                case 3:
                System.out.println("WEDDAY");
                break;
                case 4:
                System.out.println("THRUSDAY");
                break;
                case 5:
                System.out.println("FRIDAY");
                break;
                case 6:
                System.out.println("SATURDAY");
                break;
                case 7:
                System.out.println("SUNDAY");
                break;
            default:
                System.out.println("INVALID VALUE");
        }
     }
}
