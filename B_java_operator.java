public class B_java_operator {

    public static void main(String[] args) {
        //Arthimatic operator.

                  int p= 20, q=20;
                  System.out.println("Arthimatic operator");

                  System.out.println(p+q);
                  System.out.println(p-q);
                  System.out.println(p/q);
                  System.out.println(p*q);
                  System.out.println(p%q);
                  System.out.println(p++);
                  System.out.println(q--);

        //Relational operators
                   
                   int r =10, s=15;
                   System.out.println("Relational operator");
           
                   System.out.println(r == s); //False
                   System.out.println(r != s); //True
                   System.out.println(r <= s); //True
                   System.out.println(r >= s); //False
                   System.out.println(r < s);  //True
                   System.out.println(r > s);  //False

        //Logical operator

                  int l=15, n = 10, m=5;
                  System.out.println("Logical operator");
                  
                  // && Operator
                  System.out.println((l>n) && (n<m)); //False
                  System.out.println((l>n) && (n>m)); //True
                  
                  // || operator
                  System.out.println((l>n) || (n<m)); //True
                  System.out.println((l>n) || (n>m)); //True
                  System.out.println((l<n) || (n<m)); //False
                   
                  // ! Operator
                  System.out.println(!(l == n)); //True
                  System.out.println(!(l > n)); //False
          
        // Assignment operator
                
                int a = 10;
                int b;
                System.out.println("Assignment operator");


                // = Equal to 
                b = a;
                System.out.println(b); //10

                // += 
                a+=b; // a= a+b, a= 10+10= 20
                System.out.println(a); //20

                // -=
                a-=b; // a = a-b, 20-10 = 10
                System.out.println(a); //10

                // *=
                a*=b; // a*b, 10*10= 100
                System.out.println(a); //100

                // /=
                a/=b; // a/b, 100/10= 10
                System.out.println(a); //10 

        
        // Unary operator
               
                int f= 5,t= 5;
                System.out.println("Unary operator");

                System.out.println(f++); //5
                System.out.println(f); //6

                System.out.println(++t); //6
                System.out.println(t); //5 

        // Bitwise operator 
                
                int x =9 , z=10;
                System.out.println("Bitwise operator");

                System.out.println(x | z); //11
                System.out.println(x & z); //8
                System.out.println(x ^ z); //3

                System.out.println(x<<1); //18
                System.out.println(x<<2); //36

                System.out.println(z>>1); //5
                System.out.println(z>>2); //2

    }
}