// Here we will learn about parameterized and functional recursion

public class DS_03_RECURSION_TYPES {
     // sum of n numbers

    // 1. parameterized

    public static void f1(int i,int sum){
        if(i<1){
            System.out.print(sum);
            return;
        }
        f1(i-1,sum+i);
    }

    // 2. Functional

    public static int f2(int n){
        if(n==0) return 0;
        return n+f2(n-1);

    }

    //Factorial of n numbers

    // 1. parameterized

    public static void f3(int i,int fac){
        if(i<1){
            System.out.println(fac);
            return;
        }
        f3(i-1,fac*i);
    }

    // 2. Functional

    public static int f4(int n){
        if(n==0) return 1;
        return n*f4(n-1);
        
    }
    public static void main(String[]args){
        // f1(5,0);
        // int n=3;
        // System.out.println(f2(n));
        // f3(6, 1);
        int n=6;
        System.out.println(f4(n));

    }

}