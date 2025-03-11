public class G_ptrn_print {

    public static void main(String[] args) {
        
        //print pattern
        /* 
         *     ******
         *     ******
         *     ******    */
       /* for(int i=0; i<4;i++){
            for(int j = 0 ; j<6;j++){
                System.out.print("*");
            }System.out.println();
        } */
        
        //print pattern
        /*     ******
         *     *    *
         *     *    * 
         *     *    *
         *     ******      */
       /*  for(int i=0; i<5;i++){
            for(int j = 0 ; j<5;j++){
                if(i == 0 || i == 4 || j == 0 || j == 4)
                    System.out.print("*");
                else
                    System.out.print(" ");
                
            }System.out.println();
        } */
       

        //print pattern
        /*     *     
         *     **
         *     *** 
         *     ****     */
         /*for (int i = 4; i > 0; i--) {
             for(int j = 0; j <=i;j++){
                System.out.print("*");
             }
             System.out.println();
         }*/


        //print pattern
        /*      *
         *     ***
         *    ***** 
         *   *******    */
        /*for (int i = 1; i < 6; i++) {
            for(int j = 1; j <=5-i;j++){
               System.out.print(" ");
            }
            for(int k =1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }*/


        //print pattern
        /*  1234567
         *  2345671
         *  3456712
         *  4567123
         *  5671234
         *  6712345
         *  7123456   */ 
         /*int r = 7;
         for(int i=1; i<=r;i++){
            for(int j=i;j<=r;j++){
                System.out.print(j);
            }for(int k = 1;k<=i-1;k++){
                System.out.print(k);
            }
            System.out.println();
         }*/

         //print pattern 
         /*  123456
             123456
             123456
             123456   */
        /*for(int i = 1 ; i <=4; i++){
            for (int j = 1; j <= 6; j++){
                System.out.print(j);
            }
            System.out.println();
        }  
        
        //print pattern
        /* 123456
         * 1    6
         * 1    6
         * 123456  */
        /*for(int i = 1 ; i <=4; i++){
            for (int j = 1; j <= 6; j++){
                if(i == 1 || i == 4 || j == 1 || j == 6)
                    System.out.print(j);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }*/


        //PRINT PATTERN 
        /*   121212
         *   212121
         *   121212
         *   212121    */

        /*for (int i =1; i<=4;i++){
            for (int j =1 ; j<=6;j++){
                if((i+j)% 2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("2");
                }
            }
            System.out.println();
        } */

        //PRINT PATTERN
        /*   1
         *   12
         *   123
         *   1234   */
        
        /*for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
         }*/


         //PRINT PATTERN
         /*       1
                 121
                12321 
               1234321     */

        /*for(int i =1; i<=4;i++){
            for(int j =1 ; j<=4-i;j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i;k++){
                System.out.print(k);
            } 
            for(int l=i-1;l>=1;l--){
                System.out.print(l);
            }
             System.out.println();    
        }  */

        //PRINT PATTERN
        /*       1
         *     2  2
         *    3    3 
         *   44444444     */

         int n = 5; // Number of rows for the triangle

         for (int i = 1; i <= n; i++) {
             for (int j = 1; j <= n - i; j++) {
                 System.out.print(" ");
             }
             
             // Print stars and spaces for the hollow part
             for (int j = 1; j <= 2 * i - 1; j++) {
                 if (j == 1 || j == 2 * i - 1 || i == n) {
                     System.out.print("*");
                 } else {
                     System.out.print(" ");
                 }
            } System.out.println(); 
        }
    }
}