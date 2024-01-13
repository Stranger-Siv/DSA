// package ARRAY.EASY;

public class ARR_04_CHECK_SORTED {

    public static boolean isSorted(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean optimalIsSorted(int arr[]){
        for(int i=1;i<arr.length;i++){
            if(arr[i] < arr[i-1]){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
       System.out.println( isSorted(arr));

       System.out.println(optimalIsSorted(arr));
    }
   
}
