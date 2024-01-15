import java.util.ArrayList;

public class ARR_10_MISSING_NUMBER {
    public static int missingBrute(int arr[]){
        for(int i=1;i<=arr.length;i++){
            int flag=0;
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]==i){
                    flag=1;
                    break;
                }
            }
            if(flag == 0) return i;
        }
        return -1;
    }

    public static int sum_1_N(int arr[]){
        int n=arr.length+1;
        int sum = (n*(n+1))/2;

        return sum;
    }
    
    public static int arrSum(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }

        return sum;
        
    }

    public static void main(String[] args) {
        int arr[]={1,2,4,5};
        int ans=missingBrute(arr);
        System.out.println("The missing number is "+ans);

        System.out.println();

        int ans1=sum_1_N(arr);
        int ans2=arrSum(arr);
        int answer = ans1-ans2;
        System.out.println("The missing number is "+answer);
        
        
    }
}
