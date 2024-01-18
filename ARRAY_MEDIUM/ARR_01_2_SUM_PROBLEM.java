package ARRAY_MEDIUM;
import java.util.*;

public class ARR_01_2_SUM_PROBLEM {

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static String var1(int arr[], int k) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == k)
                    return "YES";
            }

        }
        return "No";
    }

    public static int[] var2(int arr[], int k) {
        int n = arr.length;
        int[] temp = new int[2];
        temp[0] = temp[1] = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == k) {
                    temp[0] = i;
                    temp[1] = j;
                    return temp;
                }
            }
        }
        return temp;
    }

    public static String optimalVar1(int arr[], int k) {
        int n = arr.length;
        Arrays.sort(arr);
        print(arr);
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == k) {
                return "YES";
            } else if (sum < k)
                left++;
            else
                right--;
        }
        return "NO";
    }

    public static int[] optimalVar2(int arr[], int k) {
        int temp[] = new int[2];
        temp[0] = temp[1] = -1;
        int n = arr.length;
        Arrays.sort(arr);
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == k) {
                temp[0] = left;
                temp[1] = right;
                return temp;
            } else if (sum < k)
                left++;
            else
                right--;
        }
        return temp;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 6, 5, 8, 11 };
        int k = 14;
        String ans = var1(arr, k);
        System.out.println(ans);
        int[] ans1 = var2(arr, k);
        System.out.println("[" + ans1[0] + "," + ans1[1] + "]");

        String ans2 = optimalVar1(arr, k);
        System.out.println(ans2);

        int[] ans3=optimalVar2(arr, k);
        System.out.println(ans3[0]);
        System.out.println(ans3[1]);
    }
}
