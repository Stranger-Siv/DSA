public class ARR_07_MOVE_0_TO_END {

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] move(int arr[]){
        int j=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
           
        }
        if(j == -1) return arr;

        for(int i=j+1;i<arr.length;i++){
            if(arr[i]!=0){
                int temp =arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        return arr;

        
    }
    public static void main(String[] args) {
        int arr[]={1,0,2,3,0,4,0,1};
       
        print(arr);
        System.out.println();
        move(arr);
        print(arr);
        
    }
}
