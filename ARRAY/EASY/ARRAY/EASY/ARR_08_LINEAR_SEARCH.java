public class ARR_08_LINEAR_SEARCH {

    public static void search(int arr[],int num){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                System.out.print("The num is present at index "+i);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        search(arr, 4);
        System.out.println();

    
    }
}
