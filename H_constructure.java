import java.util.*;

class Algebra{
    int a, b;

    Algebra(int x,int y){
        System.out.println("constructor");
        a = x;
        b = y;
    }
    int add(){
        int ans = a+b;
        return ans;
    }
    int sub(){
        int ans = a-b;
        return ans;
    }
    int mul(){
        int ans = a*b;
        return ans;
    }
}

public class H_constructure {
    public static void main(String[] args) {
        Algebra obj =  new Algebra(5, 7);
        
        int ans = obj.add();
        System.out.println(ans);
        System.out.println(obj.sub());
        System.out.println(obj.mul());

        Algebra obj2 = new Algebra(4,5);

        System.out.println(obj2.add());
        System.out.println(obj2.sub());
        System.out.println(obj2.mul());
    }
    
}
 