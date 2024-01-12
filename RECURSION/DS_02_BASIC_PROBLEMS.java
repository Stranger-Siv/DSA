public class DS_02_BASIC_PROBLEMS {

    static int counter = 0;
    
     // print name 5 times

    public static void prob1(){
       
        if(counter==5) return;
        System.out.println("SIVRAM");
        counter++;
        prob1();
        
    }

    // calling a function n times

    public static void prob2(int i,int n){
        if(i>n) return;
        System.out.println("SIVRAM");
        i++;
        prob2(i, n);

    }

    // Print linearly from 1 to n

    public static void prob3(int i,int n){
        if(i>n) return;
        System.out.println(i);
        prob3(i+1,n);
    }

    //print from n to 1

    public static void prob4(int i,int n){
        if(i<n) return;
        System.out.println(i);
        prob4(i-1, n);
    }
    // print 1 to n without using the "+" symbol

    public static void prob5(int i, int n){
        if(i<n) return;
        prob5(i-1,n);
        System.out.println(i);
        
    }

    // print n to 1 without using the symbol "-"

    public static void prob6(int i,int n){
        if(i>n) return ;
        prob6(i+1, n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        // prob1();
        // prob2(1,10);
        // prob3(1, 10);
        // prob4(10,1);
        // prob5(10,1);
        // prob6(1,10);

    }
}
