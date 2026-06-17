import java.util.*;
public class Pos_Neg_alternative_Number{
    public static void main(String x[]){
        int a[] = {2,-1,3,-4,6,-9};
        
        int pcount = 0;
        int ncount = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] > 0){
                pcount++;
            }
            if(a[i] < 0){
                ncount++;
            }
        }
        
        System.out.println(pcount);
        System.out.println(ncount);
        
        int pos[] = new int[pcount];
        int neg[] = new int[ncount];
        int pi= 0, ni = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] > 0)
                pos[pi++] = a[i];
        
            if(a[i] < 0)
                neg[ni++] = a[i];
        }
        System.out.print("[");
        for(int i = 0; i < pos.length; i++){
            System.out.print(pos[i]+ " ");
            if(i!=pos.length-1)System.out.print(",");
        }
        System.out.print("]");
        System.out.print("[");
        for(int i = 0; i < neg.length; i++){
            System.out.print(neg[i]+ " ");
            if(i!=neg.length-1)System.out.print(",");
        }
        System.out.print("]");
        System.out.print("[");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]+ " ");
            if(i!=a.length-1)System.out.print(",");
        }
        System.out.print("]");
        for(int i = 0; i< a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}