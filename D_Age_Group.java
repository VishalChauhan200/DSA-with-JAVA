import java.util.Scanner;

 public class D_Age_Group {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enteer Age :");
        int Age= sc.nextInt();
         

         if( Age < 12){
            System.out.println("Child");
         }
         else if(Age > 18){
            System.out.println("Adult");
         }
         else {
            System.out.println("Teenager");
         }
    }
 }