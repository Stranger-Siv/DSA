public class ARR_03_SEC_LARGEST_ELEMENT {

    public static void Print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void sort(int arr[]) {
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
public static int Optimal(int arr1[]){
    int large = Integer.MIN_VALUE;
    int second_large = Integer.MIN_VALUE;

    for(int i=0;i<arr1.length;i++){
        if(arr1[i] > large){
            large = arr1[i];
        }
        else if(arr1[i]>second_large && arr1[i]!=large){
            second_large=arr1[i];
        }
    }
    return second_large;

}
    public static void main(String[] args) {
        int arr[]={4,3,5,6,8,7};
        int arr1[]={1,2,4,7,7,5};
        

        // BRUTEFORCE APPROACH

        // sort(arr);
        // Print(arr);
        // System.out.println("Largest Element is "+ arr[arr.length-1]);
        // System.out.println("Second Largest element is "+ arr[arr.length-2]);

        // OPTIMAL APPROACH
        
        Optimal(arr1);
        int sL = Optimal(arr1);
        System.out.println("Second Largest element is "+sL);
    }
}