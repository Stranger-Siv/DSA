public class ARR_06_ROTATE_BY_N {

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void rotateRight(int arr[], int d, int n) {
        d = d % n;
        int temp[] = new int[d];
        for (int i = n - d; i < n; i++) {
            temp[i - n + d] = arr[i];
        }
        for (int i = n - d - 1; i >= 0; i--) {
            arr[i + d] = arr[i];
        }
        for (int i = 0; i < d; i++) {
            arr[i] = temp[i];
        }
    }

    public static void rotateLeft(int arrr[], int d, int n) {
        d = d % n;
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arrr[i];
        }
        for (int i = 0; i < n - d; i++) {
            arrr[i] = arrr[i + d];
        }
        for (int i = n - d; i < n; i++) {
            arrr[i] = temp[i - n + d];
        }
    }



    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        rotateRight(arr, 2, 7);
        print(arr);

        System.out.println();
        
        int arrr[]={3,7,8,9,10,11};
        rotateLeft(arrr, 3, 6);
        print(arrr);

    }
}
