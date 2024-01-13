public class ARR_02_REMOVE_DUPLICATE {

    public static int myApproach(int arr[]) {
        for (int i = 0; i < arr.length;) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if(arr[i] != arr[j]){
                    i++;
                    arr[i] = arr[j];
                }
            }
            return i+1;
        }
        return 0;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 1, 2, 2, 3, 3, 3 };

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        int k = myApproach(arr);
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        

    }

}
