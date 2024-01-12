public class DS_04_RECURSION_FUNCTIONAL {
    // To reverse an array
    public static void f1(int start, int arr[], int end) {
        if (start >= end / 2)
            return;
        int temp;
        if (start >= end)
            return;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        f1(start + 1, arr, end - 1);

    }
    // fibonacci number

    public static int fibo(int n) {

        if (n < 0)
            return 0;
        int sum = 0;
        int i = 0;
        int j = 1;
        if (n >= 1) {
            return sum = i + j;
        }
        return sum;

    }

    public static void main(String[] args) {
                // int n =6;
                // int arr[]={1,2,3,4,5,6};
                // f1(0,arr,5);
                // for(int i=0;i<n;i++){
                //     System.out.print(arr[i]+" ");
                // }
                fibo(3);
              
    }
}
