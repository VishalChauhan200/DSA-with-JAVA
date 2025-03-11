package add.source;

public class app {

    public String str_1 = "public member";
    void printfromclass(){
        System.out.println("witnin class :"+str_1);
    }
    public static void main(String[] args) {
        app obj = new app();
        obj.printfromclass();

        System.out.println("within class :"+obj.str_1);
    }

    
}