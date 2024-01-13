public class ARR_05_LEFT_ROTATE_BY_1 {

    public static void print(int arr[]){
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       }
    }

    public static void rotate(int arr[]){
        int last = arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1] = arr[i];
            if(arr[i-1] == arr[i]){
                arr[i] = last;
            }
    
        }
    }
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5,6};
        rotate(arr);
        print(arr);
    }
}
