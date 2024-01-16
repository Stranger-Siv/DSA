public class ARR_13_LONGEST_SUBARRAY_WITH_GIVEN_SUM {

    public static int bruteApproach(int arr[], int k) {
        int n = arr.length;

        int len = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == k) {
                    len = Math.max(len, j - i + 1);
                }
            }
        }
        return len;
    }

    public static int optimalApproach(int arr[],int k){
        int n=arr.length;
        int right=0,left=0;
        long sum=arr[0];
        int len=0;
        while(right<n){

            while(left <=right && sum>k){
                sum-=arr[left];
                left++;
            }
            if(sum == k){
                len=Math.max(len,right-left+1);
            }
            right++;
            if(right < n) sum+=arr[right];
        }
        return len;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 1, 9 };
        int ans=bruteApproach(arr, 10);
        System.out.println(ans);

        int ans1=optimalApproach(arr, 10);
        System.out.println(ans1);
    }
}
