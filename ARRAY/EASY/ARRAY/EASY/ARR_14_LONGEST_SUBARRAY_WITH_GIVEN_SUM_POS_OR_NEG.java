public class ARR_14_LONGEST_SUBARRAY_WITH_GIVEN_SUM_POS_OR_NEG {

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
    public static void main(String[] args) {
        int arr[]={-1,1,1};
        int ans=bruteApproach(arr, 1);
        System.out.println(ans);
    }
}
