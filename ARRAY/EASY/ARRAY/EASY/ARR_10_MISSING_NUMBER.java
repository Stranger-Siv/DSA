import java.util.ArrayList;

public class ARR_10_MISSING_NUMBER {

    public static void missing(int arr[]){
        ArrayList<Integer>a2=new ArrayList<Integer>();
        for(Integer element:a2 ){
            element.add(arr);
        }
        
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5};
        missing(arr);
    }
}
