package ARRAY.EASY;

public class ARR_01_LARGEST_ELEMENT {
    public static void Print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
    }

    public static void optimalApproach(int arr[]){
        int max= arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max= arr[i];
            }
        }
        System.out.println("Largest element is"+ max);
        
    }
        
    

    public static void main(String[] args) {

        int arr[] = { 2,5,1,3,0 };

        /*
          this is brute force approach or my approach of thinking
          
          bubbleSort(arr);
          Print(arr);
          System.out.println("Largest element of the array is "+arr[arr.length-1]);
         
         */

         //Optimal Approaches
         Print(arr);
         optimalApproach(arr);
         


    }
}
