import java.util.*;
public class ARR_12_NUM_APPEAR_ONES_AND_OTHER_TWICE {

    public static int bruteApproach(int arr[]){
        int count=0;
        

        for (int i = 0; i < arr.length;i++) {
            int num=arr[i];
            for (int j =0; j < arr.length; j++) {
                if(num==arr[j]){
                    count++;
                }
                
            }
            if(count == 1) return num;
        }

        return -1;
    }

    public static int optimalApproach(int arr[]){
        int n=arr.length;
        int xorr=0;
        for(int i=0;i<n;i++){
            xorr=xorr ^ arr[i];
        }
        return xorr;
    }
    public static void main(String[] args) {
        int arr[]={4,1,2,1,2};
        
        int ans=bruteApproach(arr);
        System.out.println(ans);

        int ans1=optimalApproach(arr);
        System.out.println(ans1);
    }
}
