public class F_break {
    public static void main(String[] args) {
        /*for(int i = 1;i<+10;i++){
            if(i == 5) break;
            System.out.println(i);
        }*/


       
        for(int num = 1;true ; num++ ){
            if(num %5 == 0 && num %7 == 0){
                System.out.println("found num:"+num);
                //  break;
            }
        }
    }
}
