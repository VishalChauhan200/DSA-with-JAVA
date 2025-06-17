package Array;



import java.util.Scanner;


public class findelement
    {   
        public void  findmaxelement(int x){
        int arr[] = {11,22,33,44,543,44,55,66,77,12};
        int ans =-1;

        for(int i = 1; i< arr.length; i++)
        {
            if (arr[i] == x)
            {
            ans  = i;
           System.out.println("element found :" + i);
             }
       }
            
            if (ans == -1 )
            System.out.println(-1);
         
      
    }
        public static void main(String[] args) 
        {   
            Scanner sc =  new Scanner(System.in);
            System.out.println("Enter the  value of x");
            int x = sc.nextInt();
         

           findelement obj = new findelement();
           obj.findmaxelement(x);
        }
    }