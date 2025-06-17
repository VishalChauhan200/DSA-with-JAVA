package Array;

public class ChechArrayIsSorted {
    
    static boolean chechSortedArray(int[] arr)
    {
        boolean check = true;
       
        for(int i= 1; i< arr.length; i++)
        {
            if(arr[i] < arr[i-1])
            {
                check = false;
                break;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        
        int arr[] = { 1,2,3,4,5};
        int arr1[] = { 21,2,3,4,5};
        
        System.out.println(chechSortedArray(arr));
        System.out.println(chechSortedArray(arr1));

    }
}
