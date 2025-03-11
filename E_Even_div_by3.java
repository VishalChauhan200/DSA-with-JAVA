public class E_Even_div_by3 {

    public static void main(String[] args) {
         int[] values ={15,12,9,2,6,25,20};

         for(int value : values){

             if (value%2 == 0 && value%3 == 0){
            System.out.println("Found ans:"+value);
            }
            
            else if(value%5 == 0 || value %3 == 0){
                System.out.println("Found ans of Logical or:"+value);

            }
        }
    }
}
