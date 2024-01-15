import java.util.*;

public class ARR_09_FIND_UNION {
    public static ArrayList<Integer> union(int a1[],int a2[]){
        HashSet <Integer> s = new HashSet <>();
        ArrayList <Integer> a3 = new ArrayList <Integer>();
        for(int i=0;i<a1.length;i++){
            s.add(a1[i]);
        }
        for(int i=0;i<a2.length;i++){
            s.add(a2[i]);
        }
        for(int ans:s){
            a3.add(ans);
        }
        return a3;

    }
    public static void main(String[] args) {
       int a1[]={1,2,3,4,5};
       int a2[]={4,5,6,7,8};
       for(int val:a1){
        System.out.print(val+" ");
       }

       System.out.println();

       for(int val:a2){
        System.out.print(val+" ");
       }
       
       System.out.println();

       ArrayList <Integer> a3=union(a1,a2);
       for(int val:a3){
        System.out.print(val+" ");
       }
    }
}
