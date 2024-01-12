public class DS_01_RECURSION{
    // public static void print(){
    //     System.out.println("1");
    //     print();
    // }
    static int count = 0;
    public static void count(){
        
        if(count==10) return;
        System.out.println(count);
        count++;
        count();
    }
    public static void main(String[] args) {
        // print();
        count();
       
    }
}