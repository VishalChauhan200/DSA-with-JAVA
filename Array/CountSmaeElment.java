package Array;


import java.util.Scanner;


public class CountSmaeElment 
    {   
        static int findSameNum(int x){
        int arr[] = {11,22,33,44,543,44,55,66,44,77,12,44};
        int count =0;

        for(int i = 0; i< arr.length; i++){
            if (arr[i] == x){
            count++;
        }
    }
         return count;
      
    }
        public static void main(String[] args) 
        {   
            Scanner sc =  new Scanner(System.in);
            int x = sc.nextInt();

           
           System.out.println("Element found in Array "+findSameNum(x)+ " times");
        }
    }